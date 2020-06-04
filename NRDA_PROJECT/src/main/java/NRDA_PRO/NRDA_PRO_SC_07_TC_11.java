package NRDA_PRO;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_PRO_SC_07_TC_11 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();

	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "remarks".
	 * @author deepak.saini
	 * @since 2018-05-11
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Remarks')]/../following-sibling::td/textarea")
	private WebElement remarks;

	public void enterRemarks() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(remarks));
		Assert.assertTrue(remarks.isDisplayed());
		HighlightOnElement(remarks);
		Assert.assertTrue(remarks.isEnabled());
		excel.getExcelData(remarks,"PRO DATA", 1,7);
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "add details".
	 * @author deepak.saini
	 * @since 2018-05-11
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'Add Details')])[2]")
	private WebElement adddetails;

	public void clickOnAddDetails() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(adddetails));
		Assert.assertTrue(adddetails.isDisplayed());
		HighlightOnElement(adddetails);
		Assert.assertTrue(adddetails.isEnabled());
		adddetails.click();
		waitForSomeTime();

	}


}
