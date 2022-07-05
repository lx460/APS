import java.text.SimpleDateFormat;
import java.util.Date;

public class boj10699_오늘날짜 {
	public static void main(String[] args) {
		Date a = new Date();
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(f.format(a));
	}
}	
