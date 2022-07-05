import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj6064_카잉달력 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int max = 0;
			int left = Math.min(M, N);
			int right = Math.max(M, N);
			for (int j = left; j <= left * right; j += left) {
				if (j % right == 0)
					max = j;
			}
			int cnt = x;
			while (cnt <= max) {
				if (y != N) {
					if (cnt % N == y) {
						sb.append(cnt + "\n");
						break;
					}
				} else {
					if (cnt % N == 0) {
						sb.append(cnt + "\n");
						break;
					}
				}
				cnt += M;
			}
			if (cnt > max)
				sb.append(-1 + "\n");
		}
		System.out.println(sb.toString());
	}

}
