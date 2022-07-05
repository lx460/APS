import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj2468_안전영역 {
	static class rain {
		int r;
		int c;

		public rain(int r, int c) {
			this.r = r;
			this.c = c;
		}
	}

	static int[] dr = { 0, 1, 0, -1 }; // 우하좌상
	static int[] dc = { 1, 0, -1, 0 };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int N = Integer.parseInt(br.readLine()); // 한변의 길이
			int[][] map = new int[N][N];
			int lastDay = 0; 
			int max = 1; 
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				for (int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
					lastDay = Math.max(lastDay, map[i][j]); 
				}
			}

			Queue<rain> q = new LinkedList<>(); // 큐생성

			for (int i = 1; i <= lastDay; i++) {
				boolean[][] visited = new boolean[N][N]; 
				for (int r = 0; r < N; r++) {
					for (int c = 0; c < N; c++) {
						if (map[r][c] <= i) 
							visited[r][c] = true;
					} 
				} 
				int cnt = 0; 
				for (int r = 0; r < N; r++) {
					for (int c = 0; c < N; c++) {
						if (!visited[r][c]) { 
							visited[r][c] = true; 
							q.add(new rain(r, c));

							while (!q.isEmpty()) {
								rain now = q.poll();
								// 우하좌상
								for (int j = 0; j < 4; j++) {
									int nr = now.r + dr[j];
									int nc = now.c + dc[j];
									if (nr >= 0 && nr < N && nc >= 0 && nc < N && !visited[nr][nc]) {
										visited[nr][nc] = true; 
										q.add(new rain(nr, nc)); 
									} // end if
								} // end for j
							} // end while
							cnt++; // 덩어리 구분이 끝났다면 갯수 추가
						} // end if
					} // end for c
				} // end for r
				max = Math.max(max, cnt); // 최댓값 판별
		}
			System.out.println(max);
	}
}
