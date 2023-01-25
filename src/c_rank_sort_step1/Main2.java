package c_rank_sort_step1;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < size;) {
			int a = arr[i];
			int b = 0;

			if ((i + 1) < size) {
				b = arr[i + 1];
			} else {
				size--;
				i = 0;
				continue;
			}

			if (a > b) {
				arr[i] = b;
				arr[i + 1] = a;
			}
			i++;
		}

		for (int i : arr) {
			System.out.println(i);
		}
	}
}