import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj8974_희주의수학시험 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int[] arr = new int[1001];
		int num;
		int idx = 1;
		int ans = 0;
		for (int i = 1; idx <= B; i++) {
			for (int j = 1; j <= i; j++) {
				if (idx <= 1000) {
					arr[idx++] = i;
				}
			}
		}
		for (int i = A; i <= B; i++) {
			ans += arr[i];
		}
		System.out.println(ans);
	}
}
