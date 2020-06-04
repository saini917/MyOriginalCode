package NRDA_BOD;

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

public class NRDA_BOD_SC_01_TC_22 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "meeting schedule".
	 * @author deepak.saini
	 * @since 2017-02-14
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:Nb_content']/div/ul/li/a[contains(text(),'Meeting Schedule')]")
	private WebElement meetingschedule;
	
	public void clickOnMeetingSchedule()
	{
		wait.until(ExpectedConditions.visibilityOf(meetingschedule));
		Assert.assertTrue(meetingschedule.isDisplayed());
		HighlightOnElement(meetingschedule);
		Assert.assertTrue(meetingschedule.isEnabled());
		meetingschedule.click();
		Reporter.log("Click on Meeting Schedule Tab",true);
	}
	
	/****************************************************************************************************/
	
	 /* This is the xpath of the WebElement "verify link".
	 * @author deepak.saini
	 * @since 2018-02-14
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//div[@id='form0:Nb_content']/div/div/div[3]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label")
	private List<WebElement> verifylink;
	
	public void verifyDisplayLink() throws InterruptedException
	{
		Reporter.log("System will display the Following:",true);
		for(WebElement link:verifylink)
		{
			HighlightOnElement(link);
			Assert.assertTrue(link.isDisplayed());
			String list=link.getText();
			Reporter.log(list,true);
			waitForSomeTime();
		}
	}

}
