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

public class NRDA_LandManagement_SC001_TC037 extends CommonLibrary{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,100);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "corresspondance address".
	 * @author deepak.saini
	 * @since 2018-05-31
	 */
	/****************************************************************************************************/
	
	@FindBy(xpath="//a[contains(text(),'Correspondence Address Details/पते का विवरण')]")
	private WebElement address;
	
	public void verifyCorrespondanceAddress() throws EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(address));
		Assert.assertTrue(address.isDisplayed());
		HighlightOnElement(address);
		Assert.assertTrue(address.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(address));
		address.click();
	}
}
