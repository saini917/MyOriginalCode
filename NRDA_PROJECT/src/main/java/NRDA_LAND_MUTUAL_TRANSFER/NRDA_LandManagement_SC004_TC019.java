package NRDA_LAND_MUTUAL_TRANSFER;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC004_TC019 extends CommonLibrary{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,100);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select legal section".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/****************************************************************************************************/
	
	@FindBy(xpath="//label[contains(text(),'Select Action')]/../following-sibling::td/span/table/tbody/tr/td[1]/div/div/span")
	private WebElement legalsection;
	
	public void selectLegalSection() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(legalsection));
		Assert.assertTrue(legalsection.isDisplayed());
		HighlightOnElement(legalsection);
		Assert.assertTrue(legalsection.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(legalsection));
		legalsection.click();
		selectValueFromDropdown("Legal Section");
		waitForPageLoad();
		waitForDomElement();
	}

}
