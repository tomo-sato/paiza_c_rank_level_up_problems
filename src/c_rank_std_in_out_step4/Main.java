package c_rank_std_in_out_step4;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int count = Integer.parseInt(line);

		for (int i = count; i > 0; i--) {
			System.out.println(sc.nextLine());
		}
	}
}