package c_rank_dictionary_step2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		Scanner sc = new Scanner(System.in);
		// キャラクター人数取得
		int num = sc.nextInt();

		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < num; i++) {
			String name = sc.next();
			int property = 0;

			map.put(name, property);
		}

		// 攻撃回数取得
		num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			String name = sc.next();

			int tmpProperty = map.get(name);
			int property = sc.nextInt();

			map.put(name, property + tmpProperty);
		}

		String searchName = sc.next();
		System.out.println(map.get(searchName));
	}
}