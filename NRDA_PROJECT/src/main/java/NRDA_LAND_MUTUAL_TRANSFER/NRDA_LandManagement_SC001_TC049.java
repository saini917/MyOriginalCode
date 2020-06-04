package NRDA_LAND_MUTUAL_TRANSFER;

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

public class NRDA_LandManagement_SC001_TC049 extends CommonLibrary{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,100);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Search".
	 * @author deepak.saini
	 * @since 2018-03-29
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'Search')])[1]")
	private WebElement search;
	
	public void clickOnSearch() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(search));
		Assert.assertTrue(search.isDisplayed());
		HighlightOnElement(search);
		Assert.assertTrue(search.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(search));
		search.click();
		waitForSomeTime();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "create new file".
	 * @author deepak.saini
	 * @since 2018-03-29
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//div[@id='inboxForm:srchDlg']/div/div/div/center/table/tbody/tr/td/button/span[contains(text(),'Create New File')]")
	private WebElement createnewfile;
	
	public void clickOnCreateNewFile() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(createnewfile));
		Assert.assertTrue(createnewfile.isDisplayed());
		HighlightOnElement(createnewfile);
		Assert.assertTrue(createnewfile.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(createnewfile));
		createnewfile.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "subject".
	 * @author deepak.saini
	 * @since 2018-03-29
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:createFileDlg']/div/div/div/table/tbody/tr/td/label[contains(text(),'Subject')]/../following-sibling::td/input")
	private WebElement subject;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "click on any".
	 * @author deepak.saini
	 * @since 2018-03-29
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:createFileDlg']/div/div/div/table/tbody/tr/td/label[contains(text(),'File Number')]")
	private WebElement clickonAny;
	
	public void enterSubject() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException{
			wait.until(ExpectedConditions.visibilityOf(subject));
			Assert.assertTrue(subject.isDisplayed());
			HighlightOnElement(subject);
			Assert.assertTrue(subject.isEnabled());
			excel.getExcelData(subject,"Land Data",1,15);
			waitForSomeTime();
			clickonAny.click();
			waitForSomeTime();
		}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "file no".
	 * @author deepak.saini
	 * @since 2018-03-29
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:createFileDlg']/div/div/div/table/tbody/tr/td/label[contains(text(),'File Number')]/../following-sibling::td/table/tbody/tr/td/input")
	private WebElement fileno;
	
	public void enterFileNumber() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(fileno));
		Assert.assertTrue(fileno.isDisplayed());
		HighlightOnElement(fileno);
		Assert.assertTrue(fileno.isEnabled());
		excel.getExcelData(fileno,"Land Data",1,16);
		waitForSomeTime();
		clickonAny.click();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Type".
	 * @author deepak.saini
	 * @since 2018-03-29
	 */
	/*****************************************************************************************************/
	//@FindBy(xpath="//div[@id='inboxForm:createFileDlg']/div/div/div/table/tbody/tr/td/label[contains(text(),'Type')]/../following-sibling::td[1]/select")
	@FindBy(xpath="//div[@id='inboxForm:createFileDlg']/div/div/div/table/tbody/tr/td/label[contains(text(),'Type')]/../following-sibling::td[1]/div/div/span")
	private WebElement type;
	
	public void selectType() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(type));
		Assert.assertTrue(type.isDisplayed());
		HighlightOnElement(type);
		Assert.assertTrue(type.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(type));
		type.click();
		selectValueFromDropdown("File");
		//SelectVisibleText(type,"File");
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "category".
	 * @author deepak.saini
	 * @since 2018-03-29
	 */
	/*****************************************************************************************************/
	//@FindBy(xpath="//div[@id='inboxForm:createFileDlg']/div/div/div/table/tbody/tr/td/label[contains(text(),'Category')]/../following-sibling::td[1]/select")
	@FindBy(xpath="//div[@id='inboxForm:createFileDlg']/div/div/div/table/tbody/tr/td/label[contains(text(),'Category')]/../following-sibling::td[1]/div/div/span")
	private WebElement category;
	
	public void selectCategory() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(category));
		Assert.assertTrue(category.isDisplayed());
		HighlightOnElement(category);
		Assert.assertTrue(category.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(category));
		category.click();
		selectValueFromDropdown("Land");
		//SelectVisibleText(category,"Land");
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "department".
	 * @author deepak.saini
	 * @since 2018-03-29
	 */
	/*****************************************************************************************************/
	//@FindBy(xpath="//div[@id='inboxForm:createFileDlg']/div/div/div/table/tbody/tr/td/label[contains(text(),'Department')]/../following-sibling::td[1]/select")
	@FindBy(xpath="//div[@id='inboxForm:createFileDlg']/div/div/div/table/tbody/tr/td/label[contains(text(),'Department')]/../following-sibling::td[1]/div/div/span")
	private WebElement department;
	
	public void selectDept() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(department));
		Assert.assertTrue(department.isDisplayed());
		HighlightOnElement(department);
		Assert.assertTrue(department.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(department));
		department.click();
		selectValueFromDropdown("Land Section");
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "clear".
	 * @author deepak.saini
	 * @since 2018-05-28
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//button/span[contains(text(),'Clear')]")
	private WebElement clear;
	
	public void clickOnClear() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(clear));
		Assert.assertTrue(clear.isDisplayed());
		HighlightOnElement(clear);
		Assert.assertTrue(clear.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(clear));
		clear.click();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "close window".
	 * @author deepak.saini
	 * @since 2018-03-29
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:createFileDlg']/div/a/span")
	//@FindBy(xpath="(//button/span[contains(text(),'Close')])[2]")
	private WebElement closewindow;
	
	public void verifyClosePopUpWindow() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(closewindow));
		Assert.assertTrue(closewindow.isDisplayed());
		HighlightOnElement(closewindow);
		Assert.assertTrue(closewindow.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(closewindow));
		closewindow.click();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "close window".
	 * @author deepak.saini
	 * @since 2018-03-29
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:srchDlg']/div/a/span")
	//@FindBy(xpath="(//button/span[contains(text(),'Close')])[1]")
	private WebElement closewindow1;
	
	public void verifyClosePopUpWindow1() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(closewindow1));
		Assert.assertTrue(closewindow1.isDisplayed());
		HighlightOnElement(closewindow1);
		Assert.assertTrue(closewindow1.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(closewindow1));
		closewindow1.click();
		waitForSomeTime();
	}

}
