import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj9012_괄호 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			String str = br.readLine();
			Stack<Character> st = new Stack<>();
			String ans = "YES";
			for (int j = 0; j < str.length(); j++) {
				if(str.charAt(j)=='(')
					st.add(str.charAt(j));
				else if(!st.isEmpty() && str.charAt(j)==')'){
					if(st.peek()=='(')
						st.pop();
					else {
						ans = "NO";
						break;
					}
				}
				else if(st.isEmpty() && str.charAt(j)==')') {
					ans = "NO";
					break;
				}
			}
			if(!st.isEmpty())
				ans = "NO";
			System.out.println(ans);
		}
	}
}
