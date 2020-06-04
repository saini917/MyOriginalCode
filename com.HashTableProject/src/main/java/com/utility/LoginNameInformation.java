package com.utility;

import java.util.Hashtable;

public class LoginNameInformation {
	static String rolewise;
	
	public static Hashtable<String, String> loginInformation() {

		Hashtable<String,String> userData=new Hashtable<String, String>();
		userData.put("Farmer", "Deepaksaini:Hphds@123#");
		userData.put("HDO", "jyoti.thakur:Hphds@123#");
		userData.put("SMS", "santosh.bakshi:Hphds@123#");
		userData.put("DDH", "rajinder.b:Hphds@123#");

		return userData;
	}
	
	public static String getUserName(String role){
		rolewise=loginInformation().get(role);
		return rolewise.split(":")[0];
	}
	
	public static String getUserPassword(String role){
		rolewise=loginInformation().get(role);
		return rolewise.split(":")[1];
	}

}
