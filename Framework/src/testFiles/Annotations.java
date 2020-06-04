package testFiles;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeMethod //pre-requiste
	public void userIdGeneration(){
		
		System.out.println("@BeforeMethod ---->This block execute before each Test");
	}
	
	@AfterMethod //post-requiste
	public void reportAdding(){
		
		System.out.println("@AfterMethod -----> This block execute after each Test");
	}
	
	@BeforeTest //pre-requiste for all testcases
	public void cookies(){
		
		System.out.println("@BeforeTest -----> This block executes before all Testcases");
	}
	
	@AfterTest //post-requiste for all testcases
	public void cookiesClose(){
		
		System.out.println("@AfterTest ------> This block executes after all Testcases");
	}
	
	@Test
	public void openBrowser(){
		
		System.out.println("@Test ----> Executing Test 2");
	}
	
	@Test
	public void flightBooking(){
		
		System.out.println("@Test -----> Executing Test 1");
	}

}
