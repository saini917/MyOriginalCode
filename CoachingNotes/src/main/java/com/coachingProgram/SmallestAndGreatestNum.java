package com.coachingProgram;

public class SmallestAndGreatestNum {

	static int[] number = { -10, 23, 54, 67, -88,-99, 77878 };
	static int largest = number[0];
	static int smallest = number[0];

	public static void main(String[] args) {
		for (int i = 1; i < number.length; i++) {
			if (number[i] > largest) {
				largest = number[i];
			}
			else if (number[i] < smallest) {
				smallest = number[i];
			}
		}
		System.out.println("smallest number:"+smallest +"," + "largest number:" +largest);
	}

}
