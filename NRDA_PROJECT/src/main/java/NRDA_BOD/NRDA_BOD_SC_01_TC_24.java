package NRDA_BOD;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_BOD_SC_01_TC_24 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Meeting Start date".
	 * @author deepak.saini
	 * @since 2017-02-14
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:Nb_content']/div/div/div[3]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Meeting Start Date')]/../../../../../../following-sibling::td/table/tbody/tr/td/span/input")
	private WebElement meetingstartdate;
	
	public void verifyMeetingStartDate()
	{
		 DateFormat dateFormat = new SimpleDateFormat("dd");
		 Date date = new Date();
		 
		 String startdate= dateFormat.format(date);
		 //Reporter.log(startdate,true);
		 
		 meetingstartdate.click();
		 
		//find the calendar
         WebElement dateWidget = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr"));  
         List<WebElement> columns=dateWidget.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));  

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
	 * This is the xpath of the WebElement "Meeting Start date".
	 * @author deepak.saini
	 * @since 2017-02-14
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:Nb_content']/div/div/div[3]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Meeting End Date')]/../../../../../../following-sibling::td/table/tbody/tr/td/span/input")
	private WebElement meetingenddate;
	
	public void verifyMeetingEndDate()
	{
		 DateFormat dateFormat = new SimpleDateFormat("dd");
		 Date date = new Date(); 
		 
		 String enddate= dateFormat.format(date);
		 //Reporter.log(enddate,true);
		 
		 meetingenddate.click();
		 
		//find the calendar
         WebElement dateWidget = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr"));  
         List<WebElement> columns=dateWidget.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));  

         //comparing the text of cell with today's date and clicking it.
         for (WebElement cell : columns)
         {
            if (cell.getText().equals(enddate))
            {
               cell.click();
               break;
            }
         }
	}

}
