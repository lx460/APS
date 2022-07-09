import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class boj18870_좌표압축 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		HashSet<Integer> set = new HashSet<>();
		int[] arr1 = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
			set.add(arr1[i]);
		}
		ArrayList<Integer> list = new ArrayList<>(set);
		Collections.sort(list);
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < list.size(); i++) {
			map.put(list.get(i), i);
		}
		for (int i = 0; i < arr1.length; i++) {
			sb.append(map.get(arr1[i])).append(" ");
		}
		System.out.println(sb.toString());
	}

}
