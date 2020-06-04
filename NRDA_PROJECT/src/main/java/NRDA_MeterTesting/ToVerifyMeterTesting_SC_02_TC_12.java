package NRDA_MeterTesting;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyMeterTesting_SC_02_TC_12 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "subject".
	 * @author deepak.saini
	 * @since 2018-03-23
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:createFileDlg']/div/div/div/table/tbody/tr/td/label[contains(text(),'Subject')]/../following-sibling::td/input")
	private WebElement subject;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "file no".
	 * @author deepak.saini
	 * @since 2018-03-23
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:createFileDlg']/div/div/div/table/tbody/tr/td/label[contains(text(),'File Number')]/../following-sibling::td/table/tbody/tr/td/input")
	private WebElement fileno;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "click on any".
	 * @author deepak.saini
	 * @since 2018-03-23
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:createFileDlg']/div/div/div/table/tbody/tr/td/label[contains(text(),'File Number')]")
	private WebElement clickonAny;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Type".
	 * @author deepak.saini
	 * @since 2018-03-23
	 */
	/*****************************************************************************************************/
	/*@FindBy(xpath="//div[@id='inboxForm:createFileDlg']/div/div/div/table/tbody/tr/td/label[contains(text(),'Type')]/../following-sibling::td[1]/select")
	private WebElement type;*/

	@FindBy(xpath="//div[@id='inboxForm:createFileDlg']/div/div/div/table/tbody/tr/td/label[contains(text(),'Type')]/../following-sibling::td[1]/div/div/span")
	private WebElement type;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "category".
	 * @author deepak.saini
	 * @since 2018-03-23
	 */
	/*****************************************************************************************************/
	/*@FindBy(xpath="//div[@id='inboxForm:createFileDlg']/div/div/div/table/tbody/tr/td/label[contains(text(),'Category')]/../following-sibling::td[1]/select")
	private WebElement category;*/

	@FindBy(xpath="//div[@id='inboxForm:createFileDlg']/div/div/div/table/tbody/tr/td/label[contains(text(),'Category')]/../following-sibling::td[1]/div/div/span")
	private WebElement category;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "department".
	 * @author deepak.saini
	 * @since 2018-03-23
	 */
	/*****************************************************************************************************/
	/*@FindBy(xpath="//div[@id='inboxForm:createFileDlg']/div/div/div/table/tbody/tr/td/label[contains(text(),'Department')]/../following-sibling::td[1]/select")
	private WebElement department;*/

	@FindBy(xpath="//div[@id='inboxForm:createFileDlg']/div/div/div/table/tbody/tr/td/label[contains(text(),'Department')]/../following-sibling::td[1]/div/div/span")
	private WebElement department;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "is condtuonal".
	 * @author deepak.saini
	 * @since 2018-03-23
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:createFileDlg']/div/div/div/table/tbody/tr/td/label[contains(text(),'Is Conditional')]/../following-sibling::td/div/div[2]")
	private WebElement conditional;

	public void enterData() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		try
		{
			wait.until(ExpectedConditions.visibilityOf(subject));
			Assert.assertTrue(subject.isDisplayed());
			HighlightOnElement(subject);
			Assert.assertTrue(subject.isEnabled());
			excel.getExcelData(subject,"PRO DATA",1,2);
			waitForSomeTime();
			clickonAny.click();
			waitForSomeTime();

			wait.until(ExpectedConditions.visibilityOf(fileno));
			Assert.assertTrue(fileno.isDisplayed());
			HighlightOnElement(fileno);
			Assert.assertTrue(fileno.isEnabled());
			excel.getExcelData(fileno,"PRO DATA",1,3);
			clickonAny.click();
			waitForSomeTime();

			/*wait.until(ExpectedConditions.visibilityOf(type));
			Assert.assertTrue(type.isDisplayed());
			HighlightOnElement(type);
			Assert.assertTrue(type.isEnabled());
			SelectVisibleText(type,"File");
			waitForSomeTime();*/

			wait.until(ExpectedConditions.visibilityOf(type));
			Assert.assertTrue(type.isDisplayed());
			HighlightOnElement(type);
			Assert.assertTrue(type.isEnabled());
			type.click();
			selectValueFromDropdown("File");
			waitForSomeTime();


			/*wait.until(ExpectedConditions.visibilityOf(category));
			Assert.assertTrue(category.isDisplayed());
			HighlightOnElement(category);
			Assert.assertTrue(category.isEnabled());
			SelectVisibleText(category,"Land");
			waitForSomeTime();*/

			wait.until(ExpectedConditions.visibilityOf(category));
			Assert.assertTrue(category.isDisplayed());
			HighlightOnElement(category);
			Assert.assertTrue(category.isEnabled());
			category.click();
			selectValueFromDropdown("Land");
			waitForSomeTime();

			/*wait.until(ExpectedConditions.visibilityOf(department));
			Assert.assertTrue(department.isDisplayed());
			HighlightOnElement(department);
			Assert.assertTrue(department.isEnabled());
			SelectVisibleText(department,"ENVIRONMENT SECTION");
			waitForSomeTime();*/

			wait.until(ExpectedConditions.visibilityOf(department));
			Assert.assertTrue(department.isDisplayed());
			HighlightOnElement(department);
			Assert.assertTrue(department.isEnabled());
			department.click();
			selectValueFromDropdown("Public Health and Engineering");
			waitForSomeTime();

			/*wait.until(ExpectedConditions.visibilityOf(conditional));
			Assert.assertTrue(conditional.isDisplayed());
			HighlightOnElement(conditional);
			Assert.assertTrue(conditional.isEnabled());
			conditional.click();
			waitForSomeTime();*/
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "submit".
	 * @author deepak.saini
	 * @since 2018-03-23
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'Submit')])[3]")
	private WebElement submit;
	public void clickOnSubmit() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(submit));
		Assert.assertTrue(submit.isDisplayed());
		HighlightOnElement(submit);
		Assert.assertTrue(submit.isEnabled());
		submit.click();
		waitForSomeTime();
	}



	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "subject".
	 * @author deepak.saini
	 * @since 2018-03-23
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:srchDlg']/div/div/div/table/tbody/tr/td/label[contains(text(),'Subject')]/../following-sibling::td[2]/input")
	private WebElement subjectname;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "search".
	 * @author deepak.saini
	 * @since 2018-03-23
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'Search')])[2]")
	private WebElement search;
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "click on radio button".
	 * @author deepak.saini
	 * @since 2018-03-23
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
	 * This is the xpath of the WebElement "close window".
	 * @author deepak.saini
	 * @since 2018-03-23
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:srchDlg']/div/a/span")
	private WebElement closewindow1;

	public void verifyClosePopUpWindow1() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(closewindow1));
		wait.until(ExpectedConditions.elementToBeClickable(closewindow1));
		Assert.assertTrue(closewindow1.isDisplayed());
		HighlightOnElement(closewindow1);
		Assert.assertTrue(closewindow1.isEnabled());
		closewindow1.click();
		waitForSomeTime();
	}
}