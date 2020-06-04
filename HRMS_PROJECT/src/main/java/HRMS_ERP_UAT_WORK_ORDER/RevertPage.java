package HRMS_ERP_UAT_WORK_ORDER;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.ExcelDataDriver;
import GenericLibrary.WebdriverCommonDriverLibrary;

public class RevertPage extends WebdriverCommonDriverLibrary{
	
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "revert'.
	 * @author deepak.saini
	 * @since 2018-12-12
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//button/span[contains(text(),'Revert')]")
	private WebElement revert;
	
	public void clickOnRevert() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(revert));
		Assert.assertTrue(revert.isDisplayed());
		HighlightOnElement(revert);
		Assert.assertTrue(revert.isEnabled());
	}

}
