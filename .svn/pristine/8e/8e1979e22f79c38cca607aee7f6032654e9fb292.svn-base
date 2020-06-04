/**
 * 
 */
package NRDA_ENVIRONMENT;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;


/**
 * @author Sarvesh.Nellore
 * @Date: 16-12-2017
 */
public class ToverifyFunctionalityof_EnvironmentSection_Loginas_CEO extends CommonLibrary 
{
	Logger log=Logger.getLogger("devpinoyLogger");
	ExcelDataDriver excel=new ExcelDataDriver();
	
	
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[contains(.,'Home')]")
	private WebElement Home_Icon;
	
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[contains(.,'Pending Application')]")
	private WebElement PendingApplication_Icon;
	
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[contains(.,'Approve/Reject Application')]")
	private WebElement ApproveorRejectApplication_Icon;
	
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[contains(.,'Payment Collection')]")
	private WebElement PaymentCollection_Icon;
	
	
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[contains(.,'Invoice Collection')]")
	private WebElement InvoiceCollection_Icon;
	
	
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[contains(.,'Application Form')]")
	private WebElement ApplicationForm_Icon;
	
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[contains(.,'MIS Reports')]")
	private WebElement MisReport_Icon;
	
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[contains(.,'Case List')]")
	private WebElement CaseList_Icon;
	
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[contains(.,'Process Legal Invoice')]")
	private WebElement ProcessLegalInvoice_Icon;
	
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[contains(.,'Manage Advocate')]")
	private WebElement ManageAdvocate_Icon;
	
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[contains(.,'Meeting Management')]")
	private WebElement MeetingManagement_Icon;
	
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[contains(.,'File Management')]")
	private WebElement FileManagement_Icon;
	
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li")
	private  List<WebElement> homepagedisplay;
	
	
	@FindBy(xpath="//table[@style='width:100%;']/tbody/tr/td/div/h3/a")
	private List <WebElement> Menu_DashBoard;
	
	public void toverifyDashBoardMenu_SC_08_TC_01() throws InterruptedException
	 {
	  try
		{ 
		HighlightOnElement(Home_Icon);
		Assert.assertEquals(true,Home_Icon.isEnabled());
		System.out.println(" To Verify Home_Icon Link in Application of Water&Sewerage link is Present" ); //print for eclipse console

		HighlightOnElement(PendingApplication_Icon);
		Assert.assertEquals(true,PendingApplication_Icon.isEnabled());
		System.out.println(" To Verify PendingApplication_Icon Link in Application of Water&Sewerage link is Present" ); //print for eclipse console

	
		HighlightOnElement(ApproveorRejectApplication_Icon);
		Assert.assertEquals(true,ApproveorRejectApplication_Icon.isEnabled());
		System.out.println(" To Verify ApprovceRejectApplication_Icon Link in Application of Water&Sewerage link is Present" ); //print for eclipse console

		
		HighlightOnElement(InvoiceCollection_Icon);
		Assert.assertEquals(true,InvoiceCollection_Icon.isEnabled());
		System.out.println(" To Verify InvoiceCollection_Icon Link in Application of Water&Sewerage link is Present" ); //print for eclipse console

	
		HighlightOnElement(PaymentCollection_Icon);
		Assert.assertEquals(true,PaymentCollection_Icon.isEnabled());
		System.out.println(" To Verify PaymentCollection_Icon Link in Application of Water&Sewerage link is Present" ); //print for eclipse console
		
	
		HighlightOnElement(MisReport_Icon);
		Assert.assertEquals(true,MisReport_Icon.isEnabled());
		System.out.println(" To Verify MisReports_Icon Link in Application of Water&Sewerage link is Present" ); //print for eclipse console

		HighlightOnElement(FileManagement_Icon);
		Assert.assertEquals(true,FileManagement_Icon.isEnabled());
		System.out.println(" To Verify FileManagement_Icon Link in Application of Water&Sewerage link is Present" ); //print for eclipse console

	
		HighlightOnElement(MeetingManagement_Icon);
		Assert.assertEquals(true,MeetingManagement_Icon.isEnabled());
		System.out.println(" To Verify MeetingManagement_Icon Link in Application of Water&Sewerage link is Present" ); //print for eclipse console

	}

	catch(Exception ex)
	{
		ex.printStackTrace();
	}
 }
	
	public void toVerifyPendingApplicationLink_SC_08_TC_02() throws InterruptedException
	{
		waitForSomeTime();
		HighlightOnElement(PendingApplication_Icon);
		Assert.assertTrue(PendingApplication_Icon.isEnabled(),"Test Case Pass: PendingApplication_Icon");
		PendingApplication_Icon.click();
		waitForSomeTime();
		waitForelementPresent(entervalueinsearchbox);
		HighlightOnElement(entervalueinsearchbox);
		System.out.println(" To Click on PendingApplication_Icon Link in Application of Water&Sewerage  Successfully" ); //print for eclipse console
		
	}
	
	@FindBy(xpath="//h3[@class='ui-accordion-header ui-helper-reset ui-state-default ui-state-active ui-corner-top']/a")
	private List <WebElement> HeadingsInPendingApplication;
	
	@FindBy(xpath="//a[contains(.,'ENVIRONMENT NOC')]/../following-sibling::div/div/div[1]/table/thead/tr/th")
	private List <WebElement> EnvironmentNOC_Menu;
	
	public void toVerifyPendingApplicationMenulist() throws InterruptedException
	{
		
		waitForSomeTime();
		for(WebElement menulist:HeadingsInPendingApplication)
		{
			HighlightOnElement(menulist);
			Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
			if(menulist.isDisplayed())
			{
				String Menu=menulist.getText();
				System.out.println(" Menu list Pending Application Is:"+Menu );
			}

		}
		waitForSomeTime();
		waitForSomeTime();
		
		waitForSomeTime();
		for(WebElement menulist:EnvironmentNOC_Menu)
		{
			HighlightOnElement(menulist);
			Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
			if(menulist.isDisplayed())
			{
				String Menu=menulist.getText();
				System.out.println(" Menu Under Environment NOC Is:"+Menu );
			}

		}
		
	}
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/div/div/table/tbody/tr/td[2]/input")
	private WebElement entervalueinsearchbox;
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/div/div/table/tbody/tr/td[3]/button[contains(.,'Search')]")
	private WebElement searchbtn;
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/div/div/table/tbody/tr/td[4]/button[contains(.,'Reset')]")
	private WebElement Resetbtn;
	
	@FindBy(xpath="//a[contains(.,'ENVIRONMENT NOC')]/../following-sibling::div/div/div[1]/table/tbody/tr/td/a/img[@src='/NRDAuthority/resources/images/view-new.png']")
	private WebElement Action_Button;
	
	@FindBy(xpath=".//*[@id='inboxForm:growl_container']/div/div/div[2]/span")
	private WebElement popupmsg;
	
	public void toVerifySearchFieldAsPendingApplicationNumberAsInValidNumber_SC_08_TC_03() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		HighlightOnElement(entervalueinsearchbox);
		Assert.assertTrue(entervalueinsearchbox.isEnabled(),"Test Case Pass: entervalueinsearchbox");
		excel.getExcelData(entervalueinsearchbox, "Environment_Application_Number", 0, 2);
		waitForSomeTime();
		
		HighlightOnElement(searchbtn);
		Assert.assertTrue(searchbtn.isEnabled(),"Test Case Pass: searchbtn");
		searchbtn.click();
		waitForSomeTime();
		System.out.println(" To Click on searchbtn Link in Application of Water&Sewerage  Successfully" ); //print for eclipse console
		
		HighlightOnElement(popupmsg);
		Assert.assertTrue(popupmsg.isEnabled(),"Test Case Pass: popupmsg");
		String ActualMessage=popupmsg.getText();
		String ExpectedMessage="Application Number is not in Records";
		Assert.assertEquals(ActualMessage, ExpectedMessage);
		waitForSomeTime();
	
	}
	
	public void toVerifySearchFieldAsPendingApplicationNumberAsBlankField_SC_08_TC_04() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		HighlightOnElement(entervalueinsearchbox);
		Assert.assertTrue(entervalueinsearchbox.isEnabled(),"Test Case Pass: entervalueinsearchbox");
		//excel.getExcelData(entervalueinsearchbox, "Environment_Application_Number", 0, 2);
		waitForSomeTime();
		
		HighlightOnElement(searchbtn);
		Assert.assertTrue(searchbtn.isEnabled(),"Test Case Pass: searchbtn");
		searchbtn.click();
		waitForSomeTime();
		System.out.println(" To Click on searchbtn Link in Application of Water&Sewerage  Successfully" ); //print for eclipse console
		
		HighlightOnElement(popupmsg);
		Assert.assertTrue(popupmsg.isEnabled(),"Test Case Pass: popupmsg");
		String ActualMessage=popupmsg.getText();
		String ExpectedMessage="Please enter Application Number !";
		Assert.assertEquals(ActualMessage, ExpectedMessage);
		waitForSomeTime();
	}
	
	public void toVerifySearchFieldAsPendingApplicationNumberAsEnterSpecialCharacters_SC_08_TC_05() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		HighlightOnElement(entervalueinsearchbox);
		Assert.assertTrue(entervalueinsearchbox.isEnabled(),"Test Case Pass: entervalueinsearchbox");
		excel.getExcelData(entervalueinsearchbox, "Environment_Application_Number", 0, 3);
		HighlightOnElement(searchbtn);
		Assert.assertTrue(searchbtn.isEnabled(),"Test Case Pass: searchbtn");
		searchbtn.click();
		waitForSomeTime();
		acceptAlert();
		waitForSomeTime();
		
	}
	
	public void toVerifySearchFieldAsPendingApplicationNumberAsEnterAlphabetsonly_SC_08_TC_06() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
			HighlightOnElement(entervalueinsearchbox);
		Assert.assertTrue(entervalueinsearchbox.isEnabled(),"Test Case Pass: entervalueinsearchbox");
		excel.getExcelData(entervalueinsearchbox, "Environment_Application_Number", 0, 4);
		waitForSomeTime();
		
		HighlightOnElement(searchbtn);
		Assert.assertTrue(searchbtn.isEnabled(),"Test Case Pass: searchbtn");
		searchbtn.click();
		waitForSomeTime();
		System.out.println(" To Click on searchbtn Link in Application of Water&Sewerage  Successfully" ); //print for eclipse console
		
		HighlightOnElement(popupmsg);
		Assert.assertTrue(popupmsg.isEnabled(),"Test Case Pass: popupmsg");
		String ActualMessage=popupmsg.getText();
		String ExpectedMessage="Application Number is not in Records";
		Assert.assertEquals(ActualMessage, ExpectedMessage);
		waitForSomeTime();
	
	}
	
	public void toVerifySearchFieldAsPendingApplicationNumberAsEnterNumericonly_SC_08_TC_07() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		HighlightOnElement(entervalueinsearchbox);
		Assert.assertTrue(entervalueinsearchbox.isEnabled(),"Test Case Pass: entervalueinsearchbox");
		excel.getExcelData(entervalueinsearchbox, "Environment_Application_Number", 0, 5);
		waitForSomeTime();
		
		HighlightOnElement(searchbtn);
		Assert.assertTrue(searchbtn.isEnabled(),"Test Case Pass: searchbtn");
		searchbtn.click();
		waitForSomeTime();
		System.out.println(" To Click on searchbtn Link in Application of Water&Sewerage  Successfully" ); //print for eclipse console
		
		HighlightOnElement(popupmsg);
		Assert.assertTrue(popupmsg.isEnabled(),"Test Case Pass: popupmsg");
		String ActualMessage=popupmsg.getText();
		String ExpectedMessage="Application Number is not in Records";
		Assert.assertEquals(ActualMessage, ExpectedMessage);
		waitForSomeTime();
	
	}
	
	public void toVerifyPendingApplicationWithValidNumber_SC_08_TC_08() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		HighlightOnElement(entervalueinsearchbox);
		Assert.assertTrue(entervalueinsearchbox.isEnabled(),"Test Case Pass: entervalueinsearchbox");
		excel.getExcelData(entervalueinsearchbox, "Environment_Application_Number", 0, 1);
		waitForSomeTime();
		
		HighlightOnElement(searchbtn);
		Assert.assertTrue(searchbtn.isEnabled(),"Test Case Pass: searchbtn");
		searchbtn.click();
		waitForSomeTime();
		System.out.println(" To Click on searchbtn Link in Application of Water&Sewerage  Successfully" ); //print for eclipse console
		
		waitForSomeTime();
		for(WebElement menulist:EnvironmentNOC_Menu)
		{
			HighlightOnElement(menulist);
			Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
			if(menulist.isDisplayed())
			{
				String Menu=menulist.getText();
				System.out.println(" Menu Under Environment NOC Is:"+Menu );
			}

		}
		waitForSomeTime();
		HighlightOnElement(Action_Button);
		Assert.assertTrue(Action_Button.isEnabled(),"Test Case Pass: Action_Button");
		waitForSomeTime();
	
	}
	
	@FindBy(xpath="//span[contains(.,'Basic Details')]/../following-sibling::div/table/tbody/tr/td/span")
	private List <WebElement> BasicDetailMenu;
	
	@FindBy(xpath="//ul/li[contains(.,'Property Details')]/../following-sibling::div/div[4]/div/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span")
	private List <WebElement> PropertiesDetailMenu;
	
	@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[2]/tbody/tr/td/label")
	private List <WebElement> ActionandCommentMenu;
	
	@FindBy(xpath="//a[contains(.,'Property Details')]")
	private WebElement PropertyDetailsMenu;
	
	@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[1]/tbody/tr/td/label")
	private WebElement selectActionLabel;
	
	@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[2]/tbody/tr/td/span")
	private WebElement UploadingDocumentlabel;
	
	@FindBy(xpath="//div/div/span[contains(.,'Basic Details')]")
	private WebElement BasicDetailHeading;
	
	public void toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_08_TC_09() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		HighlightOnElement(Action_Button);
		Action_Button.click();
		waitForSomeTime();
		waitForelementPresent(BasicDetailHeading);
		HighlightOnElement(BasicDetailHeading);
		for(WebElement menulist:BasicDetailMenu)
		{
			HighlightOnElement(menulist);
			Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
			if(menulist.isDisplayed())
			{
				String Menu=menulist.getText();
				System.out.println(" Labels Under BasicDetails Is:"+Menu );
			}

		}
		
		waitForSomeTime();
		
		HighlightOnElement(PropertyDetailsMenu);
		PropertyDetailsMenu.click();
		
		for(WebElement menulist:PropertiesDetailMenu)
		{
			HighlightOnElement(menulist);
			Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
			if(menulist.isDisplayed())
			{
				String Menu=menulist.getText();
				System.out.println(" Labels Under PropertiesDetails Is:"+Menu );
			}

		}
		
		waitForSomeTime();
		
		HighlightOnElement(selectActionLabel);
		for(WebElement menulist:ActionandCommentMenu)
		{
			HighlightOnElement(menulist);
			Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
			if(menulist.isDisplayed())
			{
				String Menu=menulist.getText();
				System.out.println(" Labels Under ActionandCommentmenu Is:"+Menu );
			}

		}
		HighlightOnElement(UploadingDocumentlabel);
		waitForSomeTime();
		
	}
	
	
	
	public void toVerifyresetbuttonFunctionality_SC_08_TC_10() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		HighlightOnElement(entervalueinsearchbox);
		Assert.assertTrue(entervalueinsearchbox.isEnabled(),"Test Case Pass: entervalueinsearchbox");
		excel.getExcelData(entervalueinsearchbox, "Environment_Application_Number", 0, 1);
		waitForSomeTime();
		HighlightOnElement(Resetbtn);
		Assert.assertTrue(Resetbtn.isEnabled(),"Test Case Pass: Resetbtn");
		Resetbtn.click();
		waitForSomeTime();
		System.out.println(" To Click on Resetbtn Link in Application of Water&Sewerage  Successfully" ); //print for eclipse console
		waitForSomeTime();
		VerifyTextField(entervalueinsearchbox);
	
	}
	
	@FindBy(xpath="//button[contains(.,'Print')]")
	private WebElement PrintBtn;
	
	public void toVerifyfunctionalityPrintButton_SC_08_TC_11() throws InterruptedException
	{
		
		HighlightOnElement(Action_Button);
		Action_Button.click();
		waitForSomeTime();
		waitForelementPresent(BasicDetailHeading);
		HighlightOnElement(BasicDetailHeading);
		ScroolDown();
		HighlightOnElement(PrintBtn);
		PrintBtn.click();
		waitForSomeTime();
		waitForSomeTime();
		ScroolUp();
	}
	//@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[1]/tbody/tr/td/select")
	@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[1]/tbody/tr/td/div/div[3]/span")
	private WebElement SelectActionDropdownLink;
	
	@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[1]/tbody/tr/td[3]/span/div/div[3]/span")
	//@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[1]/tbody/tr/td[3]/span/select")
	private WebElement SelectUserDropdown;
	
	@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[2]/tbody/tr/td/textarea")
	private WebElement EnterCommentsField;
	
	@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[2]/tbody/tr/td/table/tbody/tr/td/div/div[1]/label")
	private WebElement UploadingDocument;
	
	public void toVerifyfunctionalityofUploadingDocument_SC_08_TC_12() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		
		HighlightOnElement(UploadingDocument);
		UploadingDocument.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur.jpg");
		System.out.println("Upload Document Link Application of Water and Sewerage Environment Section is Present" ); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
	}
	
	@FindBy(xpath=".//*[@id='inboxForm:msg_container']/div/div/div[2]/span")
	private WebElement Popup_ErrorMsg;
	
	public void toVerifyfunctionalityofUploadingInvalidDocument_SC_08_TC_13() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{		
		HighlightOnElement(UploadingDocument);
		UploadingDocument.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\System.logs.1");
		System.out.println("Upload Document Link Application of Water and Sewerage Environment Section is Present" ); //print for eclipse console 
		waitForSomeTime();
		HighlightOnElement(Popup_ErrorMsg);
		String ActualMessage=Popup_ErrorMsg.getText();
		String ExpectedMessage="Invalid document size. Max file size is 2MB allowed";
		Assert.assertEquals(ActualMessage, ExpectedMessage);
		waitForSomeTime();
		waitForSomeTime();
	}
	
	@FindBy(xpath=".//*[@id='inboxForm:msg_container']/div/div/div[2]/span")
	private WebElement ERROR_MSG;
	
	@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/../following-sibling::center/button[contains(.,'Close')]")
	private WebElement Close_Button;
	
	@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/../following-sibling::center/button[contains(.,'Submit')]")
	private WebElement Submit_Button;
	
	public void toVerifyfunctionalityofCloseButton_SC_08_TC_19() throws InterruptedException
	{
		HighlightOnElement(Close_Button);
		Assert.assertTrue(Close_Button.isEnabled(),"Test Case Pass: Close_Button");
		Close_Button.click();
		waitForSomeTime();
		waitForSomeTime();
		
	}
	
	public void toVerifyfunctionalityofSubmitButton() throws InterruptedException
	{
		HighlightOnElement(Submit_Button);
		Assert.assertTrue(Submit_Button.isEnabled(),"Test Case Pass: Submit_Button");
		Submit_Button.click();
		waitForSomeTime();
		
	}
	
	
	public void toVerifyfunctionalityofEnterCommentsField() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		
		HighlightOnElement(EnterCommentsField);
		Assert.assertTrue(EnterCommentsField.isEnabled(),"Test Case Pass: EnterCommentsField");
		excel.getExcelData(EnterCommentsField, "Environmental_Application_Form", 1, 60);
		waitForSomeTime();
	
	}
	
	
	public void toVerifyfunctionalitySelectingSendback_SC_08_TC_15() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		HighlightOnElement(Action_Button);
		Action_Button.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForelementPresent(BasicDetailHeading);
		HighlightOnElement(BasicDetailHeading);
		HighlightOnElement(SelectActionDropdownLink);
		Assert.assertTrue(SelectActionDropdownLink.isEnabled(),"Test Case Pass: SelectActionDropdownLink");
		SelectActionDropdownLink.click();
		selectValueFromDropdown("Forward");
		SelectVisibleText(SelectActionDropdownLink, "Send Back");
		waitForSomeTime();
		/*HighlightOnElement(SelectUserDropdown);
		Assert.assertTrue(SelectUserDropdown.isEnabled(),"Test Case Pass: SelectUserDropdown");
		//SelectUserDropdown.click();
		//selectValueFromDropdown("Aniket jain (DGM-ENV)");
		SelectVisibleText(SelectUserDropdown, "Aniket jain (DGM-ENV)");
		waitForSomeTime();*/
		
		
	}
	
	public void toVerifyfunctionalitySelectingApprove_SC_08_TC_17() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		HighlightOnElement(Action_Button);
		Action_Button.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForelementPresent(BasicDetailHeading);
		HighlightOnElement(BasicDetailHeading);
		HighlightOnElement(SelectActionDropdownLink);
		Assert.assertTrue(SelectActionDropdownLink.isEnabled(),"Test Case Pass: SelectActionDropdownLink");
		SelectVisibleText(SelectActionDropdownLink, "Approve");
		waitForSomeTime();
		
		
		
	}
	
	
	
	public void toVerifyfunctionalitySelectingReject_SC_08_TC_17() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		HighlightOnElement(Action_Button);
		Action_Button.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForelementPresent(BasicDetailHeading);
		HighlightOnElement(BasicDetailHeading);
		HighlightOnElement(SelectActionDropdownLink);
		Assert.assertTrue(SelectActionDropdownLink.isEnabled(),"Test Case Pass: SelectActionDropdownLink");
		SelectVisibleText(SelectActionDropdownLink, "Reject");
		waitForSomeTime();
		
		
		
	}
	
	@FindBy(xpath=".//*[@id='inboxForm:growl_container']/div/div/div[2]/span")
	private WebElement Successful_MSG;
	
	
	public void toVerifySuccessfullyMsg() throws InterruptedException
	{
		waitForSomeTime();
		HighlightOnElement(Successful_MSG);
		String ActualMessage=Successful_MSG.getText();
		String ExpectedMessage="Your application submitted successfully.";
		Assert.assertEquals(ActualMessage, ExpectedMessage);
		waitForSomeTime();
		waitForSomeTime();
		
	}
	

	
	
	
}
