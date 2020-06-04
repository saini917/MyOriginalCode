package com.TestngBasics;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {

	// how to handle the exception using testng

	/*
	 * @Test(invocationTimeOut = 2, expectedExceptions =
	 * ArrayIndexOutOfBoundsException.class) public void infinteLoopTest() { int
	 * i = 1; while (i == 1) { System.out.println(i); } }
	 */

	@Test(expectedExceptions = NumberFormatException.class)
	public void test() {
		String s = "123v";
		Integer.parseInt(s);
	}

}
