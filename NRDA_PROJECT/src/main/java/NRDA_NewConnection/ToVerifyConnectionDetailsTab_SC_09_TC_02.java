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

public class ToVerifyConnectionDetailsTab_SC_09_TC_02 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "DisplayLink"
	 * @author deepak saini
	 * @Date: 2018-05-04
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//ul[@class='ui-menu-list ui-helper-reset'])[1]/li/a[contains(text(),'Home')]")
	private WebElement home;
	
	public void clickOnHome() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(home));
		wait.until(ExpectedConditions.elementToBeClickable(home));
		Assert.assertTrue(home.isDisplayed());
		HighlightOnElement(home);
		Assert.assertTrue(home.isEnabled());
		home.click();
		Reporter.log("Click on Home link",true);
		waitForSomeTime();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "verify dashboard".
	 * @author deepak.saini
	 * @since 2018-05-04
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='leftCol']/table/tbody/tr/td/form/div/div/h3/a")
	private List<WebElement> label;
	
	public void verifyDisplayLink()
	{
		Reporter.log("System will display the Following Links -->",true);
		for(WebElement link:label)
		{
			Assert.assertTrue(link.isDisplayed());
			HighlightOnElement(link);
			Reporter.log(link.getText(),true);
			
		}
	}
	
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/div/div/div/div/div/div/div[@class='box-head']/div")
	private List<WebElement> label1;
	
	public void verifyStatisticsDisplayLink()
	{
		Reporter.log("Statistics count panel should be shown for -->",true);
		for(WebElement link:label1)
		{
			Assert.assertTrue(link.isDisplayed());
			HighlightOnElement(link);
			Reporter.log(link.getText(),true);
			
		}
	}
}