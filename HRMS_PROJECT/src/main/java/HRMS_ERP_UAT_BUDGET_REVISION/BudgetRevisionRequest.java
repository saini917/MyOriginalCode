package HRMS_ERP_UAT_BUDGET_REVISION;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.ExcelDataDriver;
import GenericLibrary.WebdriverCommonDriverLibrary;

public class BudgetRevisionRequest extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Budget Revision Request".
	 * @author deepak.saini
	 * @since 2018-12-05
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//span[contains(text(),'Budget Revision Request')]")
	private WebElement revisionRequest;
	
	public void clickOnBudgetRevisionRequest() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(revisionRequest));
		Assert.assertTrue(revisionRequest.isDisplayed());
		HighlightOnElement(revisionRequest);
		Assert.assertTrue(revisionRequest.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(revisionRequest));
		revisionRequest.click();
		Thread.sleep(5000);
	}

}
