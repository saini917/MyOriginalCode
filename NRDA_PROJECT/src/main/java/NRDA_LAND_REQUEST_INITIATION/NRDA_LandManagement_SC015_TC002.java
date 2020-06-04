package NRDA_LAND_REQUEST_INITIATION;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC015_TC002 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select Manager land".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/****************************************************************************************************/
	
	@FindBy(xpath="//label[contains(text(),'Select Action')]/../following-sibling::td/span/table/tbody/tr/td/div/div/span")
	private WebElement actionname;
	
	public void selectLandManager() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(actionname));
		Assert.assertTrue(actionname.isDisplayed());
		HighlightOnElement(actionname);
		Assert.assertTrue(actionname.isEnabled());
		actionname.click();
		selectValueFromDropdown("Navin Kumar (MGR)");
		waitForSomeTime();
		waitForSomeTime();
	}


}
