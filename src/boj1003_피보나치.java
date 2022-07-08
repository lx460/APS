import java.io.BufferedReader;
import java.io.InputStreamReader;

public class boj1003_피보나치 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		int[][] func = new int[41][2];
		func[0][0] = 1;
		func[0][1] = 0;
		func[1][0] = 0;
		func[1][1] = 1;
		for (int i = 0; i < T; i++) {
			int num = Integer.parseInt(br.readLine());
			for (int j = 2; j <= num; j++) {
				func[j][0] = func[j-2][0] + func[j-1][0];
				func[j][1] = func[j-2][1] + func[j-1][1];
			}
			sb.append(func[num][0]).append(" ").append(func[num][1]).append("\n");
		}
		System.out.println(sb.toString());
	}
}
