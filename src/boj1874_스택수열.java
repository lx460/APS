import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj1874_스택수열 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> s = new Stack<>();
		int start = 1;
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num >= start) {
				for (int j = start; j <= num; j++) {
					s.push(j);
					sb.append("+").append("\n");
				}
				start = num+1;
			}
			else if (num != s.peek()) {
				System.out.println("NO");
				System.exit(0);
			}
			while(!s.isEmpty()) {
				sb.append("-").append("\n");
				if(s.pop() == num)
					break;
			}
		}
		System.out.println(sb.toString());
	}
}
