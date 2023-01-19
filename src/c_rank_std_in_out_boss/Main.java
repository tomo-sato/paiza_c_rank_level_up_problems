package c_rank_std_in_out_boss;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		Scanner sc = new Scanner(System.in);
		int tmp = Integer.parseInt(sc.nextLine());

		for (int i = tmp; i > 0; i--) {
			String[] arr = sc.nextLine().split(" ");
			int age = Integer.parseInt(arr[1]);
			System.out.println(arr[0] + " " + (age + 1));
		}
	}
}