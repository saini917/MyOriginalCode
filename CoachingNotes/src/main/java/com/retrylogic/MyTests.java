package com.retrylogic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTests{
	
	//This is test level --- not a good approach
	/*@Test(priority=1, retryAnalyzer=com.retrylogic.RetryAnalyzer.class)
	public void test(){
		Assert.assertEquals(false,true);
	}*/
	
	/*@Test(priority=2, retryAnalyzer=com.retrylogic.RetryAnalyzer.class)
	public void test1(){
		Assert.assertEquals(false,true);
	}*/
	
	//This is runtime  level --- good approach
	@Test(priority=1)
	public void test(){
		Assert.assertEquals(false,true);
	}
	
	@Test(priority=2)
	public void test1(){
		Assert.assertEquals(false,true);
	}
	@Test(priority=3)
	public void test2(){
		Assert.assertEquals(true,true);
	}


}
