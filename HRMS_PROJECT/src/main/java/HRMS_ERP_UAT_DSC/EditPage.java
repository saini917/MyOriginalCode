package HRMS_ERP_UAT_DSC;

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

public class EditPage extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Edit".
	 * @author deepak.saini
	 * @since 2018-11-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//button[contains(text(),'Edit')]")
	private WebElement edit;
	
	public void clickOnEdit() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(edit));
		Assert.assertTrue(edit.isDisplayed());
		HighlightOnElement(edit);
		Assert.assertTrue(edit.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(edit));
		edit.click();
		Thread.sleep(5000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "remarks".
	 * @author deepak.saini
	 * @since 2018-11-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//textarea[@name='employee_feedback']")
	private WebElement remarks;
	
	public void enterRemark() throws EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(remarks));
		Assert.assertTrue(remarks.isDisplayed());
		HighlightOnElement(remarks);
		Assert.assertTrue(remarks.isEnabled());
		exceldata.getExcelData(remarks,"DSC DATA",1,2);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "remarks".
	 * @author deepak.saini
	 * @since 2018-11-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//textarea[@name='enquiry_remark']")
	private WebElement remark;
	
	public void enterRemarks() throws EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(remark));
		Assert.assertTrue(remark.isDisplayed());
		HighlightOnElement(remark);
		Assert.assertTrue(remark.isEnabled());
		exceldata.getExcelData(remark,"DSC DATA",1,4);
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select discipliany action".
	 * @author deepak.saini
	 * @since 2018-11-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//select[@name='punishment_status']")
	private WebElement action;
	
	public void selectDisciplianyAction() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(action));
		Assert.assertTrue(action.isDisplayed());
		HighlightOnElement(action);
		Assert.assertTrue(action.isEnabled());
		SelectVisibleText(action,"Hold Increment");
		Thread.sleep(2000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "calender".
	 * @author deepak.saini
	 * @since 2018-11-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//input[@name='hold_increment_effective_date']")
	private WebElement cal;
	
	public void clickOnEffectiveDate(){
		wait.until(ExpectedConditions.visibilityOf(cal));
		Assert.assertTrue(cal.isDisplayed());
		HighlightOnElement(cal);
		Assert.assertTrue(cal.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(cal));
		cal.click();
		
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

}
