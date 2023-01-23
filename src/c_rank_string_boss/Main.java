package c_rank_string_boss;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws Exception {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

		for (int i = 0; i < size; i++) {
			String strDateTime = sc.next();
			int hour = sc.nextInt();
			int minutes = sc.nextInt();

			Calendar cal = Calendar.getInstance();
			Date dateTime = sdf.parse(strDateTime);

			cal.setTime(dateTime);
			cal.add(Calendar.HOUR_OF_DAY, hour);
			cal.add(Calendar.MINUTE, minutes);

			System.out.println(sdf.format(cal.getTime()));
		}
	}
}