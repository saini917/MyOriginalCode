package HRMS_ERP_UAT_VRS;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.ExcelDataDriver;
import GenericLibrary.WebdriverCommonDriverLibrary;

public class ResignationPage extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "retirement".
	 * @author deepak.saini
	 * @since 2018-11-13
	 */
	/****************************************************************************************************/
	
	@FindBy(xpath="//a[contains(text(),'Retirement')]/span")
	private WebElement retirement;
	
	public void clickOnRetirement() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(retirement));
		Assert.assertTrue(retirement.isDisplayed());
		HighlightOnElement(retirement);
		Assert.assertTrue(retirement.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(retirement));
		retirement.click();
		Thread.sleep(15000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "retirements".
	 * @author deepak.saini
	 * @since 2018-11-13
	 */
	/****************************************************************************************************/
	
	@FindBy(xpath="//span[contains(text(),'Retirements')]")
	private WebElement retirements;
	
	public void clickOnRetirements() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(retirements));
		Assert.assertTrue(retirements.isDisplayed());
		HighlightOnElement(retirements);
		Assert.assertTrue(retirements.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(retirements));
		retirements.click();
		Thread.sleep(50000);
	}

}
