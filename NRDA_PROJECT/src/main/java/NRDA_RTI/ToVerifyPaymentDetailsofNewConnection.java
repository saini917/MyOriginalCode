/**
 * 
 */
package NRDA_RTI;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;


import GenericLibrary.ExcelDataDriver;
import GenericLibrary.CommonLibrary;

/**
 * @author Sarvesh.Nellore
 * @Date: 19-09-2017
 * @purpose: ToVerify Payment of NewConnection
 *
 */
public class ToVerifyPaymentDetailsofNewConnection  extends CommonLibrary


{

	ExcelDataDriver excel=new ExcelDataDriver();

	Logger log=Logger.getLogger("devpinoyLogger");



	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "All Fields NAME"
	 * @author sarvesh.nellore
	 * @Date: 16-08-2017
	 */
	/****************************************************************************************************/	
	@FindBy(xpath="html/body/form/div[1]/table/tbody/tr/td[2]/span/span/span/div/div[2]/table[1]/tbody/tr/td[1]/label")
	//@FindBy(xpath="//table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label")
	private List<WebElement> AllFields_Name;


	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Application Number"
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/	
	@FindBy(xpath="(//table/tbody/tr/td[2]/label)[1]")
	private WebElement Application_Number;


	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Applicant Name"
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/	
	@FindBy(xpath="(//table/tbody/tr/td[2]/label)[2]")
	private WebElement Applicant_Name;

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Date Of Application"
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/	
	@FindBy(xpath="(//table/tbody/tr[3]/td[2])[1]")
	private WebElement DateOfApplication;

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Service Name"
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/	
	@FindBy(xpath="(//table/tbody/tr/td[2]/label)[3]")
	private WebElement Service_Name;

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Total Fees"
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/	
	@FindBy(xpath="(//table/tbody/tr/td[2]/label)[4]")
	private WebElement Total_Fees;

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Make Payment"
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/	
	@FindBy(xpath="//button[contains(.,'Make Payment') and@type='submit']")
	private WebElement MakePayment_Button;




	public void ToVerifyApplicantable_successfull_makepayment01() throws InterruptedException
	{

		waitForSomeTime();
		//Assert.assertEquals(true,((WebElement) AllFields_Name).isDisplayed());
		//Assert.assertNotNull(AllFields_Name,"To verify all Text field is displayed");
		for(int index=0;index<AllFields_Name.size();index++)
		{

			String allUploadbuttons=AllFields_Name.get(index).getText();
			//Assert.assertEquals(true,((WebElement) AllFields_Name).isDisplayed());
			Reporter.log("to verify the field is present:"+allUploadbuttons,true);
			log.info("To Verify all the fields are available");
		}
		HighlightOnElement(PaymentMode_Dropdown);
		SelectVisibleText(PaymentMode_Dropdown, "Pay Online");
		waitForSomeTime();
		Assert.assertEquals(true,MakePayment_Button.isEnabled());
		HighlightOnElement(MakePayment_Button);
		Reporter.log("MakePayment Button  Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 
		waitForSomeTime();

	}

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Card Number"
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/	
	@FindBy(xpath="//input[@id='ccard_number' and @type='text']")
	private WebElement Card_Number;


	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Card On Name"
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/	
	@FindBy(xpath="//input[@id='cname_on_card' and@type='text']")
	private WebElement Cardon_Name;

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "CVV Number"
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/	
	@FindBy(xpath="//input[@id='ccvv_number' and @type='password']")
	private WebElement Cvv_Number;

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "ExperidateMonth"
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/	
	@FindBy(xpath="//select[@id='cexpiry_date_month']")
	private WebElement Card_ExpiryMonth;


	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "ExperidateYear"
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/	
	@FindBy(xpath="//select[@id='cexpiry_date_year']")
	private WebElement Card_ExpiryYear;


	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "PayNow Button"
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/	
	@FindBy(xpath="//input[@id='pay_button' and @type='submit']")
	private WebElement PayNow_Button;


	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "BackTo_PreviousPage"
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/	
	@FindBy(xpath="//a[contains(.,'Click here to go back')]")
	private WebElement BackTo_PreviousPage;
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/table[1]/tbody/tr/td/select")
	private WebElement PaymentMode_Dropdown;
	
	@FindBy(xpath="//ul[@class='clearfix ui-tabs-nav ui-helper-reset ui-helper-clearfix ui-widget-header ui-corner-all']/li/a")
	private List<WebElement> PaymentTypes;
	
	public void ToVerifypaymentmodeOnline() throws InterruptedException

	{
		
		HighlightOnElement(PaymentMode_Dropdown);
		SelectVisibleText(PaymentMode_Dropdown, "Pay Online");

		waitForSomeTime();
		Assert.assertEquals(true,MakePayment_Button.isEnabled());
		HighlightOnElement(MakePayment_Button);
		
	}
	
	
	public void ToVerifypaymenttypes() throws InterruptedException

	{
		
		HighlightOnElement(PaymentMode_Dropdown);
		SelectVisibleText(PaymentMode_Dropdown, "Pay Online");

		waitForSomeTime();
		Assert.assertEquals(true,MakePayment_Button.isEnabled());
		HighlightOnElement(MakePayment_Button);
		MakePayment_Button.click();
		Reporter.log("MakePayment Button  Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		
		waitForSomeTime();
		for(WebElement MenuInPaymentTypes:PaymentTypes)
		{
			
			if(MenuInPaymentTypes.isDisplayed())
			{
				HighlightOnElement(MenuInPaymentTypes);
				String DashBoardMenu=MenuInPaymentTypes.getText();
				Reporter.log("RTI Payment Types  Are:"+DashBoardMenu,true);
			}
			
		}
		
		waitForSomeTime();
		Assert.assertEquals(true,BackTo_PreviousPage.isEnabled());
		HighlightOnElement(BackTo_PreviousPage);
		BackTo_PreviousPage.click();
		waitForSomeTime();
		Reporter.log("BackTo_PreviousPage Link on  Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 
		waitForSomeTime();		
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		
		
		
		
		
	}



	public void ToVerifyFunctionalityofMakePayment02() throws InterruptedException

	{
		
		HighlightOnElement(PaymentMode_Dropdown);
		SelectVisibleText(PaymentMode_Dropdown, "Pay Online");

		waitForSomeTime();
		Assert.assertEquals(true,MakePayment_Button.isEnabled());
		HighlightOnElement(MakePayment_Button);
		MakePayment_Button.click();
		Reporter.log("MakePayment Button  Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();

		waitForSomeTime();
		Assert.assertEquals(true,Card_Number.isEnabled());
		HighlightOnElement(Card_Number);
		Reporter.log("Card Number on  Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 
		waitForSomeTime();


		waitForSomeTime();
		Assert.assertEquals(true,Cardon_Name.isEnabled());
		HighlightOnElement(Cardon_Name);
		Reporter.log("Card on Name Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 
		waitForSomeTime();	

		waitForSomeTime();
		Assert.assertEquals(true,Cvv_Number.isEnabled());
		HighlightOnElement(Cvv_Number);
		Reporter.log("CVV Number on  Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 
		waitForSomeTime();	

		waitForSomeTime();
		Assert.assertEquals(true,Card_ExpiryMonth.isEnabled());
		HighlightOnElement(Card_ExpiryMonth);
		Reporter.log("Card_ExpiryMonth Dropdown on  Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		Assert.assertEquals(true,Card_ExpiryYear.isEnabled());
		HighlightOnElement(Card_ExpiryYear);
		Reporter.log("Card_ExpiryYear Dropdown on  Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 
		waitForSomeTime();	

		waitForSomeTime();
		Assert.assertEquals(true,PayNow_Button.isEnabled());
		HighlightOnElement(PayNow_Button);
		Reporter.log("PayNow_Button Button on  Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 
		waitForSomeTime();		


		waitForSomeTime();
		Assert.assertEquals(true,BackTo_PreviousPage.isEnabled());
		HighlightOnElement(BackTo_PreviousPage);
		BackTo_PreviousPage.click();
		waitForSomeTime();
		Reporter.log("BackTo_PreviousPage Link on  Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 
		waitForSomeTime();		
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();

	}

	public void  ApplicationSubmitMakePaymentWith_ValidData03() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		try
		{
			
			HighlightOnElement(PaymentMode_Dropdown);
			SelectVisibleText(PaymentMode_Dropdown, "Pay Online");
			waitForSomeTime();
			Assert.assertTrue(MakePayment_Button.isEnabled(),"Test case pass");
			HighlightOnElement(MakePayment_Button);
			MakePayment_Button.click();
			Reporter.log("MakePayment Button  Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 
			waitForSomeTime();

			
			Assert.assertEquals(true,Card_Number.isEnabled());
			HighlightOnElement(Card_Number);
			excel.getExcelData(Card_Number, "Card Details", 1, 1);
			Reporter.log("Card Number on  Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 

			Assert.assertEquals(true,Cardon_Name.isEnabled());
			HighlightOnElement(Cardon_Name);
			excel.getExcelData(Cardon_Name, "Card Details", 1, 2);
			Reporter.log("Card on Name Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 	

			Assert.assertEquals(true,Cvv_Number.isEnabled());
			HighlightOnElement(Cvv_Number);
			excel.getExcelData(Cvv_Number, "Card Details", 1, 3);
			Reporter.log("CVV Number on  Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 

			Assert.assertEquals(true,Card_ExpiryMonth.isEnabled());
			HighlightOnElement(Card_ExpiryMonth);
			SelectVisibleText(Card_ExpiryMonth, "May (5)");
			Reporter.log("Card_ExpiryMonth Dropdown on  Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 
		
			Assert.assertEquals(true,Card_ExpiryYear.isEnabled());
			HighlightOnElement(Card_ExpiryYear);
			SelectByValue(Card_ExpiryYear, "2020");
			Reporter.log("Card_ExpiryYear Dropdown on  Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 	


			waitForSomeTime();
			Assert.assertEquals(true,PayNow_Button.isEnabled());
			HighlightOnElement(PayNow_Button);
			PayNow_Button.click();
			Reporter.log("PayNow_Button Button on  Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();

		}
		catch(Exception ex)
		{
			ex.getMessage();
		}

	}

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "BackTo_PreviousPage"
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/	
	@FindBy(xpath="//label[contains(.,'Invalid credit card number.')]")
	private WebElement Invalid_CardNumber;



	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Service Name"
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/	
	@FindBy(xpath="(//table/tbody/tr/td[2]/label)[4]")
	private WebElement Transaction_Status;

	public void  applicationSubmitMakePaymentWith_InValidCardNumber04() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		try
		{
			HighlightOnElement(PaymentMode_Dropdown);
			SelectVisibleText(PaymentMode_Dropdown, "Pay Online");
			waitForSomeTime();
			Assert.assertEquals(true,MakePayment_Button.isEnabled());
			HighlightOnElement(MakePayment_Button);
			MakePayment_Button.click();
			Reporter.log("MakePayment Button  Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();

			waitForSomeTime();
			Assert.assertEquals(true,Card_Number.isEnabled());
			HighlightOnElement(Card_Number);
			excel.getExcelData(Card_Number, "Card Details", 2, 1);
			Reporter.log("Card Number on  Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 
			waitForSomeTime();



			waitForSomeTime();
			Assert.assertEquals(true,Cardon_Name.isEnabled());
			HighlightOnElement(Cardon_Name);
			excel.getExcelData(Cardon_Name, "Card Details", 2, 2);
			Reporter.log("Card on Name Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 
			waitForSomeTime();	

			waitForSomeTime();
			Assert.assertEquals(true,Cvv_Number.isEnabled());
			HighlightOnElement(Cvv_Number);
			excel.getExcelData(Cvv_Number, "Card Details", 2, 3);
			Reporter.log("CVV Number on  Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 
			waitForSomeTime();

			waitForSomeTime();
			Assert.assertEquals(true,Card_ExpiryMonth.isEnabled());
			HighlightOnElement(Card_ExpiryMonth);
			SelectVisibleText(Card_ExpiryMonth, "May (5)");
			Reporter.log("Card_ExpiryMonth Dropdown on  Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 
			waitForSomeTime();
			waitForSomeTime();
			Assert.assertEquals(true,Card_ExpiryYear.isEnabled());
			HighlightOnElement(Card_ExpiryYear);
			SelectByValue(Card_ExpiryYear, "2020");
			Reporter.log("Card_ExpiryYear Dropdown on  Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 
			waitForSomeTime();	


			waitForSomeTime();
			Assert.assertEquals(true,PayNow_Button.isEnabled());
			HighlightOnElement(PayNow_Button);
			PayNow_Button.click();
			Reporter.log("PayNow_Button Button on  Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 
			waitForSomeTime();

			HighlightOnElement(Invalid_CardNumber);
			Assert.assertEquals(true,Invalid_CardNumber.isEnabled());
			String Expected_Message="Invalid credit card number.";
			String Actual_Message=Invalid_CardNumber.getText();
			Assert.assertEquals(Expected_Message, Actual_Message);
			waitForSomeTime();

			waitForSomeTime();
			Assert.assertEquals(true,BackTo_PreviousPage.isEnabled());
			HighlightOnElement(BackTo_PreviousPage);
			BackTo_PreviousPage.click();
			waitForSomeTime();
			Reporter.log("BackTo_PreviousPage Link on  Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 
			waitForSomeTime();		
			waitForSomeTime();
			waitForSomeTime();

			HighlightOnElement(Transaction_Status);
			String Expected_Message1="Failed";
			String Actual_Message1=Transaction_Status.getText();
			Assert.assertEquals(Expected_Message1, Actual_Message1);
			waitForSomeTime();
			waitForSomeTime();




		}
		catch(Exception ex)
		{
			ex.getMessage();
		}

	}


	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "BackTo_PreviousPage"
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/	
	@FindBy(xpath="//label[contains(.,'Invalid CVV number.')]")
	private WebElement Invalid_CVVNumber;


	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "BackTo_PreviousPage"
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/	
	@FindBy(xpath="//label[contains(.,'Please select date')]")
	private WebElement PleaseSelectDate;


	public void  applicationSubmitMakePaymentWith_BlankFields05() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		try
		{
			
			HighlightOnElement(PaymentMode_Dropdown);
			SelectVisibleText(PaymentMode_Dropdown, "Pay Online");
			waitForSomeTime();
			Assert.assertEquals(true,MakePayment_Button.isEnabled());
			HighlightOnElement(MakePayment_Button);
			MakePayment_Button.click();
			Reporter.log("MakePayment Button  Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();

			waitForSomeTime();
			Assert.assertEquals(true,Card_Number.isEnabled());
			HighlightOnElement(Card_Number);
			//excel.getExcelData(Card_Number, "Card Details", 2, 1);
			Reporter.log("Card Number on  Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 
			waitForSomeTime();



			waitForSomeTime();
			Assert.assertEquals(true,Cardon_Name.isEnabled());
			HighlightOnElement(Cardon_Name);
			//excel.getExcelData(Cardon_Name, "Card Details", 2, 2);
			Reporter.log("Card on Name Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 
			waitForSomeTime();	

			waitForSomeTime();
			Assert.assertEquals(true,Cvv_Number.isEnabled());
			HighlightOnElement(Cvv_Number);
			//excel.getExcelData(Cvv_Number, "Card Details", 2, 3);
			Reporter.log("CVV Number on  Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 
			waitForSomeTime();

			waitForSomeTime();
			Assert.assertEquals(true,Card_ExpiryMonth.isEnabled());
			HighlightOnElement(Card_ExpiryMonth);
			//SelectVisibleText(Card_ExpiryMonth, "May (5)");
			Reporter.log("Card_ExpiryMonth Dropdown on  Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 
			waitForSomeTime();
			waitForSomeTime();
			Assert.assertEquals(true,Card_ExpiryYear.isEnabled());
			HighlightOnElement(Card_ExpiryYear);
			//SelectByValue(Card_ExpiryYear, "2020");
			Reporter.log("Card_ExpiryYear Dropdown on  Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 
			waitForSomeTime();	


			waitForSomeTime();
			Assert.assertEquals(true,PayNow_Button.isEnabled());
			HighlightOnElement(PayNow_Button);
			PayNow_Button.click();
			Reporter.log("PayNow_Button Button on  Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 
			waitForSomeTime();

			HighlightOnElement(Invalid_CardNumber);
			Assert.assertEquals(true,Invalid_CardNumber.isEnabled());
			String Expected_Message="Invalid credit card number.";
			String Actual_Message=Invalid_CardNumber.getText();
			Assert.assertEquals(Expected_Message, Actual_Message);
			waitForSomeTime();

			HighlightOnElement(Invalid_CVVNumber);
			Assert.assertEquals(true,Invalid_CVVNumber.isEnabled());
			String Expected_Message2="Invalid CVV number.";
			String Actual_Message2=Invalid_CVVNumber.getText();
			Assert.assertEquals(Expected_Message2, Actual_Message2);
			waitForSomeTime();

			HighlightOnElement(PleaseSelectDate);
			Assert.assertEquals(true,PleaseSelectDate.isEnabled());
			String Expected_Message4="Please select date";
			String Actual_Message4=PleaseSelectDate.getText();
			Assert.assertEquals(Expected_Message4, Actual_Message4);
			waitForSomeTime();

			waitForSomeTime();
			Assert.assertEquals(true,BackTo_PreviousPage.isEnabled());
			HighlightOnElement(BackTo_PreviousPage);
			BackTo_PreviousPage.click();
			waitForSomeTime();
			Reporter.log("BackTo_PreviousPage Link on  Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 
			waitForSomeTime();		
			waitForSomeTime();
			waitForSomeTime();

			HighlightOnElement(Transaction_Status);
			String Expected_Message1="Failed";
			String Actual_Message1=Transaction_Status.getText();
			Assert.assertEquals(Expected_Message1, Actual_Message1);
			waitForSomeTime();
			waitForSomeTime();

		}
		catch(Exception ex)
		{
			ex.getMessage();
		}

	}



	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Pending Payment Details"
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/	
	@FindBy(xpath="//a[contains(.,'Pending For Payment/भुगतान हेतु अपूर्ण')]")
	private WebElement PendingPaymentDetails;



	@FindBy(xpath="//a[contains(.,'WATER AND SEWERAGE CONNECTION')]")
	private WebElement WaterAndSewerageConnection;


	@FindBy(xpath="(//button[contains(.,'Proceed to Payment') and @type='submit'])[1]")
	private WebElement ProceedToPayment;



	public void PendingPaymentDetails() throws InterruptedException
	{
		HighlightOnElement(PendingPaymentDetails);
		PendingPaymentDetails.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(WaterAndSewerageConnection);
		WaterAndSewerageConnection.click();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(ProceedToPayment);
		ProceedToPayment.click();
		waitForSomeTime();
		waitForSomeTime();



	}


	public void  applicationSubmitMakePaymentWith_InValidDetails06() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		try
		{
			
			HighlightOnElement(PaymentMode_Dropdown);
			SelectVisibleText(PaymentMode_Dropdown, "Pay Online");
			waitForSomeTime();
			Assert.assertEquals(true,MakePayment_Button.isEnabled());
			HighlightOnElement(MakePayment_Button);
			MakePayment_Button.click();
			Reporter.log("MakePayment Button  Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();

			waitForSomeTime();
			Assert.assertEquals(true,Card_Number.isEnabled());
			HighlightOnElement(Card_Number);
			excel.getExcelData(Card_Number, "Card Details", 1, 1);
			Reporter.log("Card Number on  Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 
			waitForSomeTime();



			waitForSomeTime();
			Assert.assertEquals(true,Cardon_Name.isEnabled());
			HighlightOnElement(Cardon_Name);
			excel.getExcelData(Cardon_Name, "Card Details", 3, 2);
			Reporter.log("Card on Name Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 
			waitForSomeTime();	

			waitForSomeTime();
			Assert.assertEquals(true,Cvv_Number.isEnabled());
			HighlightOnElement(Cvv_Number);
			excel.getExcelData(Cvv_Number, "Card Details", 2, 3);
			Reporter.log("CVV Number on  Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 
			waitForSomeTime();

			waitForSomeTime();
			Assert.assertEquals(true,Card_ExpiryMonth.isEnabled());
			HighlightOnElement(Card_ExpiryMonth);
			SelectVisibleText(Card_ExpiryMonth, "Jul (7)");
			Reporter.log("Card_ExpiryMonth Dropdown on  Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 
			waitForSomeTime();
			waitForSomeTime();
			Assert.assertEquals(true,Card_ExpiryYear.isEnabled());
			HighlightOnElement(Card_ExpiryYear);
			SelectByValue(Card_ExpiryYear, "2019");
			Reporter.log("Card_ExpiryYear Dropdown on  Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 
			waitForSomeTime();	


			waitForSomeTime();
			Assert.assertEquals(true,PayNow_Button.isEnabled());
			HighlightOnElement(PayNow_Button);
			PayNow_Button.click();
			Reporter.log("PayNow_Button Button on  Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();


			HighlightOnElement(Transaction_Status);
			String Expected_Message1="Failed";
			String Actual_Message1=Transaction_Status.getText();
			Assert.assertEquals(Expected_Message1, Actual_Message1);
			waitForSomeTime();
			waitForSomeTime();

		}
		catch(Exception ex)
		{
			ex.getMessage();
		}

	}

}
