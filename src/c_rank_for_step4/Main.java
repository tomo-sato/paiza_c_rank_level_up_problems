package c_rank_for_step4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		Scanner sc = new Scanner(System.in);
		int roopCount = Integer.parseInt(sc.nextLine());

		Map<String, Integer> map = new HashMap<String, Integer>();

		int count = 1;
		for (int i = 0; i < roopCount; i++) {
			String key = sc.nextLine();

			if (!map.containsKey(key)) {
				map.put(key, count);
			}
			count++;
		}
		String key2 = sc.nextLine();

		System.out.println(map.get(key2));
	}
}