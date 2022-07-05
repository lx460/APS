import java.io.BufferedReader;
import java.io.InputStreamReader;

public class boj2562_최댓값 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		int max = 0;
		int idx = 0;
		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(max < arr[i]) {
				idx = i+1;
				max = arr[i];
			}
		}
		System.out.println(max);
		System.out.println(idx);
	}
}
