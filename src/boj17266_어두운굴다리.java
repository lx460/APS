import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj17266_어두운굴다리 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int start = 0;
		int end = N;
		int height = 0;
		int[] arr = new int[M + 1];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 1; i <= M; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 1; i <= M; i++) {
			end = arr[i];
			if (i != 1) {
				if ((end - start) % 2 == 1) {
					if ((end - start) / 2 + 1 > height)
						height = (end - start) / 2 + 1;
				} else {
					if ((end - start) / 2 > height)
						height = (end - start) / 2;
				}
			} else {
				if (end - start > height)
					height = end - start;
			}
			start = arr[i];
		}
		if (N - end > height) {
			height = N - end;
		}
		System.out.println(height);
	}
}
