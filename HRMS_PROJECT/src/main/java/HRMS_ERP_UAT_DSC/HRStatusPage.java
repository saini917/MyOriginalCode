package HRMS_ERP_UAT_DSC;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.ExcelDataDriver;
import GenericLibrary.WebdriverCommonDriverLibrary;

public class HRStatusPage extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Awaiting HR Manager Response".
	 * @author deepak.saini
	 * @since 2018-11-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//td[contains(text(),'Awaiting Initiator Response')]")
	private WebElement response;
	
	public void clickOnHRStatus() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(response));
		Assert.assertTrue(response.isDisplayed());
		HighlightOnElement(response);
		Assert.assertTrue(response.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(response));
		response.click();
		Thread.sleep(5000);
	}

}
