package com.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {

	// Hashmap is a class implements the Map interface and extends Abstractmap class
	// it contains only unique value
	// stores the value- key- value pair
	// it may have one null key and multiple null values
	// it maintains no order
	// hashmap is non synchronized -- not thread safe
	// concurrent modification exception -- Fail - Fast condtion
	// Returns type of put method depends upon the value not on key
	// performance wise good

	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(1, "selenium");
		m.put(2, "QTP");
		m.put(3, "testcomplete");
		m.put(4, "rft");
		m.put(4, "rft");
		m.put(null, "rft");
		m.put(null, null);
		System.out.println(m.get(1));
		System.out.println(m.get(4));

		for (Map.Entry<Integer, String> hm : m.entrySet()) {
			System.out.println(hm.getKey() + " " + hm.getValue());
		}
		System.out.println(m);
		m.remove(3);
		System.out.println(m);

		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		Employee e1 = new Employee("deepak", 30, "QA");
		Employee e2 = new Employee("tom", 33, "Admin");
		Employee e3 = new Employee("peter", 20, "Dev");
		Employee e4 = new Employee("Steve", 40, "Manager");

		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		emp.put(4, e4);

		// traverse the haspmap

		for (Map.Entry<Integer, Employee> map : emp.entrySet()) {
			int key = map.getKey();
			Employee e = map.getValue();
			System.out.println("Employee " + key + " info: ");
			System.out.println(e.name + " " + e.age + " " + e.dept);

		}
	}

}
