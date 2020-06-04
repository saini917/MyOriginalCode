package NRDA_BOD;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_BOD_SC_01_TC_40 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "subject".
	 * @author deepak.saini
	 * @since 2018-03-29
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:srchDlg']/div/div/div/table/tbody/tr/td/label[contains(text(),'Subject')]/../following-sibling::td[2]/input")
	private WebElement subjectname;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "search".
	 * @author deepak.saini
	 * @since 2018-03-29
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'Search')])[2]")
	private WebElement search;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "click on radio button".
	 * @author deepak.saini
	 * @since 2018-03-29
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:srchDlg']/div/div/div/div/div/table/tbody/tr/td/div")
	private WebElement selectrecord;
	
	public void selectSubjectClickOnSearch() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(subjectname));
		Assert.assertTrue(subjectname.isDisplayed());
		HighlightOnElement(subjectname);
		Assert.assertTrue(subjectname.isEnabled());
		excel.getExcelData(subjectname,"PRO DATA",1,2);
		waitForSomeTime();
		
		wait.until(ExpectedConditions.visibilityOf(search));
		Assert.assertTrue(search.isDisplayed());
		HighlightOnElement(search);
		Assert.assertTrue(search.isEnabled());
		search.click();
		waitForSomeTime();
		
		wait.until(ExpectedConditions.visibilityOf(selectrecord));
		Assert.assertTrue(selectrecord.isDisplayed());
		HighlightOnElement(selectrecord);
		Assert.assertTrue(selectrecord.isEnabled());
		Actions act=new Actions(driver);
		act.click(selectrecord).build().perform();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "display list".
	 * @author deepak.saini
	 * @since 2018-03-29
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:srchDlg']/div/div/div/div/div/table/tbody/tr/td/following-sibling::td")
	private List<WebElement> display;
	
	public void verifyDisplayList()
	{
		Reporter.log("System will show the following :",true);
		for(WebElement list:display)
		{
			Assert.assertTrue(list.isDisplayed());
			HighlightOnElement(list);
			String listvalue=list.getText();
			Reporter.log(listvalue,true);
		}
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "close".
	 * @author deepak.saini
	 * @since 2018-03-29
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'Close')])[1]")
	private WebElement close;
	
	public void clickOnCloseBtn()
	{
		wait.until(ExpectedConditions.visibilityOf(close));
		Assert.assertTrue(close.isDisplayed());
		HighlightOnElement(close);
		Assert.assertTrue(close.isEnabled());
		close.click();
	}

}
