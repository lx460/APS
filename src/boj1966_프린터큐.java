import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj1966_프린터큐 {
	static class q{
		int v;
		int idx;
		public q(int v, int idx) {
			this.v = v;
			this.idx = idx;
		}	
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int max = 0;
			int cnt = 1;
			Queue<q> q = new LinkedList<>();
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < n; j++) {
				q.add(new q(Integer.parseInt(st.nextToken()), j));
			}
			
			while(!q.isEmpty()) {
				for (int j = 0; j < q.size(); j++) {
					if(max<q.peek().v) {
						q nQ = q.poll();
						max = nQ.v;
						q.add(new q(max, nQ.idx));
					} else {
						q nQ = q.poll();
						q.add(new q(nQ.v, nQ.idx));
					}
				}
				for (int j = 0; j < q.size(); j++) {
					if(q.peek().v == max) {
						if(q.peek().idx == m){
							System.out.println(cnt);
							q.clear();
						}
						q.poll();
						max = 0;
						break;
					} else {
						q nQ = q.poll();
						q.add(new q(nQ.v, nQ.idx));
					}
				}
				cnt++;
			}
		}
	}
}
