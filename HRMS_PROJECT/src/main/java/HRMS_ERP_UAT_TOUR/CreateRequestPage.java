package HRMS_ERP_UAT_TOUR;

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

public class CreateRequestPage extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "create".
	 * @author deepak.saini
	 * @since 2018-11-26
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
		Thread.sleep(15000);
	}
	
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Source From".
	 * @author deepak.saini
	 * @since 2018-11-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Source From')]/../following-sibling::td/div/div/input")
	private WebElement sourceFrom;
	
	public void enterSourceFrom() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(sourceFrom));
		Assert.assertTrue(sourceFrom.isDisplayed());
		HighlightOnElement(sourceFrom);
		Assert.assertTrue(sourceFrom.isEnabled());
		sourceFrom.click();
		Thread.sleep(2000);
		exceldata.getExcelData(sourceFrom,"TOUR DATA",0,1);
		sourceFrom.click();
		Thread.sleep(3000);
	}
	
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Destination To".
	 * @author deepak.saini
	 * @since 2018-11-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Destination To')]/../following-sibling::td/div/div/input")
	private WebElement destinationTo;
	
	public void enterDestinationTo() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(destinationTo));
		Assert.assertTrue(destinationTo.isDisplayed());
		HighlightOnElement(destinationTo);
		Assert.assertTrue(destinationTo.isEnabled());
		destinationTo.click();
		Thread.sleep(2000);
		exceldata.getExcelData(destinationTo,"TOUR DATA",1,1);
		destinationTo.click();
		Thread.sleep(3000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Tour Start date".
	 * @author deepak.saini
	 * @since 2018-11-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//input[@name='date_from']")
	private WebElement tourStartDate;
	
	public void selectTourStartDate() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(tourStartDate));
		Assert.assertTrue(tourStartDate.isDisplayed());
		HighlightOnElement(tourStartDate);
		Assert.assertTrue(tourStartDate.isEnabled());
		tourStartDate.click();
		DateFormat dateFormat = new SimpleDateFormat("dd");
		 Date date = new Date();
		 
		 String startdate= dateFormat.format(date);
		 Reporter.log(startdate,true);
		 
		//find the calendar
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
	 * This is the xpath of the WebElement "Tour end date".
	 * @author deepak.saini
	 * @since 2018-11-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//input[@name='date_to']")
	private WebElement tourEndtDate;
	
	public void selectTourEndDate() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(tourEndtDate));
		Assert.assertTrue(tourEndtDate.isDisplayed());
		HighlightOnElement(tourEndtDate);
		Assert.assertTrue(tourEndtDate.isEnabled());
		tourEndtDate.click();
		DateFormat dateFormat = new SimpleDateFormat("dd");
		 Date date = new Date();
		 
		 String startdate= dateFormat.format(date);
		 Reporter.log(startdate,true);
		 
		//find the calendar
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
	 * This is the xpath of the WebElement "Add an Item".
	 * @author deepak.saini
	 * @since 2018-11-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//a[contains(text(),'Add an item')])[1]")
	private WebElement addAnItem;
	
	public void clickOnAddAnItem() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(addAnItem));
		Assert.assertTrue(addAnItem.isDisplayed());
		HighlightOnElement(addAnItem);
		Assert.assertTrue(addAnItem.isEnabled());
		addAnItem.click();
		Thread.sleep(5000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Source From".
	 * @author deepak.saini
	 * @since 2018-11-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='o_list_editable o-editing']/div/div[3]/div/input")
	private WebElement source;
	
	public void sourceFrom() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(source));
		Assert.assertTrue(source.isDisplayed());
		HighlightOnElement(source);
		Assert.assertTrue(source.isEnabled());
		source.click();
		Thread.sleep(2000);
		exceldata.getExcelData(source,"TOUR DATA",0,1);
		source.click();
		Thread.sleep(3000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Destination TO".
	 * @author deepak.saini
	 * @since 2018-11-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='o_list_editable o-editing']/div/div[4]/div/input")
	private WebElement destination;
	
	public void destinationTo() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(destination));
		Assert.assertTrue(destination.isDisplayed());
		HighlightOnElement(destination);
		Assert.assertTrue(destination.isEnabled());
		destination.click();
		Thread.sleep(2000);
		exceldata.getExcelData(destination,"TOUR DATA",1,1);
		destination.click();
		Thread.sleep(3000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "travel mode".
	 * @author deepak.saini
	 * @since 2018-11-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='o_list_editable o-editing']/div/div[5]/div/input")
	private WebElement travel;
	
	public void travelMode() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(travel));
		Assert.assertTrue(travel.isDisplayed());
		HighlightOnElement(travel);
		Assert.assertTrue(travel.isEnabled());
		travel.click();
		Thread.sleep(2000);
		exceldata.getExcelData(travel,"TOUR DATA",2,1);
		travel.click();
		Thread.sleep(3000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "reason for tour".
	 * @author deepak.saini
	 * @since 2018-11-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//textarea[@name='tour_description']")
	private WebElement reasonForTour;
	
	public void reasonForTour() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(reasonForTour));
		Assert.assertTrue(reasonForTour.isDisplayed());
		HighlightOnElement(reasonForTour);
		Assert.assertTrue(reasonForTour.isEnabled());
		reasonForTour.click();
		exceldata.getExcelData(reasonForTour,"TOUR DATA",3,1);
	}

}
