package NRDA_Plumber;

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

public class ToVerifyPlumberRegistration_SC_02_TC_11 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "enter mobile number".
	 * @author deepak.saini
	 * @since 2018-01-16
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//div[@id='form0:Nb']/div/div/div/div/table/tbody/tr/td)[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Aadhar No.')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement Aadharno;
	
	public void enterAadharNo() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(Aadharno));
		Assert.assertTrue(Aadharno.isDisplayed());
		HighlightOnElement(Aadharno);
		Assert.assertTrue(Aadharno.isEnabled());
		excel.getExcelData(Aadharno,"Plumber Data",1,3);
	}
	
	public void enterAadharNo1() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(Aadharno));
		Assert.assertTrue(Aadharno.isDisplayed());
		HighlightOnElement(Aadharno);
		Assert.assertTrue(Aadharno.isEnabled());
		excel.getExcelData(Aadharno,"Plumber Data",2,3);
	}
	
	public void enterAadharNo2() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(Aadharno));
		Assert.assertTrue(Aadharno.isDisplayed());
		HighlightOnElement(Aadharno);
		Assert.assertTrue(Aadharno.isEnabled());
		excel.getExcelData(Aadharno,"Plumber Data",3,3);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "click on next".
	 * @author deepak.saini
	 * @since 2018-01-16
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//div[@id='form0:Nb']/div/div/div/div/span/center/table/tbody/tr/td/span)[1]/button/span[contains(text(),'Next')]")
	private WebElement clickonnext;

	public void clickOnApplicantNext() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(clickonnext));
		wait.until(ExpectedConditions.elementToBeClickable(clickonnext));
		Assert.assertTrue(clickonnext.isDisplayed());
		HighlightOnElement(clickonnext);
		Assert.assertTrue(clickonnext.isEnabled());
		clickonnext.click();
		waitForSomeTime();
		acceptAlert();
	}


}