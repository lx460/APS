import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class boj2961_도영이 {
	static int[] sour;
	static int[] sweet;
	static int n;
	static boolean[] visitedSour;
	static boolean[] visitedSweet;
	static List<Integer> sourT = new ArrayList<>();
	static List<Integer> sweetT = new ArrayList<>();
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		visitedSour = new boolean[n+1];
		visitedSweet = new boolean[n+1];
		sour = new int[n+1];
		sweet = new int[n+1];
		int min = Integer.MAX_VALUE;
		for (int i = 1; i <= n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			sour[i] = Integer.parseInt(st.nextToken());
			sweet[i] = Integer.parseInt(st.nextToken());
		}
		for (int r = 1; r <= n; r++) {
			comb(1, r);
		}
		for (int i = 0; i<sourT.size(); i++) {
			min = Math.min(min, Math.abs((sourT.get(i)- sweetT.get(i))));
		}
		System.out.println(min);
		
	}
	static void comb(int start, int r) {
		if(r == 0) {
			calculate();
			return;
		} else {
			for(int i = start; i<= n; i++) {
				visitedSour[i] = true;
				visitedSweet[i] = true;
				comb(i+1, r-1);
				visitedSour[i] = false;
				visitedSweet[i] = false;
			}
		}
	}
	
	static void calculate() {
		int mul = 1;
		int sum = 0;
		for(int i = 1; i<=n; i++) {
			if(visitedSour[i])
				mul *= sour[i];
			if(visitedSweet[i])
				sum += sweet[i];
				
		}
		sourT.add(mul);
		sweetT.add(sum);
	}
}
