package c_rank_for_boss;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		Scanner sc = new Scanner(System.in);
		// 制御行取得（N：人数 M：書く数字の個数 K：マッチしたら1点）
		String[] arr = sc.nextLine().split(" ");
		int num = Integer.parseInt(arr[0]);
		int numberNum = Integer.parseInt(arr[1]);
		int pointNum = Integer.parseInt(arr[2]);

		// 配点データ保持
		List<Integer> pointList = new ArrayList<Integer>();

		// 人数分データ取得
		for (int i = 0; i < num; i++) {
			String[] arr2 = sc.nextLine().split(" ");

			int point = 0;

			// 書いた数字の個数分取得
			for (int j = 0; j < numberNum; j++) {
				int k = Integer.parseInt(arr2[j]);

				if (pointNum == k) {
					point++;
				}
			}

			pointList.add(point);
		}

		for (int point : pointList) {
			System.out.println(point);
		}
	}
}