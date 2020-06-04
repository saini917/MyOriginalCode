package NRDA_Plumber;

import java.io.IOException;
import java.util.List;
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

public class ToVerifyPlumberRegistration_SC_02_TC_06 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();

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
		Reporter.log("Leave the applicant details mandatory fields as blank",true);
		clickonnext.click();
		waitForSomeTime();
	}

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
	@FindBy(xpath="//div[@id='form0:Nb']/div/div/div/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Total Year of Experience')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement experience;

	public void enterTotalYearExperience() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(experience));
		Assert.assertTrue(experience.isDisplayed());
		HighlightOnElement(experience);
		Assert.assertTrue(experience.isEnabled());
		excel.getExcelData(experience,"Plumber Data",1,0);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "click on next".
	 * @author deepak.saini
	 * @since 2018-01-16
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//div[@id='form0:Nb']/div/div/div/div/span/center/table/tbody/tr/td/span)[2]/button/span[contains(text(),'Next')]")
	private WebElement clickonnext1;

	public void clickOnEducationNext() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(clickonnext1));
		wait.until(ExpectedConditions.elementToBeClickable(clickonnext1));
		Assert.assertTrue(clickonnext1.isDisplayed());
		HighlightOnElement(clickonnext1);
		Assert.assertTrue(clickonnext1.isEnabled());
		clickonnext1.click();
		waitForSomeTime();
	}
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "click on next".
	 * @author deepak.saini
	 * @since 2018-01-16
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:Nb']/div/div/div/div/span/center/table/tbody/tr/td/span/button/span[contains(text(),'Submit')]")
	private WebElement clickonsubmit;

	public void clickOnSubmit() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(clickonsubmit));
		wait.until(ExpectedConditions.elementToBeClickable(clickonsubmit));
		Assert.assertTrue(clickonsubmit.isDisplayed());
		HighlightOnElement(clickonsubmit);
		Assert.assertTrue(clickonsubmit.isEnabled());
		clickonsubmit.click();
		Reporter.log("click on Submit button",true);
		waitForSomeTime();
	}
	
	@FindBy(xpath="//div[@class='ui-growl-message']/span")
	private List<WebElement> errormsg;
	
	public void getErrorMsg() throws InterruptedException
	{
		Reporter.log("User should be able to view an error message :",true);
		for(WebElement error:errormsg)
		{
			HighlightOnElement(error);
			Assert.assertTrue(error.isDisplayed());
			Reporter.log(error.getText(),true);
			waitForSomeTime();
		}
	}
	
}
