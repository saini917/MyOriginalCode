package NRDA_BOD;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;

public class NRDA_BOD_SC_01_TC_06 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "new meeting request".
	 * @author deepak.saini
	 * @since 2017-03-21
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/table/tbody/tr/td/div/h3/a[contains(text(),'Administrative Section')]/preceding-sibling::span/../following-sibling::div[1]/table/tbody/tr/td[@class='c1']/span/../following-sibling::td/span/a/img")
	private WebElement meetingreq;
	
	public void clickOnMeetingRequest() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(meetingreq));
		wait.until(ExpectedConditions.elementToBeClickable(meetingreq));
		Assert.assertTrue(meetingreq.isDisplayed());
		HighlightOnElement(meetingreq);
		Assert.assertTrue(meetingreq.isEnabled());
		meetingreq.click();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "proceed".
	 * @author deepak.saini
	 * @since 2017-03-21
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//button/span[contains(text(),'Proceed')]")
	private WebElement proceed;
	
	public void verifyProceedButton()
	{
		wait.until(ExpectedConditions.visibilityOf(proceed));
		wait.until(ExpectedConditions.elementToBeClickable(proceed));
		Assert.assertTrue(proceed.isDisplayed());
		HighlightOnElement(proceed);
	}
}
