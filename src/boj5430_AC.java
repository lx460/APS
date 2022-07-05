import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class boj5430_AC {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			ArrayList<Integer> list = new ArrayList<>();
			String p = br.readLine();
			Integer.parseInt(br.readLine());
			Boolean check = true;
			int reverse = 1;
			StringTokenizer st = new StringTokenizer(br.readLine(), "[");
			StringTokenizer st2 = new StringTokenizer(st.nextToken(), "]");
			if (st2.hasMoreTokens()) {
				StringTokenizer st3 = new StringTokenizer(st2.nextToken(), ",");
				while (st3.hasMoreTokens()) {
					list.add(Integer.parseInt(st3.nextToken()));
				}
				int idx = 0;
				int rIdx = 0;
				while (idx < p.length()) {
					switch (p.charAt(idx)) {
					case 'R':
						if (rIdx == 0)
							if (list.isEmpty())
								rIdx = 0;
							else
								rIdx = list.size() - 1;
						else
							rIdx = 0;
						reverse *= -1;
						idx++;
						break;
					case 'D':
						if (list.isEmpty()) {
							sb.append("error" + "\n");
							idx = p.length();
							check = false;
						} else {
							list.remove(rIdx);
							if(rIdx != 0)
								rIdx--;
						}
						idx++;
						break;
					}
				}

			} else {
				int idx = 0;
				int rIdx = 0;
				while (idx < p.length()) {
					switch (p.charAt(idx)) {
					case 'R':
						if (rIdx == 0)
							if (list.isEmpty())
								rIdx = 0;
							else
								rIdx = list.size() - 1;
						else
							rIdx = 0;
						reverse *= -1;
						idx++;
						break;
					case 'D':
						if (list.isEmpty()) {
							sb.append("error" + "\n");
							idx = p.length();
							check = false;
						} else {
							list.remove(rIdx);
							if(rIdx != 0)
								rIdx--;
						}
						idx++;
						break;
					}
				}
			}
			if (check) {
				if (reverse == 1) {
					sb.append("[");
					for (int j = 0; j < list.size(); j++) {
						if (j == list.size() - 1)
							sb.append(list.get(j));
						else
							sb.append(list.get(j)).append(",");
					}
					sb.append("]" + "\n");
				}
				else {
					sb.append("[");
					for (int j = list.size()-1; j >= 0; j--) {
						if (j == 0)
							sb.append(list.get(j));
						else
							sb.append(list.get(j)).append(",");
					}
					sb.append("]" + "\n");
				}
			}
		}
		System.out.println(sb.toString());
	}
}
