package HRMS_ERP_UAT_VRS;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.ExcelDataDriver;
import GenericLibrary.WebdriverCommonDriverLibrary;

public class HomePage extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Discuss".
	 * @author deepak.saini
	 * @since 2018-11-01
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='navbar-header-custom']/a/i")
	private WebElement discussImage;
	
	public void clickOnDiscussImage() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(discussImage));
		Assert.assertTrue(discussImage.isDisplayed());
		HighlightOnElement(discussImage);
		Assert.assertTrue(discussImage.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(discussImage));
		discussImage.click();
		Thread.sleep(15000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "self service".
	 * @author deepak.saini
	 * @since 2018-11-01
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//span[contains(text(),' Self Service')])[2]")
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


}
