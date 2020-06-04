package NRDA_ChangeOfUse;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyChangeOfUse_SC_02_TC_03 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Connection type".
	 * @author deepak.saini
	 * @since 2018-04-11
	 */
	/****************************************************************************************************/

	@FindBy(xpath="//div[@id='form0:tabView']/div/div[4]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Connection Type')]/../../../../../../following-sibling::td/table/tbody/tr/td/select")
	private WebElement connectiontype;
	
	public void verifyConnectionType() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(connectiontype));
		Assert.assertTrue(connectiontype.isDisplayed());
		HighlightOnElement(connectiontype);
		Assert.assertTrue(connectiontype.isEnabled());
		
		Select sele=new Select(connectiontype);
		List<WebElement> value=sele.getOptions();
		Reporter.log("Connection Type :",true);
		for(WebElement list:value)
		{
			String val=list.getText();
			Reporter.log(val,true);
		}
	}
}
