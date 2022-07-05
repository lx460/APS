import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj17070_파이프옮기기2 {
	static int n;
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
		long[][][] dp = new long[n + 2][n + 2][3];
		dp[1][2][0] = 1;
		for (int r = 1; r <= n; r++) {
			for (int c = 2; c <= n; c++) {
				if (arr[r][c] == 1)
					continue;

				dp[r][c][0] += dp[r][c - 1][0] + dp[r][c - 1][2];

				dp[r][c][1] += dp[r - 1][c][1] + dp[r - 1][c][2];

				if (arr[r - 1][c - 1] == 0 && arr[r - 1][c] == 0 && arr[r][c - 1] == 0)
					dp[r][c][2] += dp[r - 1][c - 1][0] + dp[r - 1][c - 1][1] + dp[r - 1][c - 1][2];
			}
		}
		long cnt = dp[n][n][0] + dp[n][n][1] + dp[n][n][2];

		System.out.println(cnt);
	}

}
