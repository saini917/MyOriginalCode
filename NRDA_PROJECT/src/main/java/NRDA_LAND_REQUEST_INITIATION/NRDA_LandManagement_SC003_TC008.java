package NRDA_LAND_REQUEST_INITIATION;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC003_TC008 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "khasra number icon".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//div/iframe[@id='gisFrameTarget'])[2]")
	private WebElement frame;
	
	@FindBy(xpath="//div[@class='container wrap']/nav/div/div/ul/li/div/div[@class='btn-group pull-right']/button[@id='chooseKhasraNo']/span")
	private WebElement khasrano;

	public void clickOnKhasraNumIcon() throws InterruptedException
	{
		driver.switchTo().frame(frame);
		waitForSomeTime();
		wait.until(ExpectedConditions.visibilityOf(khasrano));
		Assert.assertTrue(khasrano.isDisplayed());
		HighlightOnElement(khasrano);
		Assert.assertTrue(khasrano.isEnabled());
		khasrano.click();
		waitForSomeTime();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "cancel".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//button[contains(text(),'Cancel')])[2]")
	private WebElement cancel;

	public void clickOnCancel() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(cancel));
		Assert.assertTrue(cancel.isDisplayed());
		HighlightOnElement(cancel);
		Assert.assertTrue(cancel.isEnabled());
		cancel.click();
		waitForSomeTime();
		driver.switchTo().defaultContent();
	}

}
