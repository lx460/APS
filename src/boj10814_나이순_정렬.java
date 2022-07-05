import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class boj10814_나이순_정렬 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] user = new String[N];
		for (int i = 0; i < N; i++) {
			user[i] = br.readLine();
		}
		Arrays.sort(user, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				StringTokenizer st1 = new StringTokenizer(o1, " ");
				StringTokenizer st2 = new StringTokenizer(o2, " ");
				return Integer.compare(Integer.parseInt(st1.nextToken()), Integer.parseInt(st2.nextToken()));
			};
		});
		for (int i = 0; i < N; i++) {
			System.out.println(user[i]);
		}

	}
}
