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

public class ToVerifyWaterAndSewerage_SC_02_TC_05 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	@FindBy(xpath=".//*[@id='loginForm:user']")
	private WebElement emailid;

	@FindBy(xpath="//div/select")
	private WebElement usertype;

	@FindBy(xpath=".//*[@id='loginForm']/div[12]")
	private WebElement anylogo;

	@FindBy(xpath="(//button/span[contains(text(),'Submit')])[1]")
	private WebElement submit;
	public void validUsernameLogin() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
			emailid.clear();
			HighlightOnElement(emailid);
			String username=excel.getExcelData(emailid,"Invalid Login Credentials",1,4);
			Reporter.log("Email ID:"+username,true);
	
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
	//@FindBy(xpath="//div[@class='ui-growl-message']/span[contains(text(),'is required field')]")
	@FindBy(xpath="//div[@class='ui-growl-message']/span[contains(text(),'Invalid Login details')]")
	private WebElement getmessage;
	
	public void getErrormsg() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(getmessage));
		waitForSomeTime();
		Assert.assertTrue(getmessage.isDisplayed());
		HighlightOnElement(getmessage);
		String actual=getmessage.getAttribute("innerHTML");
		//String Expected="Password is required field";
		//Assert.assertTrue(actual.contains("Password is required field"),"Matched");
		Assert.assertTrue(actual.contains("Invalid Login details"),"Matched");
		Reporter.log("Error Message:"+actual,true);
	}

}
