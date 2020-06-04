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
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;


/**
 * @author Sarvesh.Nellore
 * @Date: 01-12-2017
 * @Purpose: ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee
 */
public class ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee extends CommonLibrary 
{
	Logger log=Logger.getLogger("devpinoyLogger");
	ExcelDataDriver excel=new ExcelDataDriver();
	
	
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[contains(.,'Home')]")
	private WebElement Home_Icon;
	
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[contains(.,'Pending Application')]")
	private WebElement PendingApplication_Icon;
	
	@FindBy(xpath="//a[contains(.,'Environment Section')]")
	private WebElement EnvironmentSectionLink;
	
	@FindBy(xpath="//span[contains(.,'ENVIRONMENT NOC')]")
	private WebElement EnvironmentNOC;
	
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
	
	public void toverifyDashBoardMenu_SC_04_TC_01() throws InterruptedException
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
		
	
		HighlightOnElement(ApplicationForm_Icon);
		Assert.assertEquals(true,ApplicationForm_Icon.isEnabled());
		System.out.println(" To Verify ApplicationForm_Icon Link in Application of Water&Sewerage link is Present" ); //print for eclipse console

		
		HighlightOnElement(MisReport_Icon);
		Assert.assertEquals(true,MisReport_Icon.isEnabled());
		System.out.println(" To Verify MisReports_Icon Link in Application of Water&Sewerage link is Present" ); //print for eclipse console

		
		HighlightOnElement(CaseList_Icon);
		Assert.assertEquals(true,CaseList_Icon.isEnabled());
		System.out.println(" To Verify CaseList_Icon Link in Application of Water&Sewerage link is Present" ); //print for eclipse console


		HighlightOnElement(ProcessLegalInvoice_Icon);
		Assert.assertEquals(true,ProcessLegalInvoice_Icon.isEnabled());
		System.out.println(" To Verify ProcessLegalInvoice_Icon Link in Application of Water&Sewerage link is Present" ); //print for eclipse console

	
		HighlightOnElement(MeetingManagement_Icon);
		Assert.assertEquals(true,MeetingManagement_Icon.isEnabled());
		System.out.println(" To Verify MeetingManagement_Icon Link in Application of Water&Sewerage link is Present" ); //print for eclipse console

	}

	catch(Exception ex)
	{
		ex.printStackTrace();
	}
 }
	
	
	public void toVerifyPendingApplicationLink_SC_04_TC_02() throws InterruptedException
	{
		waitForSomeTime();
		HighlightOnElement(PendingApplication_Icon);
		Assert.assertTrue(PendingApplication_Icon.isEnabled(),"Test Case Pass: PendingApplication_Icon");
		PendingApplication_Icon.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForelementPresent(entervalueinsearchbox);
		HighlightOnElement(entervalueinsearchbox);
		System.out.println(" To Click on PendingApplication_Icon Link in Application of Water&Sewerage  Successfully" ); //print for eclipse console
		
	}
	
	public void toVerifyEnvironmentSectionLink_SC_04_TC_02() throws InterruptedException
	{
		waitForSomeTime();
		HighlightOnElement(EnvironmentSectionLink);
		Assert.assertTrue(EnvironmentSectionLink.isEnabled(),"Test Case Pass: EnvironmentSectionLink");
		EnvironmentSectionLink.click();
		waitForSomeTime();
		Reporter.log(" To Click on EnvironmentSectionLink Link in Application of Environment  Successfully",true ); //print for eclipse console
		HighlightOnElement(EnvironmentNOC);
		EnvironmentNOC.click();
		Reporter.log(" To Click on EnvironmentNoc Link in Application of Environment  Successfully",true ); //print for eclipse console
		waitForSomeTime();
		waitForSomeTime();
	}
	
	
	@FindBy(xpath="//h3[@class='ui-accordion-header ui-helper-reset ui-state-default ui-state-active ui-corner-top']/a")
	private List <WebElement> HeadingsInPendingApplication;
	
	@FindBy(xpath="//div[@class='ui-datatable ui-widget']/div[2]/table/thead/tr/th/span")
	private List <WebElement> menuList;
	
	@FindBy(xpath="//a[contains(.,'ENVIRONMENT NOC')]/../following-sibling::div/div/div[1]/table/thead/tr/th")
	private List <WebElement> EnvironmentNOC_Menu;
	
	
	@FindBy(xpath="//div[@class='col-md-9']/div/div/div/div/div[1]/div")
	private List <WebElement> HeadingsInApplications;
	
	
	public void toverifythedashboardoftheApplication() throws InterruptedException
	{
		waitForSomeTime();
		for(WebElement menulist:HeadingsInApplications)
		{
			HighlightOnElement(menulist);
			Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
			if(menulist.isDisplayed())
			{
				String Menu=menulist.getText();
				System.out.println(" Menu list inDash Board are:"+Menu );
			}

		}
		
		
		
		
		
	}
	
	
	public void toVerifyPendingApplicationMenulist() throws InterruptedException
	{
		
		waitForSomeTime();
		for(WebElement menulist:menuList)
		{
			HighlightOnElement(menulist);
			Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
			if(menulist.isDisplayed())
			{
				String Menu=menulist.getText();
				System.out.println(" Menu list EnvironmentNOc IS  Is:"+Menu );
			}

		}
	/*	waitForSomeTime();
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

		}*/
		
	}
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/div/div/table/tbody/tr/td[2]/input")
	private WebElement entervalueinsearchbox;
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/div/div/table/tbody/tr/td[3]/button[contains(.,'Search')]")
	private WebElement searchbtn;
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/div/div/table/tbody/tr/td[4]/button[contains(.,'Reset')]")
	private WebElement Resetbtn;
	
	@FindBy(xpath="//a[contains(.,'ENVIRONMENT NOC')]/../following-sibling::div/div/div[1]/table/tbody/tr/td/a/img[@src='/NRDAuthority/resources/images/view-new.png']")
	private WebElement Action_Button;
	@FindBy(xpath="//a[contains(.,'Environment NOC')]/../following-sibling::div/div/div/div/div[2]/table/tbody/tr/td/center/a/img[@src='/NRDAuthorityPreUAT/resources/images/view-new.png']")
	private WebElement Action1_Button;
	
	
	@FindBy(xpath="//div[@class='ui-datatable ui-widget']/div[2]/table/thead/tr/th[2]/input")
	private WebElement ApplicationNumberField;
	
	@FindBy(xpath="//div[@class='ui-datatable ui-widget']/div[2]/table/thead/tr/th[2]/input")
	private WebElement TableGrid;
	
	@FindBy(xpath="//div[@class='ui-datatable ui-widget']/div[2]/table/tbody/tr/td[contains(.,'No application found')]")
	private WebElement Error_Message;
	
	public void toVerifyPendingApplicationWithValidNumber_SC_04_TC_03() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		HighlightOnElement(ApplicationNumberField);
		Assert.assertTrue(ApplicationNumberField.isEnabled(),"Test Case Pass: ApplicationNumberField");
		excel.getExcelData(ApplicationNumberField, "Environment_Application_Number", 0, 1);
		waitForSomeTime();
		waitForSomeTime();
		/*HighlightOnElement(searchbtn);
		Assert.assertTrue(searchbtn.isEnabled(),"Test Case Pass: searchbtn");
		searchbtn.click();
		waitForSomeTime();
		System.out.println(" To Click on searchbtn Link in Application of Water&Sewerage  Successfully" ); //print for eclipse console
		*/
		HighlightOnElement(TableGrid);
		
		/*waitForSomeTime();
		for(WebElement menulist:EnvironmentNOC_Menu)
		{
			HighlightOnElement(menulist);
			Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
			if(menulist.isDisplayed())
			{
				String Menu=menulist.getText();
				System.out.println(" Menu Under Environment NOC Is:"+Menu );
			}

		}*/
		waitForSomeTime();
		HighlightOnElement(Action1_Button);
		Assert.assertTrue(Action1_Button.isEnabled(),"Test Case Pass: Action_Button");
		waitForSomeTime();
	
	}
	
	@FindBy(xpath="//div[@class='ui-accordion-content ui-helper-reset ui-widget-content']/div/div/div/div[3]/span[4]")
	private WebElement Seeknext;
	
	@FindBy(xpath="//div[@class='ui-accordion-content ui-helper-reset ui-widget-content']/div/div/div/div[3]/span[5]")
	private WebElement Seekend;
	
	@FindBy(xpath="//div[@class='ui-accordion-content ui-helper-reset ui-widget-content']/div/div/div/div[3]/span[2]")
	private WebElement Seekprevious;
	
	@FindBy(xpath="//div[@class='ui-accordion-content ui-helper-reset ui-widget-content']/div/div/div/div[3]/span[1]")
	private WebElement Seekfirst;
	
	
	
	
	public void toveriftthePaginationinPendingApplications() throws InterruptedException
	{
		waitForSomeTime();
		HighlightOnElement(Seeknext);
		HighlightOnElement(Seekend);
		HighlightOnElement(Seekprevious);
		HighlightOnElement(Seekfirst);

		if(Seeknext.isEnabled())
		{
			Assert.assertTrue(Seeknext.isDisplayed(),"TestCase Pass");
			Reporter.log("Test case pass: Pagination is Displayed in PendingList Application",true);
			Seeknext.click();
			waitForSomeTime();
			Seekprevious.click();
			waitForSomeTime();
		}
		else 
		{
			Assert.assertFalse(Seeknext.isDisplayed(),"Test Case Fail");
			Reporter.log("Test case pass: Pagination is Not Displayed in PendingList Application",true);
		}
		
	
	}
	
	
	public void toverifythefunctionalityofsearchfiledasInvalidApplicationNumber() throws InterruptedException
	{
		HighlightOnElement(ApplicationNumberField);
		ApplicationNumberField.sendKeys("bfhjsfhgeu546");
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(Error_Message);
	
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
	
	
	@FindBy(xpath="//div/div//span[contains(.,'Basic Details')]")
	private WebElement BasicDetailsHeading;
	
	public void toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		HighlightOnElement(Action1_Button);
		Action1_Button.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForelementPresent(BasicDetailsHeading);
		HighlightOnElement(BasicDetailsHeading);
		
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
	
	@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[1]/tbody/tr/td/div/div[3]/span")
	//@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[1]/tbody/tr/td/select")
	private WebElement SelectActionDropdownLink;
	
	//@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[1]/tbody/tr/td[3]/span/select")
	@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[1]/tbody/tr/td[3]/span/table/tbody/tr/td/div/div[3]/span")
	private WebElement SelectUserDropdown;
	
	@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[2]/tbody/tr/td/textarea")
	private WebElement EnterCommentsField;
	
	@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[2]/tbody/tr/td/table/tbody/tr/td/div/div[1]/label")
	private WebElement UploadingDocument;
	
	
	@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr/td[2]/table/tbody/tr/td[2]/button[contains(.,'Search')]")
	private WebElement SearchButton_Fileno;
	
	@FindBy(xpath="//button[contains(.,'Create New File')]")
	private WebElement CreateNewFile_Button;
	
	@FindBy(xpath="//button[contains(.,'Fill In Form')]")
	private WebElement FillInForm_Button;
	
	@FindBy(xpath="//span[contains(.,'Create File')]/../following-sibling::div/div/div/table/tbody/tr/td[2]/input")
	private WebElement SubjectField1;
	
	@FindBy(xpath="//span[contains(.,'Create File')]/../following-sibling::div/div/div/table/tbody/tr/td[4]/table/tbody/tr/td/input")
	private WebElement FileField1;
	
	//@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr[2]/td[3]/div/div/span")
	@FindBy(xpath="//span[contains(.,'Create File')]/../following-sibling::div/div/div/table/tbody/tr[2]/td[2]/div/div[3]")
	private WebElement Type_Dropdown;
	
	//@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr[2]/td[6]/div/div/span")
	@FindBy(xpath="//span[contains(.,'Create File')]/../following-sibling::div/div/div/table/tbody/tr[2]/td[4]/div/div[3]")
	private WebElement Category_Dropdown;
	
	//@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr[3]/td[3]/div/div/span")
	@FindBy(xpath="//span[contains(.,'Create File')]/../following-sibling::div/div/div/table/tbody/tr[3]/td[2]/div/div[3]")
	private WebElement Department_Dropdown;
	
	@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr[3]/td[6]/div/div[2]")
	private WebElement IsConditional_Checkbox;
	
	@FindBy(xpath=".//*[@id='inboxForm:searchdata_data']/tr/td[1]/div/div[2]")
	private WebElement Checkbox1;
	
	@FindBy(xpath="//span[contains(.,'Create File')]/../following-sibling::div/div/div/center/table/tbody/tr/td/button[contains(.,'Submit')]")
	private WebElement SUBMITBTN;
	
	@FindBy(xpath="//span[contains(.,'Search Action')]/../following-sibling::div/div/div/table/tbody/tr/td/label")
	private List <WebElement> LAbelsinPopupWindow;
	
	public void toVerifyfunctionalitySubjectField() throws InterruptedException
	{
		
		HighlightOnElement(Subject_Field);
		Assert.assertTrue(Subject_Field.isEnabled(),"Test Case Pass: Subject_Field");
		VerifyTextFieldisEditable(Subject_Field);
	
	}
	
	public void toVerifyfunctionalityFileField() throws InterruptedException
	{
		
		HighlightOnElement(FileNo_Field);
		Assert.assertTrue(FileNo_Field.isEnabled(),"Test Case Pass: FileNo_Field");
		VerifyTextFieldisEditable(FileNo_Field);
	
	}
	
	@FindBy(xpath=".//*[@id='inboxForm:srchDlg']/div[1]/a/span")
	private WebElement POPUP_CLOSE;
	
	@FindBy(xpath=".//*[@id='inboxForm:createFileDlg']/div[1]/a/span")
	private WebElement POPUP_CLOSE1;
	
	
	@FindBy(xpath="//button[contains(.,'Clear')]")
	private WebElement Clear_Button;
	
	public void toverifytheSearchbuttonFunctionality() throws InterruptedException
	{
		
		HighlightOnElement(SearchButton_Fileno);
		Assert.assertTrue(SearchButton_Fileno.isEnabled(),"Test Case Pass: SearchButton_Fileno");
		SearchButton_Fileno.click();
		waitForSomeTime();
		for(WebElement menulist:LAbelsinPopupWindow)
		{
			HighlightOnElement(menulist);
			Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
			if(menulist.isDisplayed())
			{
				String Menu=menulist.getText();
				System.out.println(" Labels in popup window  Is:"+Menu );
			}

		}
		HighlightOnElement(POPUP_CLOSE);
		POPUP_CLOSE.click();
		waitForSomeTime();
		waitForSomeTime();
		
	}
	
	public void toverifyfunctionalityofClearButton() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		HighlightOnElement(SearchButton_Fileno);
		Assert.assertTrue(SearchButton_Fileno.isEnabled(),"Test Case Pass: SearchButton_Fileno");
		SearchButton_Fileno.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(CreateNewFile_Button);
		CreateNewFile_Button.click();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(SubjectField1);
		excel.getExcelData(SubjectField1, "Environmental_Application_Form", 1, 54);
		waitForSomeTime();
		HighlightOnElement(FileField1);
		waitForSomeTime();
		excel.getExcelData(FileField1, "Environmental_Application_Form", 1, 55);
		waitForSomeTime();
		HighlightOnElement(Type_Dropdown);
		Type_Dropdown.click();
		waitForSomeTime();
		selectValueFromDropdown("File");
		//SelectVisibleText(Type_Dropdown, "File");
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(Category_Dropdown);
		Category_Dropdown.click();
		waitForSomeTime();
		selectValueFromDropdown("Land");
		//SelectVisibleText(Category_Dropdown, "Land");
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(Department_Dropdown);
		Department_Dropdown.click();
		waitForSomeTime();
		selectValueFromDropdown("Environment Section");
		//SelectVisibleText(Department_Dropdown, "ENVIRONMENT SECTION");
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(Clear_Button);
		Assert.assertTrue(Clear_Button.isEnabled(),"Test Case Pass: Clear_Button");
		Clear_Button.click();
		waitForSomeTime();
		waitForSomeTime();
		VerifyTextField(SubjectField1);
		VerifyTextField(FileField1);
		HighlightOnElement(POPUP_CLOSE1);
		POPUP_CLOSE1.click();
		waitForSomeTime();
		HighlightOnElement(POPUP_CLOSE);
		POPUP_CLOSE.click();
		waitForSomeTime();
		
		
	}
	
	
	
	
	public void toVerifyfunctionalitySelectingActionDropdownasForward() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		waitForSomeTime();
		waitForelementPresent(BasicDetailsHeading);
		HighlightOnElement(BasicDetailsHeading);
		HighlightOnElement(SelectActionDropdownLink);
		Assert.assertTrue(SelectActionDropdownLink.isEnabled(),"Test Case Pass: SelectActionDropdownLink");
		//SelectVisibleText(SelectActionDropdownLink, "Forward");
		SelectActionDropdownLink.click();
		waitForSomeTime();
		selectValueFromDropdown("Forward");
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(SelectUserDropdown);
		//SelectVisibleText(SelectUserDropdown, "Ravindra Jain (AM-ENV)");
		Assert.assertTrue(SelectUserDropdown.isEnabled(),"Test Case Pass: SelectUserDropdown");
		SelectUserDropdown.click();
		selectValueFromDropdown("Poonam Sharma (AM)");
		waitForSomeTime();
		waitForSomeTime();
		
	}
	
	@FindBy(xpath="(//table[@class='ui-panelgrid ui-widget']/tbody/tr/td[2]/input)[1]")
	private WebElement Subject_Field;
	
	@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr/td[2]/table/tbody/tr/td[1]/input")
	private WebElement FileNo_Field;
	
	public void ToverifyFunctionalityofSearchbuttoncreatenewfile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
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
		excel.getExcelData(SubjectField1, "Environmental_Application_Form", 1, 54);
		waitForSomeTime();
		HighlightOnElement(FileField1);
		FileField1.click();
		waitForSomeTime();
		excel.getExcelData(FileField1, "Environmental_Application_Form", 1, 55);
		waitForSomeTime();
		HighlightOnElement(Type_Dropdown);
		Type_Dropdown.click();
		waitForSomeTime();
		selectValueFromDropdown("File");
		waitForSomeTime();
		waitForSomeTime();
		//SelectVisibleText(Type_Dropdown, "File");
		HighlightOnElement(Category_Dropdown);
		Category_Dropdown.click();
		waitForSomeTime();
		selectValueFromDropdown("Land");
		waitForSomeTime();
		waitForSomeTime();
		//SelectVisibleText(Category_Dropdown, "Land");
		HighlightOnElement(Department_Dropdown);
		Department_Dropdown.click();
		waitForSomeTime();
		selectValueFromDropdown("Environment Section");
		//SelectVisibleText(Department_Dropdown, "ENVIRONMENT SECTION");
		waitForSomeTime();
		waitForSomeTime();
		//HighlightOnElement(IsConditional_Checkbox);
		//IsConditional_Checkbox.click();
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
		VerifyTextField(Subject_Field);
		waitForSomeTime();
		VerifyTextField(FileNo_Field);
		
		
		
	}
	
	
	
	public void toVerifyfunctionalityofUploadingDocument() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		
		
		HighlightOnElement(UploadingDocument);
		UploadingDocument.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur.jpg");
		System.out.println("Upload Document Link Application of Water and Sewerage Environment Section is Present" ); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	}
	
	@FindBy(xpath=".//*[@id='inboxForm:msg_container']/div/div/div[2]/span")
	private WebElement Popup_ErrorMsg;
	
	public void toVerifyfunctionalityofUploadingInvalidDocument() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
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
	
	public void toVerifyfunctionalityofEnterCommentsField() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		HighlightOnElement(EnterCommentsField);
		Assert.assertTrue(EnterCommentsField.isEnabled(),"Test Case Pass: EnterCommentsField");
		excel.getExcelData(EnterCommentsField, "Environmental_Application_Form", 1, 56);
		waitForSomeTime();
		waitForSomeTime();
	}
	
	
	@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/../following-sibling::center/button[contains(.,'Close')]")
	private WebElement Close_Button;
	
	@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/../following-sibling::center/button[contains(.,'Submit')]")
	private WebElement Submit_Button;
	
	public void toVerifyfunctionalityofCloseButton() throws InterruptedException
	{
		HighlightOnElement(Close_Button);
		Assert.assertTrue(Close_Button.isEnabled(),"Test Case Pass: Close_Button");
		Close_Button.click();
		waitForSomeTime();
		waitForSomeTime();
		
	}
	
	@FindBy(xpath=".//*[@id='inboxForm:growl_container']/div/div/div[2]/span")
	private WebElement Successful_MSG;
	
	public void toVerifyfunctionalityofSubmitButton() throws InterruptedException
	{
		HighlightOnElement(Submit_Button);
		Assert.assertTrue(Submit_Button.isEnabled(),"Test Case Pass: Submit_Button");
		Submit_Button.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(Successful_MSG);
		String ActualMessage=Successful_MSG.getText();
		String ExpectedMessage="Your application submitted successfully.";
		Assert.assertEquals(ActualMessage, ExpectedMessage);
		waitForSomeTime();
		waitForSomeTime();
		
	}
	
	@FindBy(xpath="//a[contains(.,'eGovernance')]")
	private WebElement EgovernanceLink;
	
	@FindBy(xpath="//span[contains(.,'Application Form')]")
	private WebElement ApplicationForm;
	
	@FindBy(xpath="//table[@style='width:100%;']/tbody/tr/td/div/h3/a[contains(.,'Environment Section')]")
	private WebElement Environment_Section;
	
	@FindBy(xpath="//table[@style='width:100%;']/tbody/tr/td/div/h3/a[contains(.,'Environment Section')]/../following-sibling::div[1]/table/tbody/tr/td/span/a/img[@src='/NRDAuthorityPreUAT/javax.faces.resource/applyNow.png.xhtml?ln=img']")
	private WebElement Environment_NOC;
		
	@FindBy(xpath="//button[contains(.,'Proceed')]")
	private WebElement Proceed_Button;
	
	@FindBy(xpath="//select[@id='headerForm:language']")
	private WebElement Language_Dropdown;
	
	
	public void toverifyDashboardoftheEnvironmentApplicationForm() throws InterruptedException
	{
		
		HighlightOnElement(EgovernanceLink);
		Assert.assertTrue(EgovernanceLink.isEnabled());
		EgovernanceLink.click();
		Reporter.log("Verify Application of Water and Sewerage  EgovernanceLink link is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(ApplicationForm);
		Assert.assertEquals(true,ApplicationForm.isEnabled());
		ApplicationForm.click();
		Reporter.log("Verify Application of Environment ApplicationForm link is Present",true); //print for eclipse console 
		waitForSomeTime();
		HighlightOnElement(Language_Dropdown);
		SelectVisibleText(Language_Dropdown, "English to Hindi");
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(Environment_Section);
		Assert.assertTrue(Environment_Section.isEnabled());
		Environment_Section.click();
		Reporter.log("Verify Application of Water and Sewerage  Environment_Section link is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(Environment_NOC);
		Assert.assertEquals(true,Environment_NOC.isEnabled());
		Environment_NOC.click();
		Reporter.log("Verify Application of Water and Sewerage Environment_NOC link is Present",true); //print for eclipse console 
		waitForSomeTime();
		HighlightOnElement(Proceed_Button);
		Assert.assertEquals(true,Proceed_Button.isEnabled());
		Proceed_Button.click();
		Reporter.log("Verify Application of Water and Sewerage Proceed_Button is Present",true); //print for eclipse console 
		waitForSomeTime();

		
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(Language_Dropdown);
		SelectByIndex(Language_Dropdown, "0");
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		
	}
	
	
	
}
