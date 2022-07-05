import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1541_잃어버린괄호 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), "-");
		boolean check = true;
		int ans = 0;
		while (st.hasMoreTokens()) {
			int num = 0;
			StringTokenizer st2 = new StringTokenizer(st.nextToken(), "+");
			while (st2.hasMoreTokens()) {
				num += Integer.parseInt(st2.nextToken());
			}
			if (check) {
				ans+= num;
				check = false;
			}
			else
				ans-= num;
		}
		System.out.println(ans);
	}
}
