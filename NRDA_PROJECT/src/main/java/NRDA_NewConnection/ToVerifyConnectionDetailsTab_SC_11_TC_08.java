package NRDA_NewConnection;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyConnectionDetailsTab_SC_11_TC_08 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "connection meter details".
	 * @author deepak saini
	 * @since 2017-09-22
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//div[@id='inboxForm:docAccordionPanel']/ul/li/a[contains(text(),'Connection Meter Details')]")
	private WebElement connectionmeterdetails;
	
	public void clickOnConnectionMeterDetails() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(connectionmeterdetails));
		wait.until(ExpectedConditions.elementToBeClickable(connectionmeterdetails));
		Assert.assertTrue(connectionmeterdetails.isDisplayed());
		HighlightOnElement(connectionmeterdetails);
		Assert.assertTrue(connectionmeterdetails.isEnabled());
		connectionmeterdetails.click();
		waitForSomeTime();
	}
	
	@FindBy(xpath="//div[@id='inboxForm:docAccordionPanel']/ul/li/a[contains(text(),'Connection Meter Details')]/../../following-sibling::div/div/div/div/center/table/tbody/tr/td/label")
	private List<WebElement> displaylist;
	
	public void displayList() throws InterruptedException
	{
		for(WebElement list:displaylist)
		{
			HighlightOnElement(list);
			Assert.assertTrue(list.isDisplayed());
			waitForSomeTime();
			Reporter.log(list.getText(),true);
		}
	}
}