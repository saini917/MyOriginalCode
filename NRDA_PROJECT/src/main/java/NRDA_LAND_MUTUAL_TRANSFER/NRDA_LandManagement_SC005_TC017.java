package NRDA_LAND_MUTUAL_TRANSFER;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC005_TC017 extends CommonLibrary{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,100);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select case No".
	 * @author deepak.saini
	 * @since 2018-06-05
	 */
	/*****************************************************************************************************/

	
	@FindBy(xpath="//label[contains(text(),'Case Registered')]/../following-sibling::td/div/div/span")
	private WebElement selectcaseno;
	
	public void selectCaseNo() throws InterruptedException{	
		wait.until(ExpectedConditions.visibilityOf(selectcaseno));
		Assert.assertTrue(selectcaseno.isDisplayed());
		HighlightOnElement(selectcaseno);
		Assert.assertTrue(selectcaseno.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(selectcaseno));
		selectcaseno.click();
		selectValueFromDropdown("NO");
	}
	
	@FindBy(xpath="(//button/descendant::span[contains(text(),'Update')])[2]")
	private WebElement update;
	
	public void clickOnUpdate(){
		wait.until(ExpectedConditions.visibilityOf(update));
		Assert.assertTrue(update.isDisplayed());
		HighlightOnElement(update);
		Assert.assertTrue(update.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(update));
		update.click();
		waitForPageLoad();
		waitForDomElement();
	}

}
