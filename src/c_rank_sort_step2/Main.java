package c_rank_sort_step2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		List<Integer> intList = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {

			int tmp = sc.nextInt();
			int listSize = intList.size();

			if (listSize > 0) {

				boolean isAdd = false;
				for (int j = 0; j < listSize; j++) {
					int tmp2 = intList.get(j);

					// 値の詰替
					if (tmp > tmp2) {
						intList.add(j, tmp);
						isAdd = true;
						break;
					}
				}

				if (!isAdd) {
					intList.add(tmp);
				}
			} else {
				intList.add(tmp);
			}
		}

		for (int i : intList) {
			System.out.println(i);
		}
	}
}