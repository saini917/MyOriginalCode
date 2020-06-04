package NRDA_PRO;


import java.io.IOException;
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

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_PRO_SC_01_TC_14 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "verify Public start date".
	 * @author deepak.saini
	 * @since 2018-05-05
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:Nb_content']/div/ul/li/a/../../following-sibling::div/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Publication Start Date')]/../../../../../../following-sibling::td/table/tbody/tr/td/span/input")
	private WebElement pubstartdate;

	public void selectPublicationStartDate() throws InterruptedException
	{
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		
		//Get Today's number
		String today = getCalenderCurrentDate();
		pubstartdate.click();
		
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
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "submit".
	 * @author deepak.saini
	 * @since 2018-05-05
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'Submit')])[1]")
	private WebElement submit;
	
	public void clickOnSubmit() throws InterruptedException
	{
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		wait.until(ExpectedConditions.visibilityOf(submit));
		wait.until(ExpectedConditions.elementToBeClickable(submit));
		Assert.assertTrue(submit.isDisplayed());
		HighlightOnElement(submit);
		Assert.assertTrue(submit.isEnabled());
		submit.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Application number".
	 * @author deepak.saini
	 * @since 2018-02-15
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//span[@id='inboxForm:Na']/span/div/div/div/div/table/tbody/tr/td/span[contains(text(),'Application Number')]/../following-sibling::td/a")
	private WebElement applicationno;
	
	public void getApplicationNumber() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(applicationno));
		Assert.assertTrue(applicationno.isDisplayed());
		HighlightOnElement(applicationno);
		String applicationnumber=applicationno.getText();
		Reporter.log("Application Number:"+applicationnumber,true);
		
		excel.updatePRO(applicationnumber);
		waitForSomeTime();
	}
}
