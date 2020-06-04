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

public class ToVerifyConnectionDetailsTab_SC_14_TC_01 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "My Payment History".
	 * @author deepak saini
	 * @since 2018-01-10
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//td[@class='leftCol']/span/div/div/div/ul/li/a[contains(text(),'My Payment History/मेरा भुगतान इतिहास')]")
	private WebElement mypaymenthistory;
	
	public void clickOnMyPaymentHistory() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(mypaymenthistory));
		wait.until(ExpectedConditions.elementToBeClickable(mypaymenthistory));
		Assert.assertTrue(mypaymenthistory.isDisplayed());
		HighlightOnElement(mypaymenthistory);
		Assert.assertTrue(mypaymenthistory.isEnabled());
		mypaymenthistory.click();
		Reporter.log("Click on 'My Payment History ' menu shown in Citizen Dashboard",true);
		waitForSomeTime();
	}
	
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/div/div/table/tbody/tr/td/div/div/table/thead/tr/th/span")
	private List<WebElement> displaylist;
	
	public void displayList() throws InterruptedException
	{
		for(WebElement list:displaylist)
		{
			HighlightOnElement(list);
			Assert.assertTrue(list.isDisplayed());
			Reporter.log(list.getText(),true);
			waitForSomeTime();
		}
	}
	
}
