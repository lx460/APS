import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class boj11286_절댓값힙 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> heap = new PriorityQueue<>(
				(o1, o2) -> Math.abs(o1) == Math.abs(o2) ? Integer.compare(o1, o2)
						: Integer.compare(Math.abs(o1), Math.abs(o2)));
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			if (num == 0) {
				if (heap.isEmpty())
					System.out.println(0);
				else
					System.out.println(heap.poll());
			} else
				heap.add(num);
		}
	}
}
