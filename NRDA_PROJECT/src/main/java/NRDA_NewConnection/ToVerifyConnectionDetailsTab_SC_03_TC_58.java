package NRDA_NewConnection;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyConnectionDetailsTab_SC_03_TC_58 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Name of trust/orgaization/school".
	 * @author deepak.saini
	 * @since 2018-04-25
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Name of Trust/Organisation/School')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement trust;

	@FindBy(xpath="//label[contains(text(),'Name of Trust/Organisation/School')]")
	private WebElement clickonany;

	public void enterTrust() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(trust));
		Assert.assertTrue(trust.isDisplayed());
		HighlightOnElement(trust);
		Assert.assertTrue(trust.isEnabled());
		excel.getExcelData(trust,"Connection Details",1,15);
		clickonany.click();
		acceptAlert();
		waitForSomeTime();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Name of bed/employees/students".
	 * @author deepak.saini
	 * @since 2018-04-25
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Number of Bed/Employee/Students')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement bed;

	public void enterNumberOfBed() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(bed));
		Assert.assertTrue(bed.isDisplayed());
		HighlightOnElement(bed);
		Assert.assertTrue(bed.isEnabled());
		excel.getExcelData(bed,"Connection Details",2,16);
		clickonany.click();
		acceptAlert();
		waitForSomeTime();
		waitForSomeTime();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Name of flats".
	 * @author deepak.saini
	 * @since 2018-04-25
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Number of Flats')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement flats;

	public void enterNumberOfFlat() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(flats));
		Assert.assertTrue(flats.isDisplayed());
		HighlightOnElement(flats);
		Assert.assertTrue(flats.isEnabled());
		excel.getExcelData(flats,"Connection Details",2,17);
		clickonany.click();
		acceptAlert();
		waitForSomeTime();
		waitForSomeTime();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Name of Students/Seat/Employees".
	 * @author deepak.saini
	 * @since 2018-04-25
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Number of Students/Seat/Employees')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement seat;

	public void enterNumberOfSeat() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(seat));
		Assert.assertTrue(seat.isDisplayed());
		HighlightOnElement(seat);
		Assert.assertTrue(seat.isEnabled());
		excel.getExcelData(seat,"Connection Details",2,18);
		clickonany.click();
		acceptAlert();
		waitForSomeTime();
		waitForSomeTime();
	}


	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Name of Students/Room/Flats".
	 * @author deepak.saini
	 * @since 2018-04-25
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Number of Students/Room/Flats')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement room;


	public void enterNumberOfRoom() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(room));
		Assert.assertTrue(room.isDisplayed());
		HighlightOnElement(room);
		Assert.assertTrue(room.isEnabled());
		excel.getExcelData(room,"Connection Details",2,19);
		clickonany.click();
		acceptAlert();
		waitForSomeTime();
		waitForSomeTime();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Sewerage connetion number".
	 * @author deepak.saini
	 * @since 2018-04-25
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Sewerage Connection Number')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement connectionnumber;

	public void enterConnectionNumber() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(connectionnumber));
		Assert.assertTrue(connectionnumber.isDisplayed());
		HighlightOnElement(connectionnumber);
		Assert.assertTrue(connectionnumber.isEnabled());
		excel.getExcelData(connectionnumber,"Connection Details",1,20);
		clickonany.click();
		acceptAlert();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Sewerage connetion diameter".
	 * @author deepak.saini
	 * @since 2018-04-25
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Sewerage Connection Diameter')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement connectiondiameter;

	public void enterConnectionDiameter() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(connectiondiameter));
		Assert.assertTrue(connectiondiameter.isDisplayed());
		HighlightOnElement(connectiondiameter);
		Assert.assertTrue(connectiondiameter.isEnabled());
		excel.getExcelData(connectiondiameter,"Connection Details",1,21);
		clickonany.click();
		acceptAlert();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "connetion size".
	 * @author deepak.saini
	 * @since 2018-04-25
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Connection Size')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement connectionsize;

	public void enterConnectionSize() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(connectionsize));
		Assert.assertTrue(connectionsize.isDisplayed());
		HighlightOnElement(connectionsize);
		Assert.assertTrue(connectionsize.isEnabled());
		excel.getExcelData(connectionsize,"Connection Details",1,22);
		clickonany.click();
		acceptAlert();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Site Plan Showing Proposed Sewerage Connection".
	 * @author deepak.saini
	 * @since 2018-04-25
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Site Plan Showing Proposed Sewerage Connection')]/../../../../../../following-sibling::td/table/tbody/tr/td/span/div/div/label")
	private WebElement siteplan;

	public void uploadSitePlan() throws InterruptedException, AWTException
	{
		wait.until(ExpectedConditions.visibilityOf(siteplan));
		Assert.assertTrue(siteplan.isDisplayed());
		HighlightOnElement(siteplan);
		waitForSomeTime();
		siteplan.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\DocumentFormat\\CSVFormat.csv");
		waitForSomeTime();
		waitForSomeTime();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Error message".
	 * @author deepak.saini
	 * @since 2018-04-25
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-growl-message']/span[contains(text(),'Please select actual file, changed extension and .exe not allowed.')]")
	private WebElement errormsg;
	
	public void getErrormsg()
	{
		String actualmsg="Please select actual file, changed extension and .exe not allowed.";
		Assert.assertTrue(errormsg.isDisplayed());
		HighlightOnElement(errormsg);
		String expected=errormsg.getText();
		Assert.assertEquals(actualmsg, expected,"test case pass");
		Reporter.log("Error message:"+expected,true);
	}

}
