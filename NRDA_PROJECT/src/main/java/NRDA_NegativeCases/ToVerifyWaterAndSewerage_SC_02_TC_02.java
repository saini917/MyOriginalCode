package NRDA_NegativeCases;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyWaterAndSewerage_SC_02_TC_02 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
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
	public void invalidPasswordLogin() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
			emailid.clear();
			HighlightOnElement(emailid);
			String username=excel.getExcelData(emailid,"Invalid Login Credentials",1,1);
			Reporter.log("Email ID:"+username,true);
			
			HighlightOnElement(password);
			password.clear();
			String Password=excel.getExcelData(password,"Invalid Login Credentials",2,1);
			Reporter.log("Password:"+Password,true);
	
			HighlightOnElement(usertype);
			Select sel=new Select(usertype);
			sel.selectByVisibleText("Citizen /Architect Login");
			waitForSomeTime();
			
			HighlightOnElement(submit);
			submit.click();
			waitForSomeTime();
		}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "invalid message".
	 * @author deepak.saini
	 * @since 2018-01-24
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-growl-message']/span[contains(text(),'Invalid Login details')]")
	private WebElement getmessage;
	
	public void getErrormsg() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(getmessage));
		Assert.assertTrue(getmessage.isDisplayed());
		HighlightOnElement(getmessage);
		waitForSomeTime();
		String actual=getmessage.getAttribute("innerHTML");
		//String Expected="Invalid Login details";
		Assert.assertTrue(actual.contains("Invalid Login details"),"Matched");
		Reporter.log("Error Message:"+actual,true);
	}

}
