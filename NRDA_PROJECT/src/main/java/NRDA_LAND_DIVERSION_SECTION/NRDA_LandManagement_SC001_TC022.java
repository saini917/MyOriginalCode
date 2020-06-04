package NRDA_LAND_DIVERSION_SECTION;

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

public class NRDA_LandManagement_SC001_TC022 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Land section".
	 * @author deepak.saini
	 * @since 2018-05-28
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//a[contains(text(),'Land Section')]/preceding-sibling::span")
	private WebElement landsection;
	
	public void clickOnLandSection() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(landsection));
		Assert.assertTrue(landsection.isDisplayed());
		HighlightOnElement(landsection);
		Assert.assertTrue(landsection.isEnabled());
		landsection.click();
	}
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Land Diversion request".
	 * @author deepak.saini
	 * @since 2018-05-28
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//a[contains(text(),'Land Section')]/preceding-sibling::span/../following-sibling::div/ul/li/a/span[contains(text(),'LAND DIVERSION REQUEST')]")
	private WebElement landdiversion;
	
	public void clickOnLandDiversion() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(landdiversion));
		Assert.assertTrue(landdiversion.isDisplayed());
		HighlightOnElement(landdiversion);
		Assert.assertTrue(landdiversion.isEnabled());
		landdiversion.click();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Application number".
	 * @author deepak.saini
	 * @since 2018-05-28
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//span[contains(text(),'Application No.')]/following-sibling::input")
	private WebElement applicationsarchbox;
	
	public void enterApplicationNum() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(applicationsarchbox));
		Assert.assertTrue(applicationsarchbox.isDisplayed());
		HighlightOnElement(applicationsarchbox);
		Assert.assertTrue(applicationsarchbox.isEnabled());
		excel.getExcelData(applicationsarchbox,"Land_Diversion_AppNum",0,1);
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "action image".
	 * @author deepak.saini
	 * @since 2018-05-28
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-datatable-tablewrapper']/table/tbody/tr/td/center/a/img")
	private WebElement action;
	
	public void clickOnAction() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(action));
		Assert.assertTrue(action.isDisplayed());
		HighlightOnElement(action);
		Assert.assertTrue(action.isEnabled());
		action.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	}
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "basic details".
	 * @author deepak.saini
	 * @since 2018-05-28
	 */
	/****************************************************************************************************/
	
	@FindBy(xpath="//span[contains(text(),'Basic Details')]")
	private WebElement basicdetails;
	
	public void verifyBasicDetails() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(basicdetails));
		Assert.assertTrue(basicdetails.isDisplayed());
		HighlightOnElement(basicdetails);
	}

}
