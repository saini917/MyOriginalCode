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

public class NRDA_BOD_SC_09_TC_07  extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();

	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "verify add more attendance".
	 * @author deepak.saini
	 * @since 2018-04-09
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:parentRspDia']/div/div/div/table/tbody/tr/td/div/div/button/span[contains(text(),'Add More Attendees')]")
	private WebElement addmoreattendance;
	
	public void clickOnAddMoreAttendence() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(addmoreattendance));
		wait.until(ExpectedConditions.elementToBeClickable(addmoreattendance));
		Assert.assertTrue(addmoreattendance.isDisplayed());
		HighlightOnElement(addmoreattendance);
		Assert.assertTrue(addmoreattendance.isEnabled());
		addmoreattendance.click();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "verify add invitee display list".
	 * @author deepak.saini
	 * @since 2018-04-09
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:childRspDia']/div/div/div/div/div/table/tbody/tr/td/table/tbody/tr/td[2]/div")
	private List<WebElement> display;
	
	@FindBy(xpath="//div[@id='inboxForm:childRspDia']/div/div/div/table/tbody/tr/td/button/span")
	private WebElement button;
	
	public void verifyDisplayLink()
	{
		for(WebElement list:display)
		{
			Assert.assertTrue(list.isDisplayed());
			HighlightOnElement(list);
		}
		Assert.assertTrue(button.isDisplayed());
		HighlightOnElement(button);
	}
}
