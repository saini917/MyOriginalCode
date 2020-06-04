package NRDA_LAND_REQUEST_INITIATION;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC009_TC004 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "file".
	 * @author deepak.saini
	 * @since 2018-05-15
	 */
	/****************************************************************************************************/
	
	@FindBy(xpath="(//label[contains(text(),'File Number')])[1]/../following-sibling::td/table/tbody/tr/td/input")
	private WebElement file;
	
	public void verifyFileNumber() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(file));
		Assert.assertTrue(file.isDisplayed());
		HighlightOnElement(file);
		String readonly=file.getAttribute("readonly");
		Assert.assertNotNull(readonly);
	}

}
