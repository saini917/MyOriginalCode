package com.coachingProgram;

public class Uniqueletter {
	static String str = "deepak saini";
	static String characters = "";
	static String duplicates = "";

	public static void main(String[] args) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String current = Character.toString(ch);
			if (characters.contains(current.trim())) {
				if (!duplicates.contains(current.trim())) {
					duplicates += current;
				}
			}
			characters += current;

		}
		System.out.println(duplicates);
		//System.out.println(duplicates.length());
	}

}
