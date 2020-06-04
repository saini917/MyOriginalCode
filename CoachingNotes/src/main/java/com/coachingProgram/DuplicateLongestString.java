package com.coachingProgram;

import java.util.HashMap;
import java.util.Map;

public class DuplicateLongestString {

	static String str = "";
	static String characters = "";
	static String duplicates = "";
	static char[] arr = str.toCharArray();

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
		System.out.println("Duplicates:"+duplicates);
		System.out.println("length:" +duplicates.length());
		repeatedLetterCount();
	}

	//The containsKey(Object key) method is used to check if this map contains a mapping for the specified key.
	public static void repeatedLetterCount() {
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		for (char value : arr) {

			if (Character.isLetter(value) || Character.isDigit(value)) {
				if (charMap.containsKey(value)) {
					charMap.put(value, charMap.get(value)+1);

				} else {
					charMap.put(value, 1);
				}
			}
		}

		System.out.println(charMap);
	}
}
