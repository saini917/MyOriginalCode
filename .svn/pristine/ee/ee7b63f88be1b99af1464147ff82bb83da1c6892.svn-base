package NRDA_LEGAL;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;


/**
 * @author Sarvesh.Nellore
 * @Date: 24-11-2017
 * @Purpose: To verify legal section section login as Ganeral Manager
 */
public class ToverifyFunctionalityof_GM_LEGAL extends CommonLibrary 
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
		
	public void toVerifyMenuFieldsonDashBoard_SC_03_TC01() throws InterruptedException
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
	

	public void verifyHomePageDisplayIcons_SC_03_TC_01() throws InterruptedException
		{
		  for(WebElement display:homepagedisplayICons)
		   {
			  HighlightOnElement(display);
			  String Icons=display.getText();
			  Reporter.log("Home Page Display Icons Are:"+Icons,true);
			  Assert.assertNotNull(display.isDisplayed(),"Test case pass");
		   }
		}
	
	@FindBy(xpath="//div[@class='ui-accordion-content ui-helper-reset ui-widget-content']/div/div/div/table/thead/tr/th/span[2]")
	private  List<WebElement> MenuFieldsin_PendingApplication;
	
	public void toVerifyMenuFieldsonPendingApplication_SC_03_TC_02()

		{
		for(WebElement display:MenuFieldsin_PendingApplication)
		   {
			  HighlightOnElement(display);
			  String Fields=display.getText();
			  Reporter.log("MenuFields In Pending Application Are:"+Fields,true);
			  Assert.assertNotNull(display.isDisplayed(),"Test case pass");
		   }
			
			
		}
	
	public void toVerifyPendingApplicationLink_SC_03_TC_02() throws InterruptedException
	{
		
		waitForSomeTime();
		HighlightOnElement(PendingApplication_Icon);
		Assert.assertTrue(PendingApplication_Icon.isEnabled(),"Test Case Pass: PendingApplication_Icon");
		PendingApplication_Icon.click();
		waitForSomeTime();
		Reporter.log(" To Click on PendingApplication_Icon Link in Application of Water&Sewerage  Successfully",true); //print for eclipse console
		
	}
	
	public void toVerifyCaseNumberForwardedByM_Manager_SC_03_TC_03() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		waitForSomeTime();
		String Application_Number=excel.getExcelData1("AM_CaseNumber", 0, 1);
		Reporter.log("Application NumberIs:"+Application_Number,true);
			/*for(WebElement CaseNumber: CaseNumbers)
			   {     
			     if (CaseNumber.getText().equals(Application_Number))
			       	   CaseNumber.click();
			   }
		waitForDomElement();*/
	
		
		// List<WebElement> allrows = driver.findElements(By.xpath("//div[@class='ui-accordion-content ui-helper-reset ui-widget-content']/div/div[2]/table/tbody/tr"));
		//List<WebElement> allpages = driver.findElements(By.xpath("html/body/div[2]/table[2]/tbody/tr/td[2]/table/tbody/tr/td/form/div/div[2]/div[6]/div[1]/div/div[4]/span[4]/span"));
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
	
	@FindBy(xpath="//div[@class='ui-panel-content ui-widget-content']/div[8]/div[1]/span")
	private  WebElement InvoiceDetails_Menu;
	
	@FindBy(xpath="//div[@class='ui-panel-content ui-widget-content']/div[9]/div[1]/span")
	private  WebElement ReplyDrafted_Menu;
	
	@FindBy(xpath="//div[@class='ui-panel-content ui-widget-content']/div[10]/ul/li/a")
	private  List<WebElement> MenuFields;
	
	public void VeriftMenuTabsInApplicationNumber_SC_03_TC_03() throws InterruptedException
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
	
	@FindBy(xpath="//div[@class='ui-tabs ui-widget ui-widget-content ui-corner-all ui-hidden-container ui-tabs-top']/ul/li[contains(.,'Advocate')]")
	private WebElement AdvocateMenu;
	
	@FindBy(xpath="//div[@class='ui-tabs ui-widget ui-widget-content ui-corner-all ui-hidden-container ui-tabs-top']/div/div[9]/span/center/button[contains(.,'View / Update')]")
	private WebElement View_Update_Advocate;
	
	@FindBy(xpath="(//button[contains(.,'Edit')])[1]")
	private WebElement EditBtnAdvocate;
	
	@FindBy(xpath="//button[contains(.,'Update Advocate')]")
	private WebElement UpdateAdvocate;
	
	@FindBy(xpath=".//*[@id='inboxForm:advoicDia']/div[1]/a/span")
	private WebElement Close_POPUP;
	
	
	public void toVerifyFunctionalityofAdvocateButton_SC_03_TC_04() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		waitForSomeTime();
		HighlightOnElement(AdvocateMenu);
		AdvocateMenu.click();
		Assert.assertEquals(true,InvoiceDetails_Menu.isEnabled());
		Reporter.log(" To Verify InvoiceDetails_Menu Link in Application of Water&Sewerage link is Present",true); //print for eclipse console

		waitForSomeTime();
		HighlightOnElement(View_Update_Advocate);
		View_Update_Advocate.click();
		Assert.assertEquals(true,View_Update_Advocate.isEnabled());
		Reporter.log(" To Verify View_Update_Advocate Button in Application of Water&Sewerage link is Present",true); //print for eclipse console

		waitForSomeTime();
		HighlightOnElement(EditBtnAdvocate);
		EditBtnAdvocate.click();
		Assert.assertEquals(true,EditBtnAdvocate.isEnabled());
		Reporter.log(" To Verify EditBtnAdvocate Button in Application of Water&Sewerage link is Present",true); //print for eclipse console

		waitForSomeTime();
		HighlightOnElement(UpdateAdvocate);
		//UpdateAdvocate.click();
		Assert.assertEquals(true,UpdateAdvocate.isEnabled());
		Reporter.log(" To Verify UpdateAdvocate Button in Application of Water&Sewerage link is Present",true); //print for eclipse console

		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(Close_POPUP);
		Close_POPUP.click();
		waitForSomeTime();
		Assert.assertEquals(true,Close_POPUP.isEnabled());
		Reporter.log(" To Verify Close_POPUP Button in Application of Water&Sewerage link is Present",true); //print for eclipse console
		waitForSomeTime();
	
	
	}
	@FindBy(xpath="//div[@class='ui-tabs ui-widget ui-widget-content ui-corner-all ui-hidden-container ui-tabs-top']/ul/li[contains(.,'OIC')]/a")
	private WebElement OICMenu;
	
	@FindBy(xpath="//button[contains(.,'Add / View / Update')]")
	private WebElement Add_View_Update_Advocate;
	
	@FindBy(xpath="(//button[contains(.,'Edit')])[1]")
	private WebElement EditBtnOIC;
	
	@FindBy(xpath="//button[contains(.,'Update OIC')]")
	private WebElement UpdateOIC;
	
	@FindBy(xpath=".//*[@id='inboxForm:advoicDia']/div[1]/a/span")
	private WebElement Close_POPUP1;
	
	public void toVerifyFunctionalityofOICButton_SC_03_TC_05() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		waitForSomeTime();
		HighlightOnElement(OICMenu);
		OICMenu.click();
		Assert.assertEquals(true,OICMenu.isEnabled());
		Reporter.log(" To Verify OICMenu Link in Application of Water&Sewerage link is Present",true); //print for eclipse console

		waitForSomeTime();
		HighlightOnElement(Add_View_Update_Advocate);
		Add_View_Update_Advocate.click();
		Assert.assertEquals(true,Add_View_Update_Advocate.isEnabled());
		Reporter.log(" To Verify Add_View_Update_Advocate Button in Application of Water&Sewerage link is Present",true); //print for eclipse console

		waitForSomeTime();
		HighlightOnElement(EditBtnOIC);
		EditBtnOIC.click();
		Assert.assertEquals(true,EditBtnOIC.isEnabled());
		Reporter.log(" To Verify EditBtnOIC Button in Application of Water&Sewerage link is Present",true); //print for eclipse console

		waitForSomeTime();
		HighlightOnElement(UpdateOIC);
		//UpdateAdvocate.click();
		Assert.assertEquals(true,UpdateOIC.isEnabled());
		Reporter.log(" To Verify UpdateOIC Button in Application of Water&Sewerage link is Present",true); //print for eclipse console

		HighlightOnElement(Close_POPUP1);
		Close_POPUP1.click();
		waitForSomeTime();
		Assert.assertEquals(true,Close_POPUP1.isEnabled());
		Reporter.log(" To Verify Close_POPUP1 Button in Application of Water&Sewerage link is Present",true); //print for eclipse console
		waitForSomeTime();
	
	
	}
	
	//@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr/td[2]/div/div[3]/span")
	@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[1]/tbody/tr/td/select")
	private WebElement selectAction_Dropdown;
	
	@FindBy(xpath="html/body/div[11]/div/ul/li")
	//@FindBy(xpath="html/body/div[9]/div/ul/li")
	private List <WebElement> selectAction_DropdownValues;
	@FindBy(xpath="html/body/div[8]/div/ul/li")
	private List <WebElement> selectAction_DropdownValues1;
	
	//@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr/td[3]/span/div/div/span")
	@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[1]/tbody/tr/td[3]/span/select")
	private WebElement selectUser_Dropdown;
	
	@FindBy(xpath="html/body/div[13]/div/ul/li")
	//@FindBy(xpath="html/body/div[10]/div/ul/li")
	private List <WebElement> selectUser_DropdownValues;
	
	@FindBy(xpath="(//table[@class='ui-panelgrid ui-widget']/tbody/tr/td[2]/input)[1]")
	private WebElement Subject_Field;
	
	@FindBy(xpath="(//table[@class='ui-panelgrid ui-widget']/tbody/tr/td[2]/input)[2]")
	private WebElement FileNo_Field;
	
	@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr[3]/td[2]/textarea")
	private WebElement Enter_CommentsField;
	
	@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr[4]/td[2]/table/tbody/tr/td/div/div[1]/label")
	private WebElement UploadDocumentBtn;
	
	@FindBy(xpath="//button[contains(.,'Submit')]")
	private WebElement SubmitButton;
	
	@FindBy(xpath="//button[contains(.,'Close')]")
	private WebElement CloseButton;
	
	public void toVerifyFunctionalityofSelectActionDropdown_SC_03_TC_06() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	waitForSomeTime();
	ScroolDown();
	ScroolDown();
		HighlightOnElement(selectAction_Dropdown);
		//selectAction_Dropdown.click();
		//selectValueFromDropdown("Forward");
		SelectVisibleText(selectAction_Dropdown, "Forward");
		/*for(int i=1;i<selectAction_DropdownValues.size();i++)
		{
			waitForSomeTime();
			String value=selectAction_DropdownValues.get(i).getText();
			Reporter.log("selectAction_DropdownValues:"+value,true);
			//Reporter.log("selectAction_DropdownValues:"+value);
			if(value.equalsIgnoreCase("Forward"))
			{
				selectAction_DropdownValues.get(i).click();
				waitForSomeTime();
			}
			
		}*/
		waitForSomeTime();
		
		HighlightOnElement(selectUser_Dropdown);
		
		//selectUser_Dropdown.click();
		//selectValueFromDropdown("Arun Singh (CEO)");
		SelectVisibleText(selectUser_Dropdown, "Arun Singh (CEO)");
		/*for(int i=1;i<selectUser_DropdownValues.size();i++)
		{
			
			String value=selectUser_DropdownValues.get(i).getText();
			Reporter.log("selectUser_DropdownValues:"+value,true);
			if(value.equalsIgnoreCase("Arun Singh (CEO)"))
			{
				selectUser_DropdownValues.get(i).click();
				waitForSomeTime();
			}
			
		}*/
		waitForSomeTime();
		ScroolUp();
		ScroolUp();
		waitForSomeTime();
	
	}
	
	@FindBy(xpath="(//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[1]/td[2]/a)[1]")
	private WebElement FirstCaseNumber;
	
	public void clickFirstCaseNumber() throws InterruptedException
	{
		
		HighlightOnElement(FirstCaseNumber);
		FirstCaseNumber.click();
		waitForSomeTime();
		
		
	}
	
	
	public void toVerifyFunctionalityofSelectActionDropdownasReject_SC_03_TC_07() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	waitForSomeTime();
	ScroolDown();
	ScroolDown();
	ScroolDown();
		HighlightOnElement(selectAction_Dropdown);
		//selectAction_Dropdown.click();
		//selectValueFromDropdown("Reject");
		SelectVisibleText(selectAction_Dropdown, "Reject");
		/*for(int i=1;i<selectAction_DropdownValues.size();i++)
		{
			waitForSomeTime();
			String value=selectAction_DropdownValues.get(i).getText();
			Reporter.log("selectAction_DropdownValues:"+value,true);
			//Reporter.log("selectAction_DropdownValues:"+value);
			if(value.equalsIgnoreCase("Reject"))
			{
				selectAction_DropdownValues.get(i).click();
				waitForSomeTime();
			}
			waitForSomeTime();
		}*/
		waitForSomeTime();
	}

	public void toVerifyFunctionalityofSelectActionDropdownasSendBack_SC_03_TC_08() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	waitForSomeTime();
	ScroolDown();
	ScroolDown();
	ScroolDown();
		HighlightOnElement(selectAction_Dropdown);
		//selectAction_Dropdown.click();
		//selectValueFromDropdown("Send Back");
		SelectVisibleText(selectAction_Dropdown, "Send Back");
/*
		for(int i=1;i<selectAction_DropdownValues.size();i++)
		{
			String value=selectAction_DropdownValues.get(i).getText();
			Reporter.log("selectAction_DropdownValues:"+value,true);
			//Reporter.log("selectAction_DropdownValues:"+value);
			if(value.equalsIgnoreCase("Send Back"))
			{
				selectAction_DropdownValues.get(i).click();
				waitForSomeTime();
			}
			
		}
		waitForSomeTime();*/
		waitForSomeTime();
	}
	
	public void toVerifyFunctionalityofSelectActionDropdownasApproved_SC_03_TC_09() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	waitForSomeTime();
	ScroolDown();
	ScroolDown();
	ScroolDown();
		HighlightOnElement(selectAction_Dropdown);
		//selectAction_Dropdown.click();
		//selectValueFromDropdown("Approve");
		SelectVisibleText(selectAction_Dropdown, "Approve");
		/*for(int i=1;i<selectAction_DropdownValues1.size();i++)
		{
			String value=selectAction_DropdownValues1.get(i).getText();
			Reporter.log("selectAction_DropdownValues:"+value,true);
			//Reporter.log("selectAction_DropdownValues:"+value);
			if(value.equalsIgnoreCase("Approve"))
			{
				selectAction_DropdownValues1.get(i).click();
				waitForSomeTime();
			}
			
		}
		waitForSomeTime();*/
		waitForSomeTime();
	}
	
	
	
	public void toVerifyFunctionalityofEnterCommentsField() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		waitForSomeTime();
		
		HighlightOnElement(Enter_CommentsField);
		Assert.assertTrue(Enter_CommentsField.isEnabled(),"Test Case Pass: Enter_CommentsField");
		excel.getExcelData(Enter_CommentsField, "Application_AM_LEGAL", 3, 26);
		Reporter.log("Enter_CommentsField  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
		waitForDomElement();
		
		HighlightOnElement(UploadDocumentBtn);
		UploadDocumentBtn.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur.jpg");
		Reporter.log("ApplicantIDProof Document Link Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
	
	}
	
	public void ScroolupPage()
	{
	
		ScroolUp();
		ScroolUp();
		
	}
	
	
	public void toVerifyFunctionalityofCloseButton_SC_03_TC_13() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		ScroolDown();
		ScroolDown();
		HighlightOnElement(CloseButton);
		Assert.assertTrue(CloseButton.isEnabled(),"Test Case Pass: CloseButton");
		CloseButton.click();
		Reporter.log("CloseButton  in Application of Water&Sewerage  LEGAL  Is Present",true); //print for eclipse console
		waitForDomElement();
		
		
	}
	
	@FindBy(xpath=".//*[@id='inboxForm:growl_container']/div/div/div[2]/span")
	private WebElement PopUP_Message;
	
	public void toVerifyFunctionalityofSubmitButton_SC_03_TC_12() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		
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
