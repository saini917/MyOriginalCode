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

public class ToVerifyPlumberRegistration_SC_02_TC_13 extends CommonLibrary
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
		excel.getExcelData(Aadharno,"Plumber Data",4,3);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "enter mobile number".
	 * @author deepak.saini
	 * @since 2018-01-16
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//div[@id='form0:Nb']/div/div/div/div/table/tbody/tr/td)[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Name')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement name;
	
	public void enterName() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(name));
		Assert.assertTrue(name.isDisplayed());
		HighlightOnElement(name);
		Assert.assertTrue(name.isEnabled());
		excel.getExcelData(name,"Plumber Data",4,2);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "enter mobile number".
	 * @author deepak.saini
	 * @since 2018-01-16
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//div[@id='form0:Nb']/div/div/div/div/table/tbody/tr/td)[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Mobile No.')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement mobileno;
	
	public void enterMobileNumber() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(mobileno));
		Assert.assertTrue(mobileno.isDisplayed());
		HighlightOnElement(mobileno);
		Assert.assertTrue(mobileno.isEnabled());
		excel.getExcelData(mobileno,"Plumber Data",4,1);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "click on reset".
	 * @author deepak.saini
	 * @since 2018-01-16
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//div[@id='form0:Nb']/div/div/div/div/span/center/table/tbody/tr/td/span)[1]/button/span[contains(text(),'Reset')]")
	private WebElement clickonreset;

	public void clickOnApplicantReset() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(clickonreset));
		wait.until(ExpectedConditions.elementToBeClickable(clickonreset));
		Assert.assertTrue(clickonreset.isDisplayed());
		HighlightOnElement(clickonreset);
		Assert.assertTrue(clickonreset.isEnabled());
		clickonreset.click();
		waitForSomeTime();
	}

}
