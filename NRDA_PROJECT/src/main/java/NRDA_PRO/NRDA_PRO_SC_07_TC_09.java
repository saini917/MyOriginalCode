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

public class NRDA_PRO_SC_07_TC_09 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Amount".
	 * @author deepak.saini
	 * @since 2018-05-11
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Amount')]/../following-sibling::td/input")
	private WebElement amount;

	public void enterAmount() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(amount));
		Assert.assertTrue(amount.isDisplayed());
		HighlightOnElement(amount);
		Assert.assertTrue(amount.isEnabled());
		excel.getExcelData(amount,"PRO DATA", 1,6);
	}


}
