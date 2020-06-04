package com.freecrm;

import java.util.HashMap;

public class HashMapUtility {
	static String rolewise;

	public static HashMap<String, String> getCredentialsMap() {
		HashMap<String, String> userMap = new HashMap<String, String>();
		userMap.put("customer", "naveenautomation:Test@123");
		userMap.put("admin", "arpit:arpit@123");
		userMap.put("seller", "gulnaz:gulnaz@1897");
		userMap.put("Distributer", "chetna:chetna@123433");
		userMap.put("Deliveryboy", "krishna:krishna@1093");
		userMap.put("customercare", "loveleen:loveleen@123");

		return userMap;
	}

	public static String getUserName(String role) {
		rolewise = getCredentialsMap().get(role);
		return rolewise.split(":")[0];
	}

	public static String getUserPassword(String role) {
		rolewise = getCredentialsMap().get(role);
		return rolewise.split(":")[1];
	}
}
