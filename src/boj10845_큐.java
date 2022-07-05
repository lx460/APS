import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class boj10845_큐 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			switch (st.nextToken()) {
			case "push":
				list.add(0, Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				if ((list.isEmpty()))
					System.out.println(-1);
				else {
					System.out.println(list.get(list.size() - 1));
					list.remove(list.size() - 1);
				}
				break;
			case "empty":
				if (list.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
				break;
			case "size":
				System.out.println(list.size());
				break;
			case "back":
				if (list.isEmpty())
					System.out.println(-1);
				else
					System.out.println(list.get(0));
				break;
			case "front":
				if (list.isEmpty())
					System.out.println(-1);
				else
					System.out.println(list.get(list.size() - 1));
				break;
			}
		}
	}
}
