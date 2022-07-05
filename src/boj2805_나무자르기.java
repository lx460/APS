import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2805_나무자르기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		long M = Long.parseLong(st.nextToken());
		long max = 0;
		
		long[] tree = new long[N];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			tree[i] = Long.parseLong(st.nextToken());
			max = Math.max(tree[i], max);
		}
		long start = 1;
		long end = 1000000000;
		max = 0;
		while (start <= end) {
			long mid = start + (end-start)/2;
			long ans = 0;
			for (int i = 0; i < N; i++) {
				if(tree[i]-mid>0)
					ans += tree[i]-mid;
			}
			if (ans >= M) {
				max = Math.max(max, mid);
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		System.out.println(max);
	}
}
