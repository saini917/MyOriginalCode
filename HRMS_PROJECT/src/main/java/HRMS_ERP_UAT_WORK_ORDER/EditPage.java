package HRMS_ERP_UAT_WORK_ORDER;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.ExcelDataDriver;
import GenericLibrary.WebdriverCommonDriverLibrary;

public class EditPage extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "edit".
	 * @author deepak.saini
	 * @since 2018-12-12
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//button[contains(text(),'Edit')]")
	private WebElement edit;
	
	public void clickOnEdit() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(edit));
		Assert.assertTrue(edit.isDisplayed());
		HighlightOnElement(edit);
		Assert.assertTrue(edit.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(edit));
		edit.click();
		Thread.sleep(1000);
	}


}
