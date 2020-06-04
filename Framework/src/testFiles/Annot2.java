package testFiles;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annot2 {
	
	@BeforeSuite
	public void installSoftware(){
		
		System.out.println("@BeforeSuite -----> I am the first");
	}
	
	@Test
	public void software(){
		
		System.out.println("@Test -----> I am the test");
	}
	
	@AfterSuite
	public void deinstallSoftware(){
		
		System.out.println("@AfterSuite -----> I am the last");
	}

}
