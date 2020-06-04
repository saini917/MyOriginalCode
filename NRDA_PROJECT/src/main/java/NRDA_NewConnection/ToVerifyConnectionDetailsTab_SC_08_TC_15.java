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

public class ToVerifyConnectionDetailsTab_SC_08_TC_15 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "click on create New file".
	 * @author deepak saini
	 * @since 2017-09-22
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//form[@id='inboxForm']/span/div/div/div/div/center/table/tbody/tr/td/button/span)[5]")
	private WebElement createtofile;
	
	@FindBy(xpath="//form[@id='inboxForm']/span/div/div/div/div/table/tbody/tr/td/label")
	private List<WebElement> displaylist;
	
	@FindBy(xpath="//form[@id='inboxForm']/span/div/div/div/div/center/table/tbody/tr/td/button/span")
	private List<WebElement> displaylist1;
	
	@FindBy(xpath="(//form[@id='inboxForm']/span/div/div/a/span)[5]")
	private WebElement closepopup;
	
	@FindBy(xpath="(//form[@id='inboxForm']/span/div/div/a/span)[4]")
	private WebElement closepopup1;
	
	
	public void clickOnCreateNewFill() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(createtofile));
		wait.until(ExpectedConditions.elementToBeClickable(createtofile));
		HighlightOnElement(createtofile);
		Assert.assertTrue(createtofile.isEnabled());
		createtofile.click();
		waitForSomeTime();
	}
	
	public void verifyDisplayField() throws InterruptedException
	{
		for(WebElement list:displaylist)
		{
			HighlightOnElement(list);
			Assert.assertNotNull(list.isDisplayed());
			waitForSomeTime();
		}
		for(WebElement list1:displaylist1)
		{
			HighlightOnElement(list1);
			Assert.assertNotNull(list1.isDisplayed());
			waitForSomeTime();
		}
		Reporter.log("1. User should be able to view following fields:- \n Subject \n File No \n Type \n Category \n Department \n Is conditional \n 2. Buttons 'Submit' & 'clear' should be visible",true);
	}
	public void closePopup() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(closepopup));
		wait.until(ExpectedConditions.elementToBeClickable(closepopup));
		Assert.assertTrue(closepopup.isDisplayed());
		HighlightOnElement(closepopup);
		Assert.assertTrue(closepopup.isEnabled());
		closepopup.click();
		waitForSomeTime();
		
		wait.until(ExpectedConditions.visibilityOf(closepopup1));
		wait.until(ExpectedConditions.elementToBeClickable(closepopup1));
		Assert.assertTrue(closepopup1.isDisplayed());
		HighlightOnElement(closepopup1);
		Assert.assertTrue(closepopup1.isEnabled());
		closepopup1.click();
		waitForSomeTime();
	}

}
