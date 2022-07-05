import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj3584_가장가까운공통조상 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			// 서브트리의 크기 초기화
			int N = Integer.parseInt(br.readLine()); // 노드의 개수

			int[][] tree = new int[N + 1][2];
			// 트리만들기
			for (int i = 1; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				int vertex = Integer.parseInt(st.nextToken());
				int child = Integer.parseInt(st.nextToken());
				// 첫번째 자식에 값을 안넣었다면 첫번째에 넣기
				if (tree[vertex][0] == 0)
					tree[vertex][0] = child;
				else
					tree[vertex][1] = child;
			}
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int aNode = Integer.parseInt(st.nextToken()); // 공통조상 찾을 첫번째 정점
			int bNode = Integer.parseInt(st.nextToken()); // 공통조상 찾을 두번째 정점
			// 공통조상을 찾을 첫번째 정점이 루트까지 가는데 지나간 정점배열
			int[] aEdge = new int[N + 1];
			// 공통조상을 찾을 두번째 정점이 루트까지 가는데 지나간 정점배열
			int[] bEdge = new int[N + 1];
			aEdge[0] = aNode;
			bEdge[0] = bNode;
			int aIdx = 1;
			int bIdx = 1;
			// 공통 조상 중 가장 가까운 것의 번호
			int nearV = 0;
			// 루트까지 가기
			for (;;) {
				for (int j = 1; j <= N; j++) {
					// a정점을 루트까지 보내기
					if (tree[j][0] == aNode || tree[j][1] == aNode) {
						aEdge[aIdx++] = j;
						aNode = j;
					}
					// b정점을 루트까지 보내기
					if (tree[j][0] == bNode || tree[j][1] == bNode) {
						bEdge[bIdx++] = j;
						bNode = j;
					}
				}
				// 두 정점 모두 루트에 갔다면 break;
				if (aNode == 1 && bNode == 1)
					break;
			}

			// 공통 조상 찾기
			outer: for (int i = 0; i <= N; i++) {
				for (int j = 0; j <= N; j++) {
					// 공통 조상을 구했다면 바로 반복문 탈출하면 가장 가까운 것임 왜냐 밑에서 올라간 것이라서.
					if (aEdge[i] == bEdge[j]) {
						nearV = aEdge[i];
						break outer;
					}
					// 배열이 0이라면 이미 다돌았기때문에 탈출
					if (bEdge[j] == 0)
						break;
				}
			}
			System.out.println(nearV);
		}
	}
}
