package HRMS_ERP_UAT_TECHNICAL_SECTION;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import GenericLibrary.ExcelDataDriver;
import GenericLibrary.WebdriverCommonDriverLibrary;

public class TSDetailsPage extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Ts Details".
	 * @author deepak.saini
	 * @since 2018-12-07
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//td[@data-field='account_id']")
	private WebElement accID;
	
	public void clickOnAccountID() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(accID));
		Assert.assertTrue(accID.isDisplayed());
		HighlightOnElement(accID);
		Assert.assertTrue(accID.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(accID));
		accID.click();
		Thread.sleep(3000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Add an item".
	 * @author deepak.saini
	 * @since 2018-12-07
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//a[contains(text(),'Add an item')]")
	private WebElement item;
	
	public void clickOnAddItem() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(item));
		Assert.assertTrue(item.isDisplayed());
		HighlightOnElement(item);
		Assert.assertTrue(item.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(item));
		item.click();
		Thread.sleep(1000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "enter Description".
	 * @author deepak.saini
	 * @since 2018-12-07
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//textarea[@name='name']")
	private WebElement desc;
	
	public void enterDesc() throws EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(desc));
		Assert.assertTrue(desc.isDisplayed());
		HighlightOnElement(desc);
		Assert.assertTrue(desc.isEnabled());
		exceldata.getExcelData(desc,"Finance Data",8,2);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "enter Quantity".
	 * @author deepak.saini
	 * @since 2018-12-07
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//input[@data-fieldname='qty']")
	private WebElement qty;
	
	public void enterQuantity() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(qty));
		Assert.assertTrue(qty.isDisplayed());
		HighlightOnElement(qty);
		Assert.assertTrue(qty.isEnabled());
		qty.clear();
		Thread.sleep(1000);
		exceldata.getExcelData(qty,"Finance Data",4,2);
		Thread.sleep(1000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "enter Uom".
	 * @author deepak.saini
	 * @since 2018-12-07
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//div[@class='o_form_field_many2one o_form_field o_form_required']/div/input)[3]")
	private WebElement uom;
	
	@FindBy(xpath="//li/a[contains(text(),'cm')]")
	private WebElement value;
	
	public void enterUOM() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(uom));
		Assert.assertTrue(uom.isDisplayed());
		HighlightOnElement(uom);
		Assert.assertTrue(uom.isEnabled());
		uom.click();
		Thread.sleep(1000);
		value.click();
		Thread.sleep(1000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "enter unit price".
	 * @author deepak.saini
	 * @since 2018-12-07
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//input[@data-fieldname='unit_price']")
	private WebElement unitprice;
	
	public void enterUnitPrice() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(unitprice));
		Assert.assertTrue(unitprice.isDisplayed());
		HighlightOnElement(unitprice);
		Assert.assertTrue(unitprice.isEnabled());
		unitprice.clear();
		Thread.sleep(1000);
		exceldata.getExcelData(qty,"Finance Data",6,2);
		Thread.sleep(1000);
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "save and cloae".
	 * @author deepak.saini
	 * @since 2018-12-07
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//button/span[contains(text(),'Save  & Close')]")
	private WebElement saveAndClose;
	
	public void clickOnSaveAndClose() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(saveAndClose));
		Assert.assertTrue(saveAndClose.isDisplayed());
		HighlightOnElement(saveAndClose);
		Assert.assertTrue(saveAndClose.isEnabled());
		saveAndClose.click();
		Thread.sleep(5000);
	}
}
