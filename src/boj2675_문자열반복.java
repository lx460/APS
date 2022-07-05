import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2675_문자열반복 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int R = Integer.parseInt(st.nextToken());
			String str = st.nextToken();
			for (int j = 0; j < str.length(); j++) {
				for (int k = 0; k < R; k++) {
					System.out.print(str.charAt(j));
				}
			}
			System.out.println();
		}
	}
}
