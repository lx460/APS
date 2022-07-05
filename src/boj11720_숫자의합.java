import java.io.BufferedReader;
import java.io.InputStreamReader;

public class boj11720_숫자의합 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int ans = 0;
		for (int i = 0; i < str.length(); i++) {
			ans += str.charAt(i)-'0';
		}
		System.out.println(ans);
	}
}
