package NRDA_NewConnection;

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


/**
 * @author deepak.saini
 * @since 2017-08-11
 */
public class ToVerifyWaterAndSewerageConnection_SC_03_TC_01 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Fresh Application".
	 * @author deepak.saini
	 * @since 2017-08-11
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//a[contains(text(),'Fresh Application/नया आवेदन')]")
	private WebElement freshapp;
	
	public void clickOnFreshApp() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(freshapp));
		Assert.assertTrue(freshapp.isDisplayed());
		Assert.assertTrue(freshapp.isEnabled());
		HighlightOnElement(freshapp);
		freshapp.click();
		waitForSomeTime();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Water and Sewerage Connection".
	 * @author deepak.saini
	 * @since 2017-08-11
	 */
	/*****************************************************************************************************/
	//@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/table/tbody/tr/td/div/h3/a[contains(text(),'WATER AND SEWERAGE SECTION')]/preceding-sibling::span")
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/table/tbody/tr/td/div/h3/a[contains(text(),'Public Health and Engineering')]/preceding-sibling::span")
	private WebElement waterseweargeconnection;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "verify all options under Water and Sewerage Connection".
	 * @author deepak.saini
	 * @since 2017-08-11
	 */
	/*****************************************************************************************************/
	//@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/table/tbody/tr/td/div/h3/a[contains(text(),'WATER AND SEWERAGE SECTION')]/preceding-sibling::span/../following-sibling::div/table/tbody/tr/td[1]/span")
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/table/tbody/tr/td/div/h3/a[contains(text(),'Public Health and Engineering')]/preceding-sibling::span/../following-sibling::div/table/tbody/tr/td[1]/span")
	private List<WebElement> verifyoptions;
	
/***********************This method is used to click on  Water and Sewerage Connection 
 * @throws InterruptedException ********************************************************************************/	
	public void clickOnPublicHealth() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(waterseweargeconnection));
		Assert.assertTrue(waterseweargeconnection.isDisplayed());
		Assert.assertTrue(waterseweargeconnection.isEnabled());
		HighlightOnElement(waterseweargeconnection);
		Actions clickonWatersewerage=new Actions(driver);
		clickonWatersewerage.click(waterseweargeconnection).build().perform();
		waitForSomeTime();
	}
/***************************************this method is used to get all options under Water and Sewerage Connection
 * @throws InterruptedException *************************/	
	
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/table/tbody/tr/td/div/h3/a[contains(text(),'Public Health and Engineering')]/preceding-sibling::span/../following-sibling::div/table/tbody/tr/td[1]/span/../following-sibling::td/span")
	private List<WebElement> display;
	
	public void toVerifyOptions01() throws InterruptedException
	{
		for(WebElement options:verifyoptions)
		{
			HighlightOnElement(options);
			Assert.assertTrue(options.isDisplayed());
			Reporter.log(options.getText(),true);
		}
		
		for(WebElement options:display)
		{
			HighlightOnElement(options);
			Assert.assertTrue(options.isDisplayed());
			Reporter.log(options.getText(),true);
		}
	}
	
}
