package NRDA_LAND_MUTUAL_TRANSFER;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC006_TC018 extends CommonLibrary{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,100);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select CEO".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/****************************************************************************************************/
	
	@FindBy(xpath="//label[contains(text(),'Select Action')]/../following-sibling::td/span/table/tbody/tr/td[1]/div/div/span")
	private WebElement user;
	
	public void selectCEO() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(user));
		Assert.assertTrue(user.isDisplayed());
		HighlightOnElement(user);
		Assert.assertTrue(user.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(user));
		user.click();
		selectValueFromDropdown("Mukesh Bansal (CEO)");
		waitForPageLoad();
		waitForDomElement();
	}

}
