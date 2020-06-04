package NRDA_LAND_MUTUAL_TRANSFER;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC004_TC015 extends CommonLibrary{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,100);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "land details".
	 * @author deepak.saini
	 * @since 2018-06-04
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="(//li/descendant::a[contains(text(),'Land Details')])[1]")
	private WebElement landetails;
	
	public void clickOnLandDetails() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(landetails));
		Assert.assertTrue(landetails.isDisplayed());
		HighlightOnElement(landetails);
		Assert.assertTrue(landetails.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(landetails));
		landetails.click();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Add".
	 * @author deepak.saini
	 * @since 2018-06-04
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//a/descendant::span[contains(text(),'Add')]")
	private WebElement add;
	
	public void clickOnAdd() throws InterruptedException{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",add);
		
		wait.until(ExpectedConditions.visibilityOf(add));
		Assert.assertTrue(add.isDisplayed());
		HighlightOnElement(add);
		Assert.assertTrue(add.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(add));
		add.click();
	}
}
