package c_rank_dictionary_step3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

		List<String> intList = new ArrayList<String>();
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String name = entry.getKey();
			int listSize = intList.size();

			if (listSize > 0) {

				boolean isAdd = false;
				for (int j = 0; j < listSize; j++) {
					String tmp2 = intList.get(j);

					// 値の詰替
					if (name.compareTo(tmp2) < 0) {
						intList.add(j, name);
						isAdd = true;
						break;
					}
				}

				if (!isAdd) {
					intList.add(name);
				}
			} else {
				intList.add(name);
			}
		}

		for (String name : intList) {
			System.out.println(map.get(name));
		}
	}
}