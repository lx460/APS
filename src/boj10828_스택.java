import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class boj10828_스택 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			switch (st.nextToken()) {
			case "push":
				list.add(Integer.parseInt(st.nextToken()));
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
			case "top":
				if (list.isEmpty())
					System.out.println(-1);
				else
					System.out.println(list.get(list.size() - 1));
				break;
			}
		}
	}
}
