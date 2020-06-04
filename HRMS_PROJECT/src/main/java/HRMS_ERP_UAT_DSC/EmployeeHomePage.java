package HRMS_ERP_UAT_DSC;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.ExcelDataDriver;
import GenericLibrary.WebdriverCommonDriverLibrary;

public class EmployeeHomePage extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "self service".
	 * @author deepak.saini
	 * @since 2018-11-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//span[contains(text(),'Self Service')])[2]")
	private WebElement selfservice;
	
	public void clickOnSelfService() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(selfservice));
		Assert.assertTrue(selfservice.isDisplayed());
		HighlightOnElement(selfservice);
		Assert.assertTrue(selfservice.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(selfservice));
		selfservice.click();
		Thread.sleep(10000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "common service".
	 * @author deepak.saini
	 * @since 2018-11-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//a[contains(text(),'Common Services')]")
	private WebElement commonservice;
	
	public void clickOnCommonService() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(commonservice));
		Assert.assertTrue(commonservice.isDisplayed());
		HighlightOnElement(commonservice);
		Assert.assertTrue(commonservice.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(commonservice));
		commonservice.click();
		Thread.sleep(10000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "common service".
	 * @author deepak.saini
	 * @since 2018-11-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//span[contains(text(),'Show Cause Notice')]")
	private WebElement notice;
	
	public void clickOnShowCauseNotice() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(notice));
		Assert.assertTrue(notice.isDisplayed());
		HighlightOnElement(notice);
		Assert.assertTrue(notice.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(notice));
		notice.click();
		Thread.sleep(10000);
	}

}
