package NRDA_NegativeCases;

import java.io.IOException;
import java.util.List;
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

public class ToVerifyWaterAndSewerage_SC_02_TC_07 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);

	@FindBy(xpath="//div/select")
	private WebElement usertype;

	@FindBy(xpath=".//*[@id='loginForm']/div[12]")
	private WebElement anylogo;

	@FindBy(xpath="(//button/span[contains(text(),'Submit')])[1]")
	private WebElement submit;
	public void blankUsernamePasswordLogin() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{		

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
	/*@FindBy(xpath="//div[@class='ui-growl-message']/span")
	private List<WebElement> getmessage;

	String[] errormsg={"\"User ID\" is a required field,Password is required field"};

	public void getErrormsg() throws InterruptedException
	{
		int i=0;
		Reporter.log("Error Message:",true);
		for(WebElement list:getmessage)
		{
			HighlightOnElement(list);
			Assert.assertTrue(list.isDisplayed(),"Matched");
			String actual=list.getAttribute("innerHTML");
			Reporter.log(actual,true);
			waitForSomeTime();

			if(actual.equalsIgnoreCase(errormsg[i]))
			{
				Assert.assertTrue(actual.contains(errormsg[i]));
				break;
			}
		}
	}*/
	
		@FindBy(xpath="//div[@class='ui-growl-message']/span[contains(text(),'Invalid Login details')]")
		private WebElement getmessage;
		
		public void getErrormsg() throws InterruptedException
		{
			wait.until(ExpectedConditions.visibilityOf(getmessage));
			waitForSomeTime();
			Assert.assertTrue(getmessage.isDisplayed());
			HighlightOnElement(getmessage);
			String actual=getmessage.getAttribute("innerHTML");
			//Assert.assertTrue(actual.contains("\"User ID\" is a required field"),"Matched");
			Assert.assertTrue(actual.contains("Invalid Login details"),"Matched");
			Reporter.log("Error Message:"+actual,true);
		}
}
