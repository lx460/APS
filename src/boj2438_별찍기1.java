import java.io.BufferedReader;
import java.io.InputStreamReader;

public class boj2438_별찍기1 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = N-1; i >= 0; i--) {
			for(int j = N-i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
