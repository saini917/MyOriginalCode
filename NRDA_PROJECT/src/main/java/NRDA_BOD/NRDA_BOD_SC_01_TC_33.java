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

public class NRDA_BOD_SC_01_TC_33 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Schedule Time".
	 * @author deepak.saini
	 * @since 2018-03-28
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/span/span/div/div/div/ul/li/a[contains(text(),'Meeting Schedule')]/../../following-sibling::div/div)[4]/center/button/span")
	private WebElement scheduletime;
	
	public void clickOnScheduleTime() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(scheduletime));
		wait.until(ExpectedConditions.elementToBeClickable(scheduletime));
		Assert.assertTrue(scheduletime.isDisplayed());
		HighlightOnElement(scheduletime);
		Assert.assertTrue(scheduletime.isEnabled());
		scheduletime.click();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "display link".
	 * @author deepak.saini
	 * @since 2018-03-28
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//div[@id='inboxForm:updatescheduletimes']/div/div/div/div/div/table/tbody/tr/td/label")
	private List<WebElement> display;
	
	@FindBy(xpath="//div[@id='inboxForm:updatescheduletimes']/div/div/div/div/div/table/tbody/tr/td/button/span")
	private WebElement button1;
	
	public void verifyDisplayList()
	{
		for(WebElement list:display)
		{
			Assert.assertTrue(list.isDisplayed());
			HighlightOnElement(list);
		}
		
		Assert.assertTrue(button1.isDisplayed());
		HighlightOnElement(button1);
	}


}
