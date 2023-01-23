package c_rank_for_step2;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		Scanner sc = new Scanner(System.in);
		int tmp = 0;

		String output = "NO";
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			if ("".equals(line)) {
				break;
			}
			int tmpLine = Integer.parseInt(line);
			// TODO tomo-sato 7が含まれているかどうかなので、これはバグってる。。
			if (tmpLine == 7) {
				output = "YES";
				break;
			}
		}

		System.out.println(output);

	}
}