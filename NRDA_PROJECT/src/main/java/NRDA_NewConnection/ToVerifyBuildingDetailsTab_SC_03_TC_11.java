package NRDA_NewConnection;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyBuildingDetailsTab_SC_03_TC_11 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "enter Property ID ".
	 * @author deepak.saini
	 * @since 2017-08-22
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:dlg_propertySearch']/div/div/div/span/table/tbody/tr/td/label[contains(text(),'Property ID')]/../following-sibling::td/input[@title='Property ID']")
	private WebElement enterid;

	public void enterPropertyID() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(enterid));
		HighlightOnElement(enterid);
		Assert.assertTrue(enterid.isDisplayed());
		Assert.assertTrue(enterid.isEnabled());
		excel.getExcelData(enterid,"Building Details",2,4);
		Reporter.log("Enter detail",true);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Search button".
	 * @author deepak.saini
	 * @since 2017-08-22
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:dlg_propertySearch']/div/div/div/span/center/button/span[contains(text(),'Search')]")
	private WebElement searchbutton;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Error Message".
	 * @author deepak.saini
	 * @since 2017-08-22
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-growl-message']/span[contains(text(),'Please enter valid data to search your property !')]")
	private WebElement errormsg;

	public void clickOnSearch() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(searchbutton));
		HighlightOnElement(searchbutton);
		Assert.assertTrue(searchbutton.isDisplayed());
		Assert.assertTrue(searchbutton.isEnabled());
		searchbutton.click();
		Reporter.log("Click on Search",true);
		waitForSomeTime();
		waitForSomeTime();
		
		HighlightOnElement(errormsg);
		String Actual="Please enter valid data to search your property !";
		String Expected=errormsg.getText();
		Assert.assertEquals(Actual, Expected,"Matched");
		Reporter.log(Expected,true);
		waitForSomeTime();
		waitForSomeTime();
	}
	
	@FindBy(xpath="//div[@id='form0:dlg_propertySearch']/div/a/span")
	private WebElement closewindow;
	
	public void closeWindow() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(closewindow));
		HighlightOnElement(closewindow);
		Assert.assertTrue(closewindow.isDisplayed());
		Assert.assertTrue(closewindow.isEnabled());
		closewindow.click();
		waitForSomeTime();
	}
}
