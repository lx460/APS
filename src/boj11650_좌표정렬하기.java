import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class boj11650_좌표정렬하기 {
	static class xy {
		int x;
		int y;

		public xy(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		xy[] arr = new xy[N];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			arr[i] = new xy(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		Arrays.sort(arr, new Comparator<xy>() {
			@Override
			public int compare(xy o1, xy o2) {
				if (o1.x == o2.x)
					return Integer.compare(o1.y, o2.y);
				else
					return Integer.compare(o1.x, o2.x);
			}
		});
		for (int i = 0; i < N; i++) {
			System.out.println(arr[i].x+" "+arr[i].y);
		}
	}
}
