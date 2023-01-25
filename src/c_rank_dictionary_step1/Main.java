package c_rank_dictionary_step1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < num; i++) {
			String name = sc.next();
			int property = sc.nextInt();

			map.put(name, property);
		}

		String searchName = sc.next();
		System.out.println(map.get(searchName));
	}
}