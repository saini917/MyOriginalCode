package NRDA_ChangeOfUse;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyChangeOfUse_SC_07_TC_07 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "action ".
	 * @author deepak.saini
	 * @since 2018-04-18
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//form[@id='inboxForm']/div/div/div/div/div/div/div/div/table/tbody/tr/td/center/a/img[1]")
	private WebElement actionimg;
	
	public void clickOnAction() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(actionimg));
		Assert.assertTrue(actionimg.isDisplayed());
		HighlightOnElement(actionimg);
		Assert.assertTrue(actionimg.isEnabled());
		actionimg.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "file number".
	 * @author deepak.saini
	 * @since 2018-04-18
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="(//div[@class='note-sheet-wrapper-left'])[1]/div/label[1]")
	private WebElement displayfile;
	
	public void verifyDisplayFile()
	{
		wait.until(ExpectedConditions.elementToBeClickable(displayfile));
		Assert.assertTrue(displayfile.isDisplayed());
		HighlightOnElement(displayfile);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "subject".
	 * @author deepak.saini
	 * @since 2018-04-18
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="(//div[@class='note-sheet-wrapper-left'])[1]/div/label[2]")
	private WebElement displaysubject;
	
	public void verifyDisplaySubject()
	{
		wait.until(ExpectedConditions.elementToBeClickable(displaysubject));
		Assert.assertTrue(displaysubject.isDisplayed());
		HighlightOnElement(displaysubject);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "display list".
	 * @author deepak.saini
	 * @since 2018-04-18
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//center)[3]/table/tbody/tr/td/label")
	private List<WebElement> display;
	
	@FindBy(xpath="(//center)[3]/table/tbody/tr/td/span[contains(text(),'Upload Document')]")
	private WebElement display1;
	
	@FindBy(xpath="(//center)[4]/button/span")
	private List<WebElement> display2;
	
	public void verifyDisplayList()
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,450)", "");
		
		for(WebElement list:display)
		{
			Assert.assertTrue(list.isDisplayed());
			HighlightOnElement(list);
		}
		Assert.assertTrue(display1.isDisplayed());
		HighlightOnElement(display1);
		
		for(WebElement list:display2)
		{
			Assert.assertTrue(list.isDisplayed());
			HighlightOnElement(list);
		}
	}

}
