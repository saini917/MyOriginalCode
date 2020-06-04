package com.restdatadriven;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class SampleTest{
	static DataDrivenUtil util = new DataDrivenUtil();
	@SuppressWarnings("rawtypes")
	static ArrayList list = new ArrayList<>();

	@Test
	public void mtest() throws IOException {

		list = util.getData("Login", "testdata");
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));

	}

}
