package NRDA_NewConnection;

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
import org.testng.Reporter;
import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;


public class ToVerifyBuildingDetailsTab_SC_03_TC_21 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Property ID ICon".
	 * @author deepak.saini
	 * @since 2017-08-22
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Property ID')]/../../../../../../following-sibling::td/table/tbody/tr/td/a/img")
	private WebElement propertyidicon;

	public void clickOnPropertyIDIcon() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(propertyidicon));
		Assert.assertTrue(propertyidicon.isDisplayed());
		Assert.assertTrue(propertyidicon.isEnabled());
		propertyidicon.click();
		Reporter.log("Go to 'Property ID' field , click on icon shown below",true);
		waitForSomeTime();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Plot Number ".
	 * @author deepak.saini
	 * @since 2018-04-24
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:dlg_propertySearch']/div/div/div/span/table/tbody/tr/td/label[contains(text(),'Plot No')]/../following-sibling::td/input[@title='Plot No']")
	private WebElement plotno;
	
	public void enterPlotNumber() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.elementToBeClickable(plotno));
		HighlightOnElement(plotno);
		Assert.assertTrue(plotno.isDisplayed());
		Assert.assertTrue(plotno.isEnabled());
		excel.getExcelData(plotno,"Building Details",1,12);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Search button".
	 * @author deepak.saini
	 * @since 2017-08-22
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:dlg_propertySearch']/div/div/div/span/center/button/span[contains(text(),'Search')]")
	private WebElement searchbutton;
	
	public void clickOnSearch() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(searchbutton));
		HighlightOnElement(searchbutton);
		Assert.assertTrue(searchbutton.isDisplayed());
		Assert.assertTrue(searchbutton.isEnabled());
		searchbutton.click();
		Reporter.log("Click on Search",true);
		waitForSomeTime();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select data ".
	 * @author deepak.saini
	 * @since 2018-04-24
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:dlg_propertySearch']/div/div/div/span/div/div/table/tbody/tr/td/div")
	private WebElement data;
	
	public void selectPropertyIdData()
	{
		wait.until(ExpectedConditions.elementToBeClickable(data));
		HighlightOnElement(data);
		Actions act=new Actions(driver);
		act.click(data).build().perform();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "fill in form".
	 * @author deepak.saini
	 * @since 2018-04-24
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'Fill in Form')])[1]")
	private WebElement fillinform;
	
	public void clickOnFillInForm() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(fillinform));
		wait.until(ExpectedConditions.elementToBeClickable(fillinform));
		Assert.assertTrue(fillinform.isDisplayed());
		HighlightOnElement(fillinform);
		Assert.assertTrue(fillinform.isEnabled());
		fillinform.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select yes ".
	 * @author deepak.saini
	 * @since 2018-04-24
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div[2]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Is Correspondence Address Same as above?')]/../../../../../../following-sibling::td/table/tbody/tr/td/select")
	private WebElement yes;

	public void selectCorrespondenceAddressYes() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(yes));
		wait.until(ExpectedConditions.elementToBeClickable(yes));
		Assert.assertTrue(yes.isDisplayed());
		HighlightOnElement(yes);
		Assert.assertTrue(yes.isEnabled());
		SelectVisibleText(yes,"Yes / हाँ");
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	}

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "HouseNumber_Field"
	 * @author sarvesh.nellore5
	 * @Date: 16-08-2017
	 */
	/****************************************************************************************************/		
	@FindBy(xpath="(//div[@class='ui-tabs-panels']/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'House Number')]/../../../../../../following-sibling::td/table/tbody/tr/td/input)[1]")
	private WebElement HouseNumber_Field1;	



	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Floor_Field"
	 * @author sarvesh.nellore5
	 * @Date: 16-08-2017
	 */
	/****************************************************************************************************/		
	@FindBy(xpath="(//div[@class='ui-tabs-panels']/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Floor')]/../../../../../../following-sibling::td/table/tbody/tr/td/input)[1]")
	private WebElement Floor_Field1;


	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Pincode_Field"
	 * @author sarvesh.nellore5
	 * @Date: 16-08-2017
	 */
	/****************************************************************************************************/		
	@FindBy(xpath="(//div[@class='ui-tabs-panels']/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Pin Code')]/../../../../../../following-sibling::td/table/tbody/tr/td/input)[1]")
	private WebElement Pincode_Field1;

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "HouseNumber_Field"
	 * @author sarvesh.nellore5
	 * @Date: 16-08-2017
	 */
	/****************************************************************************************************/		
	@FindBy(xpath="(//div[@class='ui-tabs-panels']/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'House Number')]/../../../../../../following-sibling::td/table/tbody/tr/td/input)[2]")
	private WebElement HouseNumber2_Field;	


	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Floor_Field"
	 * @author sarvesh.nellore5
	 * @Date: 16-08-2017
	 */
	/****************************************************************************************************/		
	@FindBy(xpath="(//div[@class='ui-tabs-panels']/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Floor')]/../../../../../../following-sibling::td/table/tbody/tr/td/input)[2]")
	private WebElement Floor2_Field;	


	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Pincode_Field"
	 * @author sarvesh.nellore5
	 * @Date: 16-08-2017
	 */
	/****************************************************************************************************/		
	@FindBy(xpath="(//div[@class='ui-tabs-panels']/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Pin Code')]/../../../../../../following-sibling::td/table/tbody/tr/td/input)[2]")
	private WebElement Pincode2_Field;



	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "sector"
	 * @author sarvesh.nellore5
	 * @Date: 16-08-2017
	 */
	/****************************************************************************************************/		
	@FindBy(xpath="(//div[@class='ui-tabs-panels']/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Sector')]/../../../../../../following-sibling::td/table/tbody/tr/td/select)[1]")
	private WebElement sector1_Field;

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "sector"
	 * @author sarvesh.nellore5
	 * @Date: 16-08-2017
	 */
	/****************************************************************************************************/		
	@FindBy(xpath="(//div[@class='ui-tabs-panels']/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Sector')]/../../../../../../following-sibling::td/table/tbody/tr/td/select)[2]")
	private WebElement sector2_Field;

	public void verifyBuildingDetailsAsTenant() throws InterruptedException
	{
		//Comparing HouseNumber Field
		HighlightOnElement(HouseNumber2_Field);
		HighlightOnElement(HouseNumber_Field1);
		String HouseActual_Text=HouseNumber_Field1.getAttribute("value");
		String HouseExpected_Text=HouseNumber2_Field.getAttribute("value");
		Assert.assertEquals(HouseExpected_Text,HouseActual_Text);
		Reporter.log("Both House Numbers are same",true);
		waitForSomeTime();

		//Comparing Floor Field
		HighlightOnElement(Floor2_Field);
		HighlightOnElement(Floor_Field1);
		String FloorActual_Value=Floor_Field1.getAttribute("value");
		String FloorExpected_Value=Floor2_Field.getAttribute("value");
		Assert.assertEquals( FloorExpected_Value,FloorActual_Value);
		Reporter.log("Both Floors are same",true);
		waitForSomeTime();

		//Comparing Sector Field
		HighlightOnElement(sector2_Field);
		HighlightOnElement(sector1_Field);
		String sectorActual_Value=sector1_Field.getAttribute("value");
		String sectorExpected_Value=sector2_Field.getAttribute("value");
		Assert.assertEquals(sectorExpected_Value,sectorActual_Value);
		Reporter.log("Both Sector Values are same",true);
		waitForSomeTime();

		//Comparing pin Field
		HighlightOnElement(Pincode2_Field);
		HighlightOnElement(Pincode_Field1);
		String PincodeActual_Value=Pincode_Field1.getAttribute("value");
		String PincodeExpected_Value=Pincode2_Field.getAttribute("value");
		Assert.assertEquals( PincodeExpected_Value,PincodeActual_Value);
		Reporter.log("Both Pincode Values are same",true);
		waitForSomeTime();
	}
}
