package NRDA_NewConnection;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyBuildingDetailsTab_SC_03_TC_22 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Corresspondence address".
	 * @author deepak.saini
	 * @since 2017-08-22
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Is Correspondence Address Same as above')]/../../../../../../following-sibling::td/table/tbody/tr/td/select")
	private WebElement correspondenceAddress;

	public void selectCorresspondenceAddressNo() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(correspondenceAddress));
		HighlightOnElement(correspondenceAddress);
		Assert.assertTrue(correspondenceAddress.isDisplayed());
		Assert.assertTrue(correspondenceAddress.isEnabled());
		SelectVisibleText(correspondenceAddress,"No / नहीं");
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
		Assert.assertNotEquals( HouseExpected_Text,HouseActual_Text);
		Reporter.log("Both House Numbers are not same",true);
		waitForSomeTime();

		//Comparing Floor Field
		HighlightOnElement(Floor2_Field);
		HighlightOnElement(Floor_Field1);
		String FloorActual_Value=Floor_Field1.getAttribute("value");
		String FloorExpected_Value=Floor2_Field.getAttribute("value");
		Assert.assertNotEquals(FloorExpected_Value,FloorActual_Value);
		Reporter.log("Both Floor are not same",true);
		waitForSomeTime();

		//Comparing pin code Field
		HighlightOnElement(Pincode2_Field);
		HighlightOnElement(Pincode_Field1);
		String PincodeActual_Value=Pincode_Field1.getAttribute("value");
		String PincodeExpected_Value=Pincode2_Field.getAttribute("value");
		Assert.assertNotEquals(PincodeExpected_Value,PincodeActual_Value);
		Reporter.log("Both Pincode Values are not same",true);
		waitForSomeTime();


		//Comparing Sector Field
		HighlightOnElement(sector2_Field);
		HighlightOnElement(sector1_Field);
		String sectorActual_Value=sector1_Field.getAttribute("value");
		String sectorExpected_Value=sector2_Field.getAttribute("value");
		Assert.assertNotEquals(sectorExpected_Value,sectorActual_Value);
		Reporter.log("Both Sector Values are not same",true);
		waitForSomeTime();
}
}
