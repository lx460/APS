import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj4949_균형잡힌세상 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (;;) {
			String str = br.readLine();
			if(str.charAt(0) =='.' && str.length()==1)
				break;
			Stack<Character> st = new Stack<>();
			String ans = "yes";
			for (int j = 0; j < str.length(); j++) {
				if(str.charAt(j)=='(' || str.charAt(j) =='[')
					st.add(str.charAt(j));
				else if(!st.isEmpty() && str.charAt(j)==')'){
					if(st.peek()=='(')
						st.pop();
					else {
						ans = "no";
						break;
					}
				}
				else if(!st.isEmpty() && str.charAt(j)==']'){
					if(st.peek()=='[')
						st.pop();
					else {
						ans = "no";
						break;
					}
				}
				else if(st.isEmpty() && (str.charAt(j)==')' || str.charAt(j) ==']')) {
					ans = "no";
					break;
				}
			}
			if(!st.isEmpty())
				ans = "no";
			System.out.println(ans);
		}
	}
}
