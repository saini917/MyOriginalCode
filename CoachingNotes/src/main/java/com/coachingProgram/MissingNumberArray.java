package com.coachingProgram;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingNumberArray {

	static int[] x = { 10, 9, 6, 7, 4, 3, 5, 1, 2 };
	static int j = x[0];

	public static void main(String[] args) {

		System.out.println(Arrays.toString(sort(x)));
		findMissingNumber();
	}

	// one way
	// find missing element
	public static void findMissingNumber() {
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum = sum + x[i];
		}
		System.out.println(sum);

		int sum1 = 0;
		for (int j = 1; j <= 10; j++) {
			sum1 = sum1 + j;
		}
		System.out.println(sum1);

		System.out.println("Missing number:" + (sum1 - sum));

	}

	// 2nd way
	// find missing element
	public static void findMissinigNumner() {
		ArrayList<Integer> arr = new ArrayList<Integer>();

		for (int i = 0; i < x.length; i++) {
			if (j == x[i]) {
				j++;
				continue;
			} else {

				arr.add(j);
				j++;
				i--;
			}

		}

		for (int array : arr) {
			System.out.println(array);
		}

	}

	// 2nd way
	// find missing element
	public static void findMissinigNumer() {
		ArrayList<Integer> arr = new ArrayList<Integer>();

		for (int i = 0; i < x.length; i++) {
			if (j == x[i]) {
				j++;
				continue;
			} else {

				arr.add(j);
				j++;
				i--;
			}

		}

		for (int array : arr) {
			System.out.println(array);
		}

	}

	// for sorting
	public static int[] sort(int[] a) {
		int i, j, temp, length = a.length;

		for (i = 0; i < length; i++) {
			for (j = 0; j < length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		return a;
	}

}
