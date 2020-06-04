package HRMS_ERP_UAT_VRS;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.ExcelDataDriver;
import GenericLibrary.WebdriverCommonDriverLibrary;

public class NewRequestPage extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "New Request".
	 * @author deepak.saini
	 * @since 2018-11-01
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//a[contains(text(),'New Requests')]")
	private WebElement newRequest;
	
	public void clickOnNewRequest(){
		wait.until(ExpectedConditions.visibilityOf(newRequest));
		Assert.assertTrue(newRequest.isDisplayed());
		HighlightOnElement(newRequest);
		Assert.assertTrue(newRequest.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(newRequest));
		newRequest.click();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "New Service Request".
	 * @author deepak.saini
	 * @since 2018-11-01
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//span[contains(text(),'New Service Request')]")
	private WebElement newServiceRequest;
	
	public void clickOnNewServiceRequest() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(newServiceRequest));
		Assert.assertTrue(newServiceRequest.isDisplayed());
		HighlightOnElement(newServiceRequest);
		Assert.assertTrue(newServiceRequest.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(newServiceRequest));
		newServiceRequest.click();
	}

}
