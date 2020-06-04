package testFiles;

import org.testng.annotations.Test;

public class DependencyAnnot {
	//lecture 98 follow
	@Test
	public void openBrowser(){
		
		System.out.println("@Test ----> Executing opening browser");
	}
	
	@Test(dependsOnMethods={"openBrowser"},alwaysRun=true)
	public void flightBooking(){
		
		System.out.println("@Test -----> Executing FlightBooking");
	}
	

	@Test(timeOut=45000)
	public void timeRelated(){
		
		System.out.println("@Test ----> New Testcase execute within 45000");
	}

	@Test(enabled=false)
	public void payment(){
		
		System.out.println("@Test ----> New Testcase");
	}

}
