package NRDA_ChangeOfUse;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyChangeOfUse_SC_02_TC_16 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	@FindBy(xpath="//a[contains(text(),'Upload Document')]")
	private WebElement uploaddoc;
	
	public void clickOnUpload() throws InterruptedException
	{
		uploaddoc.click();
		waitForSomeTime();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "document name".
	 * @author deepak.saini
	 * @since 2018-04-12
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:tabView:docsDT']/div/table/tbody/tr/td/select")
	private WebElement docname;

	public void selectDocumentName() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(docname));
		Assert.assertTrue(docname.isDisplayed());
		HighlightOnElement(docname);
		Assert.assertTrue(docname.isEnabled());
		SelectVisibleText(docname,"Other Document");
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "upload document name".
	 * @author deepak.saini
	 * @since 2018-04-12
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:tabView:docsDT']/div/table/tbody/tr/td/select/../following-sibling::td/div/div/label")
	private WebElement upload;

	public void clickOnUploadNameDoc() throws InterruptedException, AWTException
	{
		wait.until(ExpectedConditions.visibilityOf(upload));
		Assert.assertTrue(upload.isDisplayed());
		HighlightOnElement(upload);
		Assert.assertTrue(upload.isEnabled());
		upload.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\JPG AND PNG\\SampleJPGImage_500kbmb.jpg");
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	}

	@FindBy(xpath="(//button/span[contains(text(),'Submit')])[1]")
	private WebElement submit;

	public void clickOnSubmit() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(submit));
		Assert.assertTrue(submit.isDisplayed());
		HighlightOnElement(submit);
		Assert.assertTrue(submit.isEnabled());
		submit.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	}

	@FindBy(xpath="//span[@id='form0:dynaFormGroup']/div/div/table/tbody/tr/td")
	private List<WebElement> display;

	public void verifyDisplayList()
	{
		for(WebElement list:display)
		{
			if(!list.isDisplayed())
			{
				Reporter.log("Test case fail",true);
			}
			else
			{
				Assert.assertTrue(list.isDisplayed());
				HighlightOnElement(list);
			}
		}
	}
}
