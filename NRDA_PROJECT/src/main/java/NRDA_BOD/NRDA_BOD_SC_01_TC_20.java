package NRDA_BOD;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_BOD_SC_01_TC_20 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "reset button".
	 * @author deepak.saini
	 * @since 2018-02-14
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="(//button/span[contains(text(),'Reset')])[2]")
	private WebElement reset;
	
	
	public void clickOnResetBtn() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(reset));
		wait.until(ExpectedConditions.elementToBeClickable(reset));
		Assert.assertTrue(reset.isDisplayed());
		HighlightOnElement(reset);
		Assert.assertTrue(reset.isEnabled());
		String currenturl=driver.getCurrentUrl();
		Reporter.log("Current Page Url:"+currenturl,true);
		reset.click();
		waitForSomeTime();
		
		String prevoiusurl=driver.getCurrentUrl();
		Reporter.log("Current Page Url:"+prevoiusurl,true);
		
		Assert.assertEquals(currenturl,currenturl);
		Reporter.log("Click on ResetButton page redirect to home page",true);
		
	}
}
