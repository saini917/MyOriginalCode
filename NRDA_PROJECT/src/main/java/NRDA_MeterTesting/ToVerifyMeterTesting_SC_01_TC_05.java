package NRDA_MeterTesting;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyMeterTesting_SC_01_TC_05 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "save as draft".
	 * @author deepak.saini
	 * @since 2017-01-23
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/span/span/div/div/div/div/div/span/center/table/tbody/tr/td/span/button/following-sibling::button/span[contains(text(),'Close')]")
	private WebElement close;

	public void clickOnClose() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(close));
		wait.until(ExpectedConditions.elementToBeClickable(close));
		Assert.assertTrue(close.isDisplayed());
		HighlightOnElement(close);
		Assert.assertTrue(close.isEnabled());
		close.click();
		Reporter.log("Click on close  button",true);
		waitForSomeTime();
	}
	
	@FindBy(xpath="(//button/span[contains(text(),'No')])[2]")
	private WebElement no;
	
	public void clickOnPopUpNoBtn() throws InterruptedException
	{
		String currenturl=driver.getCurrentUrl();
		Reporter.log(currenturl,true);
		wait.until(ExpectedConditions.visibilityOf(no));
		wait.until(ExpectedConditions.elementToBeClickable(no));
		Assert.assertTrue(no.isDisplayed());
		HighlightOnElement(no);
		Assert.assertTrue(no.isEnabled());
		no.click();
		Reporter.log("Click on No button",true);
		String currenturl1=driver.getCurrentUrl();
		Reporter.log(currenturl1,true);
		Assert.assertNotEquals(currenturl,currenturl1,"test case pass");
		waitForSomeTime();
		waitForSomeTime();
	}
	
	@FindBy(xpath="(//button/span[contains(text(),'Yes')])[2]")
	private WebElement yes;
	
	public void clickOnPopUpYesBtn() throws InterruptedException
	{
		String currenturl=driver.getCurrentUrl();
		Reporter.log(currenturl,true);
		wait.until(ExpectedConditions.visibilityOf(yes));
		wait.until(ExpectedConditions.elementToBeClickable(yes));
		Assert.assertTrue(yes.isDisplayed());
		HighlightOnElement(yes);
		Assert.assertTrue(yes.isEnabled());
		yes.click();
		Reporter.log("Click on Yes button",true);
		String currenturl1=driver.getCurrentUrl();
		Reporter.log(currenturl1,true);
		Assert.assertEquals(currenturl,currenturl1,"test case pass");
		waitForSomeTime();
	}
	
}
