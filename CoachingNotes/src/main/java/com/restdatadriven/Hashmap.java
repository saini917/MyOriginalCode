package com.restdatadriven;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class Hashmap {

	@Test
	public void test() throws IOException {
		DataDrivenUtil d = new DataDrivenUtil();
		@SuppressWarnings("rawtypes")
		ArrayList list = d.getData("RestAddBook","RestAssured");
		HashMap<String, Object> map = new HashMap<>();
		map.put("name", list.get(1));
		map.put("isbn", list.get(2));
		map.put("aisle", list.get(3));
		map.put("author", list.get(4));
		
		for (@SuppressWarnings("rawtypes") Map.Entry hm : map.entrySet()) {
			System.out.println(hm.getKey() + " : " + hm.getValue());
		}
 
	}

}
