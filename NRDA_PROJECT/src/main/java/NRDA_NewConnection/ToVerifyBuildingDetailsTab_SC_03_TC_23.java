package NRDA_NewConnection;

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


public class ToVerifyBuildingDetailsTab_SC_03_TC_23 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "enter Property ID ".
	 * @author deepak.saini
	 * @since 2018-04-24
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:Nb']/div/div/div/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Property ID')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement enterid;

	public void enterPropertyID() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(enterid));
		HighlightOnElement(enterid);
		Assert.assertTrue(enterid.isDisplayed());
		Assert.assertTrue(enterid.isEnabled());
		excel.getExcelData(enterid,"Building Details",1,4);
		
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Name of owner of Building".
	 * @author deepak.saini
	 * @since 2018-04-24
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Name of Building')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement nameofownerbuilding;
	
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Name of Building')]")
	private WebElement clickonany;
	
	public void enterNameOfOwnerBuilding() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(nameofownerbuilding));
		HighlightOnElement(nameofownerbuilding);
		Assert.assertTrue(nameofownerbuilding.isDisplayed());
		Assert.assertTrue(nameofownerbuilding.isEnabled());
		excel.getExcelData(nameofownerbuilding,"Building Details",2,8);
		clickonany.click();
		acceptAlert();
		waitForSomeTime();
		waitForSomeTime();
		excel.getExcelData(nameofownerbuilding,"Building Details",1,8);
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Name of Building".
	 * @author deepak.saini
	 * @since 2018-04-24
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Name of Building')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement nameofbuilding;
	
	public void enterNameOfBuilding() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(nameofbuilding));
		HighlightOnElement(nameofbuilding);
		Assert.assertTrue(nameofbuilding.isDisplayed());
		Assert.assertTrue(nameofbuilding.isEnabled());
		excel.getExcelData(nameofbuilding,"Building Details",2,3);
		clickonany.click();
		acceptAlert();
		waitForSomeTime();
		waitForSomeTime();
		excel.getExcelData(nameofbuilding,"Building Details",1,3);
		waitForSomeTime();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "City".
	 * @author deepak.saini
	 * @since 2018-04-24
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//div[@class='ui-tabs-panels']/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'City')]/../../../../../../following-sibling::td/table/tbody/tr/td/select)[1]")
	private WebElement city;
	
	public void selectCity() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(city));
		HighlightOnElement(city);
		Assert.assertTrue(city.isDisplayed());
		Assert.assertTrue(city.isEnabled());
		SelectVisibleText(city, "Naya Raipur");
		waitForSomeTime();
		waitForSomeTime();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Sector".
	 * @author deepak.saini
	 * @since 2018-04-24
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//div[@class='ui-tabs-panels']/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Sector')]/../../../../../../following-sibling::td/table/tbody/tr/td/select)[1]")
	private WebElement sector;
	
	public void selectSector() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(sector));
		HighlightOnElement(sector);
		Assert.assertTrue(sector.isDisplayed());
		Assert.assertTrue(sector.isEnabled());
		SelectVisibleText(city,"17");
		waitForSomeTime();
		waitForSomeTime();
	}


	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "House Number".
	 * @author deepak.saini
	 * @since 2018-04-24
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//div[@class='ui-tabs-panels']/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'House Number')]/../../../../../../following-sibling::td/table/tbody/tr/td/input)[1]")
	private WebElement housenumber;
	
	public void enterHouseNumber() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(housenumber));
		HighlightOnElement(housenumber);
		Assert.assertTrue(housenumber.isDisplayed());
		Assert.assertTrue(housenumber.isEnabled());
		excel.getExcelData(housenumber,"Building Details",2,5);
		clickonany.click();
		acceptAlert();
		waitForSomeTime();
		waitForSomeTime();
		excel.getExcelData(housenumber,"Building Details",1,5);
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Floor".
	 * @author deepak.saini
	 * @since 2018-04-24
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//div[@class='ui-tabs-panels']/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Floor')]/../../../../../../following-sibling::td/table/tbody/tr/td/input)[1]")
	private WebElement floor;

	public void enterFloor() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(floor));
		HighlightOnElement(floor);
		Assert.assertTrue(floor.isDisplayed());
		Assert.assertTrue(floor.isEnabled());
		excel.getExcelData(floor,"Building Details",2,6);
		clickonany.click();
		acceptAlert();
		waitForSomeTime();
		waitForSomeTime();
		excel.getExcelData(floor,"Building Details",1,6);
	}



	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "pin code".
	 * @author deepak.saini
	 * @since 2018-04-24
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//div[@class='ui-tabs-panels']/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Pin Code')]/../../../../../../following-sibling::td/table/tbody/tr/td/input)[1]")
	private WebElement pin_code;

	public void enterPinCode() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(pin_code));
		HighlightOnElement(pin_code);
		Assert.assertTrue(pin_code.isDisplayed());
		Assert.assertTrue(pin_code.isEnabled());
		excel.getExcelData(pin_code,"Building Details",2,7);
		clickonany.click();
		acceptAlert();
		waitForSomeTime();
		waitForSomeTime();
		excel.getExcelData(pin_code,"Building Details",1,7);
	}

}
