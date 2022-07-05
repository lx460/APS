import java.io.BufferedReader;
import java.io.InputStreamReader;

public class boj2439_별찍기2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			for(int j = i; j<N-1; j++) {
				System.out.print(" ");
			}
			for(int j = N-i; j<=N; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
