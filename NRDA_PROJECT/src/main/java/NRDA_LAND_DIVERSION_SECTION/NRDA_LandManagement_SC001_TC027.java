package NRDA_LAND_DIVERSION_SECTION;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC001_TC027 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,500);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "land details".
	 * @author deepak.saini
	 * @since 2018-05-28
	 */
	/****************************************************************************************************/
	
	@FindBy(xpath="//a[contains(text(),'Land Details')]")
	private WebElement landdetails;
	
	public void clickOnLandDetails() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(landdetails));
		Assert.assertTrue(landdetails.isDisplayed());
		HighlightOnElement(landdetails);
		Assert.assertTrue(landdetails.isEnabled());
		landdetails.click();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "display list".
	 * @author deepak.saini
	 * @since 2018-05-28
	 */
	/****************************************************************************************************/

	@FindBy(xpath="//div[@id='inboxForm:docAccordionPanel']/descendant::div[@class='ui-tabs-panels']/div[3]/div/div/table/tbody/tr/td/span")
	private List<WebElement> display;
	
	public void verifyDisplay()
	{
		for(WebElement list:display)
		{
			Assert.assertTrue(list.isDisplayed());
			HighlightOnElement(list);
		}
	}

}
