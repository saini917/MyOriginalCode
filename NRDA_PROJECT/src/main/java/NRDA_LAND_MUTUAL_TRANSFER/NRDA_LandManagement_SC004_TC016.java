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

public class NRDA_LandManagement_SC004_TC016 extends CommonLibrary{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,100);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "land details".
	 * @author deepak.saini
	 * @since 2018-06-04
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="(//td/descendant::label[contains(text(),'Remarks')])[1]/../following-sibling::td/input")
	private WebElement remarks;

	public void enterRemarks() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(remarks));
		Assert.assertTrue(remarks.isDisplayed());
		HighlightOnElement(remarks);
		Assert.assertTrue(remarks.isEnabled());
		excel.getExcelData(remarks,"Land Data",2,46);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "land details".
	 * @author deepak.saini
	 * @since 2018-06-04
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="(//button/descendant::span[contains(text(),'Update')])[2]")
	private WebElement update;
	
	public void clickOnUpdate() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(update));
		Assert.assertTrue(update.isDisplayed());
		HighlightOnElement(update);
		Assert.assertTrue(update.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(update));
		update.click();
		waitForPageLoad();
	}

}
