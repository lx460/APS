
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1991_트리순회 {
	static int[][] treeV;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		// 해당 노드의 알파벳
		treeV = new int[N + 1][3];
		// 입력받기
		for (int i = 1; i <= N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int idx = st.nextToken().charAt(0) - 'A' + 1;
			treeV[idx][2] = idx;
			char left = st.nextToken().charAt(0);
			char right = st.nextToken().charAt(0);
			if (left != '.')
				treeV[idx][0] = left - 'A' + 1;
			if (right != '.')
				treeV[idx][1] = right - 'A' + 1;
		}
		preOrder(1);
		sb.append("\n");
		inOrder(1);
		sb.append("\n");
		postOrder(1);
		sb.append("\n");

		System.out.println(sb.toString());
	}

	public static void preOrder(int i) {
		// 자식이 없다면 순회는 안하고 위로 돌아가야 하고 방문처리
		if (treeV[i][0] == 0 && treeV[i][1] == 0) {
			sb.append((char) (treeV[i][2] + 'A' - 1));
		} else {
			sb.append((char) (treeV[i][2] + 'A' - 1));
			// 왼쪽 자식이 있다면 다시 순회하기
			if (treeV[i][0] != 0) {
				// 재귀
				preOrder(treeV[i][0]);
			}
			// 오른쪽 순회하기
			if (treeV[i][1] != 0) {
				// 재귀
				preOrder(treeV[i][1]);
			}
		}
	}

	public static void inOrder(int i) {
		// 자식이 없다면 순회는 안하고 위로 돌아가야 하고 방문처리
		if (treeV[i][0] == 0 && treeV[i][1] == 0) {
			sb.append((char) (treeV[i][2] + 'A' - 1));
		} else {
			// 왼쪽 자식이 있다면 다시 순회하기
			if (treeV[i][0] != 0) {
				// 재귀
				inOrder(treeV[i][0]);
			}
			sb.append((char) (treeV[i][2] + 'A' - 1));
			// 오른쪽 순회하기
			if (treeV[i][1] != 0) {
				// 재귀
				inOrder(treeV[i][1]);
			}
		}
	}

	public static void postOrder(int i) {
		// 자식이 없다면 순회는 안하고 위로 돌아가야 하고 방문처리
		if (treeV[i][0] == 0 && treeV[i][1] == 0) {
			sb.append((char) (treeV[i][2] + 'A' - 1));
		} else {
			// 왼쪽 자식이 있다면 다시 순회하기
			if (treeV[i][0] != 0) {
				// 재귀
				postOrder(treeV[i][0]);
			}
			// 오른쪽 순회하기
			if (treeV[i][1] != 0) {
				// 재귀
				postOrder(treeV[i][1]);
			}
			sb.append((char) (treeV[i][2] + 'A' - 1));
		}
	}
}
