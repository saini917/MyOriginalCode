package NRDA_ChangeOfUse;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyChangeOfUse_SC_07_TC_04 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "pagination forward page 1".
	 * @author deepak.saini
	 * @since 2018-04-17
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//span[@class='ui-paginator-pages']/span[contains(text(),'1')]")
	private WebElement page1;

	public void clickOnPage1() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(page1));
		Assert.assertTrue(page1.isDisplayed());
		HighlightOnElement(page1);
		Assert.assertTrue(page1.isEnabled());
		if(!page1.isEnabled())
		{
			Reporter.log("Test case fail",true);
		}
		else
		{
			page1.click();
			waitForSomeTime();
			Reporter.log("Test case pass",true);
		}
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "pagination forward page 2".
	 * @author deepak.saini
	 * @since 2018-04-17
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//span[@class='ui-paginator-pages']/span[contains(text(),'2')]")
	private WebElement page2;

	public void clickOnPage2() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(page2));
		Assert.assertTrue(page2.isDisplayed());
		HighlightOnElement(page2);
		Assert.assertTrue(page2.isEnabled());
		
		if(!page2.isEnabled())
		{
			Reporter.log("Test case fail",true);
		}
		else
		{
			page2.click();
			waitForSomeTime();
		}
	}

}
