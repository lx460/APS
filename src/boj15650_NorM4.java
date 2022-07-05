import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj15650_NorM4 {
	static int[] arr;
	static int n;
	static int r;
	static int result[] = new int[9];
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		n = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		arr = new int[n+1];
		for (int i = 1; i <= n; i++) {
			arr[i] = i;
		}
		comb(1, r);
		System.out.println(sb.toString());
	}
	static void comb(int start, int r) {
		if(r == 0) {
			print();
			return;
		} else {
			for(int i = start; i<= n; i++) {
				result[r] = arr[i];
				comb(i, r-1);
			}
		}
	}
	
	static void print() {
		for(int i = r; i>=1; i--) {
			sb.append(result[i]).append(" ");
		}
		sb.append("\n");
	}
}
