package HRMS_ERP_UAT_VRS_TEST;

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
import HRMS_ERP_UAT_VRS.EmployeeRetirement;
import HRMS_ERP_UAT_VRS.HRFetchAllEmployees;
import HRMS_ERP_UAT_VRS.HRManagerHomePage;
import HRMS_ERP_UAT_VRS.HRapprovePage;
import HRMS_ERP_UAT_VRS.HRsectionNOCPage;
import HRMS_ERP_UAT_VRS.HRstatusPage;
import HRMS_ERP_UAT_VRS.HomePage;
import HRMS_ERP_UAT_VRS.ResignationPage;
import HRMS_LOGINPAGE.LoginPageHRMS;
import HRMS_URL_Page.HRMS_URL;

@Listeners(GenericLibrary.ListenerDriver.class)
public class LoginAsHRManager extends HRMS_URL
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

	@DataProvider(name="VRS HRManager")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"HRMS_VRS_HR");
	}

	@Test(priority=1,description="login verify",dataProvider="VRS HRManager",alwaysRun=true)
	public void UAT_HRMS_VRS_14(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HR(Username,Password);
	}
	
	@Test(priority=2,description="verify resignation/retirements",dataProvider="VRS HRManager",alwaysRun=true)
	public void UAT_HRMS_VRS_15(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HR(Username,Password);
		
		HomePage selfService=PageFactory.initElements(driver,HomePage.class);
		selfService.clickOnDiscussImage();
		
		HRManagerHomePage homepage=PageFactory.initElements(driver,HRManagerHomePage.class);
		homepage.clickOnResignation();
	}
	
	@Test(priority=3,description="verify retirements",dataProvider="VRS HRManager",alwaysRun=true)
	public void UAT_HRMS_VRS_16(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HR(Username,Password);
		
		HomePage selfService=PageFactory.initElements(driver,HomePage.class);
		selfService.clickOnDiscussImage();
		
		HRManagerHomePage homepage=PageFactory.initElements(driver,HRManagerHomePage.class);
		homepage.clickOnResignation();
		
		ResignationPage retirement=PageFactory.initElements(driver,ResignationPage.class);
		retirement.clickOnRetirement();
		retirement.clickOnRetirements();
		
		EmployeeRetirement name=PageFactory.initElements(driver,EmployeeRetirement.class);
		name.clickOnEmployeeSearch();
		name.clickOnEmployee();
		
		HRstatusPage hrstatus=PageFactory.initElements(driver,HRstatusPage.class);
		hrstatus.clickOnHRStatus();
	}
	
	@Test(priority=4,description="verify fetch all Employee",dataProvider="VRS HRManager",alwaysRun=true)
	public void UAT_HRMS_VRS_17(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HR(Username,Password);
		
		HomePage selfService=PageFactory.initElements(driver,HomePage.class);
		selfService.clickOnDiscussImage();
		
		HRManagerHomePage homepage=PageFactory.initElements(driver,HRManagerHomePage.class);
		homepage.clickOnResignation();
		
		ResignationPage retirement=PageFactory.initElements(driver,ResignationPage.class);
		retirement.clickOnRetirement();
		retirement.clickOnRetirements();
		
		EmployeeRetirement name=PageFactory.initElements(driver,EmployeeRetirement.class);
		name.clickOnEmployeeSearch();
		name.clickOnEmployee();
		
		HRstatusPage hrstatus=PageFactory.initElements(driver,HRstatusPage.class);
		hrstatus.clickOnHRStatus();
		
		HRFetchAllEmployees fetch=PageFactory.initElements(driver,HRFetchAllEmployees.class);
		fetch.clickOnFetchAllEmployee();
	}
	
	@Test(priority=5,description="verify section NOC",dataProvider="VRS HRManager",alwaysRun=true)
	public void UAT_HRMS_VRS_18(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HR(Username,Password);
		
		HomePage selfService=PageFactory.initElements(driver,HomePage.class);
		selfService.clickOnDiscussImage();
		
		HRManagerHomePage homepage=PageFactory.initElements(driver,HRManagerHomePage.class);
		homepage.clickOnResignation();
		
		ResignationPage retirement=PageFactory.initElements(driver,ResignationPage.class);
		retirement.clickOnRetirement();
		retirement.clickOnRetirements();
		
		EmployeeRetirement name=PageFactory.initElements(driver,EmployeeRetirement.class);
		name.clickOnEmployeeSearch();
		name.clickOnEmployee();
		
		HRstatusPage hrstatus=PageFactory.initElements(driver,HRstatusPage.class);
		hrstatus.clickOnHRStatus();
		
//		HRsectionNOCPage sectionNOC=PageFactory.initElements(driver,HRsectionNOCPage.class);
//		sectionNOC.clickOnSectionNOC();
//		name.clickOnEmployee();
//		sectionNOC.clickOnReitrement();
//		sectionNOC.clickOnSelectedEmployee();
//		sectionNOC.clickOnEdit();
//		sectionNOC.uploadDocs();
//		sectionNOC.enterRemark();
//		sectionNOC.clickOnNoDues();
//		sectionNOC.clickOnDuesPending();
	}
	
	@Test(priority=6,description="verify Arrove",dataProvider="VRS HRManager",alwaysRun=true)
	public void UAT_HRMS_VRS_19(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HR(Username,Password);
		
		HomePage selfService=PageFactory.initElements(driver,HomePage.class);
		selfService.clickOnDiscussImage();
		
		HRManagerHomePage homepage=PageFactory.initElements(driver,HRManagerHomePage.class);
		homepage.clickOnResignation();
		
		ResignationPage retirement=PageFactory.initElements(driver,ResignationPage.class);
		retirement.clickOnRetirement();
		retirement.clickOnRetirements();
		
		EmployeeRetirement name=PageFactory.initElements(driver,EmployeeRetirement.class);
		name.clickOnEmployeeSearch();
		name.clickOnEmployee();
		
		HRstatusPage hrstatus=PageFactory.initElements(driver,HRstatusPage.class);
		hrstatus.clickOnHRStatus();
		
		HRapprovePage approve=PageFactory.initElements(driver,HRapprovePage.class);
		approve.clickOnApprove();
		approve.selectRelievingDate();
		approve.enterRemarks();
		approve.clickOnSubmit();
	}

}
