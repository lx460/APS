import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class boj11866_요세푸스문제0 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i <= N; i++) {
			list.add(i);
		}
		int idx = K - 1;
		sb.append("<");
		while (!list.isEmpty()) {
			if (idx < list.size()) {
				sb.append(list.get(idx)).append(", ");
				list.remove(idx);
			} else {
				while (idx >= list.size()) {
					idx = idx - list.size();
				}
				sb.append(list.get(idx)).append(", ");
				list.remove(idx);
			}
			idx += K - 1;
		}
		for (int i = 0; i < 2; i++) {
			sb.deleteCharAt(sb.length()-1);
		}
		sb.append(">");
		System.out.println(sb.toString());
	}
}
