import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1654_랜선자르기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		long M = Long.parseLong(st.nextToken());
		long max = 0;
		
		long[] lan = new long[N];
		for (int i = 0; i < N; i++) {
			lan[i] = Long.parseLong(br.readLine());
			max = Math.max(lan[i], max);
		}
		long start = 1;
		long end = max;
		long ans = 0;
		while (start <= end) {
			long mid = start + (end-start)/2;
			long cnt = 0;
			for (int i = 0; i < N; i++) {
				cnt += lan[i]/mid;
			}
			if (cnt >= M) {
				ans = Math.max(ans, mid);
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		System.out.println(ans);
	}
}
