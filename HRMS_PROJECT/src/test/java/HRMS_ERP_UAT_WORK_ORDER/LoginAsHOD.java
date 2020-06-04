package HRMS_ERP_UAT_WORK_ORDER;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericLibrary.ExcelDataDriver;
import HRMS_ERP_UAT_DSC.HRHomePage;
import HRMS_LOGINPAGE.LoginPageHRMS;
import HRMS_URL_Page.HRMS_URL;

@Listeners(GenericLibrary.ListenerDriver.class)
public class LoginAsHOD extends HRMS_URL
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	String filepath="C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\HRMS_PROJECT\\src\\test\\resources\\HRMS_TESTDATA\\HRMS_TESTDATA.xlsx";

	@AfterMethod 
	public void logoutHRMS() throws InterruptedException
	{
		WebElement logout=driver.findElement(By.xpath("//header[@role='banner']/nav/div/ul/li/a/img"));
		HighlightOnElement(logout);
		logout.click();
		Reporter.log("click on Administrator menu successfully",true);
		log.info("To verify click on Administrator menu successfully");

		WebElement logoutbtn=driver.findElement(By.xpath("//a[contains(text(),'Log out')]"));
		HighlightOnElement(logoutbtn);
		logoutbtn.click();
		Reporter.log("click on Logout buton successfully",true);
		log.info("To verify click on Logout button successfully");
		
		driver.close();
		Reporter.log("Browser closed succesfully",true);
		log.info("To verify Browser closed successfully");
	}

	@DataProvider(name="WO HOD")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"HRMS_TOUR_HOD");
	}

	@Test(priority=1,description="login verify",dataProvider="WO HOD",alwaysRun=true)
	public void UAT_Finance_WO_01(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HOD(Username,Password);
	}
	
	@Test(priority=2,description="verify work order",dataProvider="WO HOD",alwaysRun=true)
	public void UAT_Finance_WO_02(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HOD(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		WOHomePage homepage=PageFactory.initElements(driver,WOHomePage.class);
		homepage.clickOnWorkOrder();
	}
	
	@Test(priority=3,description="verify create work order",dataProvider="WO HOD",alwaysRun=true)
	public void UAT_Finance_WO_03(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HOD(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		WOHomePage homepage=PageFactory.initElements(driver,WOHomePage.class);
		homepage.clickOnWorkOrder();
		
		CreatePage create=PageFactory.initElements(driver,CreatePage.class);
		create.clickOnCreate();
	}
	
	@Test(priority=4,description="verify enter work order details",dataProvider="WO HOD",alwaysRun=true)
	public void UAT_Finance_WO_04(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HOD(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		WOHomePage homepage=PageFactory.initElements(driver,WOHomePage.class);
		homepage.clickOnWorkOrder();
		
		CreatePage create=PageFactory.initElements(driver,CreatePage.class);
		create.clickOnCreate();
		create.selectSupplier();
		create.selectTSNo();
		create.enterTenderNo();
		create.selectStartDate();
		create.selectCompletionDate();
		
		SavePage save=PageFactory.initElements(driver,SavePage.class);
		save.clickOnSave();
	}
	
	@Test(priority=5,description="verify work order details",dataProvider="WO HOD",alwaysRun=true)
	public void UAT_Finance_WO_05(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HOD(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		WOHomePage homepage=PageFactory.initElements(driver,WOHomePage.class);
		homepage.clickOnWorkOrder();
		
		FilterPage filter=PageFactory.initElements(driver,FilterPage.class);
		filter.clickOnSerach();
		filter.enterFilterDetails();
		filter.enterTSNo();
		filter.clickOnApply();
		filter.clickOnDraft();
		
		WorkOrderLinesPage work=PageFactory.initElements(driver,WorkOrderLinesPage.class);
		work.clickOnWorkOrderLines();
	}
	
	@Test(priority=6,description="verify Payment details",dataProvider="WO HOD",alwaysRun=true)
	public void UAT_Finance_WO_06(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HOD(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		WOHomePage homepage=PageFactory.initElements(driver,WOHomePage.class);
		homepage.clickOnWorkOrder();
		
		FilterPage filter=PageFactory.initElements(driver,FilterPage.class);
		filter.clickOnSerach();
		filter.enterFilterDetails();
		filter.enterTSNo();
		filter.clickOnApply();
		filter.clickOnDraft();
		
		EditPage edit=PageFactory.initElements(driver,EditPage.class);
		edit.clickOnEdit();
		
		PaymentDetailsPage details=PageFactory.initElements(driver,PaymentDetailsPage.class);
		details.clickOnPaymentDetails();
		details.clickOnAddItem();
		details.enterMilestone();
		details.enterReleaseAmt();
	}
	
	@Test(priority=7,description="verify save",dataProvider="WO HOD",alwaysRun=true)
	public void UAT_Finance_WO_07(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HOD(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		WOHomePage homepage=PageFactory.initElements(driver,WOHomePage.class);
		homepage.clickOnWorkOrder();
		
		FilterPage filter=PageFactory.initElements(driver,FilterPage.class);
		filter.clickOnSerach();
		filter.enterFilterDetails();
		filter.enterTSNo();
		filter.clickOnApply();
		filter.clickOnDraft();
		
		EditPage edit=PageFactory.initElements(driver,EditPage.class);
		edit.clickOnEdit();
		
		PaymentDetailsPage details=PageFactory.initElements(driver,PaymentDetailsPage.class);
		details.clickOnPaymentDetails();
		details.clickOnAddItem();
		details.enterMilestone();
		details.enterReleaseAmt();
		
		SavePage save=PageFactory.initElements(driver,SavePage.class);
		save.clickOnSave();
	}
	
	@Test(priority=8,description="verify submit",dataProvider="WO HOD",alwaysRun=true)
	public void UAT_Finance_WO_08(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HOD(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		WOHomePage homepage=PageFactory.initElements(driver,WOHomePage.class);
		homepage.clickOnWorkOrder();
		
		FilterPage filter=PageFactory.initElements(driver,FilterPage.class);
		filter.clickOnSerach();
		filter.enterFilterDetails();
		filter.enterTSNo();
		filter.clickOnApply();
		filter.clickOnDraft();
		
		SubmitPage submit=PageFactory.initElements(driver,SubmitPage.class);
		submit.clickOnSubmit();
	}
	
	
						//HOD Approval
	
	@Test(priority=1,description="login verify",dataProvider="WO HOD",alwaysRun=true)
	public void UAT_Finance_WO_09(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HOD(Username,Password);
	}
	
	@Test(priority=2,description="verify work order",dataProvider="WO HOD",alwaysRun=true)
	public void UAT_Finance_WO_10(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HOD(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		WOHomePage homepage=PageFactory.initElements(driver,WOHomePage.class);
		homepage.clickOnWorkOrder();
	}
	
	@Test(priority=5,description="verify Approve",dataProvider="WO HOD",alwaysRun=true)
	public void UAT_Finance_WO_11(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HOD(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		WOHomePage homepage=PageFactory.initElements(driver,WOHomePage.class);
		homepage.clickOnWorkOrder();
		
		FilterPage filter=PageFactory.initElements(driver,FilterPage.class);
		filter.clickOnSerach();
		filter.enterFilterDetails();
		filter.enterTSNo();
		filter.clickOnApply();
		filter.clickOnHODWaitingStatus();
		
		ApproveApge approve=PageFactory.initElements(driver,ApproveApge.class);
		approve.clickOnApprove();
		approve.selectAssignedToCEO();
		approve.enterHODRemark();
		approve.clickOnApproves();
	}
	
	@Test(priority=3,description="verify Revert",dataProvider="WO HOD",alwaysRun=true)
	public void UAT_Finance_WO_12(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HOD(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		WOHomePage homepage=PageFactory.initElements(driver,WOHomePage.class);
		homepage.clickOnWorkOrder();
		
		FilterPage filter=PageFactory.initElements(driver,FilterPage.class);
		filter.clickOnSerach();
		filter.enterFilterDetails();
		filter.enterTSNo();
		filter.clickOnApply();
		filter.clickOnHODWaitingStatus();
		
		RevertPage revert=PageFactory.initElements(driver,RevertPage.class);
		revert.clickOnRevert();
	}
	
	@Test(priority=4,description="verify Reject",dataProvider="WO HOD",alwaysRun=true)
	public void UAT_Finance_WO_13(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HOD(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		WOHomePage homepage=PageFactory.initElements(driver,WOHomePage.class);
		homepage.clickOnWorkOrder();
		
		FilterPage filter=PageFactory.initElements(driver,FilterPage.class);
		filter.clickOnSerach();
		filter.enterFilterDetails();
		filter.enterTSNo();
		filter.clickOnApply();
		filter.clickOnHODWaitingStatus();
		
		RejectPage reject=PageFactory.initElements(driver,RejectPage.class);
		reject.clickOnReject();
	}

}
