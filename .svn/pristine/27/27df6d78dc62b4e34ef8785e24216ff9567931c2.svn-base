/**
 * 
 */
package NRDA_LEGAL;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;


/**
 * @author Sarvesh.Nellore
 *
 */
public class ToverifyFunctionalityof_OIC_LEGAL extends CommonLibrary 
{
	Logger log=Logger.getLogger("devpinoyLogger");
	ExcelDataDriver excel=new ExcelDataDriver();
	
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li")
	private List<WebElement> homepagedisplayICons;
	
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
	
	@FindBy(xpath="//div[@class='ui-accordion ui-widget ui-helper-reset ui-hidden-container Accordian-Header-Black']/h3")
	private  List<WebElement> homepagedisplay;
		
	public void toVerifyMenuFieldsonDashBoard_SC_06_TC_01() throws InterruptedException
	{
		try
		{
			waitForSomeTime();
			HighlightOnElement(Home_Icon);
			Assert.assertEquals(true,Home_Icon.isEnabled());
			Reporter.log(" To Verify Home_Icon Link in Application of Water&Sewerage link is Present",true); //print for eclipse console

			waitForSomeTime();
			HighlightOnElement(PendingApplication_Icon);
			Assert.assertEquals(true,PendingApplication_Icon.isEnabled());
			Reporter.log(" To Verify PendingApplication_Icon Link in Application of Water&Sewerage link is Present",true); //print for eclipse console
			waitForSomeTime();
			HighlightOnElement(ApproveorRejectApplication_Icon);
			Assert.assertEquals(true,ApproveorRejectApplication_Icon.isEnabled());
			Reporter.log(" To Verify ApprovceRejectApplication_Icon Link in Application of Water&Sewerage link is Present",true); //print for eclipse console

			
			waitForSomeTime();
			HighlightOnElement(PaymentCollection_Icon);
			Assert.assertEquals(true,PaymentCollection_Icon.isEnabled());
			Reporter.log(" To Verify PaymentCollection_Icon Link in Application of Water&Sewerage link is Present",true); //print for eclipse console
			
			waitForSomeTime();
			HighlightOnElement(InvoiceCollection_Icon);
			Assert.assertEquals(true,InvoiceCollection_Icon.isEnabled());
			Reporter.log(" To Verify InvoiceCollection_Icon Link in Application of Water&Sewerage link is Present",true); //print for eclipse console
			
			
			waitForSomeTime();
			HighlightOnElement(MisReport_Icon);
			Assert.assertEquals(true,MisReport_Icon.isEnabled());
			Reporter.log(" To Verify MisReports_Icon Link in Application of Water&Sewerage link is Present",true); //print for eclipse console

			waitForSomeTime();
			HighlightOnElement(CaseList_Icon);
			Assert.assertEquals(true,CaseList_Icon.isEnabled());
			Reporter.log(" To Verify CaseList_Icon Link in Application of Water&Sewerage link is Present",true); //print for eclipse console

			waitForSomeTime();
			HighlightOnElement(ProcessLegalInvoice_Icon);
			Assert.assertEquals(true,ProcessLegalInvoice_Icon.isEnabled());
			Reporter.log(" To Verify ProcessLegalInvoice_Icon Link in Application of Water&Sewerage link is Present",true); //print for eclipse console

			waitForSomeTime();
			HighlightOnElement(MeetingManagement_Icon);
			Assert.assertEquals(true,MeetingManagement_Icon.isEnabled());
			Reporter.log(" To Verify MeetingManagement_Icon Link in Application of Water&Sewerage link is Present",true); //print for eclipse console

		}

		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	

	public void verifyHomePageDisplayIcons_SC_02_TC_01() throws InterruptedException
		{
		  for(WebElement display:homepagedisplayICons)
		   {
			  HighlightOnElement(display);
			  String Icons=display.getText();
			  Reporter.log("Home Page Display Icons Are:"+Icons,true);
			  Assert.assertNotNull(display.isDisplayed(),"Test case pass");
		   }
		}
	
	public void toVerifyApprove_RajectLink_SC_06_TC_02() throws InterruptedException
	{
		
		waitForSomeTime();
		HighlightOnElement(ApproveorRejectApplication_Icon);
		Assert.assertEquals(true,ApproveorRejectApplication_Icon.isEnabled());
		ApproveorRejectApplication_Icon.click();
		waitForSomeTime();
		Reporter.log(" To Verify ApprovceRejectApplication_Icon Link in Application of Water&Sewerage link is Present",true); //print for eclipse console

	
	}
	
	@FindBy(xpath="//h3[@class='ui-accordion-header ui-helper-reset ui-state-default ui-state-active ui-corner-top']/a")
	private  List<WebElement> MenufieldsInApproveRejectLink;
	
	
	public void toVerifMenuFieldsinApproveorRejectLink_SC_06_TC_02()
	{
		
		for(WebElement display:MenufieldsInApproveRejectLink)
		   {
			  HighlightOnElement(display);
			  String menu=display.getText();
			  Reporter.log("Menu in ApproveRejectLinks Are:"+menu,true);
			  Assert.assertNotNull(display.isDisplayed(),"Test case pass");
		   }
		
	}
	
	@FindBy(xpath="//td/table/tbody/tr/td/form/div/div/div/h3/a[contains(text(),'NEW CASE ENTRY')]/preceding-sibling::span/../following-sibling::div/div/div/table/thead/tr/th/span")
	private  List<WebElement> NewcaseEntryMenu;
	
	public void toVerifMenuFieldsinNewCaseEntry_SC_06_TC_03()
	{
		
		for(WebElement display:NewcaseEntryMenu)
		   {
			  HighlightOnElement(display);
			  String menu=display.getText();
			  Reporter.log("Menu in NewCaseEntry Are:"+menu,true);
			  Assert.assertNotNull(display.isDisplayed(),"Test case pass");
		   }
		
	}
	
	@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr/td[2]/input")
	private  WebElement ApplicationNumberSearch;
	
	@FindBy(xpath="//button[contains(.,'Search')]")
	private  WebElement Search_Button;
	
	@FindBy(xpath="//img[@src='/NRDAuthority/resources/images/view-icon.png']")
	private  WebElement Action_Button;
	
	public void toVerifyActionButtonFunctionality_SC_06_TC_04() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		HighlightOnElement(ApplicationNumberSearch);
		Assert.assertTrue(ApplicationNumberSearch.isDisplayed(),"Test case pass");
		excel.getExcelData(ApplicationNumberSearch, "AM_CaseNumber", 0, 1);
		
		waitForSomeTime();
		HighlightOnElement(Search_Button);
		Assert.assertTrue(Search_Button.isEnabled());
		Search_Button.click();
		waitForSomeTime();
		Reporter.log(" To Verify Search_Button Link in Application of Water&Sewerage link is Present",true); //print for eclipse console

	}
	
	public void clickonActionbutton() throws InterruptedException
	{
		
		waitForSomeTime();
		HighlightOnElement(Action_Button);
		Assert.assertTrue(Action_Button.isEnabled());
		Action_Button.click();
		waitForSomeTime();
		Reporter.log(" To Verify Action_Button Link in Application of Water&Sewerage link is Present",true); //print for eclipse console

		
		
	}
	
	public void VeriftMenuTabsInApplicationNumber_SC_06_TC_04() throws InterruptedException
	{
		waitForSomeTime();
		HighlightOnElement(InvoiceDetails_Menu);
		Assert.assertEquals(true,InvoiceDetails_Menu.isEnabled());
		Reporter.log(" To Verify InvoiceDetails_Menu Link in Application of Water&Sewerage link is Present",true); //print for eclipse console

		waitForSomeTime();
		HighlightOnElement(ReplyDrafted_Menu);
		Assert.assertEquals(true,ReplyDrafted_Menu.isEnabled());
		Reporter.log(" To Verify ReplyDrafted_Menu Link in Application of Water&Sewerage link is Present",true); //print for eclipse console

		for(WebElement displayMenu:MenuFields)
		   {
			  HighlightOnElement(displayMenu);
			  String Fields=displayMenu.getText();
			  Reporter.log("MenuFields In Pending Application Are:"+Fields,true);
			  Assert.assertNotNull(displayMenu.isDisplayed(),"Test case pass");
		   }
	
	}
				
				
	@FindBy(xpath="//div[@class='ui-panel-content ui-widget-content']/div[8]/div[1]/span")
	private  WebElement InvoiceDetails_Menu;
	
	@FindBy(xpath="//div[@class='ui-panel-content ui-widget-content']/div[9]/div[1]/span")
	private  WebElement ReplyDrafted_Menu;
	
	@FindBy(xpath="//div[@class='ui-panel-content ui-widget-content']/div[10]/ul/li/a")
	private  List<WebElement> MenuFields;
	
	@FindBy(xpath="//div[@class='ui-panel-content ui-widget-content']/div[10]/ul/li/a[contains(.,'Hearing')]")
	private  WebElement HearingTab;
	
	@FindBy(xpath="//button[contains(.,'Add Case Hearing')]")
	private  WebElement AddCaseHearing_Button;
	
	public void toverifyHearingTabFunctionality_SC_06_TC_05() throws InterruptedException
	{
		
		HighlightOnElement(HearingTab);
		Assert.assertTrue(HearingTab.isEnabled());
		HearingTab.click();
		waitForSomeTime();
		Reporter.log(" To Verify HearingTab Link in Application of Water&Sewerage link is Present",true); //print for eclipse console

		HighlightOnElement(AddCaseHearing_Button);
		Assert.assertTrue(AddCaseHearing_Button.isEnabled());
		Reporter.log(" To Verify AddCaseHearing_Button Link in Application of Water&Sewerage link is Present",true); //print for eclipse console

	}
	
	@FindBy(xpath="//table[@style='width:90%;margin-left:20px;margin-top: 15px;']/tbody/tr[1]/td[2]/span/input")
	private  WebElement CurrentHearingdate_Field;
	
	@FindBy(xpath=".//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[6]/a[contains(.,'29')]")
	private  WebElement CurrentHearingdate;
	
	@FindBy(xpath="//table[@style='width:90%;margin-left:20px;margin-top: 15px;']/tbody/tr[1]/td[4]/span/input[@name='inboxForm:nextDate_input']")
	private  WebElement NextHearingdate_Field;
	
	@FindBy(xpath=".//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[7]/a[contains(.,'30')]")
	private  WebElement NextHearingdate;
	
	@FindBy(xpath="//table[@style='width:90%;margin-left:20px;margin-top: 15px;']/tbody/tr[2]/td[2]/div/div[3]/span")
	private  WebElement FixedFor_Dropdown;
	
	@FindBy(xpath="//textarea[@title='Case Proceedings in Brief']")
	private  WebElement CaseProcedinginBreif;
	
	@FindBy(xpath="//table[@style='width:90%;margin-left:20px;margin-top: 15px;']/tbody/tr[3]/td[2]/div/div[3]/span")
	private  WebElement SelectCourt_Dropdown;
	
	@FindBy(xpath="//table[@style='width:90%;margin-left:20px;margin-top: 15px;']/tbody/tr[3]/td[4]/span/div/div[1]/label")
	private  WebElement UploadFile;
	
	@FindBy(xpath="//button[contains(.,'Add Hearing')]")
	private  WebElement AddHearing_Button;
	
	@FindBy(xpath="//div[@class='ui-dialog-content ui-widget-content']/div/div[1]/span[contains(.,'Add Hearing')]/../following-sibling::div/div/div/table/tbody/tr/td[3]/label")
	private  WebElement UploadFileLabel;
	
	@FindBy(xpath="//div[@class='ui-dialog-content ui-widget-content']/div/div[1]/span[contains(.,'Add Hearing')]/../following-sibling::div/div/div/table/tbody/tr/td/span/label")
	private  List<WebElement> AllFieldsinAddHearing;
	
	@FindBy(xpath=".//*[@id='inboxForm:caseHrngDia']/div[1]/a/span")
	private  WebElement ClosePopup;
	
	
	
	public void toverifyAddCaseHearingButtonFunctionality_SC_06_TC_06() throws InterruptedException
	{
		waitForSomeTime();
		HighlightOnElement(AddCaseHearing_Button);
		AddCaseHearing_Button.click();
		waitForSomeTime();

		for(WebElement display:AllFieldsinAddHearing)
		   {
			  HighlightOnElement(display);
			  String menu=display.getText();
			  Reporter.log("All Fields In AddHearing Are:"+menu,true);
			  Assert.assertNotNull(display.isDisplayed(),"Test case pass");
		   }
		
		HighlightOnElement(UploadFileLabel);
		Assert.assertTrue(UploadFileLabel.isEnabled());
		Reporter.log(" To Verify UploadFileLabel Link in Application of Water&Sewerage Legal Section is Present",true); //print for eclipse console

		
	}
	
	public void close_POPUP()
	{
		HighlightOnElement(ClosePopup);
		ClosePopup.click();
		
		
	}
	

	@FindBy(xpath=".//*[@id='inboxForm:growl_container']/div/div/div[2]/span")
	private  WebElement Popup_MSG;
	
	@FindBy(xpath=".//*[@id='inboxForm:msg_container']/div/div/div[2]/span")
	private  WebElement Popup_MSG1;
	
	@FindBy(xpath=".//*[@id='inboxForm:growl_container']/div/div/div[1]")
	private  WebElement Popup_MSG_Close;
	
	@FindBy(xpath=".//*[@id='inboxForm:msg_container']/div/div/div[1]")
	private  WebElement Popup_MSG_Close1;
	
	
	
	
	public void toverifyAddHearingButtonFunctionality_SC_06_TC_07() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		HighlightOnElement(AddCaseHearing_Button);
		Assert.assertTrue(AddCaseHearing_Button.isEnabled());
		AddCaseHearing_Button.click();
		waitForSomeTime();
		waitForSomeTime();
		Reporter.log(" To Verify AddCaseHearing_Button Link in Application of Water&Sewerage link is Present",true); //print for eclipse console
		
		HighlightOnElement(CurrentHearingdate_Field);
		Assert.assertTrue(CurrentHearingdate_Field.isEnabled());
		CurrentHearingdate_Field.click();
		Reporter.log(" To Verify UploadFileLabel Link in Application of Water&Sewerage Legal Section is Present",true); //print for eclipse console
		HighlightOnElement(CurrentHearingdate);
		CurrentHearingdate.click();
		waitForSomeTime();
		HighlightOnElement(NextHearingdate_Field);
		Assert.assertTrue(NextHearingdate_Field.isEnabled());
		NextHearingdate_Field.click();
		Reporter.log(" To Verify NextHearingdate_Field Link in Application of Water&Sewerage Legal Section is Present",true); //print for eclipse console
		HighlightOnElement(NextHearingdate);
		NextHearingdate.click();
		waitForSomeTime();
		HighlightOnElement(FixedFor_Dropdown);
		FixedFor_Dropdown.click();
		selectValueFromDropdown("WRITTEN ARGUMENTS");
		waitForSomeTime();
		
		HighlightOnElement(CaseProcedinginBreif);
		Assert.assertTrue(CaseProcedinginBreif.isEnabled());
		excel.getExcelData(CaseProcedinginBreif, "Application_AM_LEGAL", 1, 30);
		Reporter.log(" To Verify NextHearingdate_Field Link in Application of Water&Sewerage Legal Section is Present",true); //print for eclipse console
		
		HighlightOnElement(SelectCourt_Dropdown);
		SelectCourt_Dropdown.click();
		selectValueFromDropdown("High Court");
		
		HighlightOnElement(UploadFile);
		UploadFile.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur1.jpg");
		Reporter.log("Applicant UploadFile  Link Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 
		waitForSomeTime();
		
		HighlightOnElement(Popup_MSG);
		Actions action = new Actions(driver);
		action.moveToElement(Popup_MSG).build().perform();
		waitForSomeTime();
		HighlightOnElement(Popup_MSG_Close);
		Popup_MSG_Close.click();
		
		HighlightOnElement(AddHearing_Button);
		Assert.assertTrue(AddHearing_Button.isEnabled());
		AddHearing_Button.click();
		waitForSomeTime();
		Reporter.log(" To Verify AddHearing_Button Link in Application of Water&Sewerage link is Present",true); //print for eclipse console

		HighlightOnElement(Popup_MSG1);
		Actions action1 = new Actions(driver);
		action1.moveToElement(Popup_MSG1).build().perform();
		waitForSomeTime();
		HighlightOnElement(Popup_MSG_Close1);
		Popup_MSG_Close1.click();
		waitForSomeTime();
	}
	
	@FindBy(xpath="//div[@class='ui-tabs ui-widget ui-widget-content ui-corner-all ui-hidden-container ui-tabs-top']/ul/li[contains(.,'Advocate')]")
	private WebElement AdvocateMenu;
	
	@FindBy(xpath="//div[@class='ui-tabs ui-widget ui-widget-content ui-corner-all ui-hidden-container ui-tabs-top']/div/div[9]/span/center/button[contains(.,'Assign')]")
	private WebElement Advocate_Assign;
	
	@FindBy(xpath="(//table[@style='width:90%;margin-left:20px;margin-top: 15px;']/tbody/tr/td[2]/div/div[3]/span)[3]")
	private WebElement SelectAdvocatePractise_Dropdown;
	
	/*@FindBy(xpath="//html/body/div[15]/div/ul/li")
	private List<WebElement> Dropdownvalues_Advocate;*/
	
	@FindBy(xpath="//table[@style='width:90%;margin-left:20px;margin-top: 15px;']/tbody/tr[2]/td[2]/input")
	private WebElement AdvocateFee_Field;
	
	@FindBy(xpath="//table[@style='width:90%;margin-left:20px;margin-top: 15px;']/tbody/tr/td[4]/div/div[3]/span")
	private WebElement SelectAdvocate_Dropdown;
		
	/*@FindBy(xpath="html/body/div[17]/div/ul/li")
	private List<WebElement> Dropdownvalues_SelectAdvocate;*/
	
	@FindBy(xpath="(//button[contains(.,'Assign Advocate')])[1]")
	private WebElement AssignAdvocate_Button;
	
	@FindBy(xpath=".//*[@id='inboxForm:tableAdvo']/div/table")
	private WebElement AssignAdvocate_ResultGrid;
	
	@FindBy(xpath="(//button[contains(.,'Edit')])[1]")
	private WebElement EditBtn_ResultGrid;
	
	@FindBy(xpath=".//*[@id='inboxForm:advoicDia']/div[1]/a/span")
	private WebElement Close_Popup;
	
	@FindBy(xpath=".//*[@id='inboxForm:msg_container']/div/div/div[2]/span/font/font")
	private WebElement PopupMsg;
	
	
	
	public void toverifyAdvocateButtonFonctionality_SC_06_TC_08() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		HighlightOnElement(AdvocateMenu);
		Assert.assertTrue(AdvocateMenu.isEnabled(),"Test Case Pass: AdvocateMenu");
		AdvocateMenu.click();
		Reporter.log("AdvocateMenu  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
		waitForDomElement();
		waitForSomeTime();
		
		HighlightOnElement(Advocate_Assign);
		Assert.assertTrue(Advocate_Assign.isEnabled(),"Test Case Pass: Advocate_Assign");
		Advocate_Assign.click();
		Reporter.log("Advocate_Assign  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
		waitForDomElement();
		waitForSomeTime();
		
		HighlightOnElement(SelectAdvocatePractise_Dropdown);
		SelectAdvocatePractise_Dropdown.click();

		selectValueFromDropdown("Criminal");
		HighlightOnElement(AdvocateFee_Field);
		Assert.assertTrue(AdvocateFee_Field.isEnabled(),"Test Case Pass: AdvocateFee_Field");
		AdvocateFee_Field.clear();
		excel.getExcelData(AdvocateFee_Field, "Application_AM_LEGAL", 1, 23);
		Reporter.log("AdvocateFee_Field  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
		waitForDomElement();
		waitForSomeTime();
		HighlightOnElement(SelectAdvocate_Dropdown);
		SelectAdvocate_Dropdown.click();

		selectValueFromDropdown("Vikas Mishra");
		HighlightOnElement(AssignAdvocate_Button);
		Assert.assertTrue(AssignAdvocate_Button.isEnabled(),"Test Case Pass: AssignAdvocate_Button");
		AssignAdvocate_Button.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		Reporter.log("AdvocateFee_Field  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
		
		HighlightOnElement(Close_Popup);
		waitForSomeTime();
		Close_Popup.click();
		waitForSomeTime();
		waitForSomeTime();
	
	}
	
	
	@FindBy(xpath="//div[@class='ui-tabs ui-widget ui-widget-content ui-corner-all ui-hidden-container ui-tabs-top']/ul/li[contains(.,'OIC')]/a")
	private WebElement OICMenu;
	
	@FindBy(xpath="//div[@class='ui-tabs ui-widget ui-widget-content ui-corner-all ui-hidden-container ui-tabs-top']/div/div[10]/span/center/button[contains(.,'Assign')]")
	private WebElement OIC_Assign;
	
	@FindBy(xpath="(//table[@style='width:90%;margin-left:20px;margin-top: 15px;']/tbody/tr/td[2]/div/div[3]/span)[3]")
	private WebElement SelectOIC_Dropdown;
	
	/*@FindBy(xpath="html/body/div[17]/div/ul/li")
	private List<WebElement> Dropdownvalues_OIC;*/
	
	@FindBy(xpath="(//button[contains(.,'Assign OIC')])[1]")
	private WebElement AssignOIC_Button;
	
	@FindBy(xpath=".//*[@id='inboxForm:table1Oic']/div/table")
	private WebElement AssignOIC_ResultGrid;
	
	public void toverifyOICButtonFonctionality_SC_06_TC_09() throws InterruptedException
	{
		HighlightOnElement(OICMenu);
		Assert.assertTrue(OICMenu.isEnabled(),"Test Case Pass: OICMenu");
		OICMenu.click();
		Reporter.log("OICMenu  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
		waitForDomElement();
		waitForSomeTime();
		
		HighlightOnElement(OIC_Assign);
		Assert.assertTrue(OIC_Assign.isEnabled(),"Test Case Pass: OIC_Assign");
		OIC_Assign.click();
		Reporter.log("OIC_Assign  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
		waitForDomElement();
		waitForSomeTime();
		HighlightOnElement(SelectOIC_Dropdown);
		SelectOIC_Dropdown.click();
		selectValueFromDropdown("OIC-LEGAL-01");
		waitForSomeTime();
		HighlightOnElement(AssignOIC_Button);
		Assert.assertTrue(AssignOIC_Button.isEnabled(),"Test Case Pass: AssignOIC_Button");
		AssignOIC_Button.click();
		Reporter.log("AssignOIC_Button  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
		waitForDomElement();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(Close_Popup);
		waitForSomeTime();
		waitForSomeTime();
		Close_Popup.click();
		waitForSomeTime();
	}
	
	//@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr/td[2]/div/div[3]/span")
	@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[1]/tbody/tr/td/select")
	private WebElement selectAction_Dropdown;
	
	//@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr/td[3]/span/div/div/span")
	@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[1]/tbody/tr/td[3]/span/select")
	private WebElement selectUser_Dropdown;
	
	public void toVerifyFunctionalityofSelectActionDropdown_SC_06_TC_10() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	waitForSomeTime();
	ScroolDown();
		HighlightOnElement(selectAction_Dropdown);
		//selectAction_Dropdown.click();
		//selectValueFromDropdown("Forward");
		SelectVisibleText(selectAction_Dropdown, "Forward");
		waitForSomeTime();
		HighlightOnElement(selectUser_Dropdown);
		Assert.assertEquals(true,selectUser_Dropdown.isEnabled());
		Reporter.log(" To Verify selectUser_Dropdown  in Application of Water&Sewerage link is Present",true); //print for eclipse console
		//selectUser_Dropdown.click();
		//selectValueFromDropdown("Vikash Singh (common-Legal)");
		SelectVisibleText(selectUser_Dropdown, "Vikash Singh (AM-LEGAL)");
		ScroolUp();
	}
	
	public void toVerifyCaseNumber() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  {
		waitForSomeTime();
		String Application_Number=excel.getExcelData1("AM_CaseNumber", 0, 1);
		Reporter.log("Application NumberIs:"+Application_Number,true);
			
		List<WebElement> allpages = driver.findElements(By.xpath("html/body/div[1]/table[2]/tbody/tr/td[2]/table/tbody/tr/td/form/div/div[2]/div[6]/div[1]/div/div[4]/span[4]/span"));
		
		    Reporter.log("Total pages :" +allpages.size());
		    
		    boolean check = true;
		    for(int i=1; i<=(allpages.size()); i++)
		        {
		    	List<WebElement> allrows = driver.findElements(By.xpath("//div[@class='ui-accordion-content ui-helper-reset ui-widget-content']/div/div[2]/table/tbody/tr"));
		            for(int row=1; row<=allrows.size(); row++)
		                {
		                    Reporter.log("Total rows :" +allrows.size()); 
		                    String name = driver.findElement(By.xpath("//div[@class='ui-accordion-content ui-helper-reset ui-widget-content']/div/div[2]/table/tbody/tr["+row+"]/td[2]")).getText();
		                    //Reporter.log(name);
		                    Reporter.log("Row loop");
		                    if(name.equals(Application_Number))
		                        {
		                            WebElement ApplicationNumber = driver.findElement(By.xpath("//div[@class='ui-accordion-content ui-helper-reset ui-widget-content']/div/div[2]/table/tbody/tr["+row+"]/td[2]"));
		                            ApplicationNumber.click();
		                            Reporter.log("Element  exist");
		                            check = false;
		                            break;
		                        }
		                    else
		                    {
		                        Reporter.log("Element doesn't exist");
		                    }
		               
		                }

		            if(check)
		            {
		            allpages.get(i).click();
		            waitForSomeTime();
		            }
		      
		        }
		    waitForSomeTime();
		    waitForSomeTime();
	}	

public void toVerifyPendingApplicationLink() throws InterruptedException
{
	waitForSomeTime();
	HighlightOnElement(PendingApplication_Icon);
	Assert.assertTrue(PendingApplication_Icon.isEnabled(),"Test Case Pass: PendingApplication_Icon");
	PendingApplication_Icon.click();
	waitForSomeTime();
	Reporter.log(" To Click on PendingApplication_Icon Link in Application of Water&Sewerage  Successfully",true); //print for eclipse console
	
}

@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr[3]/td[2]/textarea")
private WebElement Enter_CommentsField;

@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr[4]/td[2]/table/tbody/tr/td/div/div[1]/label")
private WebElement UploadDocumentBtn;

@FindBy(xpath="//td/table/tbody/tr/td/form/span/span/div/div/center/button[contains(.,'Submit')]")
private WebElement SubmitButton;

@FindBy(xpath="//td/table/tbody/tr/td/form/span/span/div/div/center/button[contains(.,'Close')]")
private WebElement CloseButton;


	public void toVerifyFunctionalityofEnterCommentsField_SC_06_TC_12() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			ScroolDown();
			ScroolDown();
			waitForSomeTime();
			HighlightOnElement(Enter_CommentsField);
			Assert.assertTrue(Enter_CommentsField.isEnabled(),"Test Case Pass: Enter_CommentsField");
			excel.getExcelData(Enter_CommentsField, "Application_AM_LEGAL", 1, 27);
			Reporter.log("Enter_CommentsField  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
			waitForDomElement();
			ScroolUp();
			ScroolUp();
		}	

	public void toVerifyFunctionalityofUploadDocument_SC_06_TC_13() throws AWTException, InterruptedException
	{
		ScroolDown();
		ScroolDown();
		HighlightOnElement(UploadDocumentBtn);
		UploadDocumentBtn.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur1.jpg");
		waitForSomeTime();
		waitForSomeTime();
		ScroolUp();
		ScroolUp();
		
	}

	@FindBy(xpath=".//*[@id='inboxForm:growl_container']/div/div/div[2]/span")
	private WebElement PopUP_Message;
	public void toVerifyFunctionalityofSubmitButton_SC_06_TC_14() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		ScroolDown();
		ScroolDown();
		HighlightOnElement(SubmitButton);
		Assert.assertTrue(SubmitButton.isEnabled(),"Test Case Pass: SubmitButton");
		SubmitButton.click();
		Reporter.log("SubmitButton  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
		waitForDomElement();
		waitForSomeTime();
		
		HighlightOnElement(PopUP_Message);
		String Expected_Message="Your application submitted successfully.";
		String Actual_Message=PopUP_Message.getText();
		Assert.assertEquals(Expected_Message, Actual_Message);
		waitForSomeTime();
		waitForSomeTime();
		
		
	}
	
	


}
