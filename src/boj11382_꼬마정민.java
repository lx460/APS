import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj11382_꼬마정민 {
		public static void main(String[] args) throws Exception {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			Long A = Long.parseLong(st.nextToken());
			Long B = Long.parseLong(st.nextToken());
			Long C = Long.parseLong(st.nextToken());
			System.out.println(A+B+C);
		}

}
