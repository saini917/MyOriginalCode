package HRMS_ERP_UAT_BUDGET_ALLOCATION;

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
import HRMS_ERP_UAT_ADMINISTRATIVE_APPROVAL_ALLOCATION.AdministrativeApprovalPage;
import HRMS_ERP_UAT_ADMINISTRATIVE_APPROVAL_ALLOCATION.CreateProjectEstimatePage;
import HRMS_ERP_UAT_ADMINISTRATIVE_APPROVAL_ALLOCATION.SubmitPage;
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

	@DataProvider(name="BA FM")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"HRMS_TOUR_HOD");
	}

	@Test(priority=1,description="login verify",dataProvider="BA FM",alwaysRun=true)
	public void UAT_Finance_BA_04(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HOD(Username,Password);
		
	}
	
	@Test(priority=2,description="verify administrative Approvals",dataProvider="BA FM",alwaysRun=true)
	public void UAT_Finance_BA_05(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HOD(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		AdministrativeApprovalPage app=PageFactory.initElements(driver,AdministrativeApprovalPage.class);
		app.clickOnAdministrativeApproval();
		
	}
	
	@Test(priority=3,description="verify Estimate Project",dataProvider="BA FM",alwaysRun=true)
	public void UAT_Finance_BA_06(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
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
	
	@Test(priority=4,description="verify create Estimate Project",dataProvider="BA FM",alwaysRun=true)
	public void UAT_Finance_BA_07(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
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
	
	@Test(priority=5,description="verify save",dataProvider="BA FM",alwaysRun=true)
	public void UAT_Finance_BA_08(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
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
		create.clickOnSave();
	}
	
	@Test(priority=5,description="verify submit",dataProvider="BA FM",alwaysRun=true)
	public void UAT_Finance_BA_09(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HOD(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		AdministrativeApprovalPage app=PageFactory.initElements(driver,AdministrativeApprovalPage.class);
		app.clickOnAdministrativeApproval();
		app.clickOnEstimateProject();
		app.clickOnEstimateProjectMenu();	
		
		SubmitPage submit=PageFactory.initElements(driver,SubmitPage.class);
		submit.clickOnSerach();
		submit.enterFilterDetails();
		submit.enterProposalNo();
		submit.clickOnApply();
		submit.clickOnDraft();
		submit.clickOnSubmit();
	}
	
	@Test(priority=5,description="verify Approve",dataProvider="BA FM",alwaysRun=true)
	public void UAT_Finance_BA_10(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HOD(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		AdministrativeApprovalPage app=PageFactory.initElements(driver,AdministrativeApprovalPage.class);
		app.clickOnAdministrativeApproval();
		app.clickOnEstimateProject();
		app.clickOnEstimateProjectMenu();	
		
		SubmitPage submit=PageFactory.initElements(driver,SubmitPage.class);
		submit.clickOnSerach();
		submit.enterFilterDetails();
		submit.enterProposalNo();
		submit.clickOnApply();
		submit.clickOnHODApprovalStatus();
		submit.clickOnApprove();
		submit.enterHODRemark();
		submit.clickOnApproves();
	}
	
	

}
