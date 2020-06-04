package HRMS_ERP_UAT_ADMINISTRATIVE_APPROVAL_ALLOCATION;

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
import GenericLibrary.ExcelDataDriver;
import GenericLibrary.WebdriverCommonDriverLibrary;

public class EditPage extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "edit'.
	 * @author deepak.saini
	 * @since 2018-12-04
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//button[contains(text(),'Edit')]")
	private WebElement edit;
	
	public void clickOnEdit() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(edit));
		Assert.assertTrue(edit.isDisplayed());
		HighlightOnElement(edit);
		Assert.assertTrue(edit.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(edit));
		edit.click();
		Thread.sleep(2000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Upload your file ".
	 * @author deepak.saini
	 * @since 2018-12-03
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//button[contains(text(),'Upload your file')]")
	private WebElement files;
	
	public void clickOnUploadFile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		wait.until(ExpectedConditions.visibilityOf(files));
		Assert.assertTrue(files.isDisplayed());
		HighlightOnElement(files);
		Assert.assertTrue(files.isEnabled());
		files.click();
		Thread.sleep(2000);
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\HRMS_PROJECT\\src\\test\\resources\\HRMS_IMAGE\\ExcelFormat.xlsx");
		Thread.sleep(3000);
	}

}
