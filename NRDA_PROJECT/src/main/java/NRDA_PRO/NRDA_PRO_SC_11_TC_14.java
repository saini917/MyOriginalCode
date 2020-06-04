package NRDA_PRO;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_PRO_SC_11_TC_14 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "close".
	 * @author deepak.saini
	 * @since 2018-05-10
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//button/span[contains(text(),'Close')]")
	private WebElement close;

	public void clickOnClose() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1200)", "");
		
		wait.until(ExpectedConditions.visibilityOf(close));
		Assert.assertTrue(close.isDisplayed());
		HighlightOnElement(close);
		Assert.assertTrue(close.isEnabled());
		String currenturl=driver.getCurrentUrl();
		close.click();
		waitForSomeTime();
		waitForSomeTime();
		Reporter.log("click on close button",true);
		String previousurl=driver.getCurrentUrl();
		Assert.assertNotEquals(currenturl,previousurl,"Test case pass");
	}

}
