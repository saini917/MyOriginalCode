package NRDA_LAND_DIVERSION_SECTION;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC005_TC026 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select Land section".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/****************************************************************************************************/
	
	@FindBy(xpath="//label[contains(text(),'Select Action')]/../following-sibling::td/span/table/tbody/tr/td[1]/div/div/span")
	private WebElement accountfinance;
	
	public void selectLandSection() throws InterruptedException
	{
		waitForSomeTime();
		waitForSomeTime();
		wait.until(ExpectedConditions.visibilityOf(accountfinance));
		Assert.assertTrue(accountfinance.isDisplayed());
		HighlightOnElement(accountfinance);
		Assert.assertTrue(accountfinance.isEnabled());
		accountfinance.click();
		selectValueFromDropdown("Land Section");
		waitForSomeTime();
		waitForSomeTime();
	}

}
