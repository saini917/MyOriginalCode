package NRDA_LAND_DIVERSION_SECTION;

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

public class NRDA_LandManagement_SC001_TC008 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,100);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "existing land type".
	 * @author deepak.saini
	 * @since 2018-05-25
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Existing Land Type')]/ancestor::td[@class='left']/following-sibling::td/table/tbody/tr/td/select")
	private WebElement existlandtype;
	
	public void selectExistingLandType() throws InterruptedException
	{
		fluentWait(existlandtype);
		//wait.until(ExpectedConditions.visibilityOf(existlandtype));
		Assert.assertTrue(existlandtype.isDisplayed());
		HighlightOnElement(existlandtype);
		Assert.assertTrue(existlandtype.isEnabled());
		SelectVisibleText(existlandtype,"COMMERCIAL");
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "converted to".
	 * @author deepak.saini
	 * @since 2018-05-25
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Converted To')]/ancestor::td[@class='left']/following-sibling::td/table/tbody/tr/td/select")
	private WebElement convertedto;
	
	public void selectConvertedTo() throws InterruptedException
	{
		fluentWait(convertedto);
		//wait.until(ExpectedConditions.visibilityOf(convertedto));
		Assert.assertTrue(convertedto.isDisplayed());
		HighlightOnElement(convertedto);
		Assert.assertTrue(convertedto.isEnabled());
		SelectVisibleText(convertedto,"INDUSTRIAL");
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "purpose".
	 * @author deepak.saini
	 * @since 2018-05-25
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Purpose')]/ancestor::td[@class='left']/following-sibling::td/table/tbody/tr/td/textarea")
	private WebElement purpose;
	
	public void enterPurpose() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		fluentWait(purpose);
		//wait.until(ExpectedConditions.visibilityOf(purpose));
		Assert.assertTrue(purpose.isDisplayed());
		HighlightOnElement(purpose);
		Assert.assertTrue(purpose.isEnabled());
		excel.getExcelData(purpose,"Land Data",1,30);
	}

}
