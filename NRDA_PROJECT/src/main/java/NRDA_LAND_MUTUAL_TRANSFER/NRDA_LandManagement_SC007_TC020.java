package NRDA_LAND_MUTUAL_TRANSFER;

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

public class NRDA_LandManagement_SC007_TC020 extends CommonLibrary{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,100);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	@FindBy(xpath="(//span[contains(text(),'Upload Document')])[1]/../../following-sibling::tr/td/table/tbody/tr/td/div/div/label")
	private WebElement upload;
	
	public void uploadInvalidDocument() throws InterruptedException, AWTException{
		wait.until(ExpectedConditions.visibilityOf(upload));
		Assert.assertTrue(upload.isDisplayed());
		HighlightOnElement(upload);
		Assert.assertTrue(upload.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(upload));
		upload.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\DocumentFormat\\CSVFormat.csv");
		waitForPageLoad();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "error message".
	 * @author deepak.saini
	 * @since 2018-04-17
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div/span[contains(text(),'Upload only jpg, png or pdf file')]")
	private WebElement msg;
	
	public void verifyErrorMsg() throws InterruptedException{
		String expected="Upload only jpg, png or pdf file";
		wait.until(ExpectedConditions.visibilityOf(msg));
		HighlightOnElement(msg);
		Assert.assertTrue(msg.isDisplayed());
		String actual=msg.getText();
		Reporter.log("Uploaded Message :"+actual,true);
		Assert.assertEquals(actual,expected,"Test case not pass");
	}

}