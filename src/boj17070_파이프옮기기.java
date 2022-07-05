import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj17070_파이프옮기기 {
	static int n;
	static int cnt;
	static int[][] arr;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n + 2][n + 2];
		for (int i = 0; i < n + 2; i++) {
			Arrays.fill(arr[i], 1);
		}
		for (int i = 1; i <= n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 1; j <= n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		cnt = 0;
		dfs(1, 2, 0);

		System.out.println(cnt);
	}

	public static void dfs(int r, int c, int dir) {
		if (r == n && c == n) {
			cnt++;
			return;
		}
		switch (dir) {
		case 0:
			if (arr[r][c + 1] == 0)
				dfs(r, c + 1, 0);
			if (arr[r][c + 1] == 0 && arr[r + 1][c] == 0 && arr[r + 1][c + 1] == 0)
				dfs(r + 1, c + 1, 2);
			break;
		case 1:
			if (arr[r + 1][c] == 0)
				dfs(r + 1, c, 1);
			if (arr[r][c + 1] == 0 && arr[r + 1][c] == 0 && arr[r + 1][c + 1] == 0)
				dfs(r + 1, c + 1, 2);
			break;
		case 2:
			if (arr[r][c + 1] == 0)
				dfs(r, c + 1, 0);
			if (arr[r + 1][c] == 0)
				dfs(r + 1, c, 1);
			if (arr[r][c + 1] == 0 && arr[r + 1][c] == 0 && arr[r + 1][c + 1] == 0)
				dfs(r + 1, c + 1, 2);
			break;
		}
	}
}
