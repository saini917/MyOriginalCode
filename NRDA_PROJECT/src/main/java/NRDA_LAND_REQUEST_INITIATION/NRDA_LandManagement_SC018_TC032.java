package NRDA_LAND_REQUEST_INITIATION;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC018_TC032 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select High Court".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/*****************************************************************************************************/

	
	@FindBy(xpath="//label[contains(text(),'Court Name')]/../following-sibling::td/div/div/span")
	private WebElement selectcourtname;
	
	public void selectCourtName() throws InterruptedException
	{	
		wait.until(ExpectedConditions.visibilityOf(selectcourtname));
		Assert.assertTrue(selectcourtname.isDisplayed());
		HighlightOnElement(selectcourtname);
		Assert.assertTrue(selectcourtname.isEnabled());
		selectcourtname.click();
		waitForSomeTime();
		selectValueFromDropdown("High Court");
		waitForSomeTime();
	}

}
