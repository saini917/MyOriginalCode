package HRMS_ERP_UAT_BUDGET_ALLOCATION;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.ExcelDataDriver;
import GenericLibrary.WebdriverCommonDriverLibrary;

public class BudgetAllocationTabPage extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Budget Allocation ".
	 * @author deepak.saini
	 * @since 2018-12-04
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//a[contains(text(),'Budget Allocation')]")
	private WebElement budgetAllocation;
	
	public void clickOnBudgetAllocationTab() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(budgetAllocation));
		Assert.assertTrue(budgetAllocation.isDisplayed());
		HighlightOnElement(budgetAllocation);
		Assert.assertTrue(budgetAllocation.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(budgetAllocation));
		budgetAllocation.click();
		Thread.sleep(5000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Consolidated Budget Request".
	 * @author deepak.saini
	 * @since 2018-12-04
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//span[contains(text(),'Consolidated Budget Request')]")
	private WebElement consolidate;
	
	public void clickOnConsolidateBudgetRequest() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(consolidate));
		Assert.assertTrue(consolidate.isDisplayed());
		HighlightOnElement(consolidate);
		Assert.assertTrue(consolidate.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(consolidate));
		consolidate.click();
		Thread.sleep(5000);
	}

}
