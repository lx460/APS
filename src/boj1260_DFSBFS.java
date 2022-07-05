import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj1260_DFSBFS {
	static int N;
	static int[][] map;
	static boolean[] visit;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		map = new int[N+1][N+1];
		visit = new boolean[N+1];
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int r = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			map[r][c] = 1;
			map[c][r] = 1;
		}
		dfs(V);
		sb.append("\n");
		visit = new boolean[N+1];
		bfs(V);
		System.out.println(sb.toString());
	}
	
	public static void dfs(int v) {
		visit[v] = true;
		sb.append(v).append(" ");
		
		for(int i =1; i<=N; i++) {
			if(map[v][i]==1 && visit[i]==false) {
				dfs(i);
			}
		}
	}
	
	public static void bfs(int v) {
		int now;
		Queue<Integer> queue = new LinkedList<>();
		queue.add(v);
		visit[v] = true;
		sb.append(v).append(" ");
		while(!queue.isEmpty()) {
			now = queue.poll();
			for(int i =1; i<N+1; i++) {
				if(map[now][i]==1 && !visit[i]) {
					visit[i] = true;
					queue.add(i);
					sb.append(i).append(" ");
				}
			}
		}
	}
}
