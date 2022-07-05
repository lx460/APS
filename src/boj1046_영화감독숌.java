import java.io.BufferedReader;
import java.io.InputStreamReader;

public class boj1046_영화감독숌 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int devil = 666;
		int cnt = 0;
		while(cnt < N) {
			if(String.valueOf(devil).contains("666"))
				cnt++;
			if(cnt == N)
				break;
			devil++;
		}
		System.out.println(devil);
	}
}
