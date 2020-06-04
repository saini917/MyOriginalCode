package HRMS_ERP_UAT_VRS;

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

public class HRapprovePage extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Approve".
	 * @author deepak.saini
	 * @since 2018-11-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//span[contains(text(),'Approve')])[5]")
	private WebElement approve;
	
	public void clickOnApprove() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(approve));
		Assert.assertTrue(approve.isDisplayed());
		HighlightOnElement(approve);
		Assert.assertTrue(approve.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(approve));
		approve.click();
		Thread.sleep(10000);
	}
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "relieving date".
	 * @author deepak.saini
	 * @since 2018-11-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//table[@class='o_group o_inner_group'])[5]/tbody/tr/td/div/span")
	private WebElement relievingDate;
	
	public void selectRelievingDate(){
		wait.until(ExpectedConditions.visibilityOf(relievingDate));
		Assert.assertTrue(relievingDate.isDisplayed());
		HighlightOnElement(relievingDate);
		Assert.assertTrue(relievingDate.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(relievingDate));
		
		
		DateFormat dateFormat = new SimpleDateFormat("dd");
		Date date = new Date();
		 
		 String startdate= dateFormat.format(date);
		 Reporter.log(startdate,true);
		 
		 relievingDate.click();
		 
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
	 * This is the xpath of the WebElement "remarks".
	 * @author deepak.saini
	 * @since 2018-11-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//textarea[@placeholder='Please give the Remarks']")
	private WebElement remarks;
	
	public void enterRemarks() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(remarks));
		Assert.assertTrue(remarks.isDisplayed());
		HighlightOnElement(remarks);
		Assert.assertTrue(remarks.isEnabled());
		exceldata.getExcelData(remarks,"VRS DATA",3,1);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "submit".
	 * @author deepak.saini
	 * @since 2018-11-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//span[contains(text(),'Submit')]")
	private WebElement submit;
	
	public void clickOnSubmit() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(submit));
		Assert.assertTrue(submit.isDisplayed());
		HighlightOnElement(submit);
		Assert.assertTrue(submit.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(submit));
		submit.click();
		Thread.sleep(10000);
	}

}
