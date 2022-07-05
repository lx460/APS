import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj7579_토마토2 {
	static class tot {
		int r;
		int c;
		int h;
		int day;

		tot(int r, int c, int h, int day) {
			this.r = r;
			this.c = c;
			this.h = h;
			this.day = day;
		}
	}

	static int[] dr = { 0, 1, 0, -1, 0, 0 };
	static int[] dc = { 1, 0, -1, 0, 0, 0 };
	static int[] dh = { 0, 0, 0, 0, -1, 1 };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int z = Integer.parseInt(st.nextToken());
		int[][][] map = new int[n][m][z];
		int cnt = 0;
		int ansday = -1;
		Queue<tot> q = new LinkedList<>();
		for (int k = 0; k < z; k++) {
			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				for (int j = 0; j < m; j++) {
					map[i][j][k] = Integer.parseInt(st.nextToken());
					if (map[i][j][k] == 1)
						q.add(new tot(i, j, k, 0));
					else if (map[i][j][k] == 0)
						cnt++;
				}
			}
		}
		while (!q.isEmpty()) {
			tot now = q.poll();
			for (int i = 0; i < 6; i++) {
				int nr = now.r + dr[i];
				int nc = now.c + dc[i];
				int nh = now.h + dh[i];
				if (nr >= 0 && nr < n && nc >= 0 && nc < m && nh >= 0 && nh < z && map[nr][nc][nh] == 0) {
					cnt--;
					map[nr][nc][nh] = now.day + 1;
					q.add(new tot(nr, nc, nh, now.day + 1));
				}
			}
			if (cnt == 0)
				ansday = now.day;
		}
		System.out.println(ansday);
	}
}
