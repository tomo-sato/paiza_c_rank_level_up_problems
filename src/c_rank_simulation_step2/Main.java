package c_rank_simulation_step2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		int startPaiza = 1;
		int startKyoko = 1;

		int count = 0;
		for (int i = 0; i <= n;) {
			startKyoko = startKyoko + (startPaiza * a);
			count++;
			startPaiza = startPaiza + (startKyoko % b);

			i = startKyoko;
		}

		System.out.println(count);
	}
}