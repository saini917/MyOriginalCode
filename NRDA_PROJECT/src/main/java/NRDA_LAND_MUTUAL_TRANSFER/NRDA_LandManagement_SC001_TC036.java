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

public class NRDA_LandManagement_SC001_TC036 extends CommonLibrary{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,100);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "khsara details".
	 * @author deepak.saini
	 * @since 2018-05-31
	 */
	/****************************************************************************************************/
	
	@FindBy(xpath="//a[contains(text(),'Khasra Details')]")
	private WebElement khasradetails;
	
	public void verifyKhasraDetails() throws EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(khasradetails));
		Assert.assertTrue(khasradetails.isDisplayed());
		HighlightOnElement(khasradetails);
		Assert.assertTrue(khasradetails.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(khasradetails));
		khasradetails.click();
	}

}
