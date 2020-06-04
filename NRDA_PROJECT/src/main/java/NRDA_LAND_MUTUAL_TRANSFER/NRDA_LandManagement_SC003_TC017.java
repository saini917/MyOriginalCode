package NRDA_LAND_MUTUAL_TRANSFER;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC003_TC017 extends CommonLibrary{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,100);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select planning section".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/****************************************************************************************************/
	
	@FindBy(xpath="//label[contains(text(),'Select Action')]/../following-sibling::td/span/table/tbody/tr/td[1]/div/div/span")
	private WebElement plansection;
	
	public void selectPlanningSection() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(plansection));
		Assert.assertTrue(plansection.isDisplayed());
		HighlightOnElement(plansection);
		Assert.assertTrue(plansection.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(plansection));
		plansection.click();
		selectValueFromDropdown("Planning Section");
		waitForPageLoad();
	}

}
