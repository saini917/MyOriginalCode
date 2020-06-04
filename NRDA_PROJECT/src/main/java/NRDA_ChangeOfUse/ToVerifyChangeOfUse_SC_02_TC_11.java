package NRDA_ChangeOfUse;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyChangeOfUse_SC_02_TC_11 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "other upload document".
	 * @author deepak.saini
	 * @since 2018-04-11
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:tabView']/div/div[4]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Details of Usage')]/../../../../../../following-sibling::td/table/tbody/tr/td/select/../../../../../../../../../../following-sibling::tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Other Document')]/../../../../../../following-sibling::td/table/tbody/tr/td/span/div/div/label")
	private WebElement otherdocument;
	
	public void clickOnOtherDocument() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		wait.until(ExpectedConditions.visibilityOf(otherdocument));
		Assert.assertTrue(otherdocument.isDisplayed());
		HighlightOnElement(otherdocument);
		Assert.assertTrue(otherdocument.isEnabled());
		otherdocument.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\JPG AND PNG\\SampleDOCFile_100kb.doc");
		waitForSomeTime();
		waitForSomeTime();
	}

}
