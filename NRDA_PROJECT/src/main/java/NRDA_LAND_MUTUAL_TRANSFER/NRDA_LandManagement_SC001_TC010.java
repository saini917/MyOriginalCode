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

public class NRDA_LandManagement_SC001_TC010 extends CommonLibrary{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select khasra ".
	 * @author deepak.saini
	 * @since 2018-05-28
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//label[contains(text(),'Owner Name')])[1]/ancestor::td/following-sibling::td/descendant::table/tbody/tr/td/input[@title='Owner Name']")
	private WebElement ownername;
	
	public void verifyOwnerName() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(ownername));
		Assert.assertTrue(ownername.isDisplayed());
		HighlightOnElement(ownername);
		Assert.assertTrue(ownername.isEnabled());
		excel.getExcelData(ownername,"Land Data",1,31);
	}

}
