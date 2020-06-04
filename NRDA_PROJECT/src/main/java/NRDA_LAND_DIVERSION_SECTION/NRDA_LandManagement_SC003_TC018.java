package NRDA_LAND_DIVERSION_SECTION;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC003_TC018 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select planning section".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/****************************************************************************************************/
	
	@FindBy(xpath="//label[contains(text(),'Select Action')]/../following-sibling::td/span/table/tbody/tr/td[2]/div/div/span")
	private WebElement user;
	
	public void selectPlanningSectionManager() throws InterruptedException
	{
		waitForSomeTime();
		waitForSomeTime();
		wait.until(ExpectedConditions.visibilityOf(user));
		Assert.assertTrue(user.isDisplayed());
		HighlightOnElement(user);
		Assert.assertTrue(user.isEnabled());
		user.click();
		selectValueFromDropdown("Rohit Kandelwal (MGR)");
		waitForSomeTime();
		waitForSomeTime();
	}

}
