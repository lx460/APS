import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class boj10816_숫자카드2 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < N; i++) {
			int key = Integer.parseInt(st.nextToken());
			int value = 0;
			if(map.containsKey(key))
				value = map.get(key);
			else
				value = 0;
			map.put(key, ++value);
		}
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < M; i++) {
			int key = Integer.parseInt(st.nextToken());
			if(map.containsKey(key))
				sb.append(map.get(key)).append(" ");
			else
				sb.append(0).append(" ");
		}
		System.out.println(sb.toString());
	}
}
