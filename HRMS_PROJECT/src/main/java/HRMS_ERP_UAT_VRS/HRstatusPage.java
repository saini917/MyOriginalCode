package HRMS_ERP_UAT_VRS;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.ExcelDataDriver;
import GenericLibrary.WebdriverCommonDriverLibrary;

public class HRstatusPage extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "status".
	 * @author deepak.saini
	 * @since 2018-11-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//td[contains(text(),'Waiting HR Approval')]")
	private WebElement waitingHRApproval;
	
	public void clickOnHRStatus() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(waitingHRApproval));
		Assert.assertTrue(waitingHRApproval.isDisplayed());
		HighlightOnElement(waitingHRApproval);
		Assert.assertTrue(waitingHRApproval.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(waitingHRApproval));
		waitingHRApproval.click();
		Thread.sleep(50000);
	}

}
