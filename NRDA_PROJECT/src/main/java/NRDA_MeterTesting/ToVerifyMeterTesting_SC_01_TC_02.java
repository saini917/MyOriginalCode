package NRDA_MeterTesting;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;

public class ToVerifyMeterTesting_SC_01_TC_02 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Water meter testing".
	 * @author deepak.saini
	 * @since 2017-01-23
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/table/tbody/tr/td/div/h3/a[contains(text(),'Public Health and Engineering')]/preceding-sibling::span/../following-sibling::div/table/tbody/tr/td[1]/span[contains(text(),'WATER METER TESTING')]/../following-sibling::td/span/a/img")
	private WebElement metertesting;

	public void clickOnMeterTesting() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(metertesting));
		wait.until(ExpectedConditions.elementToBeClickable(metertesting));
		Assert.assertTrue(metertesting.isDisplayed());
		HighlightOnElement(metertesting);
		Assert.assertTrue(metertesting.isEnabled());
		metertesting.click();
		Reporter.log("Click on Water Meter Testing",true);
		waitForSomeTime();
	}


	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "proceed".
	 * @author deepak.saini
	 * @@since 2017-01-23
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//button/span[contains(text(),'Proceed')]")
	private WebElement proceed;

	public void clickOnProceed() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(proceed));
		wait.until(ExpectedConditions.elementToBeClickable(proceed));
		Assert.assertTrue(proceed.isDisplayed());
		HighlightOnElement(proceed);
		Assert.assertTrue(proceed.isEnabled());
		proceed.click();
		Reporter.log("Click on Proceed",true);
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Display list".
	 * @author deepak.saini
	 * @since 2017-01-23
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/span/span/div/div/div/div/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label")
	private List<WebElement> displaylist;

	public void verifyDisplayList() throws InterruptedException
	{
		Reporter.log("User should be able to view following fields i.e",true);
		for(WebElement list:displaylist)
		{
			Assert.assertTrue(list.isDisplayed());
			HighlightOnElement(list);
			Reporter.log(list.getText(),true);
			waitForSomeTime();
		}
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Display list".
	 * @author deepak.saini
	 * @since 2017-01-23
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/span/span/div/div/div/div/div/span/center/table/tbody/tr/td/span/button/following-sibling::button/span")
	private List<WebElement> displaybuttonlist;

	public void verifyDisplayButtonList() throws InterruptedException
	{
		for(WebElement list:displaybuttonlist)
		{
			Assert.assertTrue(list.isDisplayed());
			HighlightOnElement(list);
			Reporter.log(list.getText(),true);
			waitForSomeTime();
		}
	}
	
}


