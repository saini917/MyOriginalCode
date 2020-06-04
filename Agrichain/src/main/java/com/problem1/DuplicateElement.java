package com.problem1;

public class DuplicateElement {

	static String str = "abcdfghjgabcdfgkkkkkkk";
	static String characters = "";
	static String duplicates = "";

	public static void main(String[] args) {

		for (int i = 0; i < str.length(); i++) {
			String current = Character.toString(str.charAt(i));
			if (characters.contains(current)) {
				if (!duplicates.contains(current)) {
					duplicates += current;
				}
			}
			characters += current;
		}
		System.out.println(duplicates);
		System.out.println(duplicates.length());
	}

}
