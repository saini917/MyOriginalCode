package NRDA_Plumber;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;

public class ToVerifyPlumberRegistration_SC_02_TC_01 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "verify all menu display after login".
	 * @author deepak.saini
	 * @since 2018-01-11
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/table/tbody/tr/td/div/h3/a[contains(text(),'WATER AND SEWERAGE SECTION')]/preceding-sibling::span/../following-sibling::div/table/tbody/tr/td[1]/span[contains(text(),'PLUMBER REGISTRATION')]/../following-sibling::td[@class='c2']/span/a/img")
	private List<WebElement> verifyoptions;

	public void verifyOnOffLineForm() throws InterruptedException
	{
		for(WebElement list:verifyoptions)
		{
			HighlightOnElement(list);
			Assert.assertTrue(list.isDisplayed());
			waitForSomeTime();
		}
		Reporter.log("1. User should be able to view both online and download form. \n 2. Any user can register itslef from online registeration or Offline Registeration.",true);
	}
}
