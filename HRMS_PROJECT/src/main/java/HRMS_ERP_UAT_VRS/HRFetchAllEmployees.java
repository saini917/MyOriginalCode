package HRMS_ERP_UAT_VRS;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.ExcelDataDriver;
import GenericLibrary.WebdriverCommonDriverLibrary;

public class HRFetchAllEmployees extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "fetch all employees".
	 * @author deepak.saini
	 * @since 2018-11-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//span[contains(text(),'Fetch All Sections')]")
	private WebElement fetchEmployee;
	
	public void clickOnFetchAllEmployee() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(fetchEmployee));
		Assert.assertTrue(fetchEmployee.isDisplayed());
		HighlightOnElement(fetchEmployee);
		Assert.assertTrue(fetchEmployee.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(fetchEmployee));
		fetchEmployee.click();
	}

}
