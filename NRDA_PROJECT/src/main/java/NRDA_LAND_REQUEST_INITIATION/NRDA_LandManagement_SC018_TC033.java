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

public class NRDA_LandManagement_SC018_TC033 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "respondent".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//label[contains(text(),'Respondent')]/../following-sibling::td/input")
	private WebElement respondent;
	
	public void enterRespondent() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{	
		wait.until(ExpectedConditions.visibilityOf(respondent));
		Assert.assertTrue(respondent.isDisplayed());
		HighlightOnElement(respondent);
		Assert.assertTrue(respondent.isEnabled());
		excel.getExcelData(respondent,"Land Data",1,20);
	}

}
