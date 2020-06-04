package NRDA_LEGAL;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;


/**
 * @author Sarvesh.Nellore
 * @Date:06-11-2017
 * @Purpose: To verify the functionality of AM_LEGAL
 */
public class ToverifyfunctionalityofAM_Legal extends CommonLibrary 
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
	
	@FindBy(xpath="//div[@class='ui-accordion ui-widget ui-helper-reset ui-hidden-container Accordian-Header-Black']/h3")
	private  List<WebElement> homepagedisplay;
	
	
	public void verifyDisplayLink() throws InterruptedException
	{
	for(WebElement display:homepagedisplay)
	{
	HighlightOnElement(display);
	Assert.assertNotNull(display.isDisplayed(),"Test case pass");
	}
	}
	
	
	
	public void toVerifyMenuFieldsonDashBoard_SC_01_TC01() throws InterruptedException
	{
		try
		{
			
			HighlightOnElement(Home_Icon);
			Assert.assertEquals(true,Home_Icon.isEnabled());
			Reporter.log(" To Verify Home_Icon Link in Application of Water&Sewerage link is Present",true); //print for eclipse console

			HighlightOnElement(PendingApplication_Icon);
			Assert.assertEquals(true,PendingApplication_Icon.isEnabled());
			Reporter.log(" To Verify PendingApplication_Icon Link in Application of Water&Sewerage link is Present",true); //print for eclipse console

			
			HighlightOnElement(ApproveorRejectApplication_Icon);
			Assert.assertEquals(true,ApproveorRejectApplication_Icon.isEnabled());
			Reporter.log(" To Verify ApprovceRejectApplication_Icon Link in Application of Water&Sewerage link is Present",true); //print for eclipse console

			
			HighlightOnElement(InvoiceCollection_Icon);
			Assert.assertEquals(true,InvoiceCollection_Icon.isEnabled());
			Reporter.log(" To Verify InvoiceCollection_Icon Link in Application of Water&Sewerage link is Present",true); //print for eclipse console

			
			
			HighlightOnElement(PaymentCollection_Icon);
			Assert.assertEquals(true,PaymentCollection_Icon.isEnabled());
			Reporter.log(" To Verify PaymentCollection_Icon Link in Application of Water&Sewerage link is Present",true); //print for eclipse console
			
			
			HighlightOnElement(ApplicationForm_Icon);
			Assert.assertEquals(true,ApplicationForm_Icon.isEnabled());
			Reporter.log(" To Verify ApplicationForm_Icon Link in Application of Water&Sewerage link is Present",true); //print for eclipse console

			
			
			HighlightOnElement(MisReport_Icon);
			Assert.assertEquals(true,MisReport_Icon.isEnabled());
			Reporter.log(" To Verify MisReports_Icon Link in Application of Water&Sewerage link is Present",true); //print for eclipse console

			
			HighlightOnElement(CaseList_Icon);
			Assert.assertEquals(true,CaseList_Icon.isEnabled());
			Reporter.log(" To Verify CaseList_Icon Link in Application of Water&Sewerage link is Present",true); //print for eclipse console

		
			HighlightOnElement(ProcessLegalInvoice_Icon);
			Assert.assertEquals(true,ProcessLegalInvoice_Icon.isEnabled());
			Reporter.log(" To Verify ProcessLegalInvoice_Icon Link in Application of Water&Sewerage link is Present",true); //print for eclipse console

			
			HighlightOnElement(MeetingManagement_Icon);
			Assert.assertEquals(true,MeetingManagement_Icon.isEnabled());
			Reporter.log(" To Verify MeetingManagement_Icon Link in Application of Water&Sewerage link is Present",true); //print for eclipse console

		}

		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	public void toverifythefunctionalityofPendingApplications_SC_01_TC_02()
	{
		
		HighlightOnElement(PendingApplication_Icon);
		Assert.assertTrue(PendingApplication_Icon.isEnabled(),"Test Case Pass: PendingApplication_Icon");
		PendingApplication_Icon.click();
		Reporter.log(" To CXlick on PendingApplication_Icon Link in Application of Water&Sewerage  Successfully",true); //print for eclipse console

		
	}
	
	@FindBy(xpath="//div[@class='ui-accordion-content ui-helper-reset ui-widget-content']/div/div[2]/table/tbody/tr")
	private List <WebElement> NOOFROWSListonPopup;
	
	
	@FindBy(xpath="(//span[@class='ui-icon ui-icon-seek-first'])[1]")
	private WebElement SeekFirst_PendingList;
	
	@FindBy(xpath="(//span[@class='ui-icon ui-icon-seek-prev'])[1]")
	private WebElement SeekPrevious_PendingList;

	@FindBy(xpath="(//span[@class='ui-icon ui-icon-seek-end'])[1]")
	private WebElement Seekend_PendingList;
	
	@FindBy(xpath="(//span[@class='ui-icon ui-icon-seek-next'])[1]")
	private WebElement Seeknext_PendingList;
	
	public void toVerifyRecordPerPage02() throws InterruptedException
	{

		waitForSomeTime();
		int count=NOOFROWSListonPopup.size();
		if(count==10)
		{
			Assert.assertEquals(count,10);
			Reporter.log("Test case pass: Number of record per page is equal to 10",true);
		}
		else
		{
			Reporter.log("Test case fail: Number of record per page is greater or less than 10",true);
			Assert.assertNotEquals(count,10);
		}
		Reporter.log("No of record per page:"+count,true);
		waitForSomeTime();

		waitForSomeTime();
	}
	
	public void toVerifyPagination02() throws InterruptedException
	{
		waitForSomeTime();
		HighlightOnElement(SeekFirst_PendingList);
		HighlightOnElement(SeekPrevious_PendingList);
		HighlightOnElement(Seeknext_PendingList);
		HighlightOnElement(Seekend_PendingList);

		if(Seeknext_PendingList.isEnabled())
		{
			//Assert.assertTrue(Seeknext_PendingList.isDisplayed(),"TestCase Pass");
			Reporter.log("Test case pass: Pagination is working in List Application",true);
			Seeknext_PendingList.click();
			waitForSomeTime();
			SeekPrevious_PendingList.click();
		}
		else 
		{
			Assert.assertFalse(Seeknext_PendingList.isDisplayed(),"Test Case Fail");
			Reporter.log("Test case pass: Pagination is Not working in List Application",true);
		}

	}	

	@FindBy(xpath="//html/body/div[1]/table[2]/tbody/tr/td[2]/table/tbody/tr/td/form/div/div[2]/div[6]/div[1]/div/div[1]/div/table/thead/tr/th")
	private List <WebElement> NewCase_SubMenu;
	
	
	public void toVerifyFieldsonNewCaseSC_01_TC02() throws InterruptedException
	
	{
		waitForSomeTime();
		for(WebElement menulistnewCase:NewCase_SubMenu)
		{
			if(menulistnewCase.isDisplayed())
			{
				HighlightOnElement(menulistnewCase);
				String NEWCASEMenu=menulistnewCase.getText();
				Reporter.log(" Menu list under NewCase Is:"+NEWCASEMenu,true);
			}

		}
	
	}
	
	@FindBy(xpath="//a[contains(.,'Processed ')]")
	private WebElement ProcessedCase_Menu;
	

	@FindBy(xpath="(//span[@class='ui-icon ui-icon-seek-first'])[2]")
	private WebElement SeekFirst_PendingList1;
	
	@FindBy(xpath="(//span[@class='ui-icon ui-icon-seek-prev'])[2]")
	private WebElement SeekPrevious_PendingList1;

	@FindBy(xpath="(//span[@class='ui-icon ui-icon-seek-end'])[2]")
	private WebElement Seekend_PendingList1;
	
	@FindBy(xpath="(//span[@class='ui-icon ui-icon-seek-next'])[2]")
	private WebElement Seeknext_PendingList1;
	
	
	@FindBy(xpath="//html/body/div[1]/table[2]/tbody/tr/td[2]/table/tbody/tr/td/form/div/div[2]/div[6]/div[1]/div/div[1]/div/table/thead/tr/th")
	private List <WebElement> ProcessedCase_SubMenu;
	
	
public void toVerifyFieldsonProcessedCaseSC_01_TC03() throws InterruptedException
	
	{
		waitForSomeTime();
		for(WebElement menulistnewCase:ProcessedCase_SubMenu)
		{
			if(menulistnewCase.isDisplayed())
			{
				HighlightOnElement(menulistnewCase);
				String NEWCASEMenu=menulistnewCase.getText();
				Reporter.log(" Menu list under ProcessedCase Is:"+NEWCASEMenu,true);
			}

		}
	
	}

	
	public void toVerifyPagination_SC_01_TC_03() throws InterruptedException
	{
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(ProcessedCase_Menu);
		ProcessedCase_Menu.click();
		waitForSomeTime();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,650)", "");
		waitForSomeTime();
		HighlightOnElement(SeekFirst_PendingList1);
		HighlightOnElement(SeekPrevious_PendingList1);
		HighlightOnElement(Seeknext_PendingList1);
		HighlightOnElement(Seekend_PendingList1);
	
		if(Seeknext_PendingList.isEnabled())
		{
			Assert.assertTrue(Seeknext_PendingList1.isDisplayed(),"TestCase Pass");
			Reporter.log("Test case pass: Pagination is working in List Application",true);
			Seeknext_PendingList1.click();
			waitForSomeTime();
			SeekPrevious_PendingList1.click();
		}
		else 
		{
			Assert.assertFalse(Seeknext_PendingList1.isDisplayed(),"Test Case Fail");
			Reporter.log("Test case pass: Pagination is Not working in List Application",true);
		}
		
		
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-650)", "");
	
	
	}	
	
	
	@FindBy(xpath="html/body/div[1]/table[2]/tbody/tr/td[2]/table/tbody/tr/td/form/div/div[2]/div[6]/div[2]/div/div[2]/table/tbody/tr")
	private List <WebElement> NOOFROWSListonPopup1;
	
	public void toVerifyRecordPerPage_SC_01_TC_03() throws InterruptedException
	{

		
		waitForSomeTime();
		int count=NOOFROWSListonPopup1.size();
		if(count==10)
		{
			Assert.assertEquals(count,10);
			Reporter.log("Test case pass: Number of record per page is equal to 10",true);
		}
		else
		{
			Reporter.log("Test case fail: Number of record per page is greater or less than 10",true);
			Assert.assertNotEquals(count,10);
		}
		Reporter.log("No of record per page:"+count,true);
		waitForSomeTime();

		waitForSomeTime();
	}
	
	
	
	@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr/td[2]/input")
	private WebElement entervalueinsearchbox;
	
	@FindBy(xpath="//button/span[contains(text(),'Search')]")
	private WebElement searchbtn;
	
	@FindBy(xpath="//a[contains(.,'NEW CASE ENTRY')]")
	private WebElement NewCaseEntry_Menu;
	
	@FindBy(xpath="//a[contains(.,'Meeting Management')]")
	private WebElement MeetingManagement_Menu;
	
	public void toverifyApproveRejectLinkFunctionality_SC_01_TC_04() throws InterruptedException
	{
		
		HighlightOnElement(ApproveorRejectApplication_Icon);
		Assert.assertTrue(ApproveorRejectApplication_Icon.isEnabled(),"Test Case Pass: ApproveorRejectApplication_Icon");
		ApproveorRejectApplication_Icon.click();
		Reporter.log(" To CXlick on ApproveorRejectApplication_Icon Link in Application of Water&Sewerage  Successfully",true); //print for eclipse console
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(entervalueinsearchbox);
		Assert.assertEquals(true,entervalueinsearchbox.isEnabled());
		Reporter.log(" To Verify entervalueinsearchbox Link in Application of Water&Sewerage link is Present",true); //print for eclipse console
		
		HighlightOnElement(searchbtn);
		Assert.assertEquals(true,searchbtn.isEnabled());
		Reporter.log(" To Verify searchbtn  in Application of Water&Sewerage link is Present",true); //print for eclipse console

		HighlightOnElement(NewCaseEntry_Menu);
		Assert.assertEquals(true,NewCaseEntry_Menu.isEnabled());
		Reporter.log(" To Verify NewCaseEntry_Menu Link in Application of Water&Sewerage link is Present",true); //print for eclipse console
		
		HighlightOnElement(MeetingManagement_Menu);
		Assert.assertEquals(true,MeetingManagement_Menu.isEnabled());
		Reporter.log(" To Verify BODDepartment_Menu Link in Application of Water&Sewerage link is Present",true); //print for eclipse console
		
	}
	
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all scrollable']/div[2]/table/tbody/tr/td/label")
	private List <WebElement> PaymentCollection_Labels;
	
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all scrollable']/div[2]/table/tbody/tr[1]/td[3]/input")
	private WebElement ApplicationNumber_Field;
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all scrollable']/div[2]/table/tbody/tr[2]/td[3]/input")
	private WebElement BillNumber_Field;
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all scrollable']/div[2]/table/tbody/tr[1]/td[6]/input")
	private WebElement ApplicantName_Field;
	
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all scrollable']/div[2]/table/tbody/tr[2]/td[6]/input")
	private WebElement AadhaarNumber_Field;
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all scrollable']/div[2]/table/tbody/tr[1]/td[9]/input")
	private WebElement ConsumerID_Field;
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all scrollable']/div[2]/table/tbody/tr[2]/td[9]/div")
	private WebElement SectorDropdown_Field;
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all scrollable']/div[2]/table/tbody/tr[2]/td[9]/div")
	private WebElement ServicetypeDropdown_Field;
	
	@FindBy(xpath="//button[@id='form:search']")
	private WebElement SearchBtn;
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all scrollable']/div[2]/center/table/tbody/tr[1]/td[1]/label")
	private WebElement Service_label;
	
	@FindBy(xpath="//*[@id='form:sd']/div[3]")
	private WebElement ClickonServiceTypeDropdown;
	
	@FindBy(xpath="//html/body/div[9]/div[2]/ul/li")
	private List <WebElement> ServiceDropdownValues;
	
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all scrollable']/div[2]/table/tbody/tr[2]/td[9]/div[1]/div[3]/span")
	private WebElement ClickonSectorTypeDropdown;
	
	
	@FindBy(xpath="//html/body/div[7]/div[2]/ul/li")
	private  List<WebElement> SectorDropdownValues;
	
	
	
	public void toverifyPaymentCollectionsFunctionality_SC_01_TC_05() throws InterruptedException
	{
		
		HighlightOnElement(PaymentCollection_Icon);
		Assert.assertTrue(PaymentCollection_Icon.isEnabled(),"Test Case Pass: PaymentCollection_Icon");
		PaymentCollection_Icon.click();
		Reporter.log(" To CXlick on PaymentCollection_Icon Link in Application of Water&Sewerage  Successfully",true); //print for eclipse console
		waitForSomeTime();
		waitForSomeTime();
		
		waitForSomeTime();
		for(WebElement LabelsinPaymentCollection:PaymentCollection_Labels)
		{
			if(LabelsinPaymentCollection.isDisplayed())
			{
				HighlightOnElement(LabelsinPaymentCollection);
				String Labels=LabelsinPaymentCollection.getText();
				Reporter.log(" Menu list under PaymentCollection Is:"+Labels,true);
			}

		}
		
		waitForSomeTime();
		

		HighlightOnElement(ClickonSectorTypeDropdown);
		ClickonSectorTypeDropdown.click();

		for(int i=1;i<SectorDropdownValues.size();i++)
		{
			String value=SectorDropdownValues.get(i).getText();
			Reporter.log("Expected result:"+value,true);
			waitForSomeTime();
		}
		
		

		HighlightOnElement(ClickonServiceTypeDropdown);
		ClickonServiceTypeDropdown.click();

		for(int i=1;i<ServiceDropdownValues.size();i++)
		{
			String value=ServiceDropdownValues.get(i).getText();
			Reporter.log("Expected result:"+value,true);
			waitForSomeTime();
		}
		
		waitForSomeTime();
		HighlightOnElement(SearchBtn);
		Assert.assertEquals(true,SearchBtn.isEnabled());
		Reporter.log(" To Verify SearchBtn  in Application of Water&Sewerage  is Present",true); //print for eclipse console

	}
		
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/table/tbody/tr/td[2]/div/div[3]/span")
	private WebElement ClickonMisReportDropdown;
	
	@FindBy(xpath="//html/body/div[7]/div[2]/ul/li")
	private  List<WebElement> MisReportDropdownValues;
	
	@FindBy(xpath="//button[contains(.,'Search')]")
	private WebElement SearchBtn1;
	
	public void toverifyMisReportsFunctionality_SC_01_TC_06() throws InterruptedException
	{
		waitForSomeTime();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,350)", "");
		HighlightOnElement(MisReport_Icon);
		Assert.assertTrue(MisReport_Icon.isEnabled(),"Test Case Pass: MisReport_Icon");
		MisReport_Icon.click();
		Reporter.log(" To CXlick on MisReport_Icon Link in Application of Water&Sewerage  Successfully",true); //print for eclipse console
		waitForSomeTime();
		waitForSomeTime();
		
		HighlightOnElement(ClickonMisReportDropdown);
		ClickonMisReportDropdown.click();

		for(int i=1;i<MisReportDropdownValues.size();i++)
		{
			String value=MisReportDropdownValues.get(i).getText();
			Reporter.log("Expected result:"+value,true);
			waitForSomeTime();
		}
		
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(SearchBtn1);
		Assert.assertEquals(true,SearchBtn1.isEnabled());
		Reporter.log(" To Verify SearchBtn1  in Application of Water&Sewerage  is Present",true); //print for eclipse console

		
	}
		
	public void toverifyCaseListFunctionality_SC_01_TC_07() throws InterruptedException
	{
		waitForSomeTime();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,450)", "");
		HighlightOnElement(CaseList_Icon);
		Assert.assertTrue(CaseList_Icon.isEnabled(),"Test Case Pass: CaseList_Icon");
		CaseList_Icon.click();
		Reporter.log(" To CXlick on CaseList_Icon Link in Application of Water&Sewerage  Successfully",true); //print for eclipse console
		waitForSomeTime();
		waitForSomeTime();
		
	}
	
		@FindBy(xpath="//html/body/div[1]/table[2]/tbody/tr/td[2]/table/tbody/tr/td/form/div/div[2]/div[7]/div/div/div[1]/div/table/thead/tr/th")
		private List <WebElement> CaseforInvoiceing_SubMenu;
		
		public void toverifyProcessLegalInvoiceFunctionality_SC_01_TC_08() throws InterruptedException
		{
			waitForSomeTime();
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,450)", "");
			HighlightOnElement(ProcessLegalInvoice_Icon);
			Assert.assertTrue(ProcessLegalInvoice_Icon.isEnabled(),"Test Case Pass: ProcessLegalInvoice_Icon");
			ProcessLegalInvoice_Icon.click();
			Reporter.log(" To Click on ProcessLegalInvoice_Icon Link in Application of Water&Sewerage  Successfully",true); //print for eclipse console
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			
		}
	
		public void toVerifyFieldsonCasesforinvoicingSC_01_TC08() throws InterruptedException
			
			{
				waitForSomeTime();
				for(WebElement menulistnCaseforinvoice:CaseforInvoiceing_SubMenu)
				{
					if(menulistnCaseforinvoice.isDisplayed())
					{
						HighlightOnElement(menulistnCaseforinvoice);
						String CASESforInvoiceMenu=menulistnCaseforinvoice.getText();
						Reporter.log(" Menu list under NewCase Is:"+CASESforInvoiceMenu,true);
					}
		
				}
			
			}
	
	
		@FindBy(xpath="//div[@class='ui-accordion-content ui-helper-reset ui-widget-content']/div/div[2]/table/tbody/tr")
		private List <WebElement> NOOFROWSList;
		
		public void toVerifyRecordPerPage_SC_01_TC_08() throws InterruptedException
		{
		
			waitForSomeTime();
			int count=NOOFROWSList.size();
			if(count==10)
			{
				Assert.assertEquals(count,10);
				Reporter.log("Test case pass: Number of record per page is equal to 10",true);
			}
			else
			{
				Reporter.log("Test case fail: Number of record per page is greater or less than 10",true);
				Assert.assertNotEquals(count,10);
			}
			Reporter.log("No of record per page:"+count,true);
			waitForSomeTime();
		
			waitForSomeTime();
		}
		
		
		@FindBy(xpath="//button/span[contains(text(),'Reset')]")
		private WebElement resetbtn;
		
		@FindBy(xpath="//h3[@class='ui-accordion-header ui-helper-reset ui-state-default ui-state-active ui-corner-top']")
		private List <WebElement> Headings_MeetingManagement;
		
		
		public void toverifyMeetingManagementFunctionality_SC_01_TC_09() throws InterruptedException
		{
			waitForSomeTime();
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,450)", "");
			HighlightOnElement(MeetingManagement_Icon);
			Assert.assertTrue(MeetingManagement_Icon.isEnabled(),"Test Case Pass: MeetingManagement_Icon");
			MeetingManagement_Icon.click();
			Reporter.log(" To Click on MeetingManagement_Icon Link in Application of Water&Sewerage  Successfully",true); //print for eclipse console
			waitForSomeTime();
			waitForSomeTime();
			
			HighlightOnElement(entervalueinsearchbox);
			Assert.assertEquals(true,entervalueinsearchbox.isEnabled());
			Reporter.log(" To Verify entervalueinsearchbox Link in Application of Water&Sewerage link is Present",true); //print for eclipse console
			
			HighlightOnElement(searchbtn);
			Assert.assertEquals(true,searchbtn.isEnabled());
			Reporter.log(" To Verify searchbtn  in Application of Water&Sewerage link is Present",true); //print for eclipse console

			HighlightOnElement(resetbtn);
			Assert.assertEquals(true,resetbtn.isEnabled());
			Reporter.log(" To Verify resetbtn  in Application of Water&Sewerage link is Present",true); //print for eclipse console

			waitForSomeTime();
			for(WebElement menulist:Headings_MeetingManagement)
			{
				if(menulist.isDisplayed())
				{
					HighlightOnElement(menulist);
					String ListonMeetingManagement=menulist.getText();
					Reporter.log(" Menu list under Meeting Management Is:"+ListonMeetingManagement,true);
				}
	
			}
	
		
		}
	
		@FindBy(xpath="//h3[@class='ui-accordion-header ui-helper-reset ui-state-default ui-corner-all']/a")
		private List <WebElement> Headings_ApplicationForm;	
		
		
		public void toverifyApplicationFormFunctionality_SC_01_TC_10() throws InterruptedException
		{
			waitForSomeTime();
			HighlightOnElement(ApplicationForm_Icon);
			Assert.assertTrue(ApplicationForm_Icon.isEnabled(),"Test Case Pass: ApplicationForm_Icon");
			ApplicationForm_Icon.click();
			Reporter.log(" To Click on ApplicationForm_Icon Link in Application of Water&Sewerage  Successfully",true); //print for eclipse console
			waitForSomeTime();
			waitForSomeTime();
			
		}
		
		public void toVerifyMenuinApplicationForm_SC_01_TC10() throws InterruptedException
		
		{
			waitForSomeTime();
			for(WebElement menulist:Headings_ApplicationForm)
			{
				HighlightOnElement(menulist);
				Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
				if(menulist.isDisplayed())
				{
					String Menu=menulist.getText();
					Reporter.log(" Menu list under ApplicationForm Is:"+Menu,true);
				}

			}
		
		}

		
		@FindBy(xpath="//h3[@class='ui-accordion-header ui-helper-reset ui-state-default ui-corner-all']/a[contains(.,'LEGAL SECTION')]")
		private WebElement LegalSection_Menu;
		
		@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/table/tbody/tr/td/div/h3/following-sibling::div/table/tbody/tr/td/span[contains(text(),'NEW CASE ENTRY')]/../following-sibling::td/span/a/img[@src='/NRDAuthority/javax.faces.resource/applyNow.png.xhtml?ln=img']")
		private WebElement NewCaseEntry;
		
		@FindBy(xpath="//div[@class='ui-panel-content ui-widget-content']/div/ul/li")
		private List <WebElement> NewCaseEntry_UnderMenu;
		
		
		
		public void toverifyLegalDepartmentLink_SC_01_TC_11() throws InterruptedException
		{
			waitForSomeTime();
			HighlightOnElement(LegalSection_Menu);
			Assert.assertTrue(LegalSection_Menu.isEnabled(),"Test Case Pass: LegalSection_Menu");
			LegalSection_Menu.click();
			Reporter.log(" To CXlick on LegalSection_Menu Link in Application of Water&Sewerage  Successfully",true); //print for eclipse console
			waitForSomeTime();
			
			
			HighlightOnElement(NewCaseEntry);
			Assert.assertTrue(NewCaseEntry.isEnabled(),"Test Case Pass: NewCaseEntry");
			NewCaseEntry.click();
			Reporter.log(" To CXlick on NewCaseEntry Link in Application of Water&Sewerage  Successfully",true); //print for eclipse console
			waitForSomeTime();
			
		}
		
		public void toVerifyMenuinNewCaseEntry_SC_01_TC11() throws InterruptedException
				
				{
					waitForSomeTime();
					for(WebElement menulist:NewCaseEntry_UnderMenu)
					{
						
						Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
						if(menulist.isDisplayed())
						{
							HighlightOnElement(menulist);
							String Menu=menulist.getText();
							Reporter.log(" Menu list under NewCaseEntry Is:"+Menu,true);
						}
		
					}
				
				}
		
		
		@FindBy(xpath="//a[contains(.,'Case Basic Detail')]")
		private WebElement CaseBasicDetail_Link;
		
		@FindBy(xpath="//a[contains(.,'Connected Case Detail')]")
		private WebElement ConnectedCaseDetail_Link;
		
		@FindBy(xpath="//a[contains(.,'Land Detail')]")
		private WebElement LandDetail_Link;
		
		@FindBy(xpath="//table[@style='width: 100%;border-collapse: collapse;border: 0;']/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label")
		private List <WebElement> LabelsinCaseDetails;
		
		@FindBy(xpath="(//button[contains(.,'Reset')])[1]")
		private WebElement ResetBtn;
		
		@FindBy(xpath="(//button[contains(.,'Close')])[1]")
		private WebElement CloseBtn;
		
		@FindBy(xpath="(//button[contains(.,'Next')])[1]")
		private WebElement NextBtn;
		
		
		public void toVerifyCaseBasicDetailsLink_SC_01_TC12() throws InterruptedException
		
		{
			HighlightOnElement(CaseBasicDetail_Link);
			Assert.assertTrue(CaseBasicDetail_Link.isEnabled(),"Test Case Pass: CaseBasicDetail_Link");
			CaseBasicDetail_Link.click();
			Reporter.log(" To Click on CaseBasicDetail_Link Link in Application of Water&Sewerage  Successfully",true); //print for eclipse console
			waitForSomeTime();
			
			
			for(WebElement display:LabelsinCaseDetails)
			{
			HighlightOnElement(display);
			Assert.assertNotNull(display.isDisplayed(),"Test case pass");
			if(display.isDisplayed())
			{
				String Menu=display.getText();
				Reporter.log(" Labels under NewCaseEntry Is:"+Menu,true);
			}
			
			
			}
		
			
		}
		
		@FindBy(xpath="(//button[contains(.,'Reset')])[2]")
		private WebElement ResetBtn1;
		
		@FindBy(xpath="(//button[contains(.,'Close')])[2]")
		private WebElement CloseBtn1;
		
		@FindBy(xpath="(//button[contains(.,'Next')])[2]")
		private WebElement NextBtn1;
		
		@FindBy(xpath="(//button[contains(.,'Back')])[2]")
		private WebElement BackBtn1;
		
		
		
		public void toVerifyConnectedCaseDetailsLink_SC_01_TC13() throws InterruptedException
		
			{
				HighlightOnElement(ConnectedCaseDetail_Link);
				Assert.assertTrue(ConnectedCaseDetail_Link.isEnabled(),"Test Case Pass: ConnectedCaseDetail_Link");
				ConnectedCaseDetail_Link.click();
				waitForSomeTime();
				Reporter.log(" To Click on CaseBasicDetail_Link Link in Application of Water&Sewerage  Successfully",true); //print for eclipse console
				waitForDomElement();
				for(WebElement display:LabelsinCaseDetails)
				{
				HighlightOnElement(display);
				Assert.assertNotNull(display.isDisplayed(),"Test case pass");
				if(display.isDisplayed())
					{
						String Menu=display.getText();
						Reporter.log(" Labels under NewCaseEntry Is:"+Menu,true);
					}
				
				}
			
				
			}
		
		@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/thead/tr/td/span/label")
		private List <WebElement> LandDetails_Menu;
		
		@FindBy(xpath="(//button[contains(.,'Reset')])[3]")
		private WebElement ResetBtn2;
		
		@FindBy(xpath="(//button[contains(.,'Close')])[3]")
		private WebElement CloseBtn2;
		
		@FindBy(xpath="(//button[contains(.,'Back')])[3]")
		private WebElement BackBtn2;
		
		@FindBy(xpath="(//button[contains(.,'Submit')])")
		private WebElement SubmitBtn;
		
		@FindBy(xpath="(//button[contains(.,'Add More')])")
		private WebElement AddMoreBtn;
		
		
		public void toVerifyLandDetailsLink_SC_01_TC14() throws InterruptedException
		
		{
			HighlightOnElement(LandDetail_Link);
			Assert.assertTrue(LandDetail_Link.isEnabled(),"Test Case Pass: LandDetail_Link");
			LandDetail_Link.click();
			Reporter.log(" To Click on LandDetail_Link Link in Application of Water&Sewerage  Successfully",true); //print for eclipse console
			waitForSomeTime();
			for(WebElement display:LandDetails_Menu)
			{
			HighlightOnElement(display);
			Assert.assertNotNull(display.isDisplayed(),"Test case pass");
			if(display.isDisplayed())
			{
				String Menu=display.getText();
				Reporter.log(" Labels under LandDetails Is:"+Menu,true);
			}
			
			}
			
			/*HighlightOnElement(AddMoreBtn);
			Assert.assertTrue(AddMoreBtn.isEnabled(),"Test Case Pass: AddMoreBtn");
			Reporter.log(" AddMoreBtn  in Application of Water&Sewerage  Is Present",true); //print for eclipse console
			waitForSomeTime();*/
						
			HighlightOnElement(ResetBtn2);
			Assert.assertTrue(ResetBtn2.isEnabled(),"Test Case Pass: ResetBtn2");
			Reporter.log(" ResetBtn2  in Application of Water&Sewerage  Is Present",true); //print for eclipse console
			waitForSomeTime();
			
			HighlightOnElement(BackBtn2);
			Assert.assertTrue(BackBtn2.isEnabled(),"Test Case Pass: BackBtn2");
			Reporter.log(" BackBtn2  in Application of Water&Sewerage  Is Present",true); //print for eclipse console
			waitForSomeTime();
			
			HighlightOnElement(SubmitBtn);
			Assert.assertTrue(SubmitBtn.isEnabled(),"Test Case Pass: SubmitBtn");
			Reporter.log(" SubmitBtn  in Application of Water&Sewerage  Is Present",true); //print for eclipse console
			waitForSomeTime();
			
			HighlightOnElement(CloseBtn2);
			Assert.assertTrue(CloseBtn2.isEnabled(),"Test Case Pass: CloseBtn2");
			Reporter.log(" CloseBtn2  in Application of Water&Sewerage  Is Present",true); //print for eclipse console
			waitForSomeTime();
		
			
		}
		
		@FindBy(xpath="//select[@title='Court Type']")
		private WebElement CourtType_Dropdown;
		
		@FindBy(xpath="//select[@title='Nature of Case (Assigned by Court)']")
		private WebElement Natureofcase_Dropdown;
		
		@FindBy(xpath="//input[@title='Case Number (Assigned by Court)']")
		private WebElement CaseNumberbyCourt_Field;
		
		@FindBy(xpath="//select[@title='Case Year']")
		private WebElement CaseYear_Dropdown;
		
		@FindBy(xpath="//input[@title='NRDA File Number']")
		private WebElement NRDAfileNumber_Field;
		
		@FindBy(xpath="//input[@title='Title of Case']")
		private WebElement TitleofCase_Field;
		
		@FindBy(xpath="//textarea[@title='Case Detail in Brief']")
		private WebElement CaseDetailinBrief_Field;
		
		@FindBy(xpath="//input[@title='Date of Filing of Case']")
		private WebElement DateofFillingCase_Field;
		
		@FindBy(xpath="//input[@title='Date of First Listing in Court']")
		private WebElement DateofFirstListing_Field;
		
		@FindBy(xpath="//input[@title[contains(.,'Date of Receiving')]]")
		private WebElement DateofReceiving_Field;
		
		@FindBy(xpath="//input[@title[contains(.,'Last Date of Reply Submission')]]")
		private WebElement LastDateofReplySubmission_Field;
		
		@FindBy(xpath="//select[@title='Category of Case (Department Categorization of Court)']")
		private WebElement CategoryofCase_Dropdown;
		
		@FindBy(xpath="//textarea[@title='Remarks by Court']")
		private WebElement RemarksByCourt_Field;
				
		@FindBy(xpath="//textarea[@title='Previous Reference (if Any)']")
		private WebElement PreviousRefference_Field;
		
		@FindBy(xpath="//select[@title='Current Case Status']")
		private WebElement CurrentCaseStatus_Dropdown;
		
		@FindBy(xpath="//textarea[@title='Remarks by Head of Department']")
		private WebElement RemarksByHeadofDepartment_Field;
		
		@FindBy(xpath="//select[@title='NRDA Status in Court']")
		private WebElement NRDAStausinCourt_Dropdown;
		
		@FindBy(xpath="//input[@title='Case Number']")
		private WebElement CaseNumber_Field;
		
		//@FindBy(xpath="html/body/div[2]/table[2]/tbody/tr/td[2]/table/tbody/tr/td/form/span[2]/span/div/div[2]/div/div/div[2]/table/tbody/tr/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td/span/input")
		@FindBy(xpath="(//input[@title[contains(.,'Date of Filing')]])[2]")
		private WebElement DateofFilling_Field;
		
		//@FindBy(xpath="html/body/div[8]/div[2]/button[1]")
		@FindBy(xpath=".//*[@id='ui-datepicker-div']/div[2]/button[1]")
		private WebElement TodayBtn_Dateoffilling;
		
		@FindBy(xpath="//textarea[@title='Case Detail']")
		private WebElement CaseDetail_Field;
		
		@FindBy(xpath="//textarea[@title='Lower Court Order Detail']")
		private WebElement LowerCourtOrderDetail_Field;
		
		@FindBy(xpath="(//input[@title[contains(.,'Date of Decision')]])")
		private WebElement DateofDecision_Field;
		
		@FindBy(xpath="//table[@style='width:100%;border: 1px white solid;']/tbody/tr/td[2]/table/tbody/tr/td/span/div/div[1]/label")
		private WebElement uploadorderfile;
		
		@FindBy(xpath="//select[@title='Lower Court Name']")
		private WebElement LowerCourtName_Dropdown;
		
		@FindBy(xpath="//select[@title='Whether the Case Against Land']")
		private WebElement WeatherthecaseAgainstLand_Dropdown;
				
		@FindBy(xpath="//select[@title='District']")
		private WebElement District_Dropdown;
		
		@FindBy(xpath="//select[@title='Tehsil']")
		private WebElement Tehsil_Dropdown;
				
		@FindBy(xpath="//select[@title='Village']")
		private WebElement Village_Dropdown;
		
		//@FindBy(xpath="//input[@title='Measles number']")
		@FindBy(xpath="//input[@title='Khasra Number']")
		private WebElement measlesNumber_Field;
		
		@FindBy(xpath="//input[@title='Land Acquisition Number']")
		private WebElement LandAciquisitionNumber_Field;
		
		@FindBy(xpath="//*[@id='ui-datepicker-div']/div[2]/button[1]")
		private WebElement TodayButton_DateOfFillingCase;
		
		@FindBy(xpath="//*[@id='ui-datepicker-div']/div[2]/button[1]")
		private WebElement TodayButton_FirstListingInCourt;
		
		@FindBy(xpath="//*[@id='ui-datepicker-div']/div[2]/button[1]")
		private WebElement TodayButton_DateOfReceiving;
		
		@FindBy(xpath=".//*[@id='ui-datepicker-div']/table/tbody/tr/td/a[contains(.,'29')]")
		private WebElement LastDateSubmission;
		
		@FindBy(xpath=".//*[@id='ui-datepicker-div']/table/tbody/tr/td/a[contains(.,'30')]")
		private WebElement LastDateDecision;
		
		
		
		
		
		public void tofillvaliddatainApplicationForm() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
			{
			waitForSomeTime();	
			HighlightOnElement(CourtType_Dropdown);
			Assert.assertTrue(CourtType_Dropdown.isEnabled(),"Test Case Pass: CourtType_Dropdown");
			SelectVisibleText(CourtType_Dropdown, "High Court");
			Reporter.log(" CourtType_Dropdown  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console

			HighlightOnElement(Natureofcase_Dropdown);
			Assert.assertTrue(Natureofcase_Dropdown.isEnabled(),"Test Case Pass: Natureofcase_Dropdown");
			SelectVisibleText(Natureofcase_Dropdown, "Civil Appeal");
			Reporter.log(" Natureofcase_Dropdown  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
			waitForDomElement();
			Thread.sleep(10000);
			// clickelement(CaseNumberbyCourt_Field, 20);

			HighlightOnElement(CaseNumberbyCourt_Field);
			Assert.assertTrue(CaseNumberbyCourt_Field.isEnabled(),"Test Case Pass: CaseNumberbyCourt_Field");
			excel.getExcelData(CaseNumberbyCourt_Field, "Application_AM_LEGAL", 1, 2);
			Reporter.log(" CaseNumberbyCourt_Field  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
			waitForDomElement();

			HighlightOnElement(CaseYear_Dropdown);
			Assert.assertTrue(CaseYear_Dropdown.isEnabled(),"Test Case Pass: CaseYear_Dropdown");
			SelectVisibleText(CaseYear_Dropdown, "2017");
			Reporter.log(" CaseYear_Dropdown  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
			waitForDomElement();

			HighlightOnElement(NRDAfileNumber_Field);
			Assert.assertTrue(NRDAfileNumber_Field.isEnabled(),"Test Case Pass: NRDAfileNumber_Field");
			excel.getExcelData(NRDAfileNumber_Field, "Application_AM_LEGAL", 1, 3);
			Reporter.log(" NRDAfileNumber_Field  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
			waitForDomElement();

			HighlightOnElement(TitleofCase_Field);
			Assert.assertTrue(TitleofCase_Field.isEnabled(),"Test Case Pass: TitleofCase_Field");
			excel.getExcelData(TitleofCase_Field, "Application_AM_LEGAL", 1, 4);
			Reporter.log(" TitleofCase_Field  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
			waitForDomElement();

			HighlightOnElement(CaseDetailinBrief_Field);
			Assert.assertTrue(CaseDetailinBrief_Field.isEnabled(),"Test Case Pass: CaseDetailinBrief_Field");
			excel.getExcelData(CaseDetailinBrief_Field, "Application_AM_LEGAL", 1, 5);
			Reporter.log(" CaseDetailinBrief_Field  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
			waitForDomElement();

			HighlightOnElement(DateofFillingCase_Field);
			Assert.assertTrue(DateofFillingCase_Field.isEnabled(),"Test Case Pass: DateofFillingCase_Field");
			DateofFillingCase_Field.click();
			HighlightOnElement(TodayButton_DateOfFillingCase);
			TodayButton_DateOfFillingCase.click();
			Reporter.log(" TodayButton_DateOfFillingCase  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
			waitForDomElement();

			HighlightOnElement(DateofFirstListing_Field);
			Assert.assertTrue(DateofFirstListing_Field.isEnabled(),"Test Case Pass: DateofFirstListing_Field");
			DateofFirstListing_Field.click();
			HighlightOnElement(TodayButton_FirstListingInCourt);
			TodayButton_FirstListingInCourt.click();
			Reporter.log(" TodayButton_FirstListingInCourt  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
			//waitForDomElement();
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(DateofReceiving_Field);
			//Assert.assertTrue(DateofReceiving_Field.isEnabled(),"Test Case Pass: DateofReceiving_Field");
			DateofReceiving_Field.click();
			HighlightOnElement(TodayButton_DateOfReceiving);
			TodayButton_DateOfReceiving.click();
			Reporter.log(" TodayButton_DateOfReceiving  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
			waitForDomElement();

			HighlightOnElement(LastDateofReplySubmission_Field);
			Assert.assertTrue(LastDateofReplySubmission_Field.isEnabled(),"Test Case Pass: LastDateofReplySubmission_Field");
			LastDateofReplySubmission_Field.click();
			HighlightOnElement(LastDateSubmission);
			LastDateSubmission.click();
			Reporter.log(" LastDateSubmission  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
			waitForDomElement();

			HighlightOnElement(CategoryofCase_Dropdown);
			Assert.assertTrue(CategoryofCase_Dropdown.isEnabled(),"Test Case Pass: CategoryofCase_Dropdown");
			SelectVisibleText(CategoryofCase_Dropdown, "COMPLAINT CASE");
			Reporter.log(" CategoryofCase_Dropdown  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
			waitForDomElement();
			Thread.sleep(8000);
			//clickelement(RemarksByCourt_Field, 20);


			HighlightOnElement(RemarksByCourt_Field);
			Assert.assertTrue(RemarksByCourt_Field.isEnabled(),"Test Case Pass: RemarksByCourt_Field");
			excel.getExcelData(RemarksByCourt_Field, "Application_AM_LEGAL", 1, 6);
			Reporter.log(" RemarksByCourt_Field  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
			waitForDomElement();

			HighlightOnElement(PreviousRefference_Field);
			Assert.assertTrue(PreviousRefference_Field.isEnabled(),"Test Case Pass: PreviousRefference_Field");
			excel.getExcelData(PreviousRefference_Field, "Application_AM_LEGAL", 1, 7);
			Reporter.log(" PreviousRefference_Field  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
			waitForDomElement();
			
			HighlightOnElement(CurrentCaseStatus_Dropdown);
			Assert.assertTrue(CurrentCaseStatus_Dropdown.isEnabled(),"Test Case Pass: CurrentCaseStatus_Dropdown");
			SelectVisibleText(CurrentCaseStatus_Dropdown, "Pending");
			//SelectVisibleText(CurrentCaseStatus_Dropdown, "Pending / विचाराधीन");
			Reporter.log(" CurrentCaseStatus_Dropdown  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
			waitForDomElement();
			Thread.sleep(8000);
			ScroolDown();

			HighlightOnElement(RemarksByHeadofDepartment_Field);
			waitForSomeTime();
			Assert.assertTrue(RemarksByHeadofDepartment_Field.isEnabled(),"Test Case Pass: RemarksByHeadofDepartment_Field");
			excel.getExcelData(RemarksByHeadofDepartment_Field, "Application_AM_LEGAL", 1, 8);
			Reporter.log(" RemarksByHeadofDepartment_Field  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
			waitForDomElement();

			HighlightOnElement(NRDAStausinCourt_Dropdown);
			waitForSomeTime();
			Assert.assertTrue(NRDAStausinCourt_Dropdown.isEnabled(),"Test Case Pass: NRDAStausinCourt_Dropdown");
			SelectVisibleText(NRDAStausinCourt_Dropdown, "Appellant");
			//SelectVisibleText(NRDAStausinCourt_Dropdown, "Appellant / अपीलकर्ता");
			Reporter.log(" NRDAStausinCourt_Dropdown  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
			waitForDomElement();
			Thread.sleep(8000);
			ScroolUp();

			HighlightOnElement(ConnectedCaseDetail_Link);
			Assert.assertTrue(ConnectedCaseDetail_Link.isEnabled(),"Test Case Pass: ConnectedCaseDetail_Link");
			ConnectedCaseDetail_Link.click();
			Reporter.log(" To Click on CaseBasicDetail_Link Link in Application of Water&Sewerage  Successfully",true); //print for eclipse console
			waitForDomElement();
			waitForelementPresent(CaseNumber_Field);

			HighlightOnElement(CaseNumber_Field);
			Assert.assertTrue(CaseNumber_Field.isEnabled(),"Test Case Pass: CaseNumber_Field");
			excel.getExcelData(CaseNumber_Field, "Application_AM_LEGAL", 1, 13);
			Reporter.log("CaseNumber_Field  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
			waitForDomElement();


			HighlightOnElement(DateofFilling_Field);
			Assert.assertTrue(DateofFilling_Field.isEnabled(),"Test Case Pass: DateofFilling_Field");
			DateofFilling_Field.click();
			HighlightOnElement(TodayBtn_Dateoffilling);
			TodayBtn_Dateoffilling.click();
			Reporter.log(" TodayBtn_Dateoffilling  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
			waitForDomElement();

			HighlightOnElement(CaseDetail_Field);
			Assert.assertTrue(CaseDetail_Field.isEnabled(),"Test Case Pass: CaseDetail_Field");
			excel.getExcelData(CaseDetail_Field, "Application_AM_LEGAL", 1, 14);
			Reporter.log("CaseDetail_Field  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
			waitForDomElement();

			HighlightOnElement(LowerCourtOrderDetail_Field);
			Assert.assertTrue(LowerCourtOrderDetail_Field.isEnabled(),"Test Case Pass: LowerCourtOrderDetail_Field");
			excel.getExcelData(LowerCourtOrderDetail_Field, "Application_AM_LEGAL", 1, 15);
			Reporter.log("LowerCourtOrderDetail_Field  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
			waitForDomElement();	

			HighlightOnElement(DateofDecision_Field);
			Assert.assertTrue(DateofDecision_Field.isEnabled(),"Test Case Pass: DateofDecision_Field");
			DateofDecision_Field.click();
			HighlightOnElement(LastDateDecision);
			LastDateDecision.click();
			Reporter.log(" LastDateDecision  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
			waitForDomElement();
			
			HighlightOnElement(uploadorderfile);
			uploadorderfile.click();
			waitForSomeTime();
			UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur.jpg");
			Reporter.log("ApplicantIDProof Document Link Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 
			waitForSomeTime();
			waitForSomeTime();
			
			HighlightOnElement(LowerCourtName_Dropdown);
			waitForSomeTime();
			Assert.assertTrue(LowerCourtName_Dropdown.isEnabled(),"Test Case Pass: LowerCourtName_Dropdown");
			SelectVisibleText(LowerCourtName_Dropdown, "High Court");
			Reporter.log(" LowerCourtName_Dropdown  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
			waitForDomElement();
			Thread.sleep(8000);
			
			
			HighlightOnElement(LandDetail_Link);
			Assert.assertTrue(LandDetail_Link.isEnabled(),"Test Case Pass: LandDetail_Link");
			LandDetail_Link.click();
			Reporter.log(" To Click on LandDetail_Link Link in Application of Water&Sewerage  Successfully",true); //print for eclipse console
			waitForDomElement();
			waitForelementPresent(District_Dropdown);
			HighlightOnElement(District_Dropdown);
			CaptchaAlertandAccept();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			
			
			/*HighlightOnElement(WeatherthecaseAgainstLand_Dropdown);
			waitForSomeTime();
			Assert.assertTrue(WeatherthecaseAgainstLand_Dropdown.isEnabled(),"Test Case Pass: WeatherthecaseAgainstLand_Dropdown");
			SelectVisibleText(WeatherthecaseAgainstLand_Dropdown, "Yes / Yes");
			Reporter.log(" LowerCourtName_Dropdown  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
			waitForSomeTime();
			
			HighlightOnElement(District_Dropdown);
			waitForSomeTime();
			Assert.assertTrue(District_Dropdown.isEnabled(),"Test Case Pass: District_Dropdown");
			SelectVisibleText(District_Dropdown, "Raipur");
			Reporter.log(" District_Dropdown  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			
			HighlightOnElement(Tehsil_Dropdown);
			waitForSomeTime();
			Assert.assertTrue(Tehsil_Dropdown.isEnabled(),"Test Case Pass: Tehsil_Dropdown");
			SelectVisibleText(Tehsil_Dropdown, "Abnpur");
			Reporter.log(" Tehsil_Dropdown  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
			waitForSomeTime();
			waitForSomeTime();
			
			HighlightOnElement(Village_Dropdown);
			waitForSomeTime();
			Assert.assertTrue(Village_Dropdown.isEnabled(),"Test Case Pass: Village_Dropdown");
			SelectVisibleText(Village_Dropdown, "Banjari");
			Reporter.log(" Village_Dropdown  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
			waitForSomeTime();
			waitForSomeTime();
			
			HighlightOnElement(measlesNumber_Field);
			Assert.assertTrue(measlesNumber_Field.isEnabled(),"Test Case Pass: measlesNumber_Field");
			excel.getExcelData(measlesNumber_Field, "Application_AM_LEGAL", 1, 20);
			Reporter.log("measlesNumber_Field  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
			waitForDomElement();
			
			HighlightOnElement(LandAciquisitionNumber_Field);
			Assert.assertTrue(LandAciquisitionNumber_Field.isEnabled(),"Test Case Pass: LandAciquisitionNumber_Field");
			excel.getExcelData(LandAciquisitionNumber_Field, "Application_AM_LEGAL", 1, 21);
			Reporter.log("LandAciquisitionNumber_Field  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
			waitForDomElement();*/
			waitForSomeTime();
			
		}	
		
		@FindBy(xpath="//div[@id='form0:confirmDlg']/div[2]/div/div/center/table/tbody/tr/td/button")
		private List<WebElement> button;
		
		public void toverifyCloseButtonFunctionality_SC_01_TC_15() throws InterruptedException
		{
			HighlightOnElement(CloseBtn2);
			Assert.assertTrue(CloseBtn2.isEnabled(),"Test Case Pass: CloseBtn2");
			CloseBtn2.click();
			Reporter.log("CloseBtn2  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
			waitForDomElement();
			waitForSomeTime();
			
			   for(int index=0;index<button.size();index++)
			    {
				  String buttone=button.get(index).getText();
				 Reporter.log("Buttons in Popup page is:"+buttone,true);
				    
				  if( buttone.trim().equalsIgnoreCase("Yes"))
				     {
					   button.get(index).click();
					   waitForSomeTime();
					  
					   Reporter.log("Verify Yes Button In POP-UP Of Application In Water&Sewerage New Connection  is Present",true);
				     }
			    }
			 
			 waitForSomeTime();
			
			
	
		}
			
	public void toverifyResetButtonFunctionality_SC_01_TC_16() throws InterruptedException
	{
		
		HighlightOnElement(ResetBtn2);
		Assert.assertTrue(ResetBtn2.isEnabled(),"Test Case Pass: ResetBtn2");
		ResetBtn2.click();
		Reporter.log("ResetBtn2  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
		waitForDomElement();
		waitForSomeTime();	
		
		VerifyTextField(CaseNumberbyCourt_Field);
		VerifyTextField(NRDAfileNumber_Field);
		VerifyTextField(TitleofCase_Field);
		VerifyTextField(CaseDetailinBrief_Field);
		VerifyTextField(RemarksByCourt_Field);
		VerifyTextField(PreviousRefference_Field);
		VerifyTextField(RemarksByHeadofDepartment_Field);
		
		HighlightOnElement(ConnectedCaseDetail_Link);
		ConnectedCaseDetail_Link.click();
		waitForDomElement();
		VerifyTextField(CaseNumber_Field);
		VerifyTextField(CaseDetail_Field);
		VerifyTextField(LowerCourtOrderDetail_Field);
		
		HighlightOnElement(LandDetail_Link);
		LandDetail_Link.click();
		VerifyTextField(measlesNumber_Field);
		VerifyTextField(LandAciquisitionNumber_Field);	
	}

	public void toverifyResetButtonFunctionality_SC_01_TC_17() throws InterruptedException
	 {
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(SubmitBtn);
		Assert.assertTrue(SubmitBtn.isEnabled(),"Test Case Pass: SubmitBtn");
		SubmitBtn.click();
		Reporter.log("SubmitBtn  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
		waitForDomElement();
		waitForSomeTime();	
		
	 }

	@FindBy(xpath="//div[@class='ui-panel-content ui-widget-content']/table/tbody/tr/td[4]/a")
	private WebElement CaseTarckingNumber;
	
	@FindBy(xpath="//div[@class='ui-tabs ui-widget ui-widget-content ui-corner-all ui-hidden-container ui-tabs-top']/ul/li[contains(.,'Advocate')]")
	private WebElement AdvocateMenu;
	
	//@FindBy(xpath="(//button[contains(.,'Assign')])[1]")
	@FindBy(xpath="//div[@class='ui-tabs ui-widget ui-widget-content ui-corner-all ui-hidden-container ui-tabs-top']/div/div[9]/span/center/button[contains(.,'Assign')]")
	private WebElement Advocate_Assign;
	
	@FindBy(xpath="(//table[@style='width:90%;margin-left:20px;margin-top: 15px;']/tbody/tr/td[2]/div/div[3]/span)[3]")
	private WebElement SelectAdvocatePractise_Dropdown;
	
	@FindBy(xpath="//html/body/div[15]/div/ul/li")
	private List<WebElement> Dropdownvalues_Advocate;
	
	@FindBy(xpath="//table[@style='width:90%;margin-left:20px;margin-top: 15px;']/tbody/tr[2]/td[2]/input")
	private WebElement AdvocateFee_Field;
	
	@FindBy(xpath="//table[@style='width:90%;margin-left:20px;margin-top: 15px;']/tbody/tr/td[4]/div/div[3]/span")
	private WebElement SelectAdvocate_Dropdown;
		
	@FindBy(xpath="html/body/div[17]/div/ul/li")
	private List<WebElement> Dropdownvalues_SelectAdvocate;
	
	@FindBy(xpath="(//button[contains(.,'Assign Advocate')])[1]")
	private WebElement AssignAdvocate_Button;
	
	@FindBy(xpath=".//*[@id='inboxForm:tableAdvo']/div/table")
	private WebElement AssignAdvocate_ResultGrid;
	
	@FindBy(xpath="(//button[contains(.,'Edit')])[1]")
	private WebElement EditBtn_ResultGrid;
	
	@FindBy(xpath=".//*[@id='inboxForm:advoicDia']/div[1]/a/span")
	private WebElement Close_Popup;
	
	@FindBy(xpath="//a[contains(.,'OIC')]")
	private WebElement OICMenu;
	
	//@FindBy(xpath="(//button[contains(.,'Assign')])[3]")
	@FindBy(xpath="//div[@class='ui-tabs ui-widget ui-widget-content ui-corner-all ui-hidden-container ui-tabs-top']/div/div[10]/span/center/button[contains(.,'Assign')]")
	private WebElement OIC_Assign;
	
	@FindBy(xpath="(//button[contains(.,'Assign')])[2]")
	private WebElement OIC_Assign1;
	
	@FindBy(xpath="(//table[@style='width:90%;margin-left:20px;margin-top: 15px;']/tbody/tr/td[2]/div/div[3]/span)[3]")
	private WebElement SelectOIC_Dropdown;
	
	@FindBy(xpath="html/body/div[17]/div/ul/li")
	private List<WebElement> Dropdownvalues_OIC;
	
	@FindBy(xpath="(//button[contains(.,'Assign OIC')])[1]")
	private WebElement AssignOIC_Button;
	
	@FindBy(xpath=".//*[@id='inboxForm:table1Oic']/div/table")
	private WebElement AssignOIC_ResultGrid;
	
	//@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr/td[2]/div/div[3]/span")
	@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[1]/tbody/tr/td/select")
	private WebElement selectAction_Dropdown;
	
	@FindBy(xpath="html/body/div[17]/div/ul/li")
	private List <WebElement> selectAction_DropdownValues;
	
	//@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr/td[3]/span/div/div/span")
	@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[1]/tbody/tr/td[3]/span/select")
	private WebElement selectUser_Dropdown;
	
	@FindBy(xpath="html/body/div[18]/div/ul/li")
	private List <WebElement> selectUser_DropdownValues;
	
	@FindBy(xpath="(//table[@class='ui-panelgrid ui-widget']/tbody/tr/td[2]/input)[1]")
	private WebElement Subject_Field;
	
	@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr/td[2]/table/tbody/tr/td[1]/input")
	private WebElement FileNo_Field;
	
	@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr[3]/td[2]/textarea")
	private WebElement Enter_CommentsField;
	
	@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr[4]/td[2]/table/tbody/tr/td/div/div[1]/label")
	private WebElement UploadDocumentBtn;
	
	@FindBy(xpath=".//*[@id='inboxForm:msg_container']/div/div/div[2]/span")
	private WebElement PopupMsg;
	
	@FindBy(xpath=".//*[@id='headerForm:growl_container']/div/div/div[2]/span")
	private WebElement PopupMsg1;

	public void verifysubmitbuttonfunctionality() throws InterruptedException
	{
		
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(SubmitBtn);
		Assert.assertTrue(SubmitBtn.isEnabled(),"Test Case Pass: SubmitBtn");
		SubmitBtn.click();
		Reporter.log("SubmitBtn  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
		waitForDomElement();
		waitForSomeTime();
		waitForSomeTime();
		
		
	}
	


	public void toverifyAdvocateButtonFonctionality_SC_01_TC_17() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		HighlightOnElement(AdvocateMenu);
		Assert.assertTrue(AdvocateMenu.isEnabled(),"Test Case Pass: AdvocateMenu");
		AdvocateMenu.click();
		waitForSomeTime();
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

		/*for(int i=1;i<Dropdownvalues_Advocate.size();i++)
		{
			String value=Dropdownvalues_Advocate.get(i).getText();
			Reporter.log("Dropdownvalues_Advocate:"+value,true);
			if(value.equalsIgnoreCase("Criminal"))
			{
				Dropdownvalues_Advocate.get(i).click();
				waitForSomeTime();
			}
			waitForSomeTime();
		}
*/
		waitForSomeTime();
		
		HighlightOnElement(AdvocateFee_Field);
		Assert.assertTrue(AdvocateFee_Field.isEnabled(),"Test Case Pass: AdvocateFee_Field");
		AdvocateFee_Field.clear();
		excel.getExcelData(AdvocateFee_Field, "Application_AM_LEGAL", 1, 23);
		Reporter.log("AdvocateFee_Field  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
		waitForDomElement();
		waitForSomeTime();
		HighlightOnElement(SelectAdvocate_Dropdown);
		SelectAdvocate_Dropdown.click();
		waitForSomeTime();
		selectValueFromDropdown("Vikas Mishra");

		/*for(int i=1;i<Dropdownvalues_SelectAdvocate.size();i++)
		{
			waitForSomeTime();
			String value=Dropdownvalues_SelectAdvocate.get(i).getText();
			Reporter.log("Dropdownvalues_SelectAdvocate:"+value,true);
			if(value.equalsIgnoreCase("Vikas Mishra"))
			{
				Dropdownvalues_SelectAdvocate.get(i).click();
				waitForSomeTime();
			}
			waitForSomeTime();
		}
*/
		waitForSomeTime();
		
		HighlightOnElement(AssignAdvocate_Button);
		Assert.assertTrue(AssignAdvocate_Button.isEnabled(),"Test Case Pass: AssignAdvocate_Button");
		AssignAdvocate_Button.click();
		Reporter.log("AdvocateFee_Field  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
		waitForDomElement();
		waitForSomeTime();
		
		HighlightOnElement(PopupMsg);
		String Expected_Message="Data saved successfully!";
		String Actual_Message=PopupMsg.getText();
		Assert.assertEquals(Expected_Message, Actual_Message);
		waitForSomeTime();
		
		HighlightOnElement(AssignAdvocate_ResultGrid);
		Assert.assertTrue(AssignAdvocate_ResultGrid.isEnabled(),"Test Case Pass: AssignAdvocate_ResultGrid");
		AssignAdvocate_ResultGrid.click();
		Reporter.log("AssignAdvocate_ResultGrid  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
		waitForDomElement();
		
		HighlightOnElement(EditBtn_ResultGrid);
		Assert.assertTrue(EditBtn_ResultGrid.isEnabled(),"Test Case Pass: EditBtn_ResultGrid");
		Reporter.log("EditBtn_ResultGrid  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
		waitForDomElement();
		
		HighlightOnElement(Close_Popup);
		waitForSomeTime();
		Close_Popup.click();
		waitForSomeTime();
		waitForSomeTime();
	
	}
	
	public void toverifyOICButtonFonctionality_SC_01_TC_18() throws InterruptedException
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
		waitForSomeTime();
		selectValueFromDropdown("OIC-LEGAL-01");

		/*for(int i=1;i<Dropdownvalues_OIC.size();i++)
		{
			String value=Dropdownvalues_OIC.get(i).getText();
			Reporter.log("Dropdownvalues_OIC:"+value,true);
			if(value.equalsIgnoreCase("OIC-LEGAL-01"))
			{
				waitForSomeTime();
				Dropdownvalues_OIC.get(i).click();
				waitForSomeTime();
			}
			waitForSomeTime();
		}
*/
		waitForSomeTime();
		
		HighlightOnElement(AssignOIC_Button);
		Assert.assertTrue(AssignOIC_Button.isEnabled(),"Test Case Pass: AssignOIC_Button");
		AssignOIC_Button.click();
		Reporter.log("AssignOIC_Button  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
		waitForDomElement();
		waitForSomeTime();
		
		
		HighlightOnElement(PopupMsg);
		String Expected_Message="Data saved successfully!";
		String Actual_Message=PopupMsg.getText();
		Assert.assertEquals(Expected_Message, Actual_Message);
		waitForSomeTime();
		
		HighlightOnElement(AssignOIC_ResultGrid);
		Assert.assertTrue(AssignOIC_ResultGrid.isEnabled(),"Test Case Pass: AssignOIC_ResultGrid");
		AssignOIC_ResultGrid.click();
		Reporter.log("AssignOIC_ResultGrid  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
		waitForDomElement();
		
		HighlightOnElement(EditBtn_ResultGrid);
		Assert.assertTrue(EditBtn_ResultGrid.isEnabled(),"Test Case Pass: EditBtn_ResultGrid");
		Reporter.log("EditBtn_ResultGrid  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
		waitForDomElement();
		
		HighlightOnElement(Close_Popup);
		waitForSomeTime();
		waitForSomeTime();
		Close_Popup.click();
		waitForSomeTime();
	
	}
	
	public void toverifySubmitButtonFonctionality_SC_01_TC_19() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
		
			waitForSomeTime();
			waitForSomeTime();
			ScroolDown();
			HighlightOnElement(selectAction_Dropdown);
			//selectAction_Dropdown.click();
			waitForSomeTime();
			//selectValueFromDropdown("Forward");
			SelectVisibleText(selectAction_Dropdown, "Forward");
			/*for(int i=1;i<selectAction_DropdownValues.size();i++)
			{
				waitForSomeTime();
				String value=selectAction_DropdownValues.get(i).getText();
				Reporter.log("selectAction_DropdownValues:"+value,true);
				if(value.equalsIgnoreCase("Forward"))
				{
					selectAction_DropdownValues.get(i).click();
					waitForSomeTime();
				}
				waitForSomeTime();
			}*/
			waitForSomeTime();
			
			HighlightOnElement(selectUser_Dropdown);
			//selectUser_Dropdown.click();
			waitForSomeTime();
			//selectValueFromDropdown("Yuvraj Singh (M-LEGAL)");
			SelectVisibleText(selectUser_Dropdown, "Yuvraj Singh (M-LEGAL)");
			/*for(int i=1;i<selectUser_DropdownValues.size();i++)
			{
				waitForSomeTime();
				String value=selectUser_DropdownValues.get(i).getText();
				Reporter.log("selectUser_DropdownValues:"+value,true);
				if(value.equalsIgnoreCase("Yuvraj Singh (M-LEGAL)"))
				{
					selectUser_DropdownValues.get(i).click();
					waitForSomeTime();
				}
				waitForSomeTime();
			}*/
			waitForSomeTime();
			

			HighlightOnElement(Subject_Field);
			waitForSomeTime();
			Assert.assertTrue(Subject_Field.isEnabled(),"Test Case Pass: Subject_Field");
			//excel.getExcelData(Subject_Field, "Application_AM_LEGAL", 1, 24);
			Reporter.log("Subject_Field  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
			waitForDomElement();
			waitForSomeTime();
			HighlightOnElement(FileNo_Field);
			Assert.assertTrue(FileNo_Field.isEnabled(),"Test Case Pass: FileNo_Field");
			//excel.getExcelData(FileNo_Field, "Application_AM_LEGAL", 1, 25);
			Reporter.log("FileNo_Field  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
			waitForDomElement();
			waitForSomeTime();
			
			
			HighlightOnElement(SearchButton_Fileno);
			SearchButton_Fileno.click();
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(CreateNewFile_Button);
			CreateNewFile_Button.click();
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(SubjectField1);
			excel.getExcelData(SubjectField1, "Application_AM_LEGAL", 1, 24);
			waitForSomeTime();
			HighlightOnElement(FileField1);
			excel.getExcelData(FileField1, "Application_AM_LEGAL", 1, 25);
			waitForSomeTime();
			HighlightOnElement(Type_Dropdown);
			//Type_Dropdown.click();
			SelectVisibleText(Type_Dropdown, "File");
			waitForSomeTime();
			//selectValueFromDropdown("File");
			HighlightOnElement(Category_Dropdown);
			//Category_Dropdown.click();
			SelectVisibleText(Category_Dropdown, "Case File");
			waitForSomeTime();
			//selectValueFromDropdown("Case File");
			HighlightOnElement(Department_Dropdown);
			//Department_Dropdown.click();
			SelectVisibleText(Department_Dropdown, "LEGAL SECTION");
			waitForSomeTime();
			//selectValueFromDropdown("LEGAL SECTION");
			waitForSomeTime();
			HighlightOnElement(IsConditional_Checkbox);
			IsConditional_Checkbox.click();
			HighlightOnElement(SUBMITBTN);
			SUBMITBTN.click();
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(Checkbox1);
			Checkbox1.click();
			waitForSomeTime();
			HighlightOnElement(FillInForm_Button);
			FillInForm_Button.click();
			waitForSomeTime();
			waitForSomeTime();
						
			waitForSomeTime();
			HighlightOnElement(Enter_CommentsField);
			Assert.assertTrue(Enter_CommentsField.isEnabled(),"Test Case Pass: Enter_CommentsField");
			excel.getExcelData(Enter_CommentsField, "Application_AM_LEGAL", 1, 26);
			Reporter.log("Enter_CommentsField  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
			waitForDomElement();
			
			
			HighlightOnElement(UploadDocumentBtn);
			UploadDocumentBtn.click();
			waitForSomeTime();
			UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur.jpg");
			Reporter.log("ApplicantIDProof Document Link Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 
			waitForSomeTime();
			waitForSomeTime();
			
			HighlightOnElement(SubmitButton1);
			Assert.assertTrue(SubmitButton1.isEnabled(),"Test Case Pass: CloseButton");
			SubmitButton1.click();
			waitForSomeTime();
			Reporter.log("CloseButton  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
			waitForDomElement();
		
			HighlightOnElement(PopupMsg1);
			String Expected_Message="Your application submitted successfully.";
			String Actual_Message=PopupMsg1.getText();
			Assert.assertEquals(Expected_Message, Actual_Message);
			waitForSomeTime();
			waitForSomeTime();
		
		}
	
	
	@FindBy(xpath="//div[@class='ui-panel-content ui-widget-content']/table/tbody/tr/td[4]/a")
	private WebElement CaseTracking_Number;
	
	@FindBy(xpath="(//button[contains(.,'Submit')])[2]")
	private WebElement SubmitButton1;
	
	@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr/td[2]/table/tbody/tr/td[2]/button[contains(.,'Search')]")
	private WebElement SearchButton_Fileno;
	
	@FindBy(xpath="(//div[@class='ui-dialog-content ui-widget-content']/div/div/table/tbody/tr/td[3]/input)[1]")
	private WebElement SubjectField;
	
	@FindBy(xpath="//div[@class='ui-dialog-content ui-widget-content']/div/div/table/tbody/tr/td[6]/input")
	private WebElement FileField;
	
	@FindBy(xpath="//button[contains(.,'Create New File')]")
	private WebElement CreateNewFile_Button;
	
	@FindBy(xpath="//button[contains(.,'Fill In Form')]")
	private WebElement FillInForm_Button;
	
	@FindBy(xpath="(//div[@class='ui-dialog-content ui-widget-content']/div/div/table/tbody/tr/td[3]/input)[2]")
	private WebElement SubjectField1;
	
	@FindBy(xpath="//div[@class='ui-dialog-content ui-widget-content']/div/div/table/tbody/tr/td[6]/table/tbody/tr/td[3]/input")
	private WebElement FileField1;
	
	//@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr[2]/td[3]/div/div/span")
	@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr[2]/td[3]/select")
	private WebElement Type_Dropdown;
	
	//@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr[2]/td[6]/div/div/span")
	@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr[2]/td[6]/select")
	private WebElement Category_Dropdown;
	
	//@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr[3]/td[3]/div/div/span")
	@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr[3]/td[3]/select")
	private WebElement Department_Dropdown;
	
	@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr[3]/td[6]/div/div[2]")
	private WebElement IsConditional_Checkbox;
	
	@FindBy(xpath=".//*[@id='inboxForm:searchdata_data']/tr/td[1]/div/div[2]")
	private WebElement Checkbox1;
	
	@FindBy(xpath="//span[contains(.,'Create File')]/../following-sibling::div/div/div/center/table/tbody/tr/td/button[contains(.,'Submit')]")
	private WebElement SUBMITBTN;
	
	
	public void SetCaseTrackingNumberinExcel() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		HighlightOnElement(CaseTarckingNumber);
		waitForSomeTime();
		String CaseTrackingNumber=CaseTarckingNumber.getText();
		excel.updateExcelData1(CaseTrackingNumber);
		waitForSomeTime();
		waitForSomeTime();
	
	}
	
	
	
	
	
	
	
	
	
	
}