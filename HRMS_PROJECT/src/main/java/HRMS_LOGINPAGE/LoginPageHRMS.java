package HRMS_LOGINPAGE;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.BrowserDriver;

/** 
 * @author deepak.saini
 * @since 25-10-2017
 */
public class LoginPageHRMS extends BrowserDriver
{
	public WebDriver driver;
	Logger log=Logger.getLogger("devpinoyLogger");

	@FindBy(xpath="//div/input[@id='login']")
	private WebElement emailid;

	@FindBy(xpath="//div/input[@id='password']")
	private WebElement password;

	@FindBy(xpath="//div/button[contains(text(),'Log In')]")
	private WebElement loginbtn;
	
	public void hrms_Employee(String Username,String Password) throws InterruptedException
	{
		try
		{
			emailid.clear();
			HighlightOnElement(emailid);
			emailid.sendKeys(Username);
			//String actual_username="anilnrda@hotmail.com";
			//String actual_username="joining@nayaraipur.com";
			String actual_username="ahuja@yopmail.com";
			Reporter.log("Email ID:"+Username,true);
			log.info("To verify enter the username successfuly ");
			Assert.assertEquals(Username,actual_username);

			password.clear();
			HighlightOnElement(password);
			password.sendKeys(Password);
			String actual_password="nrda@1";
			Reporter.log("Password:"+Password,true);
			log.info("To verify enter the password successfuly ");
			Assert.assertEquals(Password,actual_password);
		}
		catch(Exception StaleElementException)
		{
			StaleElementException.printStackTrace();
		}

		HighlightOnElement(loginbtn);
		loginbtn.click();
		Reporter.log("click on Login button successfully",true);
		log.info("To verify click on Login button successfuly ");
		Thread.sleep(2000);
		waitForSomeTime();
	}
	
	public void hrms_VRS_Employee(String Username,String Password) throws InterruptedException
	{
		try
		{
			emailid.clear();
			HighlightOnElement(emailid);
			emailid.sendKeys(Username);
			//String actual_username="bh.test@gmail.com";
			//String actual_username="srshrivastava@nayaraipur.com";
			//String actual_username="yshiledar@nayaraipur.com";
			//String actual_username="office_sup";
			//String actual_username="rajesh@gmail.com";
			String actual_username="pradeep@nayaraipur.com";
			Reporter.log("Email ID:"+Username,true);
			log.info("To verify enter the username successfuly ");
			Assert.assertEquals(Username,actual_username);

			password.clear();
			HighlightOnElement(password);
			password.sendKeys(Password);
			String actual_password="nrda@1";
			Reporter.log("Password:"+Password,true);
			log.info("To verify enter the password successfuly ");
			Assert.assertEquals(Password,actual_password);
		}
		catch(Exception StaleElementException)
		{
			StaleElementException.printStackTrace();
		}

		HighlightOnElement(loginbtn);
		loginbtn.click();
		Reporter.log("click on Login button successfully",true);
		log.info("To verify click on Login button successfuly ");
		waitForSomeTime();
	}
	
	public void hrms_VRS_CO(String Username,String Password) throws InterruptedException
	{
		try
		{
			emailid.clear();
			HighlightOnElement(emailid);
			emailid.sendKeys(Username);
			//String actual_username="gm_administration";
			String actual_username="eee1";
			Reporter.log("Email ID:"+Username,true);
			log.info("To verify enter the username successfuly ");
			Assert.assertEquals(Username,actual_username);

			password.clear();
			HighlightOnElement(password);
			password.sendKeys(Password);
			String actual_password="nrda@1";
			Reporter.log("Password:"+Password,true);
			log.info("To verify enter the password successfuly ");
			Assert.assertEquals(Password,actual_password);
		}
		catch(Exception StaleElementException)
		{
			StaleElementException.printStackTrace();
		}

		HighlightOnElement(loginbtn);
		loginbtn.click();
		Reporter.log("click on Login button successfully",true);
		log.info("To verify click on Login button successfuly ");
		waitForSomeTime();
	}

	public void hrms_HR(String Username,String Password) throws InterruptedException
	{
		try
		{
			emailid.clear();
			HighlightOnElement(emailid);
			emailid.sendKeys(Username);
			String actual_username="gm_finance@gmail.com";
			Reporter.log("Email ID:"+Username,true);
			log.info("To verify enter the username successfuly ");
			Assert.assertEquals(Username,actual_username);

			password.clear();
			HighlightOnElement(password);
			password.sendKeys(Password);
			String actual_password="nrda@1";
			Reporter.log("Password:"+Password,true);
			log.info("To verify enter the password successfuly ");
			Assert.assertEquals(Password,actual_password);
		}
		catch(Exception StaleElementException)
		{
			StaleElementException.printStackTrace();
		}

		HighlightOnElement(loginbtn);
		loginbtn.click();
		Reporter.log("click on Login button successfully",true);
		log.info("To verify click on Login button successfuly ");
		waitForPageLoad();
		waitForPageLoad();
		waitForSomeTime();
	}
	
	public void hrms_VRS_CEO(String Username,String Password) throws InterruptedException
	{
		try
		{
			emailid.clear();
			HighlightOnElement(emailid);
			emailid.sendKeys(Username);
			//String actual_username="rajat.kumar";
			String actual_username="ceo@hotmail.com";
			Reporter.log("Email ID:"+Username,true);
			log.info("To verify enter the username successfuly ");
			Assert.assertEquals(Username,actual_username);

			password.clear();
			HighlightOnElement(password);
			password.sendKeys(Password);
			String actual_password="nrda@1";
			Reporter.log("Password:"+Password,true);
			log.info("To verify enter the password successfuly ");
			Assert.assertEquals(Password,actual_password);
		}
		catch(Exception StaleElementException)
		{
			StaleElementException.printStackTrace();
		}

		HighlightOnElement(loginbtn);
		loginbtn.click();
		Reporter.log("click on Login button successfully",true);
		log.info("To verify click on Login button successfuly ");
		waitForPageLoad();
		waitForPageLoad();
		waitForSomeTime();
	}
	
	public void hrms_EnquiryOfficer(String Username,String Password) throws InterruptedException
	{
		try
		{
			emailid.clear();
			HighlightOnElement(emailid);
			emailid.sendKeys(Username);
			String actual_username="aman@yopmail.com";
			Reporter.log("Email ID:"+Username,true);
			log.info("To verify enter the username successfuly ");
			Assert.assertEquals(Username,actual_username);

			password.clear();
			HighlightOnElement(password);
			password.sendKeys(Password);
			String actual_password="nrda@1";
			Reporter.log("Password:"+Password,true);
			log.info("To verify enter the password successfuly ");
			Assert.assertEquals(Password,actual_password);
		}
		catch(Exception StaleElementException)
		{
			StaleElementException.printStackTrace();
		}

		HighlightOnElement(loginbtn);
		loginbtn.click();
		Reporter.log("click on Login button successfully",true);
		log.info("To verify click on Login button successfuly ");
		waitForPageLoad();
		waitForPageLoad();
		waitForSomeTime();
	}
	
	public void hrms_HOD(String Username,String Password) throws InterruptedException
	{
		try
		{
			emailid.clear();
			HighlightOnElement(emailid);
			emailid.sendKeys(Username);
			String actual_username="m_administration";
			Reporter.log("Email ID:"+Username,true);
			log.info("To verify enter the username successfuly ");
			Assert.assertEquals(Username,actual_username);

			password.clear();
			HighlightOnElement(password);
			password.sendKeys(Password);
			String actual_password="nrda@1";
			Reporter.log("Password:"+Password,true);
			log.info("To verify enter the password successfuly ");
			Assert.assertEquals(Password,actual_password);
		}
		catch(Exception StaleElementException)
		{
			StaleElementException.printStackTrace();
		}

		HighlightOnElement(loginbtn);
		loginbtn.click();
		Reporter.log("click on Login button successfully",true);
		log.info("To verify click on Login button successfuly ");
		waitForPageLoad();
		waitForPageLoad();
		waitForSomeTime();
	}
	
	public void hrms_CEO(String Username,String Password) throws InterruptedException
	{
		try
		{
			emailid.clear();
			HighlightOnElement(emailid);
			emailid.sendKeys(Username);
			String actual_username="ceo";
			Reporter.log("Email ID:"+Username,true);
			log.info("To verify enter the username successfuly ");
			Assert.assertEquals(Username,actual_username);

			password.clear();
			HighlightOnElement(password);
			password.sendKeys(Password);
			String actual_password="nrda@1";
			Reporter.log("Password:"+Password,true);
			log.info("To verify enter the password successfuly ");
			Assert.assertEquals(Password,actual_password);
		}
		catch(Exception StaleElementException)
		{
			StaleElementException.printStackTrace();
		}

		HighlightOnElement(loginbtn);
		loginbtn.click();
		Reporter.log("click on Login button successfully",true);
		log.info("To verify click on Login button successfuly ");
		waitForPageLoad();
		waitForPageLoad();
		waitForSomeTime();
	}
	
	public void hrms_FM(String Username,String Password) throws InterruptedException
	{
		try
		{
			emailid.clear();
			HighlightOnElement(emailid);
			emailid.sendKeys(Username);
			//String actual_username="office_sup@gmail.com";
			String actual_username="gm_finance@gmail.com";
			Reporter.log("Email ID:"+Username,true);
			log.info("To verify enter the username successfuly ");
			Assert.assertEquals(Username,actual_username);

			password.clear();
			HighlightOnElement(password);
			password.sendKeys(Password);
			String actual_password="nrda@1";
			Reporter.log("Password:"+Password,true);
			log.info("To verify enter the password successfuly ");
			Assert.assertEquals(Password,actual_password);
		}
		catch(Exception StaleElementException)
		{
			StaleElementException.printStackTrace();
		}

		HighlightOnElement(loginbtn);
		loginbtn.click();
		Reporter.log("click on Login button successfully",true);
		log.info("To verify click on Login button successfuly ");
		waitForPageLoad();
		waitForPageLoad();
		waitForSomeTime();
	}
	
	public void hrms_BOD(String Username,String Password) throws InterruptedException
	{
		try
		{
			emailid.clear();
			HighlightOnElement(emailid);
			emailid.sendKeys(Username);
			String actual_username="test.bod@gmail.com";
			Reporter.log("Email ID:"+Username,true);
			log.info("To verify enter the username successfuly ");
			Assert.assertEquals(Username,actual_username);

			password.clear();
			HighlightOnElement(password);
			password.sendKeys(Password);
			String actual_password="nrda@1";
			Reporter.log("Password:"+Password,true);
			log.info("To verify enter the password successfuly ");
			Assert.assertEquals(Password,actual_password);
		}
		catch(Exception StaleElementException)
		{
			StaleElementException.printStackTrace();
		}

		HighlightOnElement(loginbtn);
		loginbtn.click();
		Reporter.log("click on Login button successfully",true);
		log.info("To verify click on Login button successfuly ");
		waitForPageLoad();
		waitForPageLoad();
		waitForSomeTime();
	}
	
	public void hrms_AM(String Username,String Password) throws InterruptedException
	{
		try
		{
			emailid.clear();
			HighlightOnElement(emailid);
			emailid.sendKeys(Username);
			String actual_username="office_sup@gmail.com";
			Reporter.log("Email ID:"+Username,true);
			log.info("To verify enter the username successfuly ");
			Assert.assertEquals(Username,actual_username);

			password.clear();
			HighlightOnElement(password);
			password.sendKeys(Password);
			String actual_password="nrda@1";
			Reporter.log("Password:"+Password,true);
			log.info("To verify enter the password successfuly ");
			Assert.assertEquals(Password,actual_password);
		}
		catch(Exception StaleElementException)
		{
			StaleElementException.printStackTrace();
		}

		HighlightOnElement(loginbtn);
		loginbtn.click();
		Reporter.log("click on Login button successfully",true);
		log.info("To verify click on Login button successfuly ");
		waitForPageLoad();
		waitForPageLoad();
		waitForSomeTime();
	}
	
}
