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
import GenericLibrary.ExcelDataDriver;

public class ToVerifyMeterTesting_SC_02_TC_02 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "home icon".
	 * @author deepak.saini
	 * @since 2018-03-22
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="(//ul[@class='ui-menu-list ui-helper-reset'])[1]/li/a[1]/i")
	private WebElement home;
	
	public void clickOnHomeIcon() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(home));
		wait.until(ExpectedConditions.elementToBeClickable(home));
		Assert.assertTrue(home.isDisplayed());
		HighlightOnElement(home);
		Assert.assertTrue(home.isEnabled());
		home.click();
		Reporter.log("Click on home Icon",true);
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Display link".
	 * @author deepak.saini
	 * @since 2018-03-22
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//td[@class='leftCol']/table/tbody/tr/td/form/div/div/h3/a")
	private List<WebElement> label;
	
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/div/div/div/div/div/div/div[@class='box-head']/div")
	private List<WebElement> label1;
	
	public void verifyDisplayLink()
	{
		Reporter.log("System will display the Following Links -->",true);
		for(WebElement link:label)
		{
			Assert.assertTrue(link.isDisplayed());
			HighlightOnElement(link);
			Reporter.log(link.getText(),true);
			
		}
	}
	public void verifyStatisticsDisplayLink()
	{
		Reporter.log("Statistics count panel should be shown for -->",true);
		for(WebElement link:label1)
		{
			Assert.assertTrue(link.isDisplayed());
			HighlightOnElement(link);
			Reporter.log(link.getText(),true);
			
		}
	}
	

}