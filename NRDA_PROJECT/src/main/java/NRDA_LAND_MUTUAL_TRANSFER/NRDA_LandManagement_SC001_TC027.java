package NRDA_LAND_MUTUAL_TRANSFER;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC001_TC027 extends CommonLibrary{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,100);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "I/WE".
	 * @author deepak.saini
	 * @since 2018-05-30
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'I/WE')]/ancestor::td/following-sibling::td/descendant::table/tbody/tr/td/input[@title='I/WE']")
	private WebElement IW;
	
	public void verifyIWE() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(IW));
		Assert.assertTrue(IW.isDisplayed());
		HighlightOnElement(IW);
		Assert.assertTrue(IW.isEnabled());
	}
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "S/O".
	 * @author deepak.saini
	 * @since 2018-05-30
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'S/O')]/ancestor::td/following-sibling::td/descendant::table/tbody/tr/td/input")
	private WebElement SO;
	
	public void verifySO() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(SO));
		Assert.assertTrue(SO.isDisplayed());
		HighlightOnElement(SO);
		Assert.assertTrue(SO.isEnabled());
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "caste".
	 * @author deepak.saini
	 * @since 2018-05-30
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Caste')]/ancestor::td/following-sibling::td/descendant::table/tbody/tr/td/input[@title='Caste']")
	private WebElement caste;
	
	public void verifyCaste() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(caste));
		Assert.assertTrue(caste.isDisplayed());
		HighlightOnElement(caste);
		Assert.assertTrue(caste.isEnabled());
	}

}
