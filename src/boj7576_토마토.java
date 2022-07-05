import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj7576_토마토 {
	static class tot {
		int r;
		int c;
		int day;

		tot(int r, int c, int day) {
			this.r = r;
			this.c = c;
			this.day = day;
		}
	}

	static int[] dr = { 0, 1, 0, -1 };
	static int[] dc = { 1, 0, -1, 0 };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int[][] map = new int[n][m];
		int cnt = 0;
		int ansday = -1;
		Queue<tot> q = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < m; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if (map[i][j] == 1)
					q.add(new tot(i, j, 0));
				else if (map[i][j] == 0)
					cnt++;
			}
		}
		while (!q.isEmpty()) {
			tot now = q.poll();
			for (int i = 0; i < 4; i++) {
				int nr = now.r + dr[i];
				int nc = now.c + dc[i];

				if (nr >= 0 && nr < n && nc >= 0 && nc < m && map[nr][nc] == 0) {
					cnt--;
					map[nr][nc] = now.day+1;
					q.add(new tot(nr, nc, now.day+1));
				}
			}
			if(cnt == 0) 
				ansday = now.day;
		}
		System.out.println(ansday);
	}
}
