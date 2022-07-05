import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj11047_동전0 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		int idx = 0;
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i]<=K) {
				idx = i;
			}
		}
		while (K != 0) {
			int tk = K/arr[idx];
			K = K%arr[idx];
			int max = idx;
			for (int i = 0; i <= max; i++) {
				if(arr[i]<=K) {
					idx = i;
				}
			}
			cnt += tk;
		}
		System.out.println(cnt);
	}
}
