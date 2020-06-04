package NRDA_RECONNECTION;

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
import org.testng.Reporter;
import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_Reconnection_SC_05_TC_04 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
/****************************************************************************************************/
/*
 * This is the xpath of the WebElement "application number".
 * @author deepak.saini
 * @since 2018-05-03
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
	excel.getExcelData(appnum,"Reconnection_App_Num",0,1);
	waitForSomeTime();
}

/****************************************************************************************************/
/*
 * This is the xpath of the WebElement "action".
 * @author deepak saini
 * @since 2017-09-22
 */
/*****************************************************************************************************/
@FindBy(xpath="//form[@id='inboxForm']/div/div/div/div/div/div/div/div/table/tbody/tr/td/center/a/img")
private WebElement actionimg;

public void clickOnActionImg() throws InterruptedException
{
	wait.until(ExpectedConditions.visibilityOf(actionimg));
	wait.until(ExpectedConditions.elementToBeClickable(actionimg));
	Assert.assertTrue(actionimg.isDisplayed());
	HighlightOnElement(actionimg);
	Assert.assertTrue(actionimg.isEnabled());
	actionimg.click();
	waitForSomeTime();
	waitForSomeTime();
	waitForSomeTime();
	waitForSomeTime();
	waitForSomeTime();
	waitForSomeTime();
}

/****************************************************************************************************/
/*
 * This is the xpath of the WebElement "display list".
 * @author deepak.saini
 * @since 2018-05-03
 */
/*****************************************************************************************************/

@FindBy(xpath="(//center)[2]/table/tbody/tr/td/label")
private List<WebElement> display;

@FindBy(xpath="(//center)[2]/table/tbody/tr/td/span[contains(text(),'Upload Document')]")
private WebElement display1;

@FindBy(xpath="(//center)[3]/button/span")
private List<WebElement> display2;

public void verifyDisplayList() throws InterruptedException
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
