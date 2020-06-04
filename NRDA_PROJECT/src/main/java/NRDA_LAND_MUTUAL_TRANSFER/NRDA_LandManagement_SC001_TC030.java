package NRDA_LAND_MUTUAL_TRANSFER;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC001_TC030 extends CommonLibrary{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,100);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "upload letter".
	 * @author deepak.saini
	 * @since 2018-05-30
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Upload Letter')]/ancestor::td/following-sibling::td/descendant::table[1]/tbody/tr/td/span/div/div/label")
	private WebElement uploadletter;
	
	public void uploadLetter() throws InterruptedException, AWTException{
		wait.until(ExpectedConditions.visibilityOf(uploadletter));
		Assert.assertTrue(uploadletter.isDisplayed());
		HighlightOnElement(uploadletter);
		Assert.assertTrue(uploadletter.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(uploadletter));
		uploadletter.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\DocumentFormat\\ExcelFormat.xlsx");
		waitForPageLoad();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Khasra paanchsala".
	 * @author deepak.saini
	 * @since 2018-05-30
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Khasra Paanchsala')]/ancestor::td/following-sibling::td/descendant::table[1]/tbody/tr/td/span/div/div/label")
	private WebElement khasrapaanch;
	
	public void khasraPaanchsala() throws InterruptedException, AWTException{
		wait.until(ExpectedConditions.visibilityOf(khasrapaanch));
		Assert.assertTrue(khasrapaanch.isDisplayed());
		HighlightOnElement(khasrapaanch);
		Assert.assertTrue(khasrapaanch.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(khasrapaanch));
		khasrapaanch.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\DocumentFormat\\ExcelFormat.xlsx");
		waitForPageLoad();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "patwari report".
	 * @author deepak.saini
	 * @since 2018-05-30
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Patwari Report')]/ancestor::td/following-sibling::td/descendant::table[1]/tbody/tr/td/span/div/div/label")
	private WebElement patwarireport;
	
	public void patwariReport() throws InterruptedException, AWTException{
		wait.until(ExpectedConditions.visibilityOf(patwarireport));
		Assert.assertTrue(patwarireport.isDisplayed());
		HighlightOnElement(patwarireport);
		Assert.assertTrue(patwarireport.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(patwarireport));
		patwarireport.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\DocumentFormat\\ExcelFormat.xlsx");
		waitForPageLoad();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "error message".
	 * @author deepak.saini
	 * @since 2018-05-30
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-growl-message']/span[contains(text(),'Please select actual file, changed extension and .exe not allowed.')]")
	private WebElement errormsg;
	
	public void getErrorMsg() throws InterruptedException, AWTException{
		String expected="Please select actual file, changed extension and .exe not allowed.";
		wait.until(ExpectedConditions.visibilityOf(errormsg));
		Assert.assertTrue(errormsg.isDisplayed());
		HighlightOnElement(errormsg);
		Assert.assertTrue(errormsg.isEnabled());
		String actual=errormsg.getText();
		Assert.assertEquals(actual,expected,"test case not pass");
		Reporter.log("Error message:"+actual,true);
		
	}

}
