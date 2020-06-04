package NRDA_ChangeOfUse;

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

public class ToVerifyChangeOfUse_SC_02_TC_09 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Details of Usage".
	 * @author deepak.saini
	 * @since 2018-04-11
	 */
	/****************************************************************************************************/

	@FindBy(xpath="//div[@id='form0:tabView']/div/div[4]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Details of Usage')]/../../../../../../following-sibling::td/table/tbody/tr/td/select")
	private WebElement usage;
	
	public void selectDetailsOfUsage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(usage));
		Assert.assertTrue(usage.isDisplayed());
		HighlightOnElement(usage);
		Assert.assertTrue(usage.isEnabled());
		SelectVisibleText(usage,"Educational Institutes/शैक्षिक संस्थानों");
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "trust/organization/school".
	 * @author deepak.saini
	 * @since 2018-04-11
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:tabView']/div/div[4]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Details of Usage')]/../../../../../../following-sibling::td/table/tbody/tr/td/select/../../../../../../../../../../following-sibling::tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Trust/Organisation/School')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement trust;
	
	@FindBy(xpath="//div[@id='form0:tabView']/div/div[4]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Details of Usage')]/../../../../../../following-sibling::td/table/tbody/tr/td/select/../../../../../../../../../../following-sibling::tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Trust/Organisation/School')]")
	private WebElement clickonany;
	
	public void enterTrustOrganizationSchool() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(trust));
		Assert.assertTrue(trust.isDisplayed());
		HighlightOnElement(trust);
		Assert.assertTrue(trust.isEnabled());
		excel.getExcelData(trust,"Change Of Use Data",1,2);
		clickonany.click();
		acceptAlert();
		excel.getExcelData(trust,"Change Of Use Data",2,2);
	}
	

}
