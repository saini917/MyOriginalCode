package NRDA_LAND_REQUEST_INITIATION;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC018_TC041 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "update".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="(//span[contains(text(),'Update')])[3]")
	private WebElement update;
	
	public void clickOnUpdate() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",update);
		waitForSomeTime();
		waitForSomeTime();
		
		wait.until(ExpectedConditions.visibilityOf(update));
		Assert.assertTrue(update.isDisplayed());
		HighlightOnElement(update);
		Assert.assertTrue(update.isEnabled());
		update.click();
		waitForSomeTime();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "remarks".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//label[contains(text(),'Legal Remarks')]/../following-sibling::td/textarea")
	private WebElement remarks;
	
	public void enterUpdateRemarks() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(remarks));
		Assert.assertTrue(remarks.isDisplayed());
		HighlightOnElement(remarks);
		Assert.assertTrue(remarks.isEnabled());
		remarks.clear();
		waitForSomeTime();
		excel.getExcelData(remarks,"Land Data",2,22);
		waitForSomeTime();
	}
	
	@FindBy(xpath="(//button/span[contains(text(),'Update')])[2]")
	private WebElement updatepop;
	
	public void clickOnUpdatePop() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(updatepop));
		Assert.assertTrue(updatepop.isDisplayed());
		HighlightOnElement(updatepop);
		Assert.assertTrue(updatepop.isEnabled());
		updatepop.click();
		waitForSomeTime();
		waitForSomeTime();
	}

}
