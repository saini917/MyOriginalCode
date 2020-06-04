package NRDA_ChangeOfUse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyChangeOfUse_SC_02_TC_15 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "close".
	 * @author deepak.saini
	 * @since 2018-04-11
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'Close')])[4]")
	private WebElement close;
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "NO".
	 * @author deepak.saini
	 * @since 2018-04-11
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'No')])[2]")
	private WebElement no;
	
	public void clickOnNoCloseButton() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(close));
		Assert.assertTrue(close.isDisplayed());
		HighlightOnElement(close);
		Assert.assertTrue(close.isEnabled());
		String currenturl=driver.getCurrentUrl();
		Reporter.log("Current Url :" +currenturl,true);
		close.click();
		waitForSomeTime();
		waitForSomeTime();
		
		no.click();
		waitForSomeTime();
		waitForSomeTime();
		String currenturlafterclose=driver.getCurrentUrl();
		Reporter.log("Current Url :" +currenturlafterclose,true);
		
		Assert.assertNotEquals(currenturl.equalsIgnoreCase(currenturlafterclose),"test case pass");
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "YES".
	 * @author deepak.saini
	 * @since 2018-04-11
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'Yes')])[2]")
	private WebElement yes;
	public void clickOnYesCloseButton() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(close));
		Assert.assertTrue(close.isDisplayed());
		HighlightOnElement(close);
		Assert.assertTrue(close.isEnabled());
		String currenturl=driver.getCurrentUrl();
		Reporter.log("Current Url :" +currenturl,true);
		close.click();
		waitForSomeTime();
		waitForSomeTime();
		
		yes.click();
		waitForSomeTime();
		waitForSomeTime();
		String currenturlafterclose=driver.getCurrentUrl();
		Reporter.log("Current Url :" +currenturlafterclose,true);
		
		Assert.assertNotEquals(currenturl.equalsIgnoreCase(currenturlafterclose),"test case pass");
	}

}
