package NRDA_MeterTesting;

import java.util.List;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import GenericLibrary.CommonLibrary;

public class ToVerifyMeterTesting_SC_01_TC_01 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Water and Sewerage Connection".
	 * @author deepak.saini
	 * @since 2017-08-11
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/table/tbody/tr/td/div/h3/a[contains(text(),'Public Health and Engineering')]/preceding-sibling::span")
	private WebElement publicandhealth;
	
/***********************This method is used to click on  Water and Sewerage Connection 
 * @throws InterruptedException ********************************************************************************/	
	public void clickOnWaterAndSewerageConnection() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(publicandhealth));
		Assert.assertEquals(true,publicandhealth.isDisplayed());
		Assert.assertEquals(true,publicandhealth.isEnabled());
		HighlightOnElement(publicandhealth);
		Actions clickonWatersewerage=new Actions(driver);
		clickonWatersewerage.click(publicandhealth).build().perform();
		Reporter.log("click on public Health and Engineering",true);
		waitForSomeTime();
	}
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "verify all options under Water and Sewerage Connection".
	 * @author deepak.saini
	 * @since 2017-08-11
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/table/tbody/tr/td/div/h3/a[contains(text(),'Public Health and Engineering')]/preceding-sibling::span/../following-sibling::div/table/tbody/tr/td[1]/span")
	private List<WebElement> verifyoptions1;
	
/***************************************this method is used to get all options under Water and Sewerage Connection
 * @throws InterruptedException *************************/	
	public void toVerifyOptions01() throws InterruptedException
	{
		Reporter.log("User should be able to view following forms i.e :-",true);
		for(WebElement options:verifyoptions1)
		{
			HighlightOnElement(options);
			Assert.assertTrue(options.isDisplayed());
			Reporter.log(options.getText(),true);
		}
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "verify all menu display after login".
	 * @author deepak.saini
	 * @since 2018-01-11
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/table/tbody/tr/td/div/h3/a[contains(text(),'Public Health and Engineering')]/preceding-sibling::span/../following-sibling::div/table/tbody/tr/td[@class='c2']/span/a")
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
