import java.io.BufferedReader;
import java.io.InputStreamReader;

public class boj2577_숫자의개수 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int mul = A*B*C;
		String str = mul+"";
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)-48]++; 
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(arr[i]);
		}
	}
}
