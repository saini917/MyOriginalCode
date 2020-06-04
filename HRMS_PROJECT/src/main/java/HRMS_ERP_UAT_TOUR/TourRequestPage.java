package HRMS_ERP_UAT_TOUR;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.ExcelDataDriver;
import GenericLibrary.WebdriverCommonDriverLibrary;

public class TourRequestPage extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Tour Request".
	 * @author deepak.saini
	 * @since 2018-11-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//a[contains(text(),'Tour Request')]")
	private WebElement tourRequest;
	
	public void clickOnTourRequest() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(tourRequest));
		Assert.assertTrue(tourRequest.isDisplayed());
		HighlightOnElement(tourRequest);
		Assert.assertTrue(tourRequest.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(tourRequest));
		tourRequest.click();
		Thread.sleep(15000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Tour Request Menu".
	 * @author deepak.saini
	 * @since 2018-11-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//a[contains(text(),'Tour Request')]/following-sibling::ul/li/a/span")
	private WebElement request;
	
	public void clickOnTourRequestMenu() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(request));
		Assert.assertTrue(request.isDisplayed());
		HighlightOnElement(request);
		Assert.assertTrue(request.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(request));
		request.click();
		Thread.sleep(15000);
	}

}
