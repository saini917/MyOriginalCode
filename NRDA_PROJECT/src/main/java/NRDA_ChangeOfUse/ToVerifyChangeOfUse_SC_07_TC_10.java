package NRDA_ChangeOfUse;

import java.awt.AWTException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyChangeOfUse_SC_07_TC_10 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "upload document".
	 * @author deepak.saini
	 * @since 2018-04-18
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="(//span[contains(text(),'Upload Document')])[1]/../../following-sibling::tr/td/table/tbody/tr/td/div/div/label")
	private WebElement upload;
	
	public void clickOnUploadDocument() throws AWTException, InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(upload));
		HighlightOnElement(upload);
		Assert.assertTrue(upload.isDisplayed());
		Assert.assertTrue(upload.isEnabled());
		upload.click();
		upload.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\DocumentFormat\\CSVFormat.csv");
		waitForSomeTime();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "successful message".
	 * @author deepak.saini
	 * @since 2018-04-18
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div/span[contains(text(),'Upload only jpg, png or pdf file')]")
	private WebElement msg;

	public void verifyErrorMsg() throws InterruptedException
	{
		String actual="Upload only jpg, png or pdf file";
		wait.until(ExpectedConditions.elementToBeClickable(msg));
		HighlightOnElement(msg);
		Assert.assertTrue(msg.isDisplayed());
		Assert.assertTrue(msg.isEnabled());
		String expected=msg.getText();
		Reporter.log("Error Message :"+expected,true);
		Assert.assertEquals(actual,expected,"Test case pass");
		HighlightOnElement(msg);
	}

}
