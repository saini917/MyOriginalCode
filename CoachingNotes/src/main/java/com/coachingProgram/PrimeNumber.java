package com.coachingProgram;

public class PrimeNumber {

	// lowest prime number is 2,3
	public static boolean isPrimeNum(int num) {

		if (num <= 1) {
			return false;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void getPrimeNumbers(int num) {
		for (int j = 2; j <= num; j++) {
			if (isPrimeNum(j))
				System.out.print(j + " ");
		}

	}

	public static void main(String[] args) {
		System.out.println("2 is prime number:" + isPrimeNum(2));
		System.out.println("3 is prime number:" + isPrimeNum(3));
		System.out.println("10 is prime number:" + isPrimeNum(10));
		System.out.println("40 is prime number:" + isPrimeNum(40));
		System.out.println("61 is prime number:" + isPrimeNum(61));
		System.out.println("99 is prime number:" + isPrimeNum(99));
		System.out.println("0 is prime number:" + isPrimeNum(0));
		System.out.println("1 is prime number:" + isPrimeNum(1));
		System.out.println("-3 is prime number:" + isPrimeNum(-3));

		getPrimeNumbers(20);
		getPrimeNumbers(10);
		getPrimeNumbers(5);

	}

}
