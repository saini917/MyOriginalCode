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

public class ToVerifyUploadDocument_SC_03_TC_65  extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "No".
	 * @author deepak.saini
	 * @since 2018-04-25
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'No')])[2]")
	private WebElement no;
	
	public void clickOnNo() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(no));
		Assert.assertTrue(no.isDisplayed());
		HighlightOnElement(no);
		Assert.assertTrue(no.isEnabled());
		String currenturl=driver.getCurrentUrl();
		Reporter.log("Current URL: "+currenturl,true);
		no.click();
		waitForSomeTime();
		String previousurl=driver.getCurrentUrl();
		Reporter.log("Previous URL: "+previousurl,true);
		Assert.assertEquals(currenturl,previousurl,"Test case pass");
	}

}
