import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj1697_숨바꼭질 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		if (N == K)
			System.out.println(0);
		else
			bfs(N, K);
	}

	private static void bfs(int n, int k) {
		Queue<Integer> q = new LinkedList<>();
		q.add(n);
		int[] cnt = new int[100001];
		cnt[n] = 1;
		while (!q.isEmpty()) {
			int cur = q.poll();
			for (int i = 0; i < 3; i++) {
				int X;
				switch (i) {
				case 0:
					X = cur - 1;
					break;
				case 1:
					X = cur + 1;
					break;
				default:
					X = cur * 2;
					break;
				}
				if (X == k) {
					System.out.println(cnt[cur]);
					return;
				}
				if(X < cnt.length && X >= 0 && cnt[X] == 0) {
					q.add(X);
					cnt[X] = cnt[cur]+1;
				}
					
			}
		}

	}

}
