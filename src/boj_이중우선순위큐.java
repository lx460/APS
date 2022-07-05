import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class boj_이중우선순위큐 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			int k = Integer.parseInt(br.readLine());
			TreeMap<Integer, Integer> q = new TreeMap<>();
			for (int j = 0; j < k; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				String cmd = st.nextToken();
				int v = Integer.parseInt(st.nextToken());
				switch (cmd) {
				case "I":
					if (q.containsKey(v)) {
						int cnt = q.get(v) + 1;
						q.remove(v);
						q.put(v, cnt);
					} else
						q.put(v, 1);
					break;
				case "D":
					if (q.isEmpty())
						continue;
					else {
						int num = (v == -1) ? q.firstKey() : q.lastKey();
						int cnt = q.get(num) - 1;
						q.remove(num);
						if(cnt > 0)
							q.put(num, cnt);
					}
					break;
				}
			}
			if(q.isEmpty())
				sb.append("EMPTY").append("\n");
			else
				sb.append(q.lastKey()).append(" ").append(q.firstKey()).append("\n");
		}
		System.out.println(sb.toString());
	}
}
