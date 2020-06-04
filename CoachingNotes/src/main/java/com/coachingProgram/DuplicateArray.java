package com.coachingProgram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class DuplicateArray {

	static String sdup[] = { "abc", "java", "testing", "java", "testing" };
	static int idup[] = { 1, 2, 3, 2, 3 };
	static int len = sdup.length;

	public static void main(String[] args) {

		/*
		 * stringDuplicate(); System.out.println(); intDuplicate();
		 * stringDuplicate1();
		 */
		stringDuplicate2();
	}

	// first approach (time complexity is on2)
	public static void stringDuplicate() {
		System.out.println("String duplicate value:");
		for (int index = 0; index < len; index++) {
			for (int j = index + 1; j < len; j++) {
				if (sdup[index] == sdup[j]) {
					System.out.print(sdup[index] + " ");
				}

			}

		}
	}

	// Second approach using hashset class(time complexity is on)
	public static void stringDuplicate1() {
		System.out.println("String duplicate value:");
		Set<String> store = new HashSet<String>();
		for (String names : sdup) {
			if (store.add(names) == false) {
				System.out.println(names);
			}
		}

	}

	// 3rd approach using hashmap class(time complexity is on)
	public static void stringDuplicate2() {
		System.out.println("String duplicate value:");
		Map<String, Integer> storemap = new HashMap<String, Integer>();
		for (String name : sdup) {
			Integer count = storemap.get(name);
			if (count == null) {
				storemap.put(name, 1);
			}
			else{
				storemap.put(name, ++count);
			}

		}
		
		//get the value from this hashmap
		Set<Entry<String, Integer>> entryset=storemap.entrySet();
		for(Entry<String, Integer> entry:entryset){
			if(entry.getValue()>1){
				System.out.println(entry.getKey());
			}
		}
	}

	public static void intDuplicate() {
		System.out.println("Integer duplicate value:");
		for (int index = 0; index < len; index++) {
			for (int j = index + 1; j < len; j++) {
				if (idup[index] == idup[j]) {

					System.out.print(idup[index] + " ");
				}
			}

		}

	}

}
