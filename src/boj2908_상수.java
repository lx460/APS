import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2908_상수 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		String str1 = st.nextToken();
		String str2 = st.nextToken();
		String rStr1 = "";
		String rStr2 = "";
		for (int i = str1.length()-1; i >=0; i--) {
			rStr1 += str1.charAt(i);
			rStr2 += str2.charAt(i);
		}
		int a = Integer.parseInt(rStr1);
		int b = Integer.parseInt(rStr2);
		if (a>b)
			System.out.println(a);
		else
			System.out.println(b);
		
	}
}
