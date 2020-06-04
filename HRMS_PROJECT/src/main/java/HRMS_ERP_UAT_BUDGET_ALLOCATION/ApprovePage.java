package HRMS_ERP_UAT_BUDGET_ALLOCATION;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.ExcelDataDriver;
import GenericLibrary.WebdriverCommonDriverLibrary;

public class ApprovePage extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "approve'.
	 * @author deepak.saini
	 * @since 2018-11-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//span[contains(text(),'Approve')])[5]")
	private WebElement approve;
	
	public void clickOnApprove() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(approve));
		Assert.assertTrue(approve.isDisplayed());
		HighlightOnElement(approve);
		Assert.assertTrue(approve.isEnabled());
//		wait.until(ExpectedConditions.elementToBeClickable(approve));
//		approve.click();
		Thread.sleep(2000);
	}

}
