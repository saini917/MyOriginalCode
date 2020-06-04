package NRDA_RTI;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;







import GenericLibrary.ExcelDataDriver;
import GenericLibrary.CommonLibrary;

/**
 * @author Sarvesh.Nellore
 * @Date: 23-10-2017
 * @Purpose:  RTI login As PIO
 *
 */
public class ToverifyRTILoginASPIO extends CommonLibrary
{
	
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	static int ApprovecountList=0;
	static int RejectcountList=0;
	static int PendingcountList=0;
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Home_Icon".
	 * @author Sarvesh.Nellore
	 * @since 2017-09-21
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[1]")
	private WebElement Home_Icon;
	
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[2]")
	private WebElement PendingApplication_Icon;
	
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[3]")
	private WebElement ApproveorRejectApplication_Icon;
	
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[11]")
	private WebElement PaymentCollection_Icon;
	
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[15]")
	private WebElement MisReport_Icon;
	
	@FindBy(xpath="//html/body/div[2]/table[2]/tbody/tr/td[2]/table/tbody/tr/td/form/div[4]/div[2]/div[1]/ul[1]/li")
	private List <WebElement> RTI_Icon;
	
	@FindBy(xpath="//div[@class='col-md-9']/div/div/div/div/div[1]/div")
	private List <WebElement> HeadingsInApplications;
	
	@FindBy(xpath="//div[@class='ui-panelmenu-panel']/h3/a")
	private List <WebElement> MenuLabels;
	
	public void toVerifyMenuFieldsonDashBoard_SC_09_TC02() throws InterruptedException
		{
			try
			{
				waitForSomeTime();
				for(WebElement menulist:HeadingsInApplications)
				{
					HighlightOnElement(menulist);
					Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
					if(menulist.isDisplayed())
					{
						String Menu=menulist.getText();
						Reporter.log(" Menu list inDash Board are:"+Menu,true);
					}

				}
				
				waitForSomeTime();
				for(WebElement menulist:MenuLabels)
				{
					HighlightOnElement(menulist);
					Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
					if(menulist.isDisplayed())
					{
						String Menu=menulist.getText();
						Reporter.log(" Menu list inDash Board are:"+Menu,true );
					}

				}

			}
	
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		
	public void toVerifyFieldsonRTIIcon_SC_09_TC02() throws InterruptedException
	
		{
			waitForSomeTime();
			for(WebElement menulistnewapplication:RTI_Icon)
			{
				if(menulistnewapplication.isDisplayed())
				{
					String RTIMenu=menulistnewapplication.getText();
					Reporter.log("RTI Menu list under Labels are:"+RTIMenu,true);
				}
	
			}
		
		}
	
	@FindBy(xpath="//table[@style='width:100%;']/tbody/tr/td/form/div[4]/div[2]/div[1]/ul[2]/li[1]")
	private WebElement Approve_count;
	
	@FindBy(xpath="//table[@style='width:100%;']/tbody/tr/td/form/div[4]/div[2]/div[1]/ul[2]/li[2]")
	private WebElement Reject_count;
	
	@FindBy(xpath="//table[@style='width:100%;']/tbody/tr/td/form/div[4]/div[2]/div[1]/ul[2]/li[3]")
	private WebElement Pending_count;
	
	public void toclickonApprovecountlink() throws InterruptedException
		{
	
			HighlightOnElement(Approve_count);
			Assert.assertTrue(Approve_count.isEnabled(),"Test Case Pass: Approve_count");
			String ApprovedCount1=Approve_count.getText();
			int Approvecount=Integer.parseInt(ApprovedCount1);
			waitForSomeTime();
			Reporter.log("Pending Count On Water Icon Is:" +Approvecount,true);
			Approve_count.click();
			waitForSomeTime();
	
		}
	
	@FindBy(xpath="//img[@src='/NRDAuthority1/resources/images/view-new.png']")
	private  List<WebElement> actionbtn;
	
	public void toVerifyActionButtonDisplayed01()
		{
			int actionbuttoncount=0;
			for(WebElement action:actionbtn)
			{
				//if(action.isDisplayed())
				Assert.assertTrue(action.isDisplayed(),"Test Case: PassAction Button Available ");
				{/*
								JavascriptExecutor jse = (JavascriptExecutor)driver;
								jse.executeScript("window.scrollBy(0,250)", "");*/
					actionbuttoncount++;
				}
				Reporter.log("Test case is passed for action button shown:"+actionbuttoncount,true);
			}
		}
	
			//@FindBy(xpath="//div[@id='inboxForm:dlg']/div[2]/div/div/div/div[1]/table/tbody/tr/td[5]/span")
			@FindBy(xpath="//div[@id='inboxForm:dlg']/div[2]/div/div/div/div[1]/table/tbody/tr")
			private List <WebElement> NOOFROWSListonPopup;
		
	
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
	
	@FindBy(xpath="html/body/div[3]/table[2]/tbody/tr/td[2]/table/tbody/tr/td/form/div[1]/div[2]/div[2]/div[24]/div/div/div/div[2]/span[1]/span")
	private WebElement SeekFirst_PendingList;
	
	@FindBy(xpath="html/body/div[3]/table[2]/tbody/tr/td[2]/table/tbody/tr/td/form/div[1]/div[2]/div[2]/div[24]/div/div/div/div[2]/span[2]/span")
	private WebElement SeekPrevious_PendingList;

	@FindBy(xpath="html/body/div[3]/table[2]/tbody/tr/td[2]/table/tbody/tr/td/form/div[1]/div[2]/div[2]/div[24]/div/div/div/div[2]/span[5]/span")
	private WebElement Seekend_PendingList;
	
	@FindBy(xpath="html/body/div[3]/table[2]/tbody/tr/td[2]/table/tbody/tr/td/form/div[1]/div[2]/div[2]/div[24]/div/div/div/div[2]/span[4]/span")
	private WebElement Seeknext_PendingList;

	
	
	
	public void toVerifyPagination02() throws InterruptedException
		{
			waitForSomeTime();
			HighlightOnElement(SeekFirst_PendingList);
			HighlightOnElement(SeekPrevious_PendingList);
			HighlightOnElement(Seeknext_PendingList);
			HighlightOnElement(Seekend_PendingList);
	
			if(Seeknext_PendingList.isEnabled())
			{
				Assert.assertTrue(Seeknext_PendingList.isDisplayed(),"TestCase Pass");
				Reporter.log("Test case pass: Pagination is Displayed in List Application",true);
				//Seeknext_PendingList.click();
				waitForSomeTime();
			}
			else 
			{
				Assert.assertFalse(Seeknext_PendingList.isDisplayed(),"Test Case Fail");
				Reporter.log("Test case pass: Pagination is Not Displayed in List Application",true);
			}
	
		}	
	
	@FindBy(xpath=".//*[@id='inboxForm:dlg']/div[1]/a/span")
	private WebElement Close_Popwindow;
	
	public void closePopUpWindow() throws InterruptedException
		{
			waitForSomeTime();
			HighlightOnElement(Close_Popwindow);
			waitForSomeTime();
			Assert.assertEquals(true,Close_Popwindow.isEnabled());
			Close_Popwindow.click();
			Reporter.log("Expected result:click on Close Popup window",true);
			waitForSomeTime();
			waitForSomeTime();
		}
	
	public void toverifyApproveCountinRTImenu02() throws InterruptedException
		{
	
			waitForSomeTime();
			HighlightOnElement(Approve_count);
			Assert.assertEquals(true,Approve_count.isEnabled());
			String ApproveCount1=Approve_count.getText();
			int Approvedcount=Integer.parseInt(ApproveCount1);
			waitForSomeTime();
			Reporter.log("Approve_count On Water Icon Is:" +Approvedcount,true);
			Approve_count.click();
			waitForSomeTime();
			Reporter.log(" To Verify Approve_count  in Water_Icon  Water&Sewerage link is Present",true); //print for eclipse console
			List<WebElement> allpages = driver.findElements(By.xpath("//div[@class='ui-paginator ui-paginator-bottom ui-widget-header ui-corner-bottom']/span[3]/span"));
			Reporter.log("Total No Of Pages:" +allpages.size(),true);
			for(int i=1;i<=((Approvedcount/10)+1);i++)
			{
				ApprovecountList=ApprovecountList + NOOFROWSListonPopup.size();
	
				if(Seeknext_PendingList.isEnabled())
				{
	
					Seeknext_PendingList.click();
					waitForSomeTime();
	
				}
	
			}
			//Reporter.log("Approve Count On Popup List  Is:" +pendcountList);
			Reporter.log("Approve Count On Popup List  Is:" +ApprovecountList,true);
		}
		
	public void toverifyRejectCountinRTImenu02() throws InterruptedException
	{

		waitForSomeTime();
		HighlightOnElement(Reject_count);
		Assert.assertEquals(true,Reject_count.isEnabled());
		String RejectCount1=Reject_count.getText();
		int Rejectcount=Integer.parseInt(RejectCount1);
		waitForSomeTime();
		Reporter.log("Reject_count On Water Icon Is:" +Rejectcount,true);
		Reject_count.click();
		waitForSomeTime();
		Reporter.log(" To Verify Reject_count  in Water_Icon  Water&Sewerage link is Present",true); //print for eclipse console
		List<WebElement> allpages = driver.findElements(By.xpath("//div[@class='ui-paginator ui-paginator-bottom ui-widget-header ui-corner-bottom']/span[3]/span"));
		Reporter.log("Total No Of Pages:" +allpages.size(),true);
		for(int i=1;i<=((Rejectcount/10)+1);i++)
		{
			RejectcountList=RejectcountList + NOOFROWSListonPopup.size();

			if(Seeknext_PendingList.isEnabled())
			{

				Seeknext_PendingList.click();
				waitForSomeTime();

			}

		}
		//Reporter.log("Approve Count On Popup List  Is:" +pendcountList);
		Reporter.log("Reject Count On Popup List  Is:" +RejectcountList,true);
	}
	

	public void toVerifyRejectCountlinkinRTImenu() throws InterruptedException
		{
			waitForSomeTime();
			HighlightOnElement(Reject_count);
			Assert.assertEquals(true,Reject_count.isEnabled());
			Reject_count.click();
			Reporter.log("Expected result:click on Application Reject",true);
			waitForSomeTime();
			waitForSomeTime();
		}
	
	public void toVerifyPendingCountlinkinRTImenu() throws InterruptedException
	{
		waitForSomeTime();
		HighlightOnElement(Pending_count);
		Assert.assertEquals(true,Pending_count.isEnabled());
		Pending_count.click();
		Reporter.log("Expected result:click on Application Pending_count",true);
		waitForSomeTime();
		waitForSomeTime();
	}
	
	public void toverifyPendingCountinRTImenu02() throws InterruptedException
	{

		waitForSomeTime();
		HighlightOnElement(Pending_count);
		Assert.assertEquals(true,Pending_count.isEnabled());
		String PendingCount1=Pending_count.getText();
		int pendingcount=Integer.parseInt(PendingCount1);
		waitForSomeTime();
		Reporter.log("Approve_count On Water Icon Is:" +pendingcount,true);
		Pending_count.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		Reporter.log(" To Verify pendingcount  in Water_Icon  Water&Sewerage link is Present",true); //print for eclipse console
		List<WebElement> allpages = driver.findElements(By.xpath("//div[@class='ui-paginator ui-paginator-bottom ui-widget-header ui-corner-bottom']/span[3]/span"));
		Reporter.log("Total No Of Pages:" +allpages.size(),true);
		for(int i=1;i<=((pendingcount/10)+1);i++)
		{
			PendingcountList=PendingcountList + NOOFROWSListonPopup.size();

			if(Seeknext_PendingList.isEnabled())
			{
				waitForSomeTime();
				Seeknext_PendingList.click();
				waitForSomeTime();

			}

		}
		//Reporter.log("Approve Count On Popup List  Is:" +pendcountList);
		Reporter.log("Approve Count On Popup List  Is:" +PendingcountList,true);
	}


	@FindBy(xpath="//a[contains(.,'New Application')]")
	private WebElement NewApplication_Menu;
	
	@FindBy(xpath="//a[contains(.,'ONLINE RTI')]")
	private WebElement ONLINERTI_Menu;
	
	@FindBy(xpath="//img[@src='/NRDAuthority/resources/images/view-new.png']")
	private  WebElement actionbtn1;
	
	@FindBy(xpath="//div[@role='tabpanel']/div/div[1]/table")
	private WebElement PendingApplication_Grid;
	
	@FindBy(xpath="//span[contains(.,'Applications List')]/../following-sibling::div/div[1]/div/table/tbody/tr/td/input")
	private WebElement entervalueinsearchbox;
	
	@FindBy(xpath="//button/span[contains(text(),'Search')]")
	private WebElement searchbtn;
	
	@FindBy(xpath="//table[@role='grid']/tbody/tr/td[5]/span[contains(.,'PENDING')]")
	private WebElement Application_Status;
	
	
	
	
	public void toverifythependingApplicationAsPublicInformationOfficer_SC_09_TC_06() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		HighlightOnElement(PendingApplication_Icon);
		Assert.assertTrue(PendingApplication_Icon.isEnabled(),"TestCase Pass:PendingApplication_Icon ");
		Reporter.log(" To Verify PendingApplication_Icon Link in Application of Water&Sewerage link is Present",true); //print for eclipse console
		PendingApplication_Icon.click();
		waitForSomeTime();
		waitForelementPresent(entervalueinsearchbox);
		HighlightOnElement(NewApplication_Menu);
		Assert.assertTrue(NewApplication_Menu.isEnabled(),"TestCase NewApplication_Menu ");
		Reporter.log(" To Verify NewApplication_Menu Link in Application of Water&Sewerage link is Present",true); //print for eclipse console
		waitForSomeTime();
		
		HighlightOnElement(ONLINERTI_Menu);
		Assert.assertTrue(ONLINERTI_Menu.isEnabled(),"TestCase ONLINERTI_Menu ");
		Reporter.log(" To Verify ONLINERTI_Menu Link in Application of Water&Sewerage link is Present",true); //print for eclipse console
		waitForSomeTime();
		
		HighlightOnElement(PendingApplication_Grid);
		waitForSomeTime();
		
		int actionbuttoncount=0;
		for(WebElement action:actionbtn)
		{
			//if(action.isDisplayed())
			Assert.assertTrue(action.isDisplayed(),"Test Case: PassAction Button Available ");
			{/*
							JavascriptExecutor jse = (JavascriptExecutor)driver;
							jse.executeScript("window.scrollBy(0,250)", "");*/
				actionbuttoncount++;
			}
			Reporter.log("Test case is passed for action button shown:"+actionbuttoncount,true);
		}
		
		HighlightOnElement(entervalueinsearchbox);
		//String Validnumber=ApplicationNumber.getText();
		String validnumber=excel.getExcelData(entervalueinsearchbox, "RTIApplication Number",0, 1);
		Reporter.log("Valid Application Number:"+validnumber,true);
		waitForSomeTime();
		HighlightOnElement(searchbtn);
		searchbtn.click();
		waitForSomeTime();
		HighlightOnElement(PendingApplication_Grid);
		waitForSomeTime();
		
		HighlightOnElement(Application_Status);
		String ActualStatus=Application_Status.getText();
		String ExpectedStatus="PENDING";
		if(ActualStatus.equalsIgnoreCase(ExpectedStatus))
		{
			Reporter.log("Application Status Is Pending",true);
		}
		else
		{
			Reporter.log("Application Status Is Not Pending",true);	
		}

		waitForSomeTime();
	}
	
	
	
	public void toverifythefunctionalityofpaginationinPendingApplication_SC_09_TC_07() throws InterruptedException
	 {
		HighlightOnElement(PendingApplication_Icon);
		Assert.assertTrue(PendingApplication_Icon.isEnabled(),"TestCase Pass:PendingApplication_Icon ");
		Reporter.log(" To Verify PendingApplication_Icon Link in Application of Water&Sewerage link is Present",true); //print for eclipse console
		PendingApplication_Icon.click();
		waitForSomeTime();
		waitForelementPresent(NewApplication_Menu);
		HighlightOnElement(NewApplication_Menu);
		Assert.assertTrue(NewApplication_Menu.isEnabled(),"TestCase NewApplication_Menu ");
		Reporter.log(" To Verify NewApplication_Menu Link in Application of Water&Sewerage link is Present",true); //print for eclipse console
		waitForSomeTime();
		
		HighlightOnElement(ONLINERTI_Menu);
		Assert.assertTrue(ONLINERTI_Menu.isEnabled(),"TestCase ONLINERTI_Menu ");
		Reporter.log(" To Verify ONLINERTI_Menu Link in Application of Water&Sewerage link is Present",true); //print for eclipse console
		waitForSomeTime();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		
		
		waitForSomeTime();
		HighlightOnElement(SeekFirst_PendingList);
		HighlightOnElement(SeekPrevious_PendingList);
		HighlightOnElement(Seeknext_PendingList);
		HighlightOnElement(Seekend_PendingList);

		if(Seeknext_PendingList.isEnabled())
		{
			Assert.assertTrue(Seeknext_PendingList.isDisplayed(),"TestCase Pass");
			Reporter.log("Test case pass: Pagination is Displayed in List Application",true);
			Seeknext_PendingList.click();
			waitForSomeTime();
		}
		else 
		{
			Assert.assertFalse(Seeknext_PendingList.isDisplayed(),"Test Case Fail");
			Reporter.log("Test case pass: Pagination is Not Displayed in List Application",true);
		}
		waitForSomeTime();
		jse.executeScript("window.scrollBy(0,-250)", "");
		
	
	}
	
	
	@FindBy(xpath=".//*[@id='inboxForm:growl_container']/div/div/div[2]/span")
	private WebElement getmessage;
	
	public void toverifythependingApplicationWithInvalidNumber_SC_09_TC_08() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		HighlightOnElement(PendingApplication_Icon);
		Assert.assertTrue(PendingApplication_Icon.isEnabled(),"TestCase Pass:PendingApplication_Icon ");
		Reporter.log(" To Verify PendingApplication_Icon Link in Application of Water&Sewerage link is Present",true); //print for eclipse console
		PendingApplication_Icon.click();
		waitForSomeTime();
		waitForelementPresent(entervalueinsearchbox);
		HighlightOnElement(entervalueinsearchbox);
		//String Validnumber=ApplicationNumber.getText();
		String validnumber=excel.getExcelData(entervalueinsearchbox, "RTIApplication Number",0, 3);
		Reporter.log("Valid Application Number:"+validnumber,true);
		waitForSomeTime();
		HighlightOnElement(searchbtn);
		searchbtn.click();
		waitForSomeTime();
		HighlightOnElement(getmessage);
		String Expected=getmessage.getText();
		String Actual="Application Number is not in Records";
		Assert.assertEquals(Actual, Expected);
		Reporter.log("Expected result:"+Expected,true);
		waitForSomeTime();
		waitForSomeTime();
	
	}
	
	public void toverifythependingApplicationWithBlankField_SC_09_TC_09() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	
	{
		
		HighlightOnElement(PendingApplication_Icon);
		Assert.assertTrue(PendingApplication_Icon.isEnabled(),"TestCase Pass:PendingApplication_Icon ");
		Reporter.log(" To Verify PendingApplication_Icon Link in Application of Water&Sewerage link is Present",true); //print for eclipse console
		PendingApplication_Icon.click();
		waitForSomeTime();
		waitForelementPresent(entervalueinsearchbox);
		HighlightOnElement(entervalueinsearchbox);
		//String Validnumber=ApplicationNumber.getText();
		//String validnumber=excel.getExcelData(entervalueinsearchbox, "RTIApplication Number",0, 3);
		//Reporter.log("Valid Application Number:"+validnumber,true);
		waitForSomeTime();
		HighlightOnElement(searchbtn);
		searchbtn.click();
		waitForSomeTime();
		HighlightOnElement(getmessage);
		String Expected=getmessage.getText();
		String Actual="Please enter Application Number !";
		Assert.assertEquals(Actual, Expected);
		Reporter.log("Expected result:"+Expected,true);
		waitForSomeTime();
		waitForSomeTime();	
	
	}

	public void toverifythependingApplicationWithValidNumber_SC_09_TC_10() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		HighlightOnElement(PendingApplication_Icon);
		Assert.assertTrue(PendingApplication_Icon.isEnabled(),"TestCase Pass:PendingApplication_Icon ");
		Reporter.log(" To Verify PendingApplication_Icon Link in Application of Water&Sewerage link is Present",true); //print for eclipse console
		PendingApplication_Icon.click();
		waitForSomeTime();
		waitForelementPresent(entervalueinsearchbox);
		HighlightOnElement(entervalueinsearchbox);
		//String Validnumber=ApplicationNumber.getText();
		String validnumber=excel.getExcelData(entervalueinsearchbox, "RTIApplication Number",0, 1);
		Reporter.log("Valid Application Number:"+validnumber,true);
		waitForSomeTime();
		HighlightOnElement(searchbtn);
		searchbtn.click();
		waitForSomeTime();
		
		HighlightOnElement(PendingApplication_Grid);
		waitForSomeTime();
		
		HighlightOnElement(Application_Status);
		String ActualStatus=Application_Status.getText();
		String ExpectedStatus="PENDING";
		if(ActualStatus.equalsIgnoreCase(ExpectedStatus))
		{
			Reporter.log("Application Status Is Pending",true);
		}
		else
		{
			Reporter.log("Application Status Is Not Pending",true);	
		}

		waitForSomeTime();
		
	}
	
	
	@FindBy(xpath="//div[@id='inboxForm:Nb']/div/div[4]/div[2]/center/table/tbody/tr/td/div/div/label")
	private List<WebElement> commentlabel;
	
	@FindBy(xpath="//div[@id='inboxForm:Nb']/div/div[4]/div[2]/center/table/tbody/tr/td[2]/textarea")
	private WebElement entercommentbox;
	
	@FindBy(xpath="//div[@id='inboxForm:Nb']/div/div[4]/div[2]/center/table[2]/tbody/tr[2]/td[1]/span")
	private WebElement uploaddocumentlabel;
	
	@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr[4]/td[2]/table/tbody/tr/td/div/div[1]/label")
	private WebElement uploaddocument;
	
	//@FindBy(xpath="//div[@class='ui-selectonemenu ui-widget ui-state-default ui-corner-all ui-helper-clearfix']/div[3]/span")
	@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[1]/tbody/tr/td[2]/select")
	private WebElement clickonselectactiondrop;
	
	@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[1]/tbody/tr[1]/td[4]/span/select")
	private WebElement clickonselectSectorDropdown;
	
	
	@FindBy(xpath="//ul[@class='ui-selectonemenu-items ui-selectonemenu-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']/li")
	private List<WebElement> selectdropdownvalue;
	
	
	
	
	
	
	
	
	
	
	public void toverifythependingApplicationActionFunctionality_SC_09_TC_11() throws InterruptedException
	{
		HighlightOnElement(actionbtn1);
		Assert.assertTrue(actionbtn1.isEnabled(),"TestCase actionbtn1 ");
		Reporter.log(" To Verify actionbtn1 Link in Application of Water&Sewerage link is Present",true); //print for eclipse console
		actionbtn1.click();
		waitForSomeTime();
		waitForSomeTime();
		
		
		waitForSomeTime();
		for(WebElement la:commentlabel)
		{
			if(la.isDisplayed())
			{
				String labelname=la.getText();
				Reporter.log("Expected result:"+labelname,true);
				waitForSomeTime();
			}
		}
		//Assert.assertEquals(uploaddocumentlabel.isDisplayed(),"Test case pass");
		/*HighlightOnElement(uploaddocumentlabel);
		String uploadlabel=uploaddocumentlabel.getText();
		Reporter.log("Expected result:"+uploadlabel,true);
		waitForSomeTime();*/


		HighlightOnElement(clickonselectactiondrop);
		//clickonselectactiondrop.click();
		SelectVisibleText(clickonselectactiondrop, "Select Action");
		/*for(int i=1;i<selectdropdownvalue.size();i++)
		{
			String value=selectdropdownvalue.get(i).getText();
			Reporter.log("Expected result:"+value,true);
			waitForSomeTime();
		}*/

	}
	
	public void toVerifySubmitbuttonFunctionalityWithActionFieldISBlank_SC_09_TC_12() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{

		waitForSomeTime();
		HighlightOnElement(actionbtn1);
		actionbtn1.click();
		waitForSomeTime();
		HighlightOnElement(clickonselectactiondrop);
		
	}
	
	
	@FindBy(xpath="//span[contains(.,'Action and Comment')]/../../following-sibling::center/button[contains(.,'Submit')]")
	private WebElement Submit_Button;

	public void toVerifySubmitbuttonFunctionalityWithActionFieldISBlank() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(Submit_Button);
		Assert.assertEquals(Submit_Button.isEnabled(),true);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		waitForSomeTime();
		Submit_Button.click();
		Reporter.log("Click on Submit button Successfully",true);
	}

	@FindBy(xpath=".//*[@id='inboxForm:msg_container']/div/div/div[2]/span")
	private WebElement ErrorMessag_Popup;
	
	public void toVerifyErrorMessage() throws InterruptedException
	{
		waitForSomeTime();
		HighlightOnElement(ErrorMessag_Popup);
		String Expected_Message="Please select some action before submit !";
		String Actual_Message=ErrorMessag_Popup.getText();
		Assert.assertEquals(Expected_Message, Actual_Message);
		waitForSomeTime();
		waitForSomeTime();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-150)", "");
		waitForSomeTime();
	}
	
	@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[1]/tbody/tr[1]/td[3]/span/select")
	private WebElement clickonselectuserdrop;
	
	@FindBy(xpath="//html/body/div[11]/div/ul/li")
	private List<WebElement> selectdropdownvalueUser;
	
	public void toVerifySubmitbuttonFunctionalityWithUserFieldISBlank_SC_09_TC_13() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{

		waitForSomeTime();
		HighlightOnElement(clickonselectactiondrop);
		SelectVisibleText(clickonselectactiondrop, "Forward");
		/*clickonselectactiondrop.click();

		for(int i=0;i<selectdropdownvalue.size();i++)
		{
			String value=selectdropdownvalue.get(i).getText();
			if(value.equalsIgnoreCase("Forward"))
			{
				selectdropdownvalue.get(i).click();
				waitForSomeTime();
			}
		}*/

		HighlightOnElement(clickonselectuserdrop);
		SelectVisibleText(clickonselectuserdrop, "Arun Baghel (APIO)");

		/*for(int i=1;i<selectdropdownvalueUser.size();i++)
		{
			String value=selectdropdownvalueUser.get(i).getText();
			Reporter.log("Expected result:"+value,true);
			waitForSomeTime();
		}
*/
		waitForSomeTime();

	}

	
	public void toVerifyErrorMessageAsCommentFieldisBlank() throws InterruptedException
	{
		waitForSomeTime();
		HighlightOnElement(ErrorMessag_Popup);
		String Expected_Message="Please enter comments !";
		String Actual_Message=ErrorMessag_Popup.getText();
		Assert.assertEquals(Expected_Message, Actual_Message);
		waitForSomeTime();
		waitForSomeTime();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-150)", "");
		waitForSomeTime();

	}
	
	public void toVerifySubmitbuttonFunctionalityWithCommentFieldISBlank_SC_09_TC_14() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{

		waitForSomeTime();
		HighlightOnElement(clickonselectactiondrop);
		
	SelectVisibleText(clickonselectactiondrop, "Forward");
	waitForSomeTime();
	waitForSomeTime();
	
		/*clickonselectactiondrop.click();

		for(int i=0;i<selectdropdownvalue.size();i++)
		{
			String value=selectdropdownvalue.get(i).getText();
			if(value.equalsIgnoreCase("Forward"))
			{
				selectdropdownvalue.get(i).click();
				waitForSomeTime();
			}
		}*/

		/*HighlightOnElement(clickonselectuserdrop);
		clickonselectuserdrop.click();

		for(int i=1;i<selectdropdownvalueUser.size();i++)
		{
			String value=selectdropdownvalueUser.get(i).getText();
			Reporter.log("Expected result:"+value,true);
			if(value.equalsIgnoreCase("I gh (Apio)"))
			{
				selectdropdownvalueUser.get(i).click();
				waitForSomeTime();
			}
			
			waitForSomeTime();
		}
*/
		HighlightOnElement(entercommentbox);

	}
	
	@FindBy(xpath="//table[@style='width:100%;']/tbody/tr/td/form/div[4]/div[2]/div[1]/ul[2]/li[3]")
	private WebElement AfterPending;
	
	@FindBy(xpath="//table[@style='width:100%;']/tbody/tr/td/form/div[4]/div[2]/div[1]/ul[2]/li[3]")
	private WebElement beforepending;
	
	public void beforesentbackpendingcount() throws InterruptedException
	{
		HighlightOnElement(beforepending);
		Assert.assertEquals(true,beforepending.isEnabled());
		String pendingcount=beforepending.getText();;
		int beforependingcount=Integer.parseInt(pendingcount);
		waitForSomeTime();
		Reporter.log("Before Submition pending Count On Water Icon Is:" +beforependingcount,true);
		waitForSomeTime();
	}

	
	public void aftersentbackpendingcount() throws InterruptedException
	{
		waitForSomeTime();
		HighlightOnElement(AfterPending);
		//Assert.assertEquals(true,AfterPending.isEnabled());
		String pendingcount=AfterPending.getText();;
		int afterpendingcount=Integer.parseInt(pendingcount);
		waitForSomeTime();
		Reporter.log("After Submition pending Count On Water Icon Is:" +afterpendingcount,true);
		waitForSomeTime();
	}
	
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[1]/a/span/img")
	private WebElement homelink;
	
	@FindBy(xpath="//a[contains(.,'eGovernance')]")
	private WebElement eGovernanceLink;
	
	@FindBy(xpath="//span[contains(.,'Pending Application')]")
	private WebElement PendingApplicationLink;
	
	public void toVerifyPendingApplicationLink() throws InterruptedException
	{
		waitForSomeTime();
		HighlightOnElement(eGovernanceLink);
		Assert.assertTrue(eGovernanceLink.isEnabled(),"Test Case Pass: eGovernanceLink");
		eGovernanceLink.click();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(PendingApplicationLink);
		Assert.assertTrue(PendingApplicationLink.isEnabled(),"Test Case Pass: PendingApplicationLink");
		PendingApplicationLink.click();
		waitForelementPresent(entervalueinsearchbox);
		HighlightOnElement(entervalueinsearchbox);
		Reporter.log(" To Click on PendingApplication_Icon Link in Application of Environment  Successfully" ); //print for eclipse console
		
	}
	
	
	@FindBy(xpath="(//a[contains(.,'RTI')])[3]")
	private WebElement RTI_Link;
	
	@FindBy(xpath="//a[contains(.,'RTI')]/../following-sibling::div[1]/div/div/div/div[1]/table/thead/tr/th[2]/input")
	private WebElement ApplicationNumberField;
	
	@FindBy(xpath="(//a[contains(.,'RTI')]/../following-sibling::div/div/div/div/div[1]/table/tbody/tr/td/center/a/img[@src='/NRDAuthorityPreUAT/resources/images/view-new.png'])[1]")
	private WebElement Action_Button;
	
	@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[1]/tbody/tr/td[3]/span/table/tbody/tr/td[1]/select")
	private WebElement DepartmentDropdown;
	
	@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[1]/tbody/tr/td[3]/span/table/tbody/tr/td[2]/select")
	private WebElement OfficerDropdown;
	
	@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[1]/tbody/tr/td[4]/span/select")
	private WebElement SectorDropdown;
	
	
	
	public void toverifySubmitFunctionalitywithActionAsForward() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	
	{
		waitForSomeTime();
		ScroolDown();
		ScroolDown();
		ScroolDown();
		RTI_Link.click();
		String validnumber=excel.getExcelData(entervalueinsearchbox, "RTIApplication Number",0, 1);
		Reporter.log("Valid Application Number:"+validnumber,true);
		ApplicationNumberField.sendKeys(validnumber);
		waitForSomeTime();
		//HighlightOnElement(searchbtn);
		//searchbtn.click();
		waitForSomeTime();
		HighlightOnElement(Action_Button);
		Action_Button.click();
		waitForSomeTime();

		HighlightOnElement(clickonselectactiondrop);
		SelectVisibleText(clickonselectactiondrop, "Forward");
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		
		HighlightOnElement(DepartmentDropdown);
		SelectVisibleText(DepartmentDropdown, "Administrative Section");
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(OfficerDropdown);
		SelectVisibleText(OfficerDropdown, "Poonam Sharma");
		waitForSomeTime(); 
		HighlightOnElement(SectorDropdown);
		HighlightOnElement(entercommentbox);
		excel.getExcelData(entercommentbox, "RTIApplication Number",0, 7);
		waitForSomeTime();
		HighlightOnElement(uploaddocument);
		uploaddocument.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur.jpg");
		waitForSomeTime();

		
	
		
	}
	
	
	public void toverifySubmitFunctionalitywithActionAsForward_SC_09_TC_15() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		waitForSomeTime();
		beforesentbackpendingcount();

		HighlightOnElement(PendingApplication_Icon);
		Assert.assertTrue(PendingApplication_Icon.isEnabled(),"Test Case PAss");
		PendingApplication_Icon.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForelementPresent(entervalueinsearchbox);
		Reporter.log("Expected result:click on PendingApplication Link",true);



		HighlightOnElement(entervalueinsearchbox);

		//String Validnumber=ApplicationNumber.getText();
		String validnumber=excel.getExcelData(entervalueinsearchbox, "RTIApplication Number",0, 1);
		Reporter.log("Valid Application Number:"+validnumber,true);
	//	entervalueinsearchbox.sendKeys(Validnumber);
		waitForSomeTime();
		HighlightOnElement(searchbtn);
		searchbtn.click();
		waitForSomeTime();
		HighlightOnElement(actionbtn1);
		actionbtn1.click();
		waitForSomeTime();

		HighlightOnElement(clickonselectactiondrop);
		SelectVisibleText(clickonselectactiondrop, "Forward");
		
		/*lickonselectactiondrop.click();

		for(int i=0;i<selectdropdownvalue.size();i++)
		{
			String value=selectdropdownvalue.get(i).getText();
			if(value.equalsIgnoreCase("Forward"))
			{
				selectdropdownvalue.get(i).click();
				waitForSomeTime();
			}
		}*/
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(clickonselectuserdrop);
		SelectVisibleText(clickonselectuserdrop, "Poonam Sharma  (Assistant Manager)");
	/*	clickonselectuserdrop.click();
		for(int i=1;i<selectdropdownvalueUser.size();i++)
		{
			String value=selectdropdownvalueUser.get(i).getText();
			Reporter.log("Expected result:"+value,true);
			if(value.equalsIgnoreCase("I gh (Apio)"))
			{
				selectdropdownvalueUser.get(i).click();
				waitForSomeTime();
			}
			
			waitForSomeTime();
		}*/

		
		//ToverifySubjectandFileNoFields();
		waitForSomeTime();
		HighlightOnElement(entercommentbox);
		excel.getExcelData(entercommentbox, "RTIApplication Number",0, 7);
		waitForSomeTime();
		HighlightOnElement(uploaddocument);
		uploaddocument.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur.jpg");
		waitForSomeTime();

		waitForSomeTime();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)", "");
		HighlightOnElement(Submit_Button);
		waitForSomeTime();
		Submit_Button.click();
		Reporter.log("click on Submit button succesfully",true);
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		js.executeScript("window.scrollBy(0,-150)", "");
		HighlightOnElement(homelink);
		homelink.click();
		waitForSomeTime();
		aftersentbackpendingcount();


		if(beforepending==AfterPending)
		{
			Reporter.log("Test case fail pending count Matched", true);
			waitForSomeTime();
		}
		else
		{

			Reporter.log("Test case pass when pending count not Matched", true);
		}
		waitForSomeTime();

	}
	
	
	@FindBy(xpath="//table[@style='width:100%;']/tbody/tr/td/form/div[4]/div[2]/div[1]/ul[2]/li[2]")
	private WebElement beforereject;
	public void beforeRejectcount() throws InterruptedException
	{
		HighlightOnElement(beforereject);
		Assert.assertEquals(true,beforereject.isEnabled());
		String rejectcount=beforereject.getText();;
		int beforerejectcount=Integer.parseInt(rejectcount);
		waitForSomeTime();
		Reporter.log("Before Submition Reject Count On Water Icon Is:" +beforerejectcount,true);
		waitForSomeTime();
	}
	
	
	@FindBy(xpath="//table[@style='width:100%;']/tbody/tr/td/form/div[4]/div[2]/div[1]/ul[2]/li[2]")
	private WebElement afterreject;
	public void afterRejectcount() throws InterruptedException
	{
		HighlightOnElement(afterreject);
		Assert.assertEquals(true,afterreject.isEnabled());
		String rejectcount=afterreject.getText();;
		int afterrejectcount=Integer.parseInt(rejectcount);
		waitForSomeTime();
		Reporter.log("After Submition Reject Count On Water Icon Is:" +afterrejectcount,true);
		waitForSomeTime();
	}
	
	@FindBy(xpath="//html/body/div[2]/table[2]/tbody/tr/td[2]/table/tbody/tr/td/form/div/div[2]/div[2]/div/div/div[1]/div/div[1]/table/tbody/tr[1]/td[4]")
	private WebElement ApplicationNumber;
	
	public void toverifySubmitFunctionalitywithActionAsReject_SC_09_TC_16() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{

		beforeRejectcount();
		HighlightOnElement(PendingApplication_Icon);
		Assert.assertTrue(PendingApplication_Icon.isEnabled(),"Test Case PAss");
		PendingApplication_Icon.click();
		waitForSomeTime();
		waitForSomeTime();
		Reporter.log("Expected result:click on PendingApplication Link",true);
		HighlightOnElement(entervalueinsearchbox);
		String Validnumber=ApplicationNumber.getText();
		//String validnumber=excel.getExcelData(entervalueinsearchbox, "Customer ID",0, 1);
		Reporter.log("Valid Application Number:"+Validnumber,true);
		entervalueinsearchbox.sendKeys(Validnumber);
		waitForSomeTime();
		HighlightOnElement(searchbtn);
		searchbtn.click();
		waitForSomeTime();
		HighlightOnElement(actionbtn1);
		actionbtn1.click();
		waitForSomeTime();

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,450)", "");
		HighlightOnElement(clickonselectactiondrop);
		clickonselectactiondrop.click();
		

		for(int i=0;i<selectdropdownvalue.size();i++)
		{
			String value=selectdropdownvalue.get(i).getText();
			if(value.equalsIgnoreCase("Reject"))
			{
				selectdropdownvalue.get(i).click();
				waitForSomeTime();
			}
		}
		waitForSomeTime();
		waitForSomeTime();

		HighlightOnElement(entercommentbox);
		excel.getExcelData(entercommentbox, "RTIApplication Number",0, 8);
		waitForSomeTime();
		HighlightOnElement(uploaddocument);
		uploaddocument.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur.jpg");
		waitForSomeTime();
		
		
		HighlightOnElement(Submit_Button);
		Submit_Button.click();
		Reporter.log("click on Submit button succesfully",true);
		Thread.sleep(80000);
		HighlightOnElement(homelink);
		homelink.click();
		waitForSomeTime();
		afterRejectcount();

		if(beforereject==afterreject)
		{
			Reporter.log("Test case fail Reject count Matched", true);
			waitForSomeTime();
		}
		else
		{

			Reporter.log("Test case pass when Reject count not Matched", true);
		}
		waitForSomeTime();

	}
	
	
	@FindBy(xpath="//button[contains(.,'Close')]")
	private WebElement close_Button;
	
	
	public void toverifyfunctionalityofclosebutton_SC_09_TC_17() throws InterruptedException
	{
		
		HighlightOnElement(PendingApplication_Icon);
		Assert.assertTrue(PendingApplication_Icon.isEnabled(),"Test Case PAss");
		PendingApplication_Icon.click();
		waitForSomeTime();
		waitForSomeTime();
		Reporter.log("Expected result:click on PendingApplication Link",true);
		HighlightOnElement(entervalueinsearchbox);
		String Validnumber=ApplicationNumber.getText();
		//String validnumber=excel.getExcelData(entervalueinsearchbox, "Customer ID",0, 1);
		Reporter.log("Valid Application Number:"+Validnumber,true);
		entervalueinsearchbox.sendKeys(Validnumber);
		waitForSomeTime();
		HighlightOnElement(searchbtn);
		searchbtn.click();
		waitForSomeTime();
		HighlightOnElement(actionbtn1);
		actionbtn1.click();
		waitForSomeTime();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,450)", "");
		HighlightOnElement(clickonselectactiondrop);
		HighlightOnElement(entercommentbox);
		HighlightOnElement(Submit_Button);
		HighlightOnElement(close_Button);
		waitForSomeTime();
		close_Button.click();
		Reporter.log("click on Close button succesfully",true);
		waitForSomeTime();
		waitForSomeTime();
		
	}

	
	public void toverifythemenuAfterClosingPendingApplication_SC_09_TC_017() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		HighlightOnElement(PendingApplication_Icon);
		Assert.assertTrue(PendingApplication_Icon.isEnabled(),"TestCase Pass:PendingApplication_Icon ");
		Reporter.log(" To Verify PendingApplication_Icon Link in Application of Water&Sewerage link is Present",true); //print for eclipse console
		PendingApplication_Icon.click();
		waitForSomeTime();
		
		HighlightOnElement(NewApplication_Menu);
		Assert.assertTrue(NewApplication_Menu.isEnabled(),"TestCase NewApplication_Menu ");
		Reporter.log(" To Verify NewApplication_Menu Link in Application of Water&Sewerage link is Present",true); //print for eclipse console
		waitForSomeTime();
		
		HighlightOnElement(ONLINERTI_Menu);
		Assert.assertTrue(ONLINERTI_Menu.isEnabled(),"TestCase ONLINERTI_Menu ");
		Reporter.log(" To Verify ONLINERTI_Menu Link in Application of Water&Sewerage link is Present",true); //print for eclipse console
		waitForSomeTime();
		
		HighlightOnElement(PendingApplication_Grid);
		waitForSomeTime();
	}
	
	
	
	@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[1]/tbody/tr/td/div/div[3]/span")
	//@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[1]/tbody/tr/td/select")
	private WebElement SelectActionDropdownLink;
	
	//@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[1]/tbody/tr/td[3]/span/select")
	@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[1]/tbody/tr/td[3]/span/div/div[3]/span")
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
	
	@FindBy(xpath="(//input[@title='Subject'])[2]")
	private WebElement SubjectField1;
	
	@FindBy(xpath="(//input[@title='File Number'])[2]")
	private WebElement FileField1;
	
	//@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr[2]/td[3]/div/div/span")
	@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr[2]/td[2]/select")
	private WebElement Type_Dropdown;
	
	//@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr[2]/td[6]/div/div/span")
	@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr[2]/td[4]/select")
	private WebElement Category_Dropdown;
	
	//@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr[3]/td[3]/div/div/span")
	@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr[3]/td[2]/select")
	private WebElement Department_Dropdown;
	
	@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr[3]/td[4]/div/div[2]")
	private WebElement IsConditional_Checkbox;
	
	@FindBy(xpath=".//*[@id='inboxForm:searchdata_data']/tr/td[1]/div/div[2]")
	private WebElement Checkbox1;
	
	@FindBy(xpath="//span[contains(.,'Create File')]/../following-sibling::div/div/div/center/table/tbody/tr/td/button[contains(.,'Submit')]")
	private WebElement SUBMITBTN;
	
	
	@FindBy(xpath="(//table[@class='ui-panelgrid ui-widget']/tbody/tr/td[2]/input)[1]")
	private WebElement Subject_Field;
	
	@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr/td[2]/table/tbody/tr/td[1]/input")
	private WebElement FileNo_Field;
	
	public void ToverifySubjectandFileNoFields() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		waitForSomeTime();
		HighlightOnElement(Subject_Field);
		waitForSomeTime();
		Assert.assertTrue(Subject_Field.isEnabled(),"Test Case Pass: Subject_Field");
		//excel.getExcelData(Subject_Field, "Application_AM_LEGAL", 1, 24);
		Reporter.log("Subject_Field  in Application of Water&Sewerage  LEGAL  Is Present" ); //print for eclipse console
		waitForDomElement();
		waitForSomeTime();
		HighlightOnElement(FileNo_Field);
		Assert.assertTrue(FileNo_Field.isEnabled(),"Test Case Pass: FileNo_Field");
		//excel.getExcelData(FileNo_Field, "Application_AM_LEGAL", 1, 25);
		Reporter.log("FileNo_Field  in Application of Water&Sewerage  LEGAL  Is Present" ); //print for eclipse console
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
		SubjectField1.sendKeys("RTI");
		//excel.getExcelData(SubjectField1, "Environmental_Application_Form", 1, 54);
		waitForSomeTime();
		HighlightOnElement(FileField1);
		waitForSomeTime();
		waitForSomeTime();
		FileField1.sendKeys("1234");
		//excel.getExcelData(FileField1, "Environmental_Application_Form", 1, 55);
		waitForSomeTime();
		HighlightOnElement(Type_Dropdown);
		//Type_Dropdown.click();
		waitForSomeTime();
		//selectValueFromDropdown("File");
		SelectVisibleText(Type_Dropdown, "File");
		HighlightOnElement(Category_Dropdown);
		//Category_Dropdown.click();
		waitForSomeTime();
		//selectValueFromDropdown("Land");
		SelectVisibleText(Category_Dropdown, "Land");
		HighlightOnElement(Department_Dropdown);
		//Department_Dropdown.click();
		waitForSomeTime();
		//selectValueFromDropdown("ENVIRONMENT SECTION");
		SelectVisibleText(Department_Dropdown, "RTI SECTION");
		waitForSomeTime();
		waitForSomeTime();
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
		
		
		
	}
	
	
	@FindBy(xpath="//button[contains(.,'Close')]")
	private WebElement CloseButton;
	
	
	public void toVerifyfunctionalityofUploadingDocument_SC_04_TC_06() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		
		
		HighlightOnElement(UploadingDocument);
		UploadingDocument.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur.jpg");
		Reporter.log("Upload Document Link Application ofRTI Section is Present" ); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
	}

	
	public void toVerifyfunctionalityofCloseButton_SC_04_TC_06() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		
		
		HighlightOnElement(CloseButton);
		CloseButton.click();
		
		waitForSomeTime();
		waitForSomeTime();
	}
	
	
	@FindBy(xpath="//h3[@class='ui-accordion-header ui-helper-reset ui-state-default ui-state-active ui-corner-top']/a")
	private List <WebElement> HeadingsInPendingApplication;
	
	@FindBy(xpath="//a[contains(.,'RTI')]/../following-sibling::div[1]/div/div/div/div[1]/table/thead/tr/th/span")
	private List <WebElement> RTI_Menu;
	
	@FindBy(xpath="(//h3[@class='ui-accordion-header ui-helper-reset ui-state-default ui-state-active ui-corner-top']/a[contains(.,'RTI')])[1]")
	private  WebElement RTI_Link1;
	
	@FindBy(xpath="//div[@class='ui-accordion ui-widget ui-helper-reset ui-hidden-container']/h3[24]/a")
	private  WebElement RTI_Link11;
	
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
				Reporter.log(" Menu list Pending Application Is:"+Menu );
			}

		}
		waitForSomeTime();
		waitForSomeTime();
		ScroolDown();
		HighlightOnElement(RTI_Link11);
		RTI_Link11.click();
		waitForSomeTime();
		for(WebElement menulist:RTI_Menu)
		{
			HighlightOnElement(menulist);
			Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
			if(menulist.isDisplayed())
			{
				String Menu=menulist.getText();
				Reporter.log(" Menu Under Environment NOC Is:"+Menu );
			}

		}
		
	}
	
	

}
