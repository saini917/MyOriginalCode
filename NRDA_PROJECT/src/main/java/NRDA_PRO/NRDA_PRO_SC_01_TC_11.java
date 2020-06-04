package NRDA_PRO;

import java.io.IOException;
import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_PRO_SC_01_TC_11 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "close".
	 * @author deepak.saini
	 * @since 2018-05-09
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//button/span[contains(text(),'Close')]")
	private WebElement close;

	public void clickOnClose() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		wait.until(ExpectedConditions.visibilityOf(close));
		Assert.assertTrue(close.isDisplayed());
		HighlightOnElement(close);
		Assert.assertTrue(close.isEnabled());
		close.click();
		waitForSomeTime();
		waitForSomeTime();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "no".
	 * @author deepak.saini
	 * @since 2018-05-09
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'No')])[2]")
	private WebElement no;

	public void clickONNo() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(no));
		Assert.assertTrue(no.isDisplayed());
		HighlightOnElement(no);
		Assert.assertTrue(no.isEnabled());
		String currenturl=driver.getCurrentUrl();
		no.click();
		waitForSomeTime();
		waitForSomeTime();
		String previousurl=driver.getCurrentUrl();
		Assert.assertEquals(currenturl,previousurl,"Test case pass");
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Yes".
	 * @author deepak.saini
	 * @since 2018-05-09
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'Yes')])[2]")
	private WebElement yes;

	public void clickONYes() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf( yes));
		Assert.assertTrue(yes.isDisplayed());
		HighlightOnElement(yes);
		Assert.assertTrue(yes.isEnabled());
		String currenturl=driver.getCurrentUrl();
		yes.click();
		waitForSomeTime();
		waitForSomeTime();
		String previousurl=driver.getCurrentUrl();
		Assert.assertNotEquals(currenturl,previousurl,"Test case pass");
	}

}
