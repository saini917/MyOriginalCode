package NRDA_ChangeOfUse;

import java.awt.AWTException;
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

public class ToVerifyChangeOfUse_SC_02_TC_12 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Remarks".
	 * @author deepak.saini
	 * @since 2018-04-11
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:tabView']/div/div[4]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Details of Usage')]/../../../../../../following-sibling::td/table/tbody/tr/td/select/../../../../../../../../../../following-sibling::tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Remarks(if any)')]/../../../../../../following-sibling::td/table/tbody/tr/td/textarea")
	private WebElement remarks;
	
	public void enterRemarks() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(remarks));
		Assert.assertTrue(remarks.isDisplayed());
		HighlightOnElement(remarks);
		Assert.assertTrue(remarks.isEnabled());
		excel.getExcelData(remarks,"Change Of Use Data",1,4);
	}
	
	// for temporary used
	
	@FindBy(xpath="(//a[contains(text(),'Connection Details/कनेक्शन विवरण')])[1]")
	private WebElement connectiondetails;
	
	@FindBy(xpath="//label[contains(text(),'Trust/Organisation/School')]/../../../../../../following-sibling::td/table/tbody/tr/td/input[@id='form0:tabView:id_APPTRUST_id6']")
	private WebElement trust;
	
	@FindBy(xpath="//label[contains(text(),'Sewerage Connection Diameter')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement diameter;
	
	@FindBy(xpath="//label[contains(text(),'Site Plan Showing Proposed Sewerage Connection')]/../../../../../../following-sibling::td/table/tbody/tr/td/span/div/div/label")
	private WebElement site;
	
	public void clickOnConnectionDetails() throws InterruptedException, AWTException
	{
		wait.until(ExpectedConditions.visibilityOf(connectiondetails));
		waitForSomeTime();
		wait.until(ExpectedConditions.elementToBeClickable(connectiondetails));
		HighlightOnElement(connectiondetails);
		connectiondetails.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		
		trust.sendKeys("ABC");
		waitForSomeTime();
		
		diameter.sendKeys("12");
		site.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\JPG AND PNG\\SampleJPGImage_500kbmb.jpg");
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	}

}
