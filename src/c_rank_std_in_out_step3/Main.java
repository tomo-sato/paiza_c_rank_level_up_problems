package c_rank_std_in_out_step3;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		Scanner sc = new Scanner(System.in);
		int tmp = 0;

		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			if ("".equals(line)) {
				break;
			}
			int tmpLine = Integer.parseInt(line);
			if (tmp < tmpLine) {
				tmp = tmpLine;
			}
		}

		System.out.println(tmp);
	}
}