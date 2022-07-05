import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj18411_마인크래프트 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int[][] arr = new int[N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				max = Math.max(max, arr[i][j]);
				min = Math.min(min, arr[i][j]);
			}
		}
		int h = 0;
		int minTime = Integer.MAX_VALUE;
		for (int i = min; i <= max; i++) {
			int inven = B;
			int time = 0;
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < M; k++) {
					if (arr[j][k] > i) {
						time += (arr[j][k] - i)*2;
						inven += (arr[j][k] - i);
					} else if (arr[j][k]<i) {
						time += (i-arr[j][k]);
						inven -= (i-arr[j][k]);
					}
				}
			}
			if(inven>=0 && minTime>=time) {
				minTime = time;
				h = i;
			}
		}
		System.out.println(minTime+" "+h);
		
	}
}
