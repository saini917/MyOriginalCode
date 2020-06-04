package NRDA_Plumber;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;

public class ToVerifyPlumberRegistration_SC_01_TC_01 extends CommonLibrary
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
	@FindBy(xpath="//td[@class='leftCol']/span/div/div/div/div/b")
	private List<WebElement> verifyoptions;
	
	@FindBy(xpath="//td[@class='leftCol']/span/div/div/div/div/b/../following-sibling::ul/li/a")
	private List<WebElement> verifyoptions1;
	
	public void toVerifyOptions() throws InterruptedException
	{
		for(WebElement options:verifyoptions)
		{
			HighlightOnElement(options);
			Assert.assertTrue(options.isDisplayed());
			Reporter.log(options.getText(),true);
			waitForSomeTime();
		}
	}
	
	public void toVerifyOption() throws InterruptedException
	{
		for(WebElement options1:verifyoptions1)
		{
			HighlightOnElement(options1);
			Assert.assertNotNull(options1.isDisplayed());
			Reporter.log(options1.getText(),true);
			waitForSomeTime();
		}
	}
}
