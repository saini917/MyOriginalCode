package NRDA_LAND_DIVERSION_SECTION;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC001_TC028 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select action".
	 * @author deepak.saini
	 * @since 2018-05-15
	 */
	/****************************************************************************************************/
	
	@FindBy(xpath="//label[contains(text(),'Select Action')]/../following-sibling::td/div/div/span")
	private WebElement action;
	
	public void selectForward() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(action));
		Assert.assertTrue(action.isDisplayed());
		HighlightOnElement(action);
		Assert.assertTrue(action.isEnabled());
		action.click();
		selectValueFromDropdown("Forward");
		waitForSomeTime();
		waitForSomeTime();
	}

}
