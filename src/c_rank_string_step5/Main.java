package c_rank_string_step5;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(":");
		for (String s : arr) {
			System.out.println(Integer.parseInt(s));
		}
	}
}