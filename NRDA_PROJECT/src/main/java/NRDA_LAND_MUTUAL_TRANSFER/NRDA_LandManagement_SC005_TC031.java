package NRDA_LAND_MUTUAL_TRANSFER;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC005_TC031 extends CommonLibrary{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,100);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "submit".
	 * @author deepak.saini
	 * @since 2018-04-17
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'Submit')])[1]")
	private WebElement submit;
	
	public void clickOnSubmit() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(submit));
		HighlightOnElement(submit);
		Assert.assertTrue(submit.isDisplayed());
		Assert.assertTrue(submit.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(submit));
		submit.click();
		waitForDomElement();
	}
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "successful message".
	 * @author deepak.saini
	 * @since 2018-04-17
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div/span[contains(text(),'Your application submitted successfully...')]")
	private WebElement msg;

	public void verifyMsg() throws InterruptedException{
		String expected="your application submitted successfully...";
		wait.until(ExpectedConditions.visibilityOf(msg));
		Assert.assertTrue(msg.isDisplayed());
		HighlightOnElement(msg);
		Assert.assertTrue(msg.isEnabled());
		String actual=msg.getText();
		Reporter.log("Successful Message :"+actual,true);
		Assert.assertEquals(actual,expected,"Test case not pass");
	}

}
