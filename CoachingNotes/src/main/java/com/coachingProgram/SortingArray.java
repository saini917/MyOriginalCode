package com.coachingProgram;

import java.util.Arrays;

public class SortingArray {
	static String[] str = { "e", "a", "o", "i", "u" };
	static String temp;
	static int i, j;

	public static void main(String[] args) {

		System.out.println(Arrays.toString(sort(str)));
		stringArraySorting();
		compareCustomString();
	}

	// first way
	public static String[] sort(String[] a) {
		int length = a.length;
		for (i = 0; i < length; i++) {
			for (j = i + 1; j < length; j++) {
				if (a[i].compareTo(a[j]) > 0) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;

	}

	// 2nd way
	public static void stringArraySorting() {
		String str[] = { "f", "a", "q", "z", "w" };
		int len = str.length;
		for (int i = 0; i < len; i++) {
			char c = str[i].charAt(0);
			for (int j = i + 1; j < len; j++) {
				char c1 = str[j].charAt(0);
				if (c > c1) {
					String tmp = str[i];
					str[i] = str[j];
					str[j] = tmp;
				}
			}

		}
		System.out.println(Arrays.toString(str));
	}

	public static void compareCustomString() {
		String str = "deepak saini";
		char ch[] = str.toCharArray();
		int len = ch.length;
		for (int i = 0; i < len; i++) {
			//char c = ch[i];
			for (int j = i + 1; j < len; j++) {
				//char c1 = ch[j];
				if (ch[i] > ch[j]) {
					char tmp = ch[i];
					ch[i] = ch[j];
					ch[j] = tmp;
					//c = ch[i];
				}
			}
		}
		System.out.println(ch);
	}

}
