import java.io.BufferedReader;
import java.io.InputStreamReader;

public class boj1157_단어공부 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int[] arr = new int[26];
		int max = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				arr[str.charAt(i) - 97]++;
				max = Math.max(arr[str.charAt(i)-97], max);
			}
			else {
				arr[str.charAt(i) - 65]++;
				max = Math.max(arr[str.charAt(i)-65], max);
			}
		}
		int cnt = 0;
		char ans = '?';
		for(int i = 0; i<26; i++) {
			if(arr[i] == max) {
				ans = (char) (i + 65);
				cnt++;
			}
		}
		if (cnt >1)
			ans = '?';
		System.out.println(ans);
	}
}
