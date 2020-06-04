package NRDA_PRO;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_PRO_SC_07_TC_06 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Publication date".
	 * @author deepak.saini
	 * @since 2018-05-11
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Publication Date')]/../following-sibling::td/span/input")
	private WebElement pubdate;

	public void selectPublicationDate() throws InterruptedException
	{	
		//Get Today's number
		String  today = getCalenderCurrentDate();
		pubdate.click();

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
	}

}
