package com.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("deepak");
		ll.add("siya");
		ll.add("saini");
		System.out.println(ll);

		// addfirst
		ll.addFirst("reema");
		System.out.println(ll);

		// addlast
		ll.addLast("ved");
		System.out.println(ll);

		// how to get:
		// ll.get(1);
		System.out.println(ll.get(1));

		// how to set:
		ll.set(0, "rashpal");
		System.out.println(ll.get(0));

		// how to remove first and last:
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);

		ll.remove(1);
		System.out.println(ll);

		// how to print all the value of linkedlist:
		// for loop
		System.out.println("********using for loop********");
		for (int n = 0; n < ll.size(); n++) {
			System.out.println(ll.get(n));
		}

		// for advance loop
		System.out.println("********using advance for loop********");
		for (String str : ll) {
			System.out.println(str);
		}

		// using iterator
		System.out.println("********using iterator********");
		Iterator<String> itr = ll.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// while loop
		System.out.println("********using while loop********");
		int num = 0; 
		while (ll.size() > num) {
			System.out.println(ll.get(num));
			num++;
		}
	}

}
