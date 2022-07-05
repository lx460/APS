import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj11723_집합 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int M = Integer.parseInt(br.readLine());
		int sw = 0;
		for (int i = 0; i < M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num = 0;
			switch (st.nextToken()) {
			case "add":
				num = Integer.parseInt(st.nextToken());
				sw = sw | (1<<num);
				break;
			case "remove":
				num = Integer.parseInt(st.nextToken());
				sw = sw & ~(1<<num);
				break;
			case "check":
				num = Integer.parseInt(st.nextToken());
				int ans = (sw & (1<<num)) >> num;
				sb.append(ans+"\n");
				break;
			case "toggle":
				num = Integer.parseInt(st.nextToken());
				sw = sw ^ (1<<num);
				break;
			case "all":
				sw = ~0;
				break;
			case "empty":
				sw = 0;
				break;
			}
		}
		System.out.println(sb.toString());
	}
}
