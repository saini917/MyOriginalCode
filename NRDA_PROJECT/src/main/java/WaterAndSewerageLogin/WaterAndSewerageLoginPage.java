package WaterAndSewerageLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.BrowserDriver;

/**
 * @author Deepak.saini
 * @since 05-09-2017
 */
public class WaterAndSewerageLoginPage extends BrowserDriver
{
	public WebDriver driver;

	@FindBy(xpath=".//*[@id='loginForm:user']")
	private WebElement emailid;

	@FindBy(xpath=".//*[@id='loginForm:password']")
	private WebElement password;

	@FindBy(xpath="//div/select")
	private WebElement usertype;

	@FindBy(xpath=".//*[@id='loginForm']/div[12]")
	private WebElement anylogo;

	@FindBy(xpath="(//button/span[contains(text(),'Submit')])[1]")
	private WebElement submit;

	public void loginAsCitizen(String username,String Password) throws InterruptedException
	{
		emailid.clear();
		HighlightOnElement(emailid);
		emailid.sendKeys(username);
		//String actual_username="ankit.sharma@gmail.com";
		//String actual_username="nsarvesh001@gmail.com";
		//String actual_username="Nrda@gmail.com";
		//String actual_username="Kamal@gmail.com";
		//String actual_username="8130116479";
		//String actual_username="deepak@ilfstechnologies.com";
		//String actual_username="kapil@ilfstechnologies.com";
		//String actual_username="kapil1@ilfstechnologies.com";
		//String actual_username="seema.sharma@gmail.com";
		//String actual_username="a@gmail.com";
		String actual_username="dee@gmail.com";
		Reporter.log("Email ID:"+username,true);
		Assert.assertEquals(username,actual_username);

		HighlightOnElement(password);
		password.clear();
		password.sendKeys(Password);
		//String actual_password="Vijay@123";
		String actual_password="Nrda@1234";
		Reporter.log("Password:"+Password,true);
		Assert.assertEquals(Password,actual_password);

		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Citizen /Architect Login");
		waitForSomeTime();

		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();
	}


	public void loginAsJE(String username,String Password) throws InterruptedException
	{
		HighlightOnElement(emailid);
		emailid.clear();
		emailid.sendKeys(username);
		//String actual_username="WAT-JE-01";
		String actual_username="eephe";
		Reporter.log("Email ID:"+username,true);
		Assert.assertEquals(username,actual_username);
		HighlightOnElement(password);
		password.clear();
		password.sendKeys(Password);
		//String actual_password="Vijay@123";
		String actual_password="NRDA@170";
		Reporter.log("Password:"+Password,true);
		Assert.assertEquals(Password,actual_password);
		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Officer Login");


		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();
	}

	public void loginAsFE(String username,String Password) throws InterruptedException
	{
		HighlightOnElement(emailid);	
		emailid.clear();
		emailid.sendKeys(username);
		//String actual_username="WAT-FE-01";
		//String actual_username="priyanshu.nrda@NRDA.COM";
		String actual_username="priyanshu.nrda";
		Reporter.log("Email ID:"+username,true);
		Assert.assertEquals(username,actual_username);

		HighlightOnElement(password);
		password.clear();
		password.sendKeys(Password);
		//String actual_password="Vijay@123";
		String actual_password="NRDA@169";
		Reporter.log("Password:"+Password,true);
		Assert.assertEquals(Password,actual_password);
		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Officer Login");
		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();

	}

	public void loginAsEE(String username,String Password) throws InterruptedException
	{
		emailid.clear();
		HighlightOnElement(emailid);
		emailid.sendKeys(username);
		//String actual_username="WAT-EE-01";
		String actual_username="se_engineer";
		Reporter.log("Email ID:"+username,true);
		Assert.assertEquals(username,actual_username);
		password.clear();
		HighlightOnElement(password);
		password.sendKeys(Password);
		//String actual_password="Vijay@123";
		String actual_password="NRDA@133";
		Reporter.log("Password:"+Password,true);
		Assert.assertEquals(Password,actual_password);
		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Officer Login");
		waitForSomeTime();
		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();

	}

	public void loginAsPIO(String username,String Password) throws InterruptedException
	{
		emailid.clear();
		HighlightOnElement(emailid);
		emailid.sendKeys(username);
		String actual_username="m_administration";
		Reporter.log("Email ID:"+username,true);
		Assert.assertEquals(username,actual_username);

		password.clear();
		HighlightOnElement(password);
		password.sendKeys(Password);
		String actual_password="Vijay@123";
		Reporter.log("Password:"+Password,true);
		Assert.assertEquals(Password,actual_password);

		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Officer Login");


		waitForSomeTime();

		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();

	}

	public void loginAsAPIO(String username,String Password) throws InterruptedException
	{
		emailid.clear();
		HighlightOnElement(emailid);
		emailid.sendKeys(username);
		String actual_username="tehsildaar";
		Reporter.log("Email ID:"+username,true);
		Assert.assertEquals(username,actual_username);

		password.clear();
		HighlightOnElement(password);
		password.sendKeys(Password);
		String actual_password="Vijay@123";
		Reporter.log("Password:"+Password,true);
		Assert.assertEquals(Password,actual_password);

		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Officer Login");


		waitForSomeTime();

		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();

	}

	public void loginAsHead(String username,String Password) throws InterruptedException
	{
		emailid.clear();
		HighlightOnElement(emailid);
		emailid.sendKeys(username);
		String actual_username="cee";
		Reporter.log("Email ID:"+username,true);
		Assert.assertEquals(username,actual_username);

		password.clear();
		HighlightOnElement(password);
		password.sendKeys(Password);
		String actual_password="Vijay@123";
		Reporter.log("Password:"+Password,true);
		Assert.assertEquals(Password,actual_password);

		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Officer Login");


		waitForSomeTime();

		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();

	}

	public void loginAsNewRTICitizenWithoutBPL(String username,String Password) throws InterruptedException
	{
		emailid.clear();
		HighlightOnElement(emailid);
		emailid.sendKeys(username);
		String actual_username="arch@gmail.com";
		Reporter.log("Email ID:"+username,true);
		Assert.assertEquals(username,actual_username);

		password.clear();
		HighlightOnElement(password);
		password.sendKeys(Password);
		String actual_password="Vijay@123";
		Reporter.log("Password:"+Password,true);
		Assert.assertEquals(Password,actual_password);

		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Citizen /Architect Login");


		waitForSomeTime();

		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();

	}

	public void loginAsNewRTICitizenWithBPL(String username,String Password) throws InterruptedException
	{
		emailid.clear();
		HighlightOnElement(emailid);
		emailid.sendKeys(username);
		String actual_username="arch@gmail.com";
		Reporter.log("Email ID:"+username,true);
		Assert.assertEquals(username,actual_username);

		password.clear();
		HighlightOnElement(password);
		password.sendKeys(Password);
		String actual_password="Vijay@123";
		Reporter.log("Password:"+Password,true);
		Assert.assertEquals(Password,actual_password);

		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Citizen /Architect Login");


		waitForSomeTime();

		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();
	}


	public void loginAs_AMLEGAL(String username,String Password) throws InterruptedException
	{
		emailid.clear();
		HighlightOnElement(emailid);
		emailid.sendKeys(username);
		String actual_username="AM-LEGAL";
		Reporter.log("Email ID:"+username,true);
		Assert.assertEquals(username,actual_username);

		password.clear();
		HighlightOnElement(password);
		password.sendKeys(Password);
		String actual_password="Vijay@123";
		Reporter.log("Password:"+Password,true);
		Assert.assertEquals(Password,actual_password);

		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Officer Login");
		waitForSomeTime();
		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();

	}

	public void loginAs_MLEGAL(String username,String Password) throws InterruptedException
	{
		emailid.clear();
		HighlightOnElement(emailid);
		emailid.sendKeys(username);
		String actual_username="M-LEGAL";
		Reporter.log("Email ID:"+username,true);
		Assert.assertEquals(username,actual_username);

		password.clear();
		HighlightOnElement(password);
		password.sendKeys(Password);
		String actual_password="Vijay@123";
		Reporter.log("Password:"+Password,true);
		Assert.assertEquals(Password,actual_password);

		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Officer Login");
		waitForSomeTime();
		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();

	}

	public void loginAs_OIC(String username,String Password) throws InterruptedException
	{
		emailid.clear();
		HighlightOnElement(emailid);
		emailid.sendKeys(username);
		String actual_username="OIC-LEGAL-01";
		Reporter.log("Email ID:"+username,true);
		Assert.assertEquals(username,actual_username);

		password.clear();
		HighlightOnElement(password);
		password.sendKeys(Password);
		String actual_password="Vijay@123";
		Reporter.log("Password:"+Password,true);
		Assert.assertEquals(Password,actual_password);

		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Officer Login");
		waitForSomeTime();
		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();

	}

	public void loginAs_BOD(String username,String Password) throws InterruptedException
	{
		emailid.clear();
		HighlightOnElement(emailid);
		emailid.sendKeys(username);
		String actual_username="BOD-LEGAL";
		Reporter.log("Email ID:"+username,true);
		Assert.assertEquals(username,actual_username);

		password.clear();
		HighlightOnElement(password);
		password.sendKeys(Password);
		String actual_password="Vijay@123";
		Reporter.log("Password:"+Password,true);
		Assert.assertEquals(Password,actual_password);

		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Officer Login");
		waitForSomeTime();
		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();

	}

	public void loginAs_CEO(String username,String Password) throws InterruptedException
	{
		emailid.clear();
		HighlightOnElement(emailid);
		emailid.sendKeys(username);
		String actual_username="CEO";
		Reporter.log("Email ID:"+username,true);
		Assert.assertEquals(username,actual_username);

		password.clear();
		HighlightOnElement(password);
		password.sendKeys(Password);
		String actual_password="Vijay@123";
		Reporter.log("Password:"+Password,true);
		Assert.assertEquals(Password,actual_password);

		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Officer Login");
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();

		//anylogo.click();
		waitForSomeTime();

		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();

	}

	public void loginAs_GMLEGAL(String username,String Password) throws InterruptedException
	{
		emailid.clear();
		HighlightOnElement(emailid);
		emailid.sendKeys(username);
		String actual_username="GM-LEGAL";
		Reporter.log("Email ID:"+username,true);
		Assert.assertEquals(username,actual_username);

		password.clear();
		HighlightOnElement(password);
		password.sendKeys(Password);
		String actual_password="Vijay@123";
		Reporter.log("Password:"+Password,true);
		Assert.assertEquals(Password,actual_password);

		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Officer Login");
		waitForSomeTime();
		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();

	}

	public void loginAsPROHEAD(String username,String Password) throws InterruptedException
	{
		emailid.clear();
		HighlightOnElement(emailid);
		emailid.sendKeys(username);
		String actual_username="AD-PRO-HEAD";
		Reporter.log("Email ID:"+username,true);
		Assert.assertEquals(username,actual_username);

		password.clear();
		HighlightOnElement(password);
		password.sendKeys(Password);
		String actual_password="Vijay@123";
		Reporter.log("Password:"+Password,true);
		Assert.assertEquals(Password,actual_password);

		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Officer Login");

		anylogo.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();


		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();

	}

	public void loginAsPROSECTION(String username,String Password) throws InterruptedException
	{
		emailid.clear();
		HighlightOnElement(emailid);
		emailid.sendKeys(username);
		String actual_username="PRO-SECTION";
		Reporter.log("Email ID:"+username,true);
		Assert.assertEquals(username,actual_username);

		password.clear();
		HighlightOnElement(password);
		password.sendKeys(Password);
		String actual_password="Vijay@123";
		Reporter.log("Password:"+Password,true);
		Assert.assertEquals(Password,actual_password);

		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Officer Login");

		anylogo.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();

		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();

	}

	public void loginAsPROCEO(String username,String Password) throws InterruptedException
	{
		emailid.clear();
		HighlightOnElement(emailid);
		emailid.sendKeys(username);
		String actual_username="PRO-CEO";
		Reporter.log("Email ID:"+username,true);
		Assert.assertEquals(username,actual_username);

		password.clear();
		HighlightOnElement(password);
		password.sendKeys(Password);
		String actual_password="Vijay@123";
		Reporter.log("Password:"+Password,true);
		Assert.assertEquals(Password,actual_password);

		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Officer Login");

		anylogo.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();

		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();

	}

	public void loginAsEmployee(String username,String Password) throws InterruptedException
	{
		emailid.clear();
		HighlightOnElement(emailid);
		emailid.sendKeys(username);
		String actual_username="ENV-SECTION";
		//String actual_username="nsarvesh001@gmail.com";
		Reporter.log("Email ID:"+username,true);
		Assert.assertEquals(username,actual_username);

		HighlightOnElement(password);
		password.clear();
		password.sendKeys(Password);
		String actual_password="Vijay@123";
		Reporter.log("Password:"+Password,true);
		Assert.assertEquals(Password,actual_password);

		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Officer Login");
		Thread.sleep(5000);
		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();

	}

	public void loginAsAM_ENV(String username,String Password) throws InterruptedException
	{
		emailid.clear();
		HighlightOnElement(emailid);
		emailid.sendKeys(username);
		String actual_username="AM-ENV";
		//String actual_username="nsarvesh001@gmail.com";
		Reporter.log("Email ID:"+username,true);
		Assert.assertEquals(username,actual_username);

		HighlightOnElement(password);
		password.clear();
		password.sendKeys(Password);
		String actual_password="Vijay@123";
		Reporter.log("Password:"+Password,true);
		Assert.assertEquals(Password,actual_password);

		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Officer Login");
		Thread.sleep(5000);
		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();

	}

	public void loginAsM_ENV(String username,String Password) throws InterruptedException
	{
		emailid.clear();
		HighlightOnElement(emailid);
		emailid.sendKeys(username);
		String actual_username="M-ENV";
		//String actual_username="nsarvesh001@gmail.com";
		Reporter.log("Email ID:"+username,true); 
		Assert.assertEquals(username,actual_username);

		HighlightOnElement(password);
		password.clear();
		password.sendKeys(Password);
		String actual_password="Vijay@123";
		Reporter.log("Password:"+Password,true);
		Assert.assertEquals(Password,actual_password);

		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Officer Login");
		Thread.sleep(5000);
		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();

	}

	public void loginAsDGM_ENV(String username,String Password) throws InterruptedException
	{
		emailid.clear();
		HighlightOnElement(emailid);
		emailid.sendKeys(username);
		String actual_username="DGM-ENV";
		//String actual_username="nsarvesh001@gmail.com";
		Reporter.log("Email ID:"+username,true);
		Assert.assertEquals(username,actual_username);

		HighlightOnElement(password);
		password.clear();
		password.sendKeys(Password);
		String actual_password="Vijay@123";
		Reporter.log("Password:"+Password,true);
		Assert.assertEquals(Password,actual_password);

		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Officer Login");
		Thread.sleep(5000);
		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();

	}

	public void loginAsCEO_ENV(String username,String Password) throws InterruptedException
	{
		emailid.clear();
		HighlightOnElement(emailid);
		emailid.sendKeys(username);
		String actual_username="CEO-ENV";
		//String actual_username="nsarvesh001@gmail.com";
		Reporter.log("Email ID:"+username,true);
		Assert.assertEquals(username,actual_username);

		HighlightOnElement(password);
		password.clear();
		password.sendKeys(Password);
		String actual_password="Vijay@123";
		Reporter.log("Password:"+Password,true);
		Assert.assertEquals(Password,actual_password);

		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Officer Login");
		Thread.sleep(5000);
		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();

	}

	public void loginAsCtizenPropertyTax(String username,String Password) throws InterruptedException
	{
		emailid.clear();
		HighlightOnElement(emailid);
		emailid.sendKeys(username);
		String actual_username="CEO-ENV";
		//String actual_username="nsarvesh001@gmail.com";
		Reporter.log("Email ID:"+username,true);
		Assert.assertEquals(username,actual_username);

		HighlightOnElement(password);
		password.clear();
		password.sendKeys(Password);
		String actual_password="Vijay@123";
		Reporter.log("Password:"+Password,true);
		Assert.assertEquals(Password,actual_password);

		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Officer Login");
		Thread.sleep(5000);
		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();

	}

	public void loginAsTaxOfficerPropertyTax(String username,String Password) throws InterruptedException
	{
		emailid.clear();
		HighlightOnElement(emailid);
		emailid.sendKeys(username);
		String actual_username="CEO-ENV";
		//String actual_username="nsarvesh001@gmail.com";
		Reporter.log("Email ID:"+username,true);
		Assert.assertEquals(username,actual_username);

		HighlightOnElement(password);
		password.clear();
		password.sendKeys(Password);
		String actual_password="Vijay@123";
		Reporter.log("Password:"+Password,true);
		Assert.assertEquals(Password,actual_password);

		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Officer Login");
		Thread.sleep(5000);
		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();

	}

	public void loginAsTaxSecretaryPropertyTax(String username,String Password) throws InterruptedException
	{
		emailid.clear();
		HighlightOnElement(emailid);
		emailid.sendKeys(username);
		String actual_username="CEO-ENV";
		//String actual_username="nsarvesh001@gmail.com";
		Reporter.log("Email ID:"+username,true);
		Assert.assertEquals(username,actual_username);

		HighlightOnElement(password);
		password.clear();
		password.sendKeys(Password);
		String actual_password="Vijay@123";
		Reporter.log("Password:"+Password,true);
		Assert.assertEquals(Password,actual_password);

		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Officer Login");
		Thread.sleep(5000);
		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();
	}

	// login as BOD Admin officer
	public void loginAsBODAdminOfficer(String username,String Password) throws InterruptedException
	{
		emailid.clear();
		HighlightOnElement(emailid);
		emailid.sendKeys(username);
		//String actual_username="bod-admin";
		String actual_username="m_administration";
		Reporter.log("Email ID:"+username,true);
		Assert.assertEquals(username,actual_username);

		HighlightOnElement(password);
		password.clear();
		password.sendKeys(Password);
		String actual_password="NRDA@206";
		Reporter.log("Password:"+Password,true);
		Assert.assertEquals(Password,actual_password);

		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Officer Login");

		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();
	}
	
	public void loginAsBODSectionUserOfficer(String username,String Password) throws InterruptedException
	{
		emailid.clear();
		HighlightOnElement(emailid);
		emailid.sendKeys(username);
		String actual_username="anilnrda";
		Reporter.log("Email ID:"+username,true);
		Assert.assertEquals(username,actual_username);

		HighlightOnElement(password);
		password.clear();
		password.sendKeys(Password);
		String actual_password="NRDA@168";
		Reporter.log("Password:"+Password,true);
		Assert.assertEquals(Password,actual_password);

		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Officer Login");

		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();
	}
	
	public void loginAsBODGM(String username,String Password) throws InterruptedException
	{
		emailid.clear();
		HighlightOnElement(emailid);
		emailid.sendKeys(username);
		String actual_username="gm_administration";
		Reporter.log("Email ID:"+username,true);
		Assert.assertEquals(username,actual_username);

		HighlightOnElement(password);
		password.clear();
		password.sendKeys(Password);
		String actual_password="NRDA@129";
		Reporter.log("Password:"+Password,true);
		Assert.assertEquals(Password,actual_password);

		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Officer Login");

		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();
	}
	
	public void loginAsBODCEO(String username,String Password) throws InterruptedException
	{
		emailid.clear();
		HighlightOnElement(emailid);
		emailid.sendKeys(username);
		String actual_username="ceo";
		Reporter.log("Email ID:"+username,true);
		Assert.assertEquals(username,actual_username);

		HighlightOnElement(password);
		password.clear();
		password.sendKeys(Password);
		String actual_password="NRDA@181";
		Reporter.log("Password:"+Password,true);
		Assert.assertEquals(Password,actual_password);

		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Officer Login");

		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();
	}
	
	public void loginAsBODChairman(String username,String Password) throws InterruptedException
	{
		emailid.clear();
		HighlightOnElement(emailid);
		emailid.sendKeys(username);
		String actual_username="chairman";
		Reporter.log("Email ID:"+username,true);
		Assert.assertEquals(username,actual_username);

		HighlightOnElement(password);
		password.clear();
		password.sendKeys(Password);
		String actual_password="NRDA@197";
		Reporter.log("Password:"+Password,true);
		Assert.assertEquals(Password,actual_password);

		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Officer Login");

		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();
	}

	//login as environment officer to create a request

	public void loginAsPROfficer(String username,String Password) throws InterruptedException
	{
		emailid.clear();
		HighlightOnElement(emailid);
		emailid.sendKeys(username);
		//String actual_username="env-section";
		String actual_username="pragyasahu06";
		Reporter.log("Email ID:"+username,true);
		Assert.assertEquals(username,actual_username);

		HighlightOnElement(password);
		password.clear();
		password.sendKeys(Password);
		//String actual_password="Vijay@123";
		String actual_password="NRDA@175";
		Reporter.log("Password:"+Password,true);
		Assert.assertEquals(Password,actual_password);

		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Officer Login");

		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();
	}

	public void loginAsMPROfficer(String username,String Password) throws InterruptedException
	{
		emailid.clear();
		HighlightOnElement(emailid);
		emailid.sendKeys(username);
		//String actual_username="m-pro";
		String actual_username="manager_estate";
		Reporter.log("Email ID:"+username,true);
		Assert.assertEquals(username,actual_username);

		HighlightOnElement(password);
		password.clear();
		password.sendKeys(Password);
		//String actual_password="Vijay@123";
		String actual_password="NRDA@143";
		Reporter.log("Password:"+Password,true);
		Assert.assertEquals(Password,actual_password);

		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Officer Login");

		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();
	}
	
	public void loginAsCEOPROfficer(String username,String Password) throws InterruptedException
	{
		emailid.clear();
		HighlightOnElement(emailid);
		emailid.sendKeys(username);
		String actual_username="ceo";
		Reporter.log("Email ID:"+username,true);
		Assert.assertEquals(username,actual_username);

		HighlightOnElement(password);
		password.clear();
		password.sendKeys(Password);
		String actual_password="NRDA@181";
		Reporter.log("Password:"+Password,true);
		Assert.assertEquals(Password,actual_password);

		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Officer Login");

		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();
	}
	
	public void loginAsFinancePROfficer(String username,String Password) throws InterruptedException
	{
		emailid.clear();
		HighlightOnElement(emailid);
		emailid.sendKeys(username);
		String actual_username="m_finance";
		Reporter.log("Email ID:"+username,true);
		Assert.assertEquals(username,actual_username);

		HighlightOnElement(password);
		password.clear();
		password.sendKeys(Password);
		String actual_password="NRDA@149";
		Reporter.log("Password:"+Password,true);
		Assert.assertEquals(Password,actual_password);

		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Officer Login");

		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();
	}
	
	public void loginAsAdminManagerPROfficer(String username,String Password) throws InterruptedException
	{
		emailid.clear();
		HighlightOnElement(emailid);
		emailid.sendKeys(username);
		//String actual_username="pro-admin-manager";
		String actual_username="m_administration";
		Reporter.log("Email ID:"+username,true);
		Assert.assertEquals(username,actual_username);

		HighlightOnElement(password);
		password.clear();
		password.sendKeys(Password);
		//String actual_password="Vijay@123";
		String actual_password="NRDA@206";
		Reporter.log("Password:"+Password,true);
		Assert.assertEquals(Password,actual_password);

		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Officer Login");

		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();
	}
	
	public void loginAsGMPROfficer(String username,String Password) throws InterruptedException
	{
		emailid.clear();
		HighlightOnElement(emailid);
		emailid.sendKeys(username);
		String actual_username="gm_finance";
		Reporter.log("Email ID:"+username,true);
		Assert.assertEquals(username,actual_username);

		HighlightOnElement(password);
		password.clear();
		password.sendKeys(Password);
		String actual_password="NRDA@151";
		Reporter.log("Password:"+Password,true);
		Assert.assertEquals(Password,actual_password);

		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Officer Login");

		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();
	}
	
	public void loginAsConsultantPROfficer(String username,String Password) throws InterruptedException
	{
		emailid.clear();
		HighlightOnElement(emailid);
		emailid.sendKeys(username);
		String actual_username="bettercomm";
		Reporter.log("Email ID:"+username,true);
		Assert.assertEquals(username,actual_username);

		HighlightOnElement(password);
		password.clear();
		password.sendKeys(Password);
		String actual_password="NRDA@199";
		Reporter.log("Password:"+Password,true);
		Assert.assertEquals(Password,actual_password);

		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Officer Login");

		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();
	}
	
	public void loginAsDEOPROfficer(String username,String Password) throws InterruptedException
	{
		emailid.clear();
		HighlightOnElement(emailid);
		emailid.sendKeys(username);
		String actual_username="sangeeta.chandrakar";
		Reporter.log("Email ID:"+username,true);
		Assert.assertEquals(username,actual_username);

		HighlightOnElement(password);
		password.clear();
		password.sendKeys(Password);
		String actual_password="NRDA@12372";
		Reporter.log("Password:"+Password,true);
		Assert.assertEquals(Password,actual_password);

		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Officer Login");

		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();
	}
	
	
					//LAND INITIATION REQUEST
	
	public void loginAsLandPatwari(String username,String Password) throws InterruptedException
	{
		emailid.clear();
		HighlightOnElement(emailid);
		emailid.sendKeys(username);
		String actual_username="jsharma";
		Reporter.log("Email ID:"+username,true);
		Assert.assertEquals(username,actual_username);

		HighlightOnElement(password);
		password.clear();
		password.sendKeys(Password);
		String actual_password="NRDA@217";
		Reporter.log("Password:"+Password,true);
		Assert.assertEquals(Password,actual_password);

		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Officer Login");

		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();
	}
	
	public void loginAsLandTehsildaar(String username,String Password) throws InterruptedException
	{
		emailid.clear();
		HighlightOnElement(emailid);
		emailid.sendKeys(username);
		String actual_username="tehsildaar";
		Reporter.log("Email ID:"+username,true);
		Assert.assertEquals(username,actual_username);

		HighlightOnElement(password);
		password.clear();
		password.sendKeys(Password);
		String actual_password="NRDA@179";
		Reporter.log("Password:"+Password,true);
		Assert.assertEquals(Password,actual_password);

		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Officer Login");

		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();
	}
	
	public void loginAsLandManager(String username,String Password) throws InterruptedException
	{
		emailid.clear();
		HighlightOnElement(emailid);
		emailid.sendKeys(username);
		String actual_username="manager_land";
		Reporter.log("Email ID:"+username,true);
		Assert.assertEquals(username,actual_username);

		HighlightOnElement(password);
		password.clear();
		password.sendKeys(Password);
		String actual_password="NRDA@162";
		Reporter.log("Password:"+Password,true);
		Assert.assertEquals(Password,actual_password);

		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Officer Login");

		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();
	}
	
	public void loginAsPlanningSectionManager(String username,String Password) throws InterruptedException
	{
		emailid.clear();
		HighlightOnElement(emailid);
		emailid.sendKeys(username);
		String actual_username="rohitk";
		Reporter.log("Email ID:"+username,true);
		Assert.assertEquals(username,actual_username);

		HighlightOnElement(password);
		password.clear();
		password.sendKeys(Password);
		String actual_password="NRDA@230";
		Reporter.log("Password:"+Password,true);
		Assert.assertEquals(Password,actual_password);

		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Officer Login");

		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();
	}
	
	public void loginAsLegalSectionManager(String username,String Password) throws InterruptedException
	{
		emailid.clear();
		HighlightOnElement(emailid);
		emailid.sendKeys(username);
		String actual_username="m_administration";
		Reporter.log("Email ID:"+username,true);
		Assert.assertEquals(username,actual_username);

		HighlightOnElement(password);
		password.clear();
		password.sendKeys(Password);
		String actual_password="NRDA@206";
		Reporter.log("Password:"+Password,true);
		Assert.assertEquals(Password,actual_password);

		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Officer Login");

		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();
	}
	
	public void loginAsGM(String username,String Password) throws InterruptedException
	{
		emailid.clear();
		HighlightOnElement(emailid);
		emailid.sendKeys(username);
		String actual_username="gm_administration";
		Reporter.log("Email ID:"+username,true);
		Assert.assertEquals(username,actual_username);

		HighlightOnElement(password);
		password.clear();
		password.sendKeys(Password);
		String actual_password="NRDA@129";
		Reporter.log("Password:"+Password,true);
		Assert.assertEquals(Password,actual_password);

		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Officer Login");

		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();
	}
	
	public void loginAsCEO(String username,String Password) throws InterruptedException
	{
		emailid.clear();
		HighlightOnElement(emailid);
		emailid.sendKeys(username);
		String actual_username="ceo";
		Reporter.log("Email ID:"+username,true);
		Assert.assertEquals(username,actual_username);

		HighlightOnElement(password);
		password.clear();
		password.sendKeys(Password);
		String actual_password="NRDA@181";
		Reporter.log("Password:"+Password,true);
		Assert.assertEquals(Password,actual_password);

		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Officer Login");

		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();
	}

}
