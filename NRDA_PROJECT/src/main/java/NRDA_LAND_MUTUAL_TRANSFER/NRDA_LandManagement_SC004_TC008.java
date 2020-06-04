package NRDA_LAND_MUTUAL_TRANSFER;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC004_TC008 extends CommonLibrary{

	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,100);
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement " Pending days".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//form[@id='inboxForm']/div/div/div/div/div/div/div/div/table/thead/tr/th/following-sibling::th/span")
	private List<WebElement> display;

	public void verifyDisplayList() throws InterruptedException{
		for(WebElement list:display)
		{
			wait.until(ExpectedConditions.visibilityOf(list));
			Assert.assertTrue(list.isDisplayed());
			HighlightOnElement(list);
		}
	}

}
