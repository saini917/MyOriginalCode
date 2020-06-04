package NRDA_LAND_MUTUAL_TRANSFER;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC005_TC018 extends CommonLibrary{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,100);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select case Yes".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/*****************************************************************************************************/


	@FindBy(xpath="//label[contains(text(),'Case Registered')]/../following-sibling::td/div/div/span")
	private WebElement selectcaseyes;

	public void selectCaseYes() throws InterruptedException{	
		wait.until(ExpectedConditions.visibilityOf(selectcaseyes));
		Assert.assertTrue(selectcaseyes.isDisplayed());
		HighlightOnElement(selectcaseyes);
		Assert.assertTrue(selectcaseyes.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(selectcaseyes));
		selectcaseyes.click();
		selectValueFromDropdown("YES");
		waitForPageLoad();
		waitForDomElement();
	}

}
