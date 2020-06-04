package com.TestngBasics;

import org.testng.annotations.Test;

public class InvocationCountTest {
	
	@Test(invocationCount=8)
	public void sum(){
		int a = 20;
		int b = 30;
		int c = a+b;
		System.out.println("sum is====" +c);
	}
	

}
