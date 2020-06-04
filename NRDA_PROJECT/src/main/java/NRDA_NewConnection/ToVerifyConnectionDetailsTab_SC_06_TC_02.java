package NRDA_NewConnection;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyConnectionDetailsTab_SC_06_TC_02 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "proceed"
	 * @author deepak saini
	 * @Date: 03-01-2018
	 */
	/****************************************************************************************************/	
	@FindBy(xpath="(//form[@id='form0']/div/table/tbody/tr/td[@class='rightColWithLeftPad']/span/div/h3/a[contains(text(),'Drafted Applications')]/preceding-sibling::span/../following-sibling::div/div/h3/a[contains(text(),'WATER AND SEWERAGE CONNECTION')]/../following-sibling::div/div/div/div/table/tbody/tr/td/button/span[contains(text(),'Proceed')])[1]")
	private WebElement proceed;
	
	public void clickOnProceedBtn() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(proceed));
		wait.until(ExpectedConditions.elementToBeClickable(proceed));
		Assert.assertTrue(proceed.isEnabled());
		proceed.click();
		Reporter.log("Click on proceed button",true);
		Reporter.log("User should be able to view it's drafted application & continue it's work",true);
		waitForSomeTime();
	}

}
