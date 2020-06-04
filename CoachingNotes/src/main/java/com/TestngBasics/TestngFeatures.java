package com.TestngBasics;

import org.testng.annotations.Test;

public class TestngFeatures {
	
	@Test
	public void loginTest(){
		System.out.println("loginTest");
		//int i = 20/0;
	}
	
	@Test(dependsOnMethods="loginT  est")
	public void homeTest(){
		System.out.println("homeTest");
	}

	@Test(dependsOnMethods="loginTest")
	public void searchPageTest(){
		System.out.println("searchPageTest");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void regPageTest(){
		System.out.println("regPageTest");
	}
}
