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

public class NRDA_LandManagement_SC003_TC003 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "requested by NRDA".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Land Area Required (in Hect.)')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement landarea;
	
	@FindBy(xpath="//label[contains(text(),'Land Area Required (in Hect.)')]")
	private WebElement clickonany;
	
	public void enterTwentyDigitLandArea() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(landarea));
		Assert.assertTrue(landarea.isDisplayed());
		HighlightOnElement(landarea);
		Assert.assertTrue(landarea.isEnabled());
		excel.getExcelData(landarea,"Land Data",2,0);
	}

}
