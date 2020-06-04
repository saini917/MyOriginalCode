package NRDA_BOD;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_BOD_SC_01_TC_34 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Schedule Time".
	 * @author deepak.saini
	 * @since 2018-03-28
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:updatescheduletimes']/div/div/div/div/div/table/tbody/tr/td/button/span")
	private WebElement scheduletime;
	
	public void clickOnScheduleMeetingTime() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(scheduletime));
		wait.until(ExpectedConditions.elementToBeClickable(scheduletime));
		Assert.assertTrue(scheduletime.isDisplayed());
		HighlightOnElement(scheduletime);
		Assert.assertTrue(scheduletime.isEnabled());
		scheduletime.click();
		waitForSomeTime();
	}
	

}
