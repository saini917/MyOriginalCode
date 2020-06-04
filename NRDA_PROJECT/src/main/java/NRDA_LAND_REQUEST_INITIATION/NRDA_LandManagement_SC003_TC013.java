package NRDA_LAND_REQUEST_INITIATION;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC003_TC013 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "save khasra geometery".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='container wrap']/nav/div/div/ul/li/div/div[@class='btn-group pull-right']/button[@id='saveKhasraGeometry']/span")
	private WebElement khasrageometery;

	public void clickOnSaveKhasraGeometry() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(khasrageometery));
		Assert.assertTrue(khasrageometery.isDisplayed());
		HighlightOnElement(khasrageometery);
		Assert.assertTrue(khasrageometery.isEnabled());
		khasrageometery.click();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "cancel".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//button[contains(text(),'cancel')]")
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
