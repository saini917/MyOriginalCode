package NRDA_LAND_REQUEST_INITIATION;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC004_TC005 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "requested type".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Request Type')]/../../../../../../following-sibling::td/table/tbody/tr/td/select")
	private WebElement requestedtype;
	
	public void selectRequestType() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(requestedtype));
		Assert.assertTrue(requestedtype.isDisplayed());
		HighlightOnElement(requestedtype);
		Assert.assertTrue(requestedtype.isEnabled());
		getValueFromDropDown(requestedtype);
	}
}
