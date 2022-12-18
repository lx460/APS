import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj4796_캠핑 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int L; // L일 동안만 사용 가능
		int P; // 연속하는 P일
		int V; // V일짜리 휴가
		int t = 1;
		for (;;) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int ans = 0;
			L = Integer.parseInt(st.nextToken());
			P = Integer.parseInt(st.nextToken());
			V = Integer.parseInt(st.nextToken());
			if (L == 0 && P == 0 && V == 0)
				break;
			ans = V/P*L;
			if(V%P>L) {
				ans += L;
			} else {
				ans += V%P;
			}
			sb.append("Case ").append(t).append(": ").append(ans).append("\n");
			t++;
		}
		System.out.println(sb.toString());
	}
}
