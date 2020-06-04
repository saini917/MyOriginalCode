package NRDA_BOD;

import java.util.List;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_BOD_SC_01_TC_07 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "proceed".
	 * @author deepak.saini
	 * @since 2017-03-21
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//button/span[contains(text(),'Proceed')]")
	private WebElement proceed;
	
	public void clickOnProceedButton() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(proceed));
		wait.until(ExpectedConditions.elementToBeClickable(proceed));
		Assert.assertTrue(proceed.isDisplayed());
		HighlightOnElement(proceed);
		Assert.assertTrue(proceed.isEnabled());
		proceed.click();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "verify dispaly link".
	 * @author deepak.saini
	 * @since 2017-03-21
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//div[@id='form0:Nb_content']/div/ul/li/a")
	private List<WebElement> verifylink;
	
	public void verifyLink() throws InterruptedException
	{
		Reporter.log("System will display the Following Link :",true);
		for(WebElement link:verifylink)
		{
			Assert.assertTrue(link.isDisplayed());
			HighlightOnElement(link);
			String display=link.getText();
			Reporter.log(display,true);
			waitForSomeTime();
		}
	}

}
