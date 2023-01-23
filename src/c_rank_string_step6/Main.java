package c_rank_string_step6;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		try {
			Calendar cal = Calendar.getInstance();

			Date dateTime = sdf.parse(str);

			cal.setTime(dateTime);
			cal.add(Calendar.MINUTE, 30);

			System.out.println(sdf.format(cal.getTime()));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}