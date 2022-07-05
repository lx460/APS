import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj15650_NorM2 {
	static int[] arr;
	static int n;
	static int r;
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		visited = new boolean[9];
		n = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		arr = new int[n+1];
		for (int i = 1; i <= n; i++) {
			arr[i] = i;
		}
		comb(1, r);
		System.out.println(sb.toString());
	}
	static void comb(int start, int r) {
		if(r == 0) {
			print();
			return;
		} else {
			for(int i = start; i<= n; i++) {
				visited[i] = true;
				comb(i+1, r-1);
				visited[i] = false;
			}
		}
	}
	
	static void print() {
		for(int i = 1; i<=n; i++) {
			if(visited[i])
				sb.append(arr[i]).append(" ");
		}
		sb.append("\n");
	}
}
