package com.freecrm;

import java.util.HashMap;

public class DeepakHashMap {
	static String rolewise;

	public static HashMap<String, String> getLoginUserData() {
		HashMap<String, String> userData = new HashMap<String, String>();
		userData.put("Farmer", "Deepaksaini:Hphds@123#");
		userData.put("HDO", "jyoti.thakur:Hphds@123#");
		userData.put("SMS", "santosh.bakshi:Hphds@123#");
		userData.put("DDH", "rajinder.b:Hphds@123#");

		return userData;
	}

	public static String getUserName(String role) {
		rolewise = getLoginUserData().get(role);
		return rolewise.split(":")[0];
	}
	
	public static String getUserPassword(String role) {
		rolewise = getLoginUserData().get(role);
		return rolewise.split(":")[1];
	}


}
