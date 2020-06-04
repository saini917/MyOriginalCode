package com.collection;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableClass {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// it is similar to hashmap but it is synchronized
		// stores the value on the basis of key-value
		// key -- object is used as key -- Hashcode(each object has hashcode) -- value
		// its contains only unique value
		// it have not null key and not null values
		// performance wise is not good

		Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();
		h1.put(1, "tom");
		h1.put(2, "test");
		h1.put(3, "java");
		h1.put(4, null);//nul pointer exception

		// how to create clone copy/shallow copy:
		Hashtable<Integer, String> h2 = new Hashtable<Integer, String>();
		h2 = (Hashtable<Integer, String>) h1.clone();

		System.out.println("The value from h1" + h1);
		System.out.println("The value from h2" + h2);

		h1.clear();

		System.out.println("The value from h1" + h1);
		System.out.println("The value from h2" + h2);

		// contains value
		Hashtable<String, String> st = new Hashtable<String, String>();
		st.put("A", "deepak");
		st.put("B", "QA");
		st.put("C", "Dev");

		if (st.containsValue("QA")) {
			System.out.println("value is found");
		}

		// print all the values from hashtable using Enumeration -elements
		Enumeration<String> e = st.elements();
		System.out.println("print values from st using enumeration");
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

		// get all the values from hashtable -- entryset -- set of hashtable values
		
		System.out.println("print values from st using entry set");

		Set<Entry<String, String>> set = st.entrySet();
		System.out.println(set);
		
		//equals method
		//check both the hashtable are equals or not:
		
		Hashtable<String, String> st1 = new Hashtable<String, String>();
		st1.put("A", "deepak");
		st1.put("B", "QA");
		st1.put("C", "Dev");
		
		if(st.equals(st1)){
			System.out.println("both are equals");
		}
		else{
			System.out.println("both are not equals");
		}
		
		//get the value from key
		System.out.println(st1.get("C"));
		
		//get the hashcode of hashtable object
		System.out.println("the hashcode value of st1: " +st1.hashCode());
		System.out.println("the hashcode value of st: " +st.hashCode());
	}

}
