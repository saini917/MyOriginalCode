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
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyPlumberRegistration_SC_02_TC_17 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Name of course".
	 * @author deepak.saini
	 * @since 2018-01-16
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:Nb']/div/div/div/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Name of Course')]/../../../../../../following-sibling::td/table/tbody/tr/td/select")
	private WebElement nameofcourse;

	public void selectNameOfCourse() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(nameofcourse));
		wait.until(ExpectedConditions.elementToBeClickable(nameofcourse));
		Assert.assertTrue(nameofcourse.isDisplayed());
		HighlightOnElement(nameofcourse);
		Assert.assertTrue(nameofcourse.isEnabled());
		SelectVisibleText(nameofcourse,"Plumbing Technology / नलसाजी प्रौद्योगिकी");
		
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Total year of experience".
	 * @author deepak.saini
	 * @since 2018-01-16
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//div[@id='form0:Nb']/div/div/div/div/table/tbody/tr/td)[2]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Total Year of Experience')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement totalyearofexperience;
	
	public void enterTotalOfYearExperience() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(totalyearofexperience));
		Assert.assertTrue(totalyearofexperience.isDisplayed());
		HighlightOnElement(totalyearofexperience);
		Assert.assertTrue(totalyearofexperience.isEnabled());
		excel.getExcelData(totalyearofexperience,"Plumber Data",1,0);
		Reporter.log("Enter the details",true); 
	}	
	
/****************************************************************************************************//*
	
	 * This is the xpath of the WebElement "click on Education next".
	 * @author deepak.saini
	 * @since 2018-01-16
	 
	/*****************************************************************************************************/
	@FindBy(xpath="(//div[@id='form0:Nb']/div/div/div/div/span/center/table/tbody/tr/td/span)[2]/button/span[contains(text(),'Next')]")
	private WebElement clickonnext;

	public void clickOnEducationNext() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(clickonnext));
		wait.until(ExpectedConditions.elementToBeClickable(clickonnext));
		Assert.assertTrue(clickonnext.isDisplayed());
		HighlightOnElement(clickonnext);
		Assert.assertTrue(clickonnext.isEnabled());
		clickonnext.click();
		Reporter.log("click on Next button",true);
		waitForSomeTime();
	}

}