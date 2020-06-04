package NRDA_LAND_MUTUAL_TRANSFER;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC001_TC024 extends CommonLibrary{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,100);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "search by bank name".
	 * @author deepak.saini
	 * @since 2018-05-30
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Search By')]/following-sibling::div/div/span")
	private WebElement searchifsc;
	
	public void serachByIFSCode() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(searchifsc));
		Assert.assertTrue(searchifsc.isDisplayed());
		HighlightOnElement(searchifsc);
		Assert.assertTrue(searchifsc.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(searchifsc));
		searchifsc.click();
		selectValueFromDropdown("IFSC CODE");
		waitForPageLoad();
		waitForPageLoad();
		waitForDomElement();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "search by ifsc code".
	 * @author deepak.saini
	 * @since 2018-05-30
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Select IFSC')]/following-sibling::div/div/span")
	private WebElement ifscode;
	
	public void selectIFSCode() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(ifscode));
		Assert.assertTrue(ifscode.isDisplayed());
		HighlightOnElement(ifscode);
		Assert.assertTrue(ifscode.isEnabled());
		ifscode.click();
		wait.until(ExpectedConditions.elementToBeClickable(ifscode));
		selectValueFromDropdown("BARB0ARANGX");
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "fill in form".
	 * @author deepak.saini
	 * @since 2018-05-30
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//button/descendant::span[contains(text(),'Fill in Form')])[2]")
	private WebElement fillinform;
	
	public void clickOnFillInForm() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(fillinform));
		Assert.assertTrue(fillinform.isDisplayed());
		HighlightOnElement(fillinform);
		Assert.assertTrue(fillinform.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(fillinform));
		fillinform.click();
		waitForPageLoad();
		waitForPageLoad();
		waitForDomElement();
	}

}
