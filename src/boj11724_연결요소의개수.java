import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj11724_연결요소의개수 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] arr = new int[N+1][N+1];
		boolean[] visited = new boolean[N+1];
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int r = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			arr[r][c] = 1;
			arr[c][r] = 1;
		}
		Queue<Integer> q = new LinkedList<>();
		int cnt = 0;
		for (int i = 1; i <= N; i++) {
			if(!visited[i]) {
				q.add(i);
				visited[i] = true;
				while(!q.isEmpty()) {
					int cur = q.poll();
					for (int j = 1; j <= N; j++) {
						if(arr[cur][j] == 1&& !visited[j]) {
							q.add(j);
							visited[j] = true;
						}
					}
				}
				cnt++;
			}
			
		}
		System.out.println(cnt);
		
	}

}
