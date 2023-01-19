package c_rank_std_in_out_step6;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		Scanner sc = new Scanner(System.in);
		int count = Integer.parseInt(sc.nextLine());
		String[] lines = sc.nextLine().split(" ");

		for (int i = 0; i < count; i++) {
			System.out.println(lines[i]);
		}
	}
}