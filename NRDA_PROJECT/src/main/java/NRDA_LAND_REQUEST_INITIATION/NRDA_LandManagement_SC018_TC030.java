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

public class NRDA_LandManagement_SC018_TC030 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "case number".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//label[contains(text(),'CaseNo')]/../following-sibling::td/input")
	private WebElement caseno;
	
	public void enterCaseNo() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{	
		wait.until(ExpectedConditions.visibilityOf(caseno));
		Assert.assertTrue(caseno.isDisplayed());
		HighlightOnElement(caseno);
		Assert.assertTrue(caseno.isEnabled());
		excel.getExcelData(caseno,"Land Data",1,19);
	}
}
