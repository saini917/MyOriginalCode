package HRMS_ERP_UAT_TOUR;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.ExcelDataDriver;
import GenericLibrary.WebdriverCommonDriverLibrary;

public class ExpensePage extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Expense".
	 * @author deepak.saini
	 * @since 2018-11-27
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//a[contains(text(),'Expense')]")
	private WebElement expense;
	
	public void clickOnExpense() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(expense));
		Assert.assertTrue(expense.isDisplayed());
		HighlightOnElement(expense);
		Assert.assertTrue(expense.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(expense));
		expense.click();
		Thread.sleep(10000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Expense Against tour".
	 * @author deepak.saini
	 * @since 2018-11-27
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//span[contains(text(),'Expense Against Tour')]")
	private WebElement expensetour;
	
	public void verifyExpenseAgainstTour() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(expensetour));
		Assert.assertTrue(expensetour.isDisplayed());
		HighlightOnElement(expensetour);
	}
	
	public void clickOnExpenseAgainstTour() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(expensetour));
		Assert.assertTrue(expensetour.isDisplayed());
		HighlightOnElement(expensetour);
		Assert.assertTrue(expensetour.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(expensetour));
		expensetour.click();
		Thread.sleep(10000);
	}

}
