package NRDA_LAND_DIVERSION_SECTION;

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

public class NRDA_LandManagement_SC001_TC014 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,500);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "update".
	 * @author deepak.saini
	 * @since 2018-05-28
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//button/span[contains(text(),'Update')]")
	private WebElement update;
	
	public void clickOnUpdate() throws InterruptedException
	{
		switchFrameToMainWindow();
		update(update);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "submit".
	 * @author deepak.saini
	 * @since 2018-05-28
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'Submit')])[1]")
	private WebElement submit;
	
	public void clickOnSubmit() throws InterruptedException
	{
		submit(submit);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Application number".
	 * @author deepak.saini
	 * @since 2018-05-28
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//span[contains(text(),'Application Number')]/../following-sibling::td[1]/span")
	private WebElement appnum;
	
	public void getApplicationNum() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(appnum));
		Assert.assertTrue(appnum.isDisplayed());
		HighlightOnElement(appnum);
		Assert.assertTrue(appnum.isEnabled());
		String appnumber=appnum.getText();
		Reporter.log("Application Number:"+appnumber,true);
		excel.updateLandDiversionAppNum(appnumber);
	}

}
