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

public class NRDA_PRO_SC_07_TC_07 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "invoice number".
	 * @author deepak.saini
	 * @since 2018-05-11
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Invoice No.')]/../following-sibling::td/input")
	private WebElement invoice;

	public void enterInvoiceNum() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(invoice));
		Assert.assertTrue(invoice.isDisplayed());
		HighlightOnElement(invoice);
		Assert.assertTrue(invoice.isEnabled());
		excel.getExcelData(invoice,"PRO DATA", 1,5);
	}


}
