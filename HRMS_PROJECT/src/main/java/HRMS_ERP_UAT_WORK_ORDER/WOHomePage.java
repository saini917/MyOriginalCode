package HRMS_ERP_UAT_WORK_ORDER;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.ExcelDataDriver;
import GenericLibrary.WebdriverCommonDriverLibrary;

public class WOHomePage extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Work Order".
	 * @author deepak.saini
	 * @since 2018-12-12
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//span[contains(text(),'WorkOrder')])[2]")
	private WebElement workOrder;
	
	public void clickOnWorkOrder() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(workOrder));
		Assert.assertTrue(workOrder.isDisplayed());
		HighlightOnElement(workOrder);
		Assert.assertTrue(workOrder.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(workOrder));
		workOrder.click();
		Thread.sleep(5000);
	}

}
