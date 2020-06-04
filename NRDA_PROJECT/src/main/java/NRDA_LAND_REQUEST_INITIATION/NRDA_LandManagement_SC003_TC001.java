package NRDA_LAND_REQUEST_INITIATION;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC003_TC001 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "requested by NRDA".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Requested By')]/../../../../../../following-sibling::td/table/tbody/tr/td/select")
	private WebElement requestedby;
	
	public void selectRequestByNRDA() throws InterruptedException
	{
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		wait.until(ExpectedConditions.visibilityOf(requestedby));
		Assert.assertTrue(requestedby.isDisplayed());
		HighlightOnElement(requestedby);
		Assert.assertTrue(requestedby.isEnabled());
		SelectVisibleText(requestedby,"NRDA");
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	}

}
