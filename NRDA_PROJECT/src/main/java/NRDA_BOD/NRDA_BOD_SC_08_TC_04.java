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

public class NRDA_BOD_SC_08_TC_04 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "New Meeting Request".
	 * @author deepak.saini
	 * @since 2018-04-05
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//td[@class='leftCol']/table/tbody/tr/td/form/div/div/h3/a[contains(text(),'Administrative Section')]/../following-sibling::div/ul/li/a/span[contains(text(),'NEW MEETING REQUEST')]")
	private WebElement newmeetingreq;
	
	public void clickOnNewMeetingRequest() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(newmeetingreq));
		wait.until(ExpectedConditions.elementToBeClickable(newmeetingreq));
		Assert.assertTrue(newmeetingreq.isDisplayed());
		HighlightOnElement(newmeetingreq);
		Assert.assertTrue(newmeetingreq.isEnabled());
		newmeetingreq.click();
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
