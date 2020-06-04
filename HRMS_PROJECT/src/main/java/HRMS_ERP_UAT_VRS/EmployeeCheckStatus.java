package HRMS_ERP_UAT_VRS;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.ExcelDataDriver;
import GenericLibrary.WebdriverCommonDriverLibrary;

public class EmployeeCheckStatus extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "status".
	 * @author deepak.saini
	 * @since 2018-11-16
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//td[contains(text(),'Done')]")
	private WebElement done;
	
	public void verifyEmployeeStatus() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(done));
		Assert.assertTrue(done.isDisplayed());
		HighlightOnElement(done);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "click on employee".
	 * @author deepak.saini
	 * @since 2018-11-16
	 */
	/****************************************************************************************************/
	public void clickOnEmployee() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(done));
		Assert.assertTrue(done.isDisplayed());
		HighlightOnElement(done);
		Assert.assertTrue(done.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(done));
		done.click();
	}
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "check status".
	 * @author deepak.saini
	 * @since 2018-11-16
	 */
	/****************************************************************************************************/
	
	@FindBy(xpath="//span[contains(text(),'Done')]")
	private WebElement status;
	
	public void checkStatus() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(status));
		Assert.assertTrue(status.isDisplayed());
		HighlightOnElement(status);
	}

}
