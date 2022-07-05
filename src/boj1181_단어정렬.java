import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class boj1181_단어정렬 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		HashSet<String> set = new HashSet<>();
		
		for (int i = 0; i < N; i++) {
			set.add(br.readLine());
		}
		
		String[] arr = new String[set.size()];
		set.toArray(arr);
		
		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length()) 
					return o1.compareTo(o2);
				else
					return o1.length() - o2.length();
			}
		});
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
