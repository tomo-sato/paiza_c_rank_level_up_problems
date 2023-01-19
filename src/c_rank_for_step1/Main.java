package c_rank_for_step1;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		Scanner sc = new Scanner(System.in);
		int tmp = Integer.parseInt(sc.nextLine());
		String[] arr = sc.nextLine().split(" ");

		int count = 0;
		for (int i = 0; i < tmp; i++) {
			int tmp2 = Integer.parseInt(arr[i]);
			if (tmp2 % 3 == 0) {
				count++;
			}
		}

		System.out.println(count);
	}
}