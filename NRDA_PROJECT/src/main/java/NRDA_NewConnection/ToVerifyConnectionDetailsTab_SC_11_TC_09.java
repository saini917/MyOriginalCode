package NRDA_NewConnection;

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

public class ToVerifyConnectionDetailsTab_SC_11_TC_09 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "meter number".
	 * @author deepak saini
	 * @since 2017-09-22
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//div[@id='inboxForm:docAccordionPanel']/ul/li/a[contains(text(),'Connection Meter Details')]/../../following-sibling::div/div/div/div/center/table/tbody/tr/td/label[contains(text(),'Meter Number')]/../following-sibling::td/input")
	private WebElement meternumber;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "meter status".
	 * @author deepak saini
	 * @since 2017-09-22
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//div[@id='inboxForm:docAccordionPanel']/ul/li/a[contains(text(),'Connection Meter Details')]/../../following-sibling::div/div/div/div/center/table/tbody/tr/td/label[contains(text(),'Meter Status')]/../following-sibling::td/input")
	private WebElement meterstatus;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "meter latitude".
	 * @author deepak saini
	 * @since 2017-09-22
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//div[@id='inboxForm:docAccordionPanel']/ul/li/a[contains(text(),'Connection Meter Details')]/../../following-sibling::div/div/div/div/center/table/tbody/tr/td/label[contains(text(),'Meter Latitude')]/../following-sibling::td/input")
	private WebElement meterlatitude;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "meter longitude".
	 * @author deepak saini
	 * @since 2017-09-22
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//div[@id='inboxForm:docAccordionPanel']/ul/li/a[contains(text(),'Connection Meter Details')]/../../following-sibling::div/div/div/div/center/table/tbody/tr/td/label[contains(text(),'Meter Longitude')]/../following-sibling::td/input")
	private WebElement meterlongitude;
	
	@FindBy(xpath="//label[contains(text(),'Meter Number')]")
	private WebElement clickonany;
	
	public void enterInvalidMeterData() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(meternumber));
		Assert.assertTrue(meternumber.isDisplayed());
		HighlightOnElement(meternumber);
		Assert.assertTrue(meternumber.isEnabled());
		excel.getExcelData(meternumber,"Connection Meter Number",2,2);
		clickonany.click();
		acceptAlert();
		
		wait.until(ExpectedConditions.visibilityOf(meterstatus));
		Assert.assertTrue(meterstatus.isDisplayed());
		HighlightOnElement(meterstatus);
		Assert.assertTrue(meterstatus.isEnabled());
		excel.getExcelData(meterstatus,"Connection Meter Number",2,3);
		clickonany.click();
		acceptAlert();
		
		wait.until(ExpectedConditions.visibilityOf(meterlatitude));
		Assert.assertTrue(meterlatitude.isDisplayed());
		HighlightOnElement(meterlatitude);
		Assert.assertTrue(meterlatitude.isEnabled());
		excel.getExcelData(meterlatitude,"Connection Meter Number",2,4);
		clickonany.click();
		acceptAlert();
		
		wait.until(ExpectedConditions.visibilityOf(meterlongitude));
		Assert.assertTrue(meterlongitude.isDisplayed());
		HighlightOnElement(meterlongitude);
		Assert.assertTrue(meterlongitude.isEnabled());
		excel.getExcelData(meterlongitude,"Connection Meter Number",2,5);
		clickonany.click();
		acceptAlert();
	}
	
}
