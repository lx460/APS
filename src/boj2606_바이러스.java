import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj2606_바이러스 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] com = new int[N+1][N+1];
		boolean[] visited = new boolean[N+1];
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int r = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			com[r][c] = 1;
			com[c][r] = 1;
		}
		int cnt = 0;
		
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(1);
		visited[1] = true;
		
		while (!q.isEmpty()) {
			int cur = q.poll();
			for (int i = 1; i<= N; i++) {
				if(com[cur][i] == 1 && !visited[i]) {
					visited[i] = true;
					cnt++;
					q.offer(i);
				}
			}
			
		}
		System.out.println(cnt);
	}

}

