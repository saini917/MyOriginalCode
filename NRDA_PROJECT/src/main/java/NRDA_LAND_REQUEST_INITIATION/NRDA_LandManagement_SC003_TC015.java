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

public class NRDA_LandManagement_SC003_TC015 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "remarks".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//label[contains(text(),'Remarks')])[2]/following-sibling::input")
	private WebElement remarks;

	public void enterRemarks() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(remarks));
		Assert.assertTrue(remarks.isDisplayed());
		HighlightOnElement(remarks);
		Assert.assertTrue(remarks.isEnabled());
		excel.getExcelData(remarks,"Land Data",1,1);
		waitForSomeTime();
	}


}
