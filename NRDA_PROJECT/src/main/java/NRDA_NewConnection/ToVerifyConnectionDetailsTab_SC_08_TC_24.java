package NRDA_NewConnection;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;


public class ToVerifyConnectionDetailsTab_SC_08_TC_24 extends CommonLibrary 
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "close".
	 * @author deepak saini
	 * @since 2017-09-22
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:Nb']/div/center/button/span[contains(text(),'Close')]")
	private WebElement close;

	public void clickOnClose() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(close));
		wait.until(ExpectedConditions.elementToBeClickable(close));
		HighlightOnElement(close);
		String currenturl=driver.getCurrentUrl();
		close.click();
		Reporter.log("click on Close button succesfully",true);
		String previousurl=driver.getCurrentUrl();
		waitForSomeTime();
		Assert.assertNotEquals(currenturl,previousurl,"Test case pass");
	}

}
