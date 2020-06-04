package NRDA_PRO;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_PRO_SC_04_TC_07 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "description ".
	 * @author deepak.saini
	 * @since 2018-04-18
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:panel_add_content']/table/tbody/tr/td/label[contains(text(),'Description')]/../following-sibling::td/textarea")
	private WebElement description;
	
	public void enterDescription() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(description));
		Assert.assertTrue(description.isDisplayed());
		HighlightOnElement(description);
		Assert.assertTrue(description.isEnabled());
		excel.getExcelData(description,"PRO DATA",1,1);
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "upload document ".
	 * @author deepak.saini
	 * @since 2018-04-18
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:panel_add_content']/table/tbody/tr/td/label[contains(text(),'Upload document')]/../following-sibling::td/table/tbody/tr/td/div/div/label")
	private WebElement upload;
	
	public void uploadDocument() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		wait.until(ExpectedConditions.visibilityOf(upload));
		Assert.assertTrue(upload.isDisplayed());
		HighlightOnElement(upload);
		Assert.assertTrue(upload.isEnabled());
		upload.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\download.jpg");
		waitForSomeTime();
		Reporter.log("Upload the documents",true);
	}
	
	@FindBy(xpath="(//button/span[contains(text(),'Add Details')])[1]")
	private WebElement adddetails;
	
	public void clickOnAddDetails() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(adddetails));
		Assert.assertTrue(adddetails.isDisplayed());
		HighlightOnElement(adddetails);
		Assert.assertTrue(adddetails.isEnabled());
		adddetails.click();
		waitForSomeTime();
	}
	

}
