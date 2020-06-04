package NRDA_NewConnection;

import java.io.IOException;
import java.util.List;
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


public class ToVerifyBuildingDetailsTab_SC_03_TC_12 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Plot Number ".
	 * @author deepak.saini
	 * @since 2018-04-24
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:dlg_propertySearch']/div/div/div/span/table/tbody/tr/td/label[contains(text(),'Plot No')]/../following-sibling::td/input[@title='Plot No']")
	private WebElement plotno;
	
	public void enterPlotNumber() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.elementToBeClickable(plotno));
		HighlightOnElement(plotno);
		Assert.assertTrue(plotno.isDisplayed());
		Assert.assertTrue(plotno.isEnabled());
		excel.getExcelData(plotno,"Building Details",1,12);
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
	}
	
	@FindBy(xpath="//div[@id='form0:propertyList']/div/table/thead/tr/th")
	private List<WebElement> field;
	
	public void verifyField() throws InterruptedException
	{
		Reporter.log("Verify that following fields are shown :-",true);
		for(WebElement fields:field)
		{
			HighlightOnElement(fields);
			Assert.assertTrue(fields.isDisplayed());
			Reporter.log(fields.getText(),true);
		}
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
