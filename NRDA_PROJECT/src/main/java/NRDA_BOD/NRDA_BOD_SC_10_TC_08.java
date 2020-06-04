package NRDA_BOD;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_BOD_SC_10_TC_08 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "verify proceeding details".
	 * @author deepak.saini
	 * @since 2018-04-10
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//li/a[contains(text(),'Proceeding Details')]")
	private WebElement proceedingdetails;
	
	public void clickOnProceedingDetails() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(proceedingdetails));
		wait.until(ExpectedConditions.elementToBeClickable(proceedingdetails));
		Assert.assertTrue(proceedingdetails.isDisplayed());
		HighlightOnElement(proceedingdetails);
		Assert.assertTrue(proceedingdetails.isEnabled());
		proceedingdetails.click();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "verify proceeding details display list".
	 * @author deepak.saini
	 * @since 2018-04-10
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//li/a[contains(text(),'Proceeding Details')]/../../following-sibling::div/div/div/div/center/div/div/table/tbody)[2]/tr/td")
	private List<WebElement> display;
	
	public void verifyDisplayLink()
	{
		for(WebElement list:display)
		{
			Assert.assertTrue(list.isDisplayed());
			HighlightOnElement(list);
		}
	}

}
