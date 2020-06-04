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

public class ToVerifyMeterTesting_SC_02_TC_03 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Public Health and Engineering".
	 * @author deepak.saini
	 * @since 2018-03-22
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//td[@class='leftCol']/table/tbody/tr/td/form/div/div/h3/a[contains(text(),'Public Health and Engineering')]/preceding-sibling::span")
	private WebElement publichealth;
	
	public void clickOnPublicHealth() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(publichealth));
		wait.until(ExpectedConditions.elementToBeClickable(publichealth));
		Assert.assertTrue(publichealth.isDisplayed());
		HighlightOnElement(publichealth);
		Assert.assertTrue(publichealth.isEnabled());

		publichealth.click();
		Reporter.log("Click on Public Health and Engineering",true);
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Water Meter Testing".
	 * @author deepak.saini
	 * @since 2018-03-22
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//td[@class='leftCol']/table/tbody/tr/td/form/div/div/h3/a[contains(text(),'Public Health and Engineering')]/preceding-sibling::span/../following-sibling::div/ul/li/a/span[contains(text(),'WATER METER TESTING')]")
	private WebElement watermetertest;
	
	public void clickOnWatermeterTesting() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(watermetertest));
		wait.until(ExpectedConditions.elementToBeClickable(watermetertest));
		Assert.assertTrue(watermetertest.isDisplayed());
		HighlightOnElement(watermetertest);
		Assert.assertTrue(watermetertest.isEnabled());
		watermetertest.click();
		Reporter.log("Click on Water Meter Testing",true);
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Display link".
	 * @author deepak.saini
	 * @since 2018-03-22
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//form[@id='inboxForm']/div/div/div/div/div/div/div/div/table/thead/tr/th/following-sibling::th/span")
	private List<WebElement> list;
	
	public void verifyDisplayLink()
	{
		Reporter.log(" Application form should show following fields along with a text box field for search i.e -->",true);
		for(WebElement link:list)
		{
			Assert.assertTrue(link.isDisplayed());
			HighlightOnElement(link);
			Reporter.log(link.getText(),true);
			
		}
	}

}
