import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2884_알람시계 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		m = m -45;
		if(m<0) {
			m = 60 +m;
			if(h != 0)
				h = h -1;
			else
				h = h+23;
		}
		System.out.println(h +" " +m);
	}
}
