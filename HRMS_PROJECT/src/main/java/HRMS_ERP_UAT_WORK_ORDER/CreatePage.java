package HRMS_ERP_UAT_WORK_ORDER;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.ExcelDataDriver;
import GenericLibrary.WebdriverCommonDriverLibrary;

public class CreatePage extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Work Order".
	 * @author deepak.saini
	 * @since 2018-12-12
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//button[contains(text(),'Create')]")
	private WebElement create;
	
	public void clickOnCreate() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(create));
		Assert.assertTrue(create.isDisplayed());
		HighlightOnElement(create);
		Assert.assertTrue(create.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(create));
		create.click();
		Thread.sleep(3000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Supplier".
	 * @author deepak.saini
	 * @since 2018-12-12
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//div[@class='o_form_input_dropdown'])[1]/input")
	private WebElement supplier;
	
	@FindBy(xpath="//li/a[contains(text(),'A D B & Company, C. A.')]")
	private WebElement value;
	
	public void selectSupplier() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(supplier));
		Assert.assertTrue(supplier.isDisplayed());
		HighlightOnElement(supplier);
		Assert.assertTrue(supplier.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(supplier));
		supplier.click();
		Thread.sleep(1000);
		value.click();
		Thread.sleep(1000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "TS NO.".
	 * @author deepak.saini
	 * @since 2018-12-12
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//div[@class='o_form_input_dropdown'])[3]/input")
	private WebElement ts;
	
	@FindBy(xpath="//li/a[contains(text(),'TS/2018/00011')]")
	private WebElement values;
	
	public void selectTSNo() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(ts));
		Assert.assertTrue(ts.isDisplayed());
		HighlightOnElement(ts);
		Assert.assertTrue(ts.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(ts));
		ts.click();
		Thread.sleep(1000);
		values.click();
		Thread.sleep(1000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Tender No".
	 * @author deepak.saini
	 * @since 2018-12-12 
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Tender No.')]/../following-sibling::td/input")
	private WebElement tender;
	
	public void enterTenderNo() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(tender));
		Assert.assertTrue(tender.isDisplayed());
		HighlightOnElement(tender);
		Assert.assertTrue(tender.isEnabled());
		exceldata.getExcelData(tender,"Finance Data",19,1);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Start Date".
	 * @author deepak.saini
	 * @since 2018-12-12
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Start Date')]/../following-sibling::td/div/input")
	private WebElement date;
	
	public void selectStartDate() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(date));
		Assert.assertTrue(date.isDisplayed());
		HighlightOnElement(date);
		Assert.assertTrue(date.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(date));
		date.click();
		Thread.sleep(1000);
		
		DateFormat dateFormat = new SimpleDateFormat("dd");
		Date date = new Date();
		String startdate= dateFormat.format(date);
		Reporter.log(startdate,true);
		WebElement dateWidget = driver.findElement(By.xpath("//table[@class='table-condensed']/tbody/tr"));  
        List<WebElement> columns=dateWidget.findElements(By.xpath("//table[@class='table-condensed']/tbody/tr/td"));  

        //comparing the text of cell with today's date and clicking it.
        for (WebElement cell : columns)
        {
           if (cell.getText().equals(startdate))
           {
              cell.click();
              break;
           }
        }
	}

	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Completion Date".
	 * @author deepak.saini
	 * @since 2018-12-12
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Completion Date')]/../following-sibling::td/div/input")
	private WebElement comdate;
	
	public void selectCompletionDate() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(comdate));
		Assert.assertTrue(comdate.isDisplayed());
		HighlightOnElement(comdate);
		Assert.assertTrue(comdate.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(comdate));
		comdate.click();
		Thread.sleep(1000);
		
		DateFormat dateFormat = new SimpleDateFormat("dd");
		Date date = new Date();
		String startdate= dateFormat.format(date);
		Reporter.log(startdate,true);
		WebElement dateWidget = driver.findElement(By.xpath("//table[@class='table-condensed']/tbody/tr"));  
        List<WebElement> columns=dateWidget.findElements(By.xpath("//table[@class='table-condensed']/tbody/tr/td"));  

        //comparing the text of cell with today's date and clicking it.
        for (WebElement cell : columns)
        {
           if (cell.getText().equals(startdate))
           {
              cell.click();
              break;
           }
        }
	}

}
