import java.io.BufferedReader;
import java.io.InputStreamReader;

public class boj3052_나머지 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[42];
		int max = -1;
		for (int i = 0; i < 10; i++) {
			int a = Integer.parseInt(br.readLine())%42;
			arr[a]++;
			max = Math.max(max, a);
		}
		int ans = 0;
		for (int i = 0; i <= max; i++) {
			if(arr[i] != 0)
				ans++;
		}
		System.out.println(ans);
	}
}
