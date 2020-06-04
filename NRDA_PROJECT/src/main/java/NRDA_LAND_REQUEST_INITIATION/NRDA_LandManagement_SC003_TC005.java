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
import org.testng.Reporter;
import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC003_TC005 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select yesterday date".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Target Date')]/../../../../../../following-sibling::td/table/tbody/tr/td/span/input")
	private WebElement targetdate;
	
	public void selectInvalidTargetDate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(targetdate));
		Assert.assertTrue(targetdate.isDisplayed());
		HighlightOnElement(targetdate);
		Assert.assertTrue(targetdate.isEnabled());
		
		String  yesterday = getYesterdayDateString();
		Reporter.log("Target yesterday Date:"+yesterday,true);
		targetdate.click();
		
		//find the calendar
		WebElement dateWidget = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr"));  
		List<WebElement> columns=dateWidget.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));  

		//comparing the text of cell with today's date and clicking it.
		for (WebElement cell : columns)
		{
			if (cell.getText().equals(yesterday))
			{
				cell.click();
				break;
			}
		}
	}

}
