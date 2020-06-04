package HRMS_ERP_UAT_ADMINISTRATIVE_APPROVAL_ALLOCATION;

import java.awt.AWTException;
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
import HRMS_ERP_UAT_ADMINISTRATIVE_APPROVAL_ALLOCATION.*;
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

	@DataProvider(name="AA HOD")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"HRMS_TOUR_HOD");
	}

	@Test(priority=1,description="login verify",dataProvider="AA HOD",alwaysRun=true)
	public void UAT_Finance_AA_01(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HOD(Username,Password);
		
	}
	
	@Test(priority=2,description="verify administrative Approvals",dataProvider="AA HOD",alwaysRun=true)
	public void UAT_Finance_AA_02(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HOD(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		AdministrativeApprovalPage app=PageFactory.initElements(driver,AdministrativeApprovalPage.class);
		app.clickOnAdministrativeApproval();
		
	}
	
	@Test(priority=3,description="verify Estimate Project",dataProvider="AA HOD",alwaysRun=true)
	public void UAT_Finance_AA_03(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HOD(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		AdministrativeApprovalPage app=PageFactory.initElements(driver,AdministrativeApprovalPage.class);
		app.clickOnAdministrativeApproval();
		app.clickOnEstimateProject();
		app.clickOnEstimateProjectMenu();	
	}
	
	@Test(priority=4,description="verify create Estimate Project",dataProvider="AA HOD",alwaysRun=true)
	public void UAT_Finance_AA_04(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HOD(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		AdministrativeApprovalPage app=PageFactory.initElements(driver,AdministrativeApprovalPage.class);
		app.clickOnAdministrativeApproval();
		app.clickOnEstimateProject();
		app.clickOnEstimateProjectMenu();	
		
		CreateProjectEstimatePage create=PageFactory.initElements(driver,CreateProjectEstimatePage.class);
		create.clickOnCreate();

	}
	
	@Test(priority=5,description="verify Proposal Summary",dataProvider="AA HOD",alwaysRun=true)
	public void UAT_Finance_AA_05(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HOD(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		AdministrativeApprovalPage app=PageFactory.initElements(driver,AdministrativeApprovalPage.class);
		app.clickOnAdministrativeApproval();
		app.clickOnEstimateProject();
		app.clickOnEstimateProjectMenu();	
		
		CreateProjectEstimatePage create=PageFactory.initElements(driver,CreateProjectEstimatePage.class);
		create.clickOnCreate();
		create.enterProjectName();
		create.enterProjectCategory();
		create.clickOnUploadFile();
	}
	
	@Test(priority=6,description="verify Proposal Details",dataProvider="AA HOD",alwaysRun=true)
	public void UAT_Finance_AA_06(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HOD(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		AdministrativeApprovalPage app=PageFactory.initElements(driver,AdministrativeApprovalPage.class);
		app.clickOnAdministrativeApproval();
		app.clickOnEstimateProject();
		app.clickOnEstimateProjectMenu();
		
		CreateProjectEstimatePage create=PageFactory.initElements(driver,CreateProjectEstimatePage.class);
		create.clickOnCreate();
		create.enterProjectName();
		create.enterProjectCategory();
		create.clickOnUploadFile();
		create.clickOnAddAnItem();
		create.enterAnalyticAccount();
		create.enterQuantity();
		create.enterUOM();
		create.enterUnitPrice();
		create.clickSaveAndClose();
	}
	
	@Test(priority=7,description="verify FY Estimate",dataProvider="AA HOD",alwaysRun=true)
	public void UAT_Finance_AA_07(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HOD(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		AdministrativeApprovalPage app=PageFactory.initElements(driver,AdministrativeApprovalPage.class);
		app.clickOnAdministrativeApproval();
		app.clickOnEstimateProject();
		app.clickOnEstimateProjectMenu();
		
		CreateProjectEstimatePage create=PageFactory.initElements(driver,CreateProjectEstimatePage.class);
		create.clickOnCreate();
		create.enterProjectName();
		create.enterProjectCategory();
		create.clickOnUploadFile();
		create.clickOnAddAnItem();
		create.enterAnalyticAccount();
		create.enterQuantity();
		create.enterUOM();
		create.enterUnitPrice();
		create.clickSaveAndClose();
		
		create.clickOnFYEstimate();
		create.clickOnAddAnItems();
		create.enterFY();
		create.enterDescription();
		create.enterAmount();
	}
	
	@Test(priority=8,description="verify Proposal Agency Details",dataProvider="AA HOD",alwaysRun=true)
	public void UAT_Finance_AA_08(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HOD(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		AdministrativeApprovalPage app=PageFactory.initElements(driver,AdministrativeApprovalPage.class);
		app.clickOnAdministrativeApproval();
		app.clickOnEstimateProject();
		app.clickOnEstimateProjectMenu();
		
		CreateProjectEstimatePage create=PageFactory.initElements(driver,CreateProjectEstimatePage.class);
		create.clickOnCreate();
		create.enterProjectName();
		create.enterProjectCategory();
		create.clickOnUploadFile();
		create.clickOnAddAnItem();
		create.enterAnalyticAccount();
		create.enterQuantity();
		create.enterUOM();
		create.enterUnitPrice();
		create.clickSaveAndClose();
		
		create.clickOnFYEstimate();
		create.clickOnAddAnItems();
		create.enterFY();
		create.enterDescription();
		create.enterAmount();
		
		create.clickOnProposalAgency();
		create.clickOnAddAnItemss();
		create.enterAgency();
		create.uploadFile();
		create.enterContribution();
	}
	
	@Test(priority=9,description="verify History",dataProvider="AA HOD",alwaysRun=true)
	public void UAT_Finance_AA_09(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HOD(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		AdministrativeApprovalPage app=PageFactory.initElements(driver,AdministrativeApprovalPage.class);
		app.clickOnAdministrativeApproval();
		app.clickOnEstimateProject();
		app.clickOnEstimateProjectMenu();
		
		CreateProjectEstimatePage create=PageFactory.initElements(driver,CreateProjectEstimatePage.class);
		create.clickOnCreate();
		create.enterProjectName();
		create.enterProjectCategory();
		create.clickOnUploadFile();
		create.clickOnAddAnItem();
		create.enterAnalyticAccount();
		create.enterQuantity();
		create.enterUOM();
		create.enterUnitPrice();
		create.clickSaveAndClose();
		
		create.clickOnFYEstimate();
		create.clickOnAddAnItems();
		create.enterFY();
		create.enterDescription();
		create.enterAmount();
		
		create.clickOnProposalAgency();
		create.clickOnAddAnItemss();
		create.enterAgency();
		create.uploadFile();
		create.enterContribution();
		
		create.clickOnHistory();
	}
	
	@Test(priority=10,description="verify Document History ",dataProvider="AA HOD",alwaysRun=true)
	public void UAT_Finance_AA_10(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HOD(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		AdministrativeApprovalPage app=PageFactory.initElements(driver,AdministrativeApprovalPage.class);
		app.clickOnAdministrativeApproval();
		app.clickOnEstimateProject();
		app.clickOnEstimateProjectMenu();
		
		CreateProjectEstimatePage create=PageFactory.initElements(driver,CreateProjectEstimatePage.class);
		create.clickOnCreate();
		create.enterProjectName();
		create.enterProjectCategory();
		create.clickOnUploadFile();
		create.clickOnAddAnItem();
		create.enterAnalyticAccount();
		create.enterQuantity();
		create.enterUOM();
		create.enterUnitPrice();
		create.clickSaveAndClose();
		
		create.clickOnFYEstimate();
		create.clickOnAddAnItems();
		create.enterFY();
		create.enterDescription();
		create.enterAmount();
		
		create.clickOnProposalAgency();
		create.clickOnAddAnItemss();
		create.enterAgency();
		create.uploadFile();
		create.enterContribution();
		
		create.clickOnDocsHistory();
	}
	
	@Test(priority=11,description="verify Save ",dataProvider="AA HOD",alwaysRun=true)
	public void UAT_Finance_AA_11(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HOD(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		AdministrativeApprovalPage app=PageFactory.initElements(driver,AdministrativeApprovalPage.class);
		app.clickOnAdministrativeApproval();
		app.clickOnEstimateProject();
		app.clickOnEstimateProjectMenu();
		
		CreateProjectEstimatePage create=PageFactory.initElements(driver,CreateProjectEstimatePage.class);
		create.clickOnCreate();
		create.enterProjectName();
		create.enterProjectCategory();
		create.clickOnUploadFile();
		create.clickOnAddAnItem();
		create.enterAnalyticAccount();
		create.enterQuantity();
		create.enterUOM();
		create.enterUnitPrice();
		create.clickSaveAndClose();
		
		create.clickOnFYEstimate();
		create.clickOnAddAnItems();
		create.enterFY();
		create.enterDescription();
		create.enterAmount();
		
		create.clickOnProposalAgency();
		create.clickOnAddAnItemss();
		create.enterAgency();
		create.uploadFile();
		create.enterContribution();
		
		create.clickOnSave();
	}
	
	@Test(priority=12,description="verify Submit ",dataProvider="AA HOD",alwaysRun=true)
	public void UAT_Finance_AA_12(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HOD(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		AdministrativeApprovalPage app=PageFactory.initElements(driver,AdministrativeApprovalPage.class);
		app.clickOnAdministrativeApproval();
		app.clickOnEstimateProject();
		app.clickOnEstimateProjectMenu();
		
		FilterPage filter=PageFactory.initElements(driver,FilterPage.class);
		filter.clickOnSerach();
		filter.enterFilterDetails();
		filter.enterProposalNo();
		filter.clickOnApply();
		filter.clickOnDraft();
		
		SubmitPage submit=PageFactory.initElements(driver,SubmitPage.class);
		submit.clickOnSubmit();
	}
	
	@Test(priority=12,description="verify approve ",dataProvider="AA HOD",alwaysRun=true)
	public void UAT_Finance_AA_13(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HOD(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		AdministrativeApprovalPage app=PageFactory.initElements(driver,AdministrativeApprovalPage.class);
		app.clickOnAdministrativeApproval();
		app.clickOnEstimateProject();
		app.clickOnEstimateProjectMenu();
		
		FilterPage filter=PageFactory.initElements(driver,FilterPage.class);
		filter.clickOnSerach();
		filter.enterFilterDetails();
		filter.enterProposalNo();
		filter.clickOnApply();
		filter.clickOnHODWaitingStatus();
		
		SubmitPage submit=PageFactory.initElements(driver,SubmitPage.class);
		submit.clickOnApprove();
		submit.enterHODRemark();
		submit.clickOnApproves();
		
		
	}

}
