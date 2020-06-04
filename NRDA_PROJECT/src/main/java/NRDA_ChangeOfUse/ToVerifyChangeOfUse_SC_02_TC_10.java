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

public class ToVerifyChangeOfUse_SC_02_TC_10 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "trust/organization/school".
	 * @author deepak.saini
	 * @since 2018-04-11
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:tabView']/div/div[4]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Details of Usage')]/../../../../../../following-sibling::td/table/tbody/tr/td/select/../../../../../../../../../../following-sibling::tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Number of Bed/Employee/Students')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement numofbed;
	
	@FindBy(xpath="//div[@id='form0:tabView']/div/div[4]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Details of Usage')]/../../../../../../following-sibling::td/table/tbody/tr/td/select/../../../../../../../../../../following-sibling::tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Trust/Organisation/School')]")
	private WebElement clickonany;
	
	public void enterNumberOfBedEmployeeStudent() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(numofbed));
		Assert.assertTrue(numofbed.isDisplayed());
		HighlightOnElement(numofbed);
		Assert.assertTrue(numofbed.isEnabled());
		excel.getExcelData(numofbed,"Change Of Use Data",1,3);
		clickonany.click();
		acceptAlert();
		excel.getExcelData(numofbed,"Change Of Use Data",2,3);
	}
}
