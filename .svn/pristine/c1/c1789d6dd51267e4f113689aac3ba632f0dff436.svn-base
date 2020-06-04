package NRDA_LEGAL;

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
 *
 */
public class ToverifyFunctionalityof_BOD_LEGAL extends CommonLibrary 
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
		
	public void toVerifyMenuFieldsonDashBoard_SC_04_TC_01() throws InterruptedException
	{
		try
		{
			waitForSomeTime();
			HighlightOnElement(Home_Icon);
			Assert.assertEquals(true,Home_Icon.isEnabled());
			System.out.println(" To Verify Home_Icon Link in Application of Water&Sewerage link is Present" ); //print for eclipse console

			waitForSomeTime();
			HighlightOnElement(PendingApplication_Icon);
			Assert.assertEquals(true,PendingApplication_Icon.isEnabled());
			System.out.println(" To Verify PendingApplication_Icon Link in Application of Water&Sewerage link is Present" ); //print for eclipse console

			waitForSomeTime();
			HighlightOnElement(ApproveorRejectApplication_Icon);
			Assert.assertEquals(true,ApproveorRejectApplication_Icon.isEnabled());
			System.out.println(" To Verify ApprovceRejectApplication_Icon Link in Application of Water&Sewerage link is Present" ); //print for eclipse console

			
			waitForSomeTime();
			HighlightOnElement(PaymentCollection_Icon);
			Assert.assertEquals(true,PaymentCollection_Icon.isEnabled());
			System.out.println(" To Verify PaymentCollection_Icon Link in Application of Water&Sewerage link is Present" ); //print for eclipse console
			
			waitForSomeTime();
			HighlightOnElement(InvoiceCollection_Icon);
			Assert.assertEquals(true,InvoiceCollection_Icon.isEnabled());
			System.out.println(" To Verify InvoiceCollection_Icon Link in Application of Water&Sewerage link is Present" ); //print for eclipse console
			
			
			waitForSomeTime();
			HighlightOnElement(MisReport_Icon);
			Assert.assertEquals(true,MisReport_Icon.isEnabled());
			System.out.println(" To Verify MisReports_Icon Link in Application of Water&Sewerage link is Present" ); //print for eclipse console

			waitForSomeTime();
			HighlightOnElement(CaseList_Icon);
			Assert.assertEquals(true,CaseList_Icon.isEnabled());
			System.out.println(" To Verify CaseList_Icon Link in Application of Water&Sewerage link is Present" ); //print for eclipse console

			waitForSomeTime();
			HighlightOnElement(ProcessLegalInvoice_Icon);
			Assert.assertEquals(true,ProcessLegalInvoice_Icon.isEnabled());
			System.out.println(" To Verify ProcessLegalInvoice_Icon Link in Application of Water&Sewerage link is Present" ); //print for eclipse console

			waitForSomeTime();
			HighlightOnElement(MeetingManagement_Icon);
			Assert.assertEquals(true,MeetingManagement_Icon.isEnabled());
			System.out.println(" To Verify MeetingManagement_Icon Link in Application of Water&Sewerage link is Present" ); //print for eclipse console

		}

		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	

	public void toVerifyApprove_RajectLink_SC_05_TC_02() throws InterruptedException
	{
		
		waitForSomeTime();
		HighlightOnElement(ApproveorRejectApplication_Icon);
		Assert.assertEquals(true,ApproveorRejectApplication_Icon.isEnabled());
		ApproveorRejectApplication_Icon.click();
		waitForSomeTime();
		System.out.println(" To Verify ApprovceRejectApplication_Icon Link in Application of Water&Sewerage link is Present" ); //print for eclipse console

	
	}
	
	@FindBy(xpath="//h3[@class='ui-accordion-header ui-helper-reset ui-state-default ui-state-active ui-corner-top']/a")
	private  List<WebElement> MenufieldsInApproveRejectLink;
	
	
	public void toVerifMenuFieldsinApproveorRejectLink_SC_05_TC_02()
	{
		
		for(WebElement display:MenufieldsInApproveRejectLink)
		   {
			System.out.println();
			  HighlightOnElement(display);
			  String menu=display.getText();
			  System.out.println("Menu in ApproveRejectLinks Are:"+menu );
			  Assert.assertNotNull(display.isDisplayed(),"Test case pass");
		   }
		
	}
	
	@FindBy(xpath="//td/table/tbody/tr/td/form/div/div/div/h3/a[contains(text(),'NEW CASE ENTRY')]/preceding-sibling::span/../following-sibling::div/div/div/table/thead/tr/th/span")
	private  List<WebElement> NewcaseEntryMenu;
	
	public void toVerifMenuFieldsinNewCaseEntry_SC_05_TC_03()
	{
		
		for(WebElement display:NewcaseEntryMenu)
		   {
			  HighlightOnElement(display);
			  String menu=display.getText();
			  System.out.println("Menu in NewCaseEntry Are:"+menu );
			  Assert.assertNotNull(display.isDisplayed(),"Test case pass");
		   }
		
	}
	
	@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr/td[2]/input")
	private  WebElement ApplicationNumberSearch;
	
	@FindBy(xpath="//div[@class='ui-datatable-tablewrapper']/table/tbody/tr[10]/td[3]/span")
	private  WebElement ApplicationNumber;
	
	@FindBy(xpath="//button[contains(.,'Search')]")
	private  WebElement Search_Button;
	
	@FindBy(xpath="//img[@src='/NRDAuthority/resources/images/view-icon.png']")
	private  WebElement Action_Button;
	
	@FindBy(xpath="//div[@class='ui-panel-content ui-widget-content']/div[8]/div[1]/span")
	private  WebElement InvoiceDetails_Menu;
	
	@FindBy(xpath="//div[@class='ui-panel-content ui-widget-content']/div[9]/div[1]/span")
	private  WebElement ReplyDrafted_Menu;
	
	@FindBy(xpath="//div[@class='ui-panel-content ui-widget-content']/div[10]/ul/li/a")
	private  List<WebElement> MenuFields;
	
	public void toVerifyActionButtonFunctionality_SC_05_TC_04() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		String Application_Number=ApplicationNumber.getText();
		HighlightOnElement(ApplicationNumberSearch);
		Assert.assertTrue(ApplicationNumberSearch.isDisplayed(),"Test case pass");
		//excel.getExcelData(ApplicationNumberSearch, "AM_CaseNumber", 0, 1);
		ApplicationNumberSearch.sendKeys(Application_Number);
		waitForSomeTime();
		HighlightOnElement(Search_Button);
		Assert.assertTrue(Search_Button.isEnabled());
		Search_Button.click();
		waitForSomeTime();
		System.out.println(" To Verify Search_Button Link in Application of Water&Sewerage link is Present" ); //print for eclipse console

	}
	
	public void clickonActionbutton() throws InterruptedException
	{
		
		waitForSomeTime();
		HighlightOnElement(Action_Button);
		Assert.assertTrue(Action_Button.isEnabled());
		Action_Button.click();
		waitForSomeTime();
		waitForSomeTime();
		System.out.println(" To Verify Action_Button Link in Application of Water&Sewerage link is Present" ); //print for eclipse console

		
		
	}
	
	public void VeriftMenuTabsInApplicationNumber_SC_05_TC_04() throws InterruptedException
	{
		waitForSomeTime();
		HighlightOnElement(InvoiceDetails_Menu);
		Assert.assertEquals(true,InvoiceDetails_Menu.isEnabled());
		System.out.println(" To Verify InvoiceDetails_Menu Link in Application of Water&Sewerage link is Present" ); //print for eclipse console

		waitForSomeTime();
		HighlightOnElement(ReplyDrafted_Menu);
		Assert.assertEquals(true,ReplyDrafted_Menu.isEnabled());
		System.out.println(" To Verify ReplyDrafted_Menu Link in Application of Water&Sewerage link is Present" ); //print for eclipse console

		for(WebElement displayMenu:MenuFields)
		   {
			  HighlightOnElement(displayMenu);
			  String Fields=displayMenu.getText();
			  System.out.println("MenuFields In Pending Application Are:"+Fields );
			  Assert.assertNotNull(displayMenu.isDisplayed(),"Test case pass");
		   }
	
	}
				
	@FindBy(xpath="//div[@class='ui-panel-content ui-widget-content']/div[10]/ul/li/a[contains(.,'Advocate')]")
	private WebElement AdvocateMenu;
	
	@FindBy(xpath="(//button[contains(.,'View / Update')])[1]")
	private WebElement View_Update_Advocate;
	
	@FindBy(xpath="(//button[contains(.,'Edit')])[1]")
	private WebElement EditBtnAdvocate;
	
	@FindBy(xpath="//button[contains(.,'Update Advocate')]")
	private WebElement UpdateAdvocate;
	
	@FindBy(xpath=".//*[@id='inboxForm:advoicDia']/div[1]/a/span")
	private WebElement Close_POPUP;
	
	@FindBy(xpath="//div[@class='ui-panel-content ui-widget-content']/table/tbody/tr/td[2]/label[contains(.,'Update Advocate')]")
	private WebElement UpdateAdvocate1;
	
	public void toVerifyFunctionalityofAdvocateButton_SC_05_TC_05() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		waitForSomeTime();
		HighlightOnElement(AdvocateMenu);
		AdvocateMenu.click();
		Assert.assertEquals(true,AdvocateMenu.isEnabled());
		System.out.println(" To Verify waitForSomeTime(); Link in Application of Water&Sewerage link is Present" ); //print for eclipse console

		waitForSomeTime();
		HighlightOnElement(View_Update_Advocate);
		//View_Update_Advocate.click();
		Assert.assertEquals(true,View_Update_Advocate.isEnabled());
		System.out.println(" To Verify View_Update_Advocate Button in Application of Water&Sewerage link is Present" ); //print for eclipse console

	}
	
	
	
	public void toVerifyFunctionalityofUpdateAdvocateButton_SC_05_TC_06() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		waitForSomeTime();
		HighlightOnElement(View_Update_Advocate);
		View_Update_Advocate.click();
		Assert.assertEquals(true,View_Update_Advocate.isEnabled());
		System.out.println(" To Verify View_Update_Advocate Button in Application of Water&Sewerage link is Present" ); //print for eclipse console
		
		waitForSomeTime();
		HighlightOnElement(UpdateAdvocate1);
		//UpdateAdvocate.click();
		Assert.assertEquals(true,UpdateAdvocate1.isEnabled());
		System.out.println(" To Verify UpdateAdvocate1 Button in Application of Water&Sewerage link is Present" ); //print for eclipse console

	
	
	}
	
	public void closePOPup() throws InterruptedException
	{
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(Close_POPUP);
		Close_POPUP.click();
		waitForSomeTime();
		Assert.assertEquals(true,Close_POPUP.isEnabled());
		System.out.println(" To Verify Close_POPUP Button in Application of Water&Sewerage link is Present" ); //print for eclipse console
		waitForSomeTime();
	
	}
	
	@FindBy(xpath="(//table[@style='width:90%;margin-left:20px;margin-top: 15px;']/tbody/tr/td[2]/div/div[3]/span)")
	private WebElement SelectAdvocatePractise_Dropdown;
	
	@FindBy(xpath="//table[@style='width:90%;margin-left:20px;margin-top: 15px;']/tbody/tr[2]/td[2]/input")
	private WebElement AdvocateFee_Field;
	
	@FindBy(xpath="//table[@style='width:90%;margin-left:20px;margin-top: 15px;']/tbody/tr/td[4]/div/div[3]/span")
	private WebElement SelectAdvocate_Dropdown;
		
	@FindBy(xpath="html/body/div[17]/div/ul/li")
	private List<WebElement> Dropdownvalues_SelectAdvocate;
	
	@FindBy(xpath="(//button[contains(.,'Update Advocate')])[1]")
	private WebElement UpdateAdvocate_Button;
	
	public void toVerifyEditButtonFunctionalityofAdvocate_SC_05_TC_07() throws InterruptedException
	{
		
		HighlightOnElement(EditBtnAdvocate);
		EditBtnAdvocate.click();
		waitForSomeTime();
		HighlightOnElement(SelectAdvocatePractise_Dropdown);
		Assert.assertEquals(true,SelectAdvocatePractise_Dropdown.isEnabled());
		
		HighlightOnElement(AdvocateFee_Field);
		Assert.assertEquals(true,AdvocateFee_Field.isEnabled());
		
		HighlightOnElement(SelectAdvocate_Dropdown);
		Assert.assertEquals(true,SelectAdvocate_Dropdown.isEnabled());
		
		HighlightOnElement(UpdateAdvocate_Button);
		//UpdateAdvocate_Button.click();
		waitForSomeTime();
		Assert.assertEquals(true,UpdateAdvocate_Button.isEnabled());
		
		
	}
	
	@FindBy(xpath="//a[contains(.,'OIC')]")
	private WebElement OICMenu;
	
	@FindBy(xpath="//button[contains(.,'Add / View / Update')]")
	private WebElement Add_View_Update_OIC;
	
	@FindBy(xpath="(//button[contains(.,'Edit')])[1]")
	private WebElement EditBtnOIC;
	
	@FindBy(xpath="//button[contains(.,'Update OIC')]")
	private WebElement UpdateOIC;
	
	@FindBy(xpath=".//*[@id='inboxForm:advoicDia']/div[1]/a/span")
	private WebElement Close_POPUP1;
	
	@FindBy(xpath="//div[@class='ui-panel-content ui-widget-content']/table/tbody/tr/td[4]/label[contains(.,'Update OIC')]")
	private WebElement UpdateOIC1;
	
	@FindBy(xpath="(//button[contains(.,'Close')])[1]")
	private WebElement CloseBtn;
	
	public void toVerifyFunctionalityof_OICButton_SC_05_TC_08() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			waitForSomeTime();
			HighlightOnElement(OICMenu);
			OICMenu.click();
			waitForSomeTime();
			Assert.assertEquals(true,OICMenu.isEnabled());
			System.out.println(" To Verify OICMenu Link in Application of Water&Sewerage link is Present" ); //print for eclipse console

			waitForSomeTime();
			HighlightOnElement(Add_View_Update_OIC);
			Assert.assertEquals(true,Add_View_Update_OIC.isEnabled());
			System.out.println(" To Verify Add_View_Update_Advocate Button in Application of Water&Sewerage link is Present" ); //print for eclipse console
		
		}
	
	public void toVerifyFunctionalityofADD_View_UpdateOICButton_SC_05_TC_09() throws InterruptedException
	{
		
		waitForSomeTime();
		HighlightOnElement(Add_View_Update_OIC);
		Add_View_Update_OIC.click();
		waitForSomeTime();
		Assert.assertEquals(true,Add_View_Update_OIC.isEnabled());
		System.out.println(" To Verify View_Update_Advocate Button in Application of Water&Sewerage link is Present" ); //print for eclipse console

		HighlightOnElement(UpdateOIC1);
		Assert.assertEquals(true,UpdateOIC1.isEnabled());
		
	}	
	
	@FindBy(xpath="(//table[@style='width:90%;margin-left:20px;margin-top: 15px;']/tbody/tr/td[2]/div/div[3]/span)")
	private WebElement SelectOIC_Dropdown;
	
	public void toVerifyEditButtonFunctionalityofOIC_SC_05_TC_10() throws InterruptedException
	{
		HighlightOnElement(EditBtnOIC);
		EditBtnOIC.click();
		waitForSomeTime();
		HighlightOnElement(SelectOIC_Dropdown);
		Assert.assertEquals(true,SelectOIC_Dropdown.isEnabled());
		HighlightOnElement(UpdateOIC);
		Assert.assertEquals(true,UpdateOIC.isEnabled());
	}
	
	public void toVerifyCloseButtonFunctionalityofOIC_SC_05_TC_11() throws InterruptedException
	{
		ScroolDown();
		ScroolDown();
		HighlightOnElement(CloseBtn);
		Assert.assertEquals(true,CloseBtn.isEnabled());
		CloseBtn.click();
		waitForSomeTime();
	}
	
}

