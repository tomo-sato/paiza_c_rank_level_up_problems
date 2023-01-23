package c_rank_string_step4;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str2 = sc.nextLine();
		if (str2.indexOf(str) >= 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}