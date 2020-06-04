package HRMS_ERP_UAT_VRS;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import GenericLibrary.ExcelDataDriver;
import GenericLibrary.WebdriverCommonDriverLibrary;

public class HRManagerHomePage extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "self service".
	 * @author deepak.saini
	 * @since 2018-11-01
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//img[@src='/web/image/ir.ui.menu/393/web_icon_data'])[2]")
	private WebElement resignation;
	
	public void clickOnResignation() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(resignation));
		Assert.assertTrue(resignation.isDisplayed());
		HighlightOnElement(resignation);
		Assert.assertTrue(resignation.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(resignation));
		resignation.click();
		Thread.sleep(15000);
	}

}
