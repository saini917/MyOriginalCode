package NRDA_LAND_REQUEST_INITIATION;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC009_TC003 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "subject".
	 * @author deepak.saini
	 * @since 2018-05-15
	 */
	/****************************************************************************************************/
	
	@FindBy(xpath="(//label[contains(text(),'Subject')])[1]/../following-sibling::td/input")
	private WebElement subject;
	
	public void verifySubject() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(subject));
		Assert.assertTrue(subject.isDisplayed());
		HighlightOnElement(subject);
		String readonly=subject.getAttribute("readonly");
		Assert.assertNotNull(readonly);
	}

}
