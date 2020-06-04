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

public class NRDA_LandManagement_SC001_TC025 extends CommonLibrary{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,100);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "account number".
	 * @author deepak.saini
	 * @since 2018-05-30
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Bank Account No')]/ancestor::td/following-sibling::td/descendant::table/tbody/tr/td/input[@title='Bank Account No']")
	private WebElement accountno;
	
	public void enterAccountNum() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(accountno));
		Assert.assertTrue(accountno.isDisplayed());
		HighlightOnElement(accountno);
		Assert.assertTrue(accountno.isEnabled());
		excel.getExcelData(accountno,"Land Data",1,41);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "account holder name".
	 * @author deepak.saini
	 * @since 2018-05-30
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Account Holder Name')]/ancestor::td/following-sibling::td/descendant::table/tbody/tr/td/input")
	private WebElement accountholdername;
	
	public void enterAccountHolderName() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(accountholdername));
		Assert.assertTrue(accountholdername.isDisplayed());
		HighlightOnElement(accountholdername);
		Assert.assertTrue(accountholdername.isEnabled());
		excel.getExcelData(accountholdername,"Land Data",1,42);
	}

}
