package NRDA_ChangeOfUse;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyChangeOfUse_SC_08_TC_01 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "public health and engineering".
	 * @author deepak.saini
	 * @since 2018-04-19
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//td[@class='leftCol']/table/tbody/tr/td/form/div/div/h3/a[contains(text(),'Public Health and Engineering')]/preceding-sibling::span")
	private WebElement publichealth;
	
	public void clickOnPublicHealthAndEngg() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(publichealth));
		Assert.assertTrue(publichealth.isDisplayed());
		HighlightOnElement(publichealth);
		Assert.assertTrue(publichealth.isEnabled());
		publichealth.click();
		waitForSomeTime();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "change of use".
	 * @author deepak.saini
	 * @since 2018-04-19
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//td[@class='leftCol']/table/tbody/tr/td/form/div/div/h3/a[contains(text(),'Public Health and Engineering')]/preceding-sibling::span/../following-sibling::div/ul/li/a/span[contains(text(),'CHANGE OF USE')]")
	private WebElement changeofuse;
	
	public void clickOnChangeOfUse() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(changeofuse));
		Assert.assertTrue(changeofuse.isDisplayed());
		HighlightOnElement(changeofuse);
		Assert.assertTrue(changeofuse.isEnabled());
		changeofuse.click();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "application number".
	 * @author deepak.saini
	 * @since 2018-04-19
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//span[contains(text(),'Application No.')]/following-sibling::input")
	private WebElement appnum;
	
	public void enterApplicationNum() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(appnum));
		HighlightOnElement(appnum);
		Assert.assertTrue(appnum.isDisplayed());
		Assert.assertTrue(appnum.isEnabled());
		excel.getExcelData(appnum,"ChangeOfUseID",0,1);
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "action".
	 * @author deepak.saini
	 * @since 2018-04-19
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//form[@id='inboxForm']/div/div/div/div/div/div/div/div/table/tbody/tr/td/center/a/img[1]")
	private WebElement actionimg;
	
	public void clickOnAction() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(actionimg));
		HighlightOnElement(actionimg);
		Assert.assertTrue(actionimg.isDisplayed());
		Assert.assertTrue(actionimg.isEnabled());
		actionimg.click();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "display list".
	 * @author deepak.saini
	 * @since 2018-04-19
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//div[@class='note-sheet-wrapper-left'])[1]/div/label[1]")
	private WebElement displayfile;
	
	@FindBy(xpath="(//div[@class='note-sheet-wrapper-left'])[1]/div/label[2]")
	private WebElement displaysubject;
	
	@FindBy(xpath="(//center)[3]/table/tbody/tr/td/label")
	private List<WebElement> display;
	
	@FindBy(xpath="(//span[contains(text(),'Upload Document')])[1]")
	private WebElement dispaly1;
	
	@FindBy(xpath="(//center)[4]/button/span")
	private List<WebElement> display2;
	
	public void verifyDisplayList()
	{
		wait.until(ExpectedConditions.elementToBeClickable(displayfile));
		Assert.assertTrue(displayfile.isDisplayed());
		HighlightOnElement(displayfile);
		
		wait.until(ExpectedConditions.elementToBeClickable(displaysubject));
		Assert.assertTrue(displaysubject.isDisplayed());
		HighlightOnElement(displaysubject);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,400)", "");
		
		for(WebElement list:display)
		{
			Assert.assertTrue(list.isDisplayed());
			HighlightOnElement(list);
		}
		
		Assert.assertTrue(dispaly1.isDisplayed());
		HighlightOnElement(dispaly1);
		
		for(WebElement list:display2)
		{
			Assert.assertTrue(list.isDisplayed());
			HighlightOnElement(list);
		}
	}
	

}
