package NRDA_PRO;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;

public class NRDA_PRO_SC_01_TC_06 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "publication Start Date".
	 * @author deepak.saini
	 * @since 2018-05-09
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//td/span/label[contains(text(),'Publication Start Date')]/../../../../../../following-sibling::td/table/tbody/tr/td/span/input")
	private WebElement startdate;
	
	public void verifyPublicationStartDate() throws InterruptedException
	{
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		wait.until(ExpectedConditions.visibilityOf(startdate));
		wait.until(ExpectedConditions.elementToBeClickable(startdate));
		Assert.assertTrue(startdate.isDisplayed());
		HighlightOnElement(startdate);
		Assert.assertTrue(startdate.isEnabled());
		startdate.click();
		waitForSomeTime();
	}

}
