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

public class NRDA_LandManagement_SC003_TC019 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "purpose".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Purpose')]/../../../../../../following-sibling::td/table/tbody/tr/td/textarea")
	private WebElement purpose;
	
	@FindBy(xpath="//label[contains(text(),'Purpose')]")
	private WebElement clickonany;
	
	public void enterInvalidPurpose() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(purpose));
		Assert.assertTrue(purpose.isDisplayed());
		HighlightOnElement(purpose);
		Assert.assertTrue(purpose.isEnabled());
		excel.getExcelData(purpose,"Land Data",1,2);
		clickonany.click();
		acceptAlert();
	}
}
