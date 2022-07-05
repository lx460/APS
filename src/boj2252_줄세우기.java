import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class boj2252_줄세우기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int E = sc.nextInt();
		ArrayList<Integer>[] adj = new ArrayList[V + 1];
		for (int i = 0; i <= V; i++)
			adj[i] = new ArrayList<>();
		int[] indegree = new int[V + 1];

		for (int i = 0; i < E; i++) {
			int st = sc.nextInt();
			int ed = sc.nextInt();
			adj[st].add(ed);
			indegree[ed]++;
		}

		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 1; i <= V; i++) {
			if (indegree[i] == 0)
				q.add(i);
		}
		while (!q.isEmpty()) {
			int now = q.poll();
			System.out.print(now + " ");
			for (int i = 0; i < adj[now].size(); i++) {
				indegree[adj[now].get(i)]--;
				if (indegree[adj[now].get(i)] == 0)
					q.add(adj[now].get(i));
			}
		}
	}
}
