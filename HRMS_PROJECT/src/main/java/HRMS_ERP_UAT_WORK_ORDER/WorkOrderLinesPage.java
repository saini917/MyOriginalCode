package HRMS_ERP_UAT_WORK_ORDER;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.ExcelDataDriver;
import GenericLibrary.WebdriverCommonDriverLibrary;

public class WorkOrderLinesPage extends WebdriverCommonDriverLibrary{
	
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Work Order Lines'.
	 * @author deepak.saini
	 * @since 2018-12-12
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//a[contains(text(),'Workorder Lines')]")
	private WebElement work;
	
	public void clickOnWorkOrderLines() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(work));
		Assert.assertTrue(work.isDisplayed());
		HighlightOnElement(work);
		Assert.assertTrue(work.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(work));
		work.click();
		Thread.sleep(1000);
	}

}
