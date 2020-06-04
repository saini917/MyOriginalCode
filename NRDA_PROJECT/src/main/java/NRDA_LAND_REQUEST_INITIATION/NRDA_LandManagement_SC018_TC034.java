package NRDA_LAND_REQUEST_INITIATION;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC018_TC034 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "NEXT HEARING DATE".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//label[contains(text(),'NextHearingDate')]/../following-sibling::td/span/input")
	private WebElement hearingdate;
	
	public void enterNextHearingDate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{	
		wait.until(ExpectedConditions.visibilityOf(hearingdate));
		Assert.assertTrue(hearingdate.isDisplayed());
		HighlightOnElement(hearingdate);
		Assert.assertTrue(hearingdate.isEnabled());
		String  today = getCalenderCurrentDate();
        //System.out.println("Today's number: " + today + "\n");
		hearingdate.click();
		
		//find the calendar
		WebElement dateWidget = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr"));  
		List<WebElement> columns=dateWidget.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));  

		//comparing the text of cell with today's date and clicking it.
		for (WebElement cell : columns)
		{
			if (cell.getText().equals(today))
			{
				cell.click();
				break;
			}
		}
		waitForSomeTime();
		waitForSomeTime();
	}
		
}
