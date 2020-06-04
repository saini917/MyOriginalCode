package NRDA_BOD;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;

public class NRDA_BOD_SC_05_TC_05 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Meeting".
	 * @author deepak.saini
	 * @since 2018-04-05
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//a[contains(text(),'Meeting')]/preceding-sibling::span")
	private WebElement meeting;

	public void clickOnMeeting() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(meeting));
		wait.until(ExpectedConditions.elementToBeClickable(meeting));
		Assert.assertTrue(meeting.isDisplayed());
		HighlightOnElement(meeting);
		Assert.assertTrue(meeting.isEnabled());
		meeting.click();
		waitForSomeTime();
	}

	@FindBy(xpath="(//div[@class='ui-datatable-tablewrapper'])[1]/table/thead/tr/th/following-sibling::th/span")
	private List<WebElement> display;

	public void verifyDisplayLink()
	{
		for(WebElement list:display)
		{
			if(!list.isDisplayed())
			{
				Reporter.log("Test case fail",true);
			}
			else
			{
				Assert.assertTrue(list.isDisplayed());
				HighlightOnElement(list);
			}
		}
		((JavascriptExecutor)driver).executeScript("window.scrollBy(3000,0)");
	}

}
