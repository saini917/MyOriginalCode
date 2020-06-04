package NRDA_LAND_DIVERSION_SECTION;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC001_TC018 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,500);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "yes".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'Yes')])[2]")
	private WebElement yes;
	
	public void clickOnYes() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(yes));
		Assert.assertTrue(yes.isDisplayed());
		HighlightOnElement(yes);
		Assert.assertTrue(yes.isEnabled());
		String currenturl=driver.getCurrentUrl();
		yes.click();
		waitForSomeTime();
		waitForSomeTime();
		String previousurl=driver.getCurrentUrl();
		Assert.assertNotEquals(currenturl,previousurl,"Test case pass");
	}

}
