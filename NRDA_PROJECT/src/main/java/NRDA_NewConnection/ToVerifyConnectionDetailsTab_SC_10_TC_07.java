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

public class ToVerifyConnectionDetailsTab_SC_10_TC_07 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "water and sewerage connection".
	 * @author deepak saini
	 * @since 2018-05-04
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//td[@class='leftCol']/table/tbody/tr/td/form/div/div/h3/a[contains(text(),'Public Health and Engineering')]/preceding-sibling::span/../following-sibling::div/ul/li/a/span[contains(text(),'WATER AND SEWERAGE CONNECTION')]")
	private WebElement waterandseweerage;
	
	public void clickOnWaterAndSewerage() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(waterandseweerage));
		wait.until(ExpectedConditions.elementToBeClickable(waterandseweerage));
		Assert.assertTrue(waterandseweerage.isEnabled());
		HighlightOnElement(waterandseweerage);
		waterandseweerage.click();
		Reporter.log(waterandseweerage.getText(),true);
		waitForSomeTime();
	}

}
