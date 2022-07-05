import java.io.BufferedReader;
import java.io.InputStreamReader;

public class boj9095_123더하기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[11];
			arr[1] = 1;
			arr[2] = 2;
			arr[3] = 4;
			for (int j = 4; j <= n; j++) {
				arr[j] = arr[j-3] + arr[j-2] + arr[j-1];
			}
			sb.append(arr[n]).append("\n");
		}
		System.out.println(sb.toString());
	}

}
