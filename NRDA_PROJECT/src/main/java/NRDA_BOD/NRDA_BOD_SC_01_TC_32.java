package NRDA_BOD;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_BOD_SC_01_TC_32 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "meeting schedule".
	 * @author deepak.saini
	 * @since 2018-03-28
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/span/span/div/div/div/ul/li/a[contains(text(),'Meeting Schedule')]")
	private WebElement meetingschedule;
	
	public void clickOMeetingSchedule() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(meetingschedule));
		wait.until(ExpectedConditions.elementToBeClickable(meetingschedule));
		Assert.assertTrue(meetingschedule.isDisplayed());
		HighlightOnElement(meetingschedule);
		Assert.assertTrue(meetingschedule.isEnabled());
		meetingschedule.click();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "display list".
	 * @author deepak.saini
	 * @since 2018-03-28
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/span/span/div/div/div/ul/li/a[contains(text(),'Meeting Schedule')]/../../following-sibling::div/div/div/div/table/tbody/tr/td)[3]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span")
	private List<WebElement> displaylist;
	
	@FindBy(xpath="(//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/span/span/div/div/div/ul/li/a[contains(text(),'Meeting Schedule')]/../../following-sibling::div/div)[4]/center/button/span")
	private WebElement button;
	
	public void verifyDisplayList()
	{
		for(WebElement list:displaylist)
		{
			Assert.assertTrue(list.isDisplayed());
			HighlightOnElement(list);
		}
		Assert.assertTrue(button.isDisplayed());
		HighlightOnElement(button);
	}	
}
