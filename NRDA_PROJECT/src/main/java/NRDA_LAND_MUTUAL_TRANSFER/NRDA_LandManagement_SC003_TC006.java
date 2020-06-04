package NRDA_LAND_MUTUAL_TRANSFER;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC003_TC006 extends CommonLibrary{

	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement " Application number".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//span[contains(text(),'Application No.')]/following-sibling::input")
	private WebElement applicationo;

	public void enterInvalidApplicationNum() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(applicationo));
		Assert.assertTrue(applicationo.isDisplayed());
		HighlightOnElement(applicationo);
		Assert.assertTrue(applicationo.isEnabled());
		excel.getExcelData(applicationo,"Land Request Initiation",0,6);
		waitForPageLoad();
		waitForDomElement();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Error message".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//td[contains(text(),'No application found')])[1]")
	private WebElement msg;
	
	public void verifyErrorMsg(){
		String expected="No application found";
		wait.until(ExpectedConditions.visibilityOf(msg));
		Assert.assertTrue(msg.isDisplayed());
		HighlightOnElement(msg);
		String actual=msg.getText();
		Assert.assertEquals(actual,expected,"Test case not pass");
		Reporter.log("Error Message"+actual,true);
	}


}
