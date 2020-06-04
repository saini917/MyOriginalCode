package NRDA_LAND_REQUEST_INITIATION;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC017_TC032 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "remarks".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="(//label[contains(text(),'Remarks')])[1]/../following-sibling::td/input")
	private WebElement remarks;
	
	public void enterRemarks() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(remarks));
		Assert.assertTrue(remarks.isDisplayed());
		HighlightOnElement(remarks);
		Assert.assertTrue(remarks.isEnabled());
		excel.getExcelData(remarks,"Land Data",2,18);
	}
	
	@FindBy(xpath="(//button/span[contains(text(),'Update')])[2]")
	private WebElement update;
	
	public void clickOnUpdate() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(update));
		Assert.assertTrue(update.isDisplayed());
		HighlightOnElement(update);
		Assert.assertTrue(update.isEnabled());
		update.click();
		waitForSomeTime();
	}


}