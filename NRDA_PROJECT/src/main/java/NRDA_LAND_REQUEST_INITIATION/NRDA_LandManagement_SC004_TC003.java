package NRDA_LAND_REQUEST_INITIATION;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC004_TC003 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "requested type individual".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Request Type')]/../../../../../../following-sibling::td/table/tbody/tr/td/select")
	private WebElement requestedtype;
	
	public void selectRequestTypeIndividual() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(requestedtype));
		Assert.assertTrue(requestedtype.isDisplayed());
		HighlightOnElement(requestedtype);
		Assert.assertTrue(requestedtype.isEnabled());
		SelectVisibleText(requestedtype,"INDIVIDUAL");
		waitForSomeTime();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "display".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label")
	private List<WebElement> display;
	
	public void verifyDisplay() throws InterruptedException
	{
		for(WebElement list:display)
		{
			Assert.assertTrue(list.isDisplayed());
			HighlightOnElement(list);
		}
	}


}
