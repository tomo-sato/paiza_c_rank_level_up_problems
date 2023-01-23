package c_rank_string_step1;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		for (int i = size; i > 0; i--) {
			String str = sc.next();
			System.out.println(str.length());
		}
	}
}