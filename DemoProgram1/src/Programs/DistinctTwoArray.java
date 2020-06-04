package Programs;

import java.util.ArrayList;
import java.util.List;

public class DistinctTwoArray {

	static int[] arr1 = new int[] { 1, 2, 3, 4, 5, 6, 7 };
	static int[] arr2 = new int[] { 5, 6, 7, 8, 9 };
	static int i = 0;
	static int j = 0;

	public static void main(String arg[]) {

		boolean contains = false;
		List<Integer> list = new ArrayList<Integer>();
		for (i = 0; i < arr1.length; i++) {
			for (j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					contains = true;
					break;
				}
			}

			if (!contains) {
				list.add(arr1[i]);
			} else {
				contains = false;
			}
		}
		for (i = 0; i < arr1.length; i++) {
			for (j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					contains = true;
					break;
				}
			}

			if (!contains) {
				list.add(arr2[i]);
			} else {
				contains = false;
			}
		}
		System.out.println(list);

	}
}
