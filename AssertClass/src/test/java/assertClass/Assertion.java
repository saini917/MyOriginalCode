package assertClass;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {

	@Test(priority=1)
	public void softAssert(){
		 SoftAssert softAssertion= new SoftAssert();
		 System.out.println("softAssert Method Was Started");
		 softAssertion.assertTrue(false);
		 System.out.println("softAssert Method Was Executed");
		 softAssertion.assertAll();
		 }
		 
		 @Test(priority=2)
		 public void hardAssert(){
		 System.out.println("hardAssert Method Was Started");
		 Assert.assertTrue(false);
		 System.out.println("hardAssert Method Was Executed");
		 }


}
