import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj2178_미로탐색 {
	static class Pos {
		int r;
		int c;
		int dist; // 시작 위치부터 현재까지의 거리를 저장하기 위해서 선언

		public Pos(int r, int c, int dist) {
			this.r = r;
			this.c = c;
			this.dist = dist;
		}
	}

	static int[] dr = { 1, 0, -1, 0 };
	static int[] dc = { 0, -1, 0, 1 };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] map = new int[N][M];
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < M; j++) {
				map[i][j] = str.charAt(j) - '0';
			}
		}
		Pos p = new Pos(0, 0, 0);
		boolean[][] visited = new boolean[N][M];
		
		Queue<Pos> q = new LinkedList<>();
		
		q.add(p);
		visited[p.r][p.c] = true;
		while (!q.isEmpty()) {
			Pos curr = q.poll();
			
			if (curr.r == N-1 && curr.c == M-1) {
				System.out.println(curr.dist+1);
				break;
			}

			for (int i = 0; i < 4; i++) {
				int nr = curr.r + dr[i];
				int nc = curr.c + dc[i];

				if (nr < 0 || nr >= N || nc < 0 || nc >= M)
					continue;
				if (map[nr][nc] == 0 || visited[nr][nc])
					continue;

				visited[nr][nc] = true;
				q.add(new Pos(nr, nc, curr.dist+1));
			} 
		} 
	}
}
