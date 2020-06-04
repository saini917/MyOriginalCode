package NRDA_NewConnection;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyConnectionDetailsTab_SC_07_TC_04 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);	
	
	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Make Payment"
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//button/span[contains(text(),'Make Payment')]")
	private WebElement makepayment;

	public void clickOnMakePayment() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(makepayment));
		wait.until(ExpectedConditions.elementToBeClickable(makepayment));
		Assert.assertTrue(makepayment.isDisplayed());
		HighlightOnElement(makepayment);
		Assert.assertTrue(makepayment.isEnabled());
		makepayment.click();
		Reporter.log("Click on 'Make a Payment'",true);
		waitForSomeTime();
		waitForSomeTime();
	}

	@FindBy(xpath="//div[@class='col-xs-6 col-xs-pull-3 white']/div")
	private List<WebElement> display;
	
	public void verifyDisplayList()
	{
		for(WebElement list:display)
		{
			Assert.assertTrue(list.isDisplayed());
			HighlightOnElement(list);
		}
		driver.navigate().back();
	}

}
