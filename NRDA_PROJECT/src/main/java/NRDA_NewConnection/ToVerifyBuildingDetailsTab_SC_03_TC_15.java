package NRDA_NewConnection;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;


public class ToVerifyBuildingDetailsTab_SC_03_TC_15 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);


	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select data ".
	 * @author deepak.saini
	 * @since 2018-04-24
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:dlg_propertySearch']/div/div/div/span/div/div/table/tbody/tr/td/div")
	private WebElement data;
	
	public void selectPropertyIdData()
	{
		wait.until(ExpectedConditions.elementToBeClickable(data));
		HighlightOnElement(data);
		Actions act=new Actions(driver);
		act.click(data).build().perform();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "fill in form".
	 * @author deepak.saini
	 * @since 2018-04-24
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'Fill in Form')])[1]")
	private WebElement fillinform;
	
	public void clickOnFillInForm() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(fillinform));
		wait.until(ExpectedConditions.elementToBeClickable(fillinform));
		Assert.assertTrue(fillinform.isDisplayed());
		HighlightOnElement(fillinform);
		Assert.assertTrue(fillinform.isEnabled());
		fillinform.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	}
}
