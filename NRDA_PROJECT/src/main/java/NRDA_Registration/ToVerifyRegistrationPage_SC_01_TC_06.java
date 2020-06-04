package NRDA_Registration;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyRegistrationPage_SC_01_TC_06 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	Logger log=Logger.getLogger("devpinoyLogger");


	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Clear".
	 * @author deepak.saini
	 * @since 2018-04-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'Clear')])[2]")
	private WebElement clear;
	
	public void clickOnClear() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(clear));
		Assert.assertTrue(clear.isDisplayed());
		HighlightOnElement(clear);
		Assert.assertTrue(clear.isEnabled());
		clear.click();
		waitForSomeTime();
		
	}

}
