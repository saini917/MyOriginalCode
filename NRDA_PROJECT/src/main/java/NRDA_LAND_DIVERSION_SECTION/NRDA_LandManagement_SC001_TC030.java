package NRDA_LAND_DIVERSION_SECTION;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC001_TC030 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "subject is disabled".
	 * @author deepak.saini
	 * @since 2018-05-28
	 */
	/****************************************************************************************************/

	@FindBy(xpath="//label[contains(text(),'Subject')]/../following-sibling::td/input")
	private WebElement subject;

	public void verifyReadableSubject()
	{
		//for non-editable field
		wait.until(ExpectedConditions.visibilityOf(subject));
		Assert.assertTrue(subject.isDisplayed());
		HighlightOnElement(subject);
		String readonly=subject.getAttribute("readonly");
		Assert.assertNotNull(readonly);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "file number is disabled".
	 * @author deepak.saini
	 * @since 2018-05-28
	 */
	/****************************************************************************************************/

	@FindBy(xpath="//label[contains(text(),'File Number')]/../following-sibling::td/table/tbody/tr/td/input")
	private WebElement filenum;

	public void verifyReadableFileNum()
	{
		//for non-editable field
		wait.until(ExpectedConditions.visibilityOf(filenum));
		Assert.assertTrue(filenum.isDisplayed());
		HighlightOnElement(filenum);
		String readonly=filenum.getAttribute("readonly");
		Assert.assertNotNull(readonly);
	}

}
