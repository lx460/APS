import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class boj11725_트리의부모 {
	static int N;
	static int[] parent;
	static boolean[] visit;
	static ArrayList<ArrayList<Integer>> list;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		parent = new int[N + 1];
		visit = new boolean[N + 1];
		list = new ArrayList<>();
		for (int i = 0; i <= N; i++)
			list.add(new ArrayList<Integer>());

		for (int i = 1; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			list.get(a).add(b);
			list.get(b).add(a);
		}
		dfs(1);

		for (int i = 2; i <= N; i++) {
			System.out.println(parent[i]);
		}
	}

	static void dfs(int i) {
		 if(!visit[i]) {
	            visit[i] = true;

	            for(int n : list.get(i)) {
	                if(visit[n]) parent[i] = n;
	                dfs(n);
	            }
	        }

	}
}
