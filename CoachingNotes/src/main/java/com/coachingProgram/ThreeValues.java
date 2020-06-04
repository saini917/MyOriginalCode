 package com.coachingProgram;

public class ThreeValues {

	static int[] arr = { 8, 2, 4, 6, 2, 7, 5, 10,49,100,3,70};
	static int first, second, third;

	public static void main(String[] args) {

		first = second = third = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			int svalue = arr[i];
			if (first<svalue) {
				third = second;
				second = first;
				first = svalue;
			} else if (second<svalue) {
				third = second;
				second = svalue;
			} else if (third<svalue) {
				third = svalue;

			}
		}
		System.out.println("First highest value:"+first + ", " +"Second highest value:" +second + ", " +"Third highest value:"  +third);
	}
}
