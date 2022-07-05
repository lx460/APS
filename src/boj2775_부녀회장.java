import java.io.BufferedReader;
import java.io.InputStreamReader;

public class boj2775_부녀회장 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			int[][] arr =  new int[k+1][n];
			for (int r = 0; r < k+1; r++) {
				for (int c = 0; c < n; c++) {
					if(r==0)
						arr[r][c] = c+1;
					else {
						for (int j = 0; j <= c; j++) {
							arr[r][c] += arr[r-1][j];
						}
					}
				}
			}
			System.out.println(arr[k][n-1]);
		}
	}
}
