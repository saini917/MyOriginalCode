package NRDA_Plumber;

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


public class ToVerifyPlumberRegistration_SC_01_TC_02 extends CommonLibrary
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
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/table/tbody/tr/td/div/h3/a[contains(text(),'WATER AND SEWERAGE SECTION')]/preceding-sibling::span")
	private WebElement waterseweargeconnection;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "verify all options under Water and Sewerage Connection".
	 * @author deepak.saini
	 * @since 2017-08-11
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/table/tbody/tr/td/div/h3/a[contains(text(),'WATER AND SEWERAGE SECTION')]/preceding-sibling::span/../following-sibling::div/table/tbody/tr/td[1]/span")
	private List<WebElement> verifyoptions;
	
/***********************This method is used to click on  Water and Sewerage Connection 
 * @throws InterruptedException ********************************************************************************/	
	public void clickOnWaterAndSewerageConnection() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(waterseweargeconnection));
		Assert.assertEquals(true,waterseweargeconnection.isDisplayed());
		Assert.assertEquals(true,waterseweargeconnection.isEnabled());
		HighlightOnElement(waterseweargeconnection);
		Actions clickonWatersewerage=new Actions(driver);
		clickonWatersewerage.click(waterseweargeconnection).build().perform();
		Reporter.log("click on Water And Sewerage Connection",true);
		waitForSomeTime();
	}
/***************************************this method is used to get all options under Water and Sewerage Connection
 * @throws InterruptedException *************************/	
	public void toVerifyOptions01() throws InterruptedException
	{
		for(WebElement options:verifyoptions)
		{
			HighlightOnElement(options);
			Assert.assertTrue(options.isDisplayed());
			Reporter.log(options.getText(),true);
		}
	}
	

}
