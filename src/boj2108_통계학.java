import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class boj2108_통계학 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		int[] arr = new int[8001];
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			list.add(i, num);
			arr[num+4000]++;
			sum += num;
			max = Math.max(max, num);
			min = Math.min(min, num);
		}
		int cnt = 0;
		int maxIdx = 0;
		int maxCnt = 0;
		for (int i = 0; i < 8001; i++) {
			if(maxCnt < arr[i]) {
				maxCnt = arr[i];
				maxIdx = i-4000;
			}
		}
		for (int i = 0; i < 8001; i++) {
			if(arr[i] == maxCnt)
				cnt++;
			if(cnt == 2) {
				maxIdx = i-4000;
				break;
			}
		}
		Collections.sort(list);
		double avr = (double) sum/N;

		System.out.println(Math.round(avr));
		System.out.println(list.get(list.size()/2));
		System.out.println(maxIdx);
		System.out.println(max-min);
	}
}
