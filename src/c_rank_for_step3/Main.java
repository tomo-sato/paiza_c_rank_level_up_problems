package c_rank_for_step3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		Scanner sc = new Scanner(System.in);
		int roopCount = sc.nextInt();

		// 含まれる文字の抽出
		List<String> strList = new ArrayList<String>();
		for (int i = 0; i < roopCount; i++) {
			strList.add(sc.next());
		}

		int roopCount2 = sc.nextInt();

		// チェック対象の文字の抽出
		List<String> strList2 = new ArrayList<String>();
		for (int i = 0; i < roopCount2; i++) {
			strList2.add(sc.next());
		}

		// 文字が含まれているかどうかの確認
		for (String str : strList) {
			for (String str2 : strList2) {
				if (str2.indexOf(str) >= 0) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
		}
	}
}