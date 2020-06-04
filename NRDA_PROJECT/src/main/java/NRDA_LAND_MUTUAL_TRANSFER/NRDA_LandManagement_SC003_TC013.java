package NRDA_LAND_MUTUAL_TRANSFER;

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

public class NRDA_LandManagement_SC003_TC013 extends CommonLibrary{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,100);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Bank Details Tab".
	 * @author deepak.saini
	 * @since 2018-06-04
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//li/descendant::a[contains(text(),'Bank Detail/बैंक का विवरण')]")
	private WebElement bankdetails;

	public void clickOnBankDetails() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(bankdetails));
		Assert.assertTrue(bankdetails.isDisplayed());
		HighlightOnElement(bankdetails);
		Assert.assertTrue(bankdetails.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(bankdetails));
		bankdetails.click();
	}

}
