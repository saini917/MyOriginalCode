package com.assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertClass {

	SoftAssert softassert = new SoftAssert();

	@Test
	public void test() {
		System.out.println("open broswer");
		// Hard assertion if any particular assertion is getting failed immediately
		// -- after that all the corresponding line in that particular testcases is not executed
		// -- and that particular test immediately terminated and this test case
		// marked as failed test case
		Assert.assertEquals(true, true);

		System.out.println("enter username");
		System.out.println("enter password");
		System.out.println("click on sign in button");
		Assert.assertEquals(true, true);// hard assertion

		System.out.println("validate home");
		// soft assertion if any particular assertion is getting failed immediately
		// -- after that all the corresponding line in that particular testcases is executed
		softassert.assertEquals(false, true,"home title is missing");

		System.out.println("go to deals page");
		System.out.println("create deals");
		softassert.assertEquals(false, true,"not able to create deals");

		System.out.println("go to contacts page");
		System.out.println("create contacts");
		softassert.assertEquals(false, true,"not able to creat contacts");
		
		softassert.assertAll();

	}
	@Test
	public void test1() {
		System.out.println("logout");
		softassert.assertEquals(false, true,"not able to logout");
		softassert.assertAll();
	}
}
