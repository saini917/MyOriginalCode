package HRMS_ERP_UAT_VRS_TEST;

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
import HRMS_ERP_UAT_VRS.COHomePage;
import HRMS_ERP_UAT_VRS.CreateVRSPage;
import HRMS_ERP_UAT_VRS.EmployeeCheckStatus;
import HRMS_ERP_UAT_VRS.EmployeeRetirement;
import HRMS_ERP_UAT_VRS.HomePage;
import HRMS_ERP_UAT_VRS.NewRequestPage;
import HRMS_ERP_UAT_VRS.RequestTypePage;
import HRMS_ERP_UAT_VRS.ResignationPage;
import HRMS_LOGINPAGE.LoginPageHRMS;
import HRMS_URL_Page.HRMS_URL;

@Listeners(GenericLibrary.ListenerDriver.class)
public class LoginAsEmployee extends HRMS_URL
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

	@DataProvider(name="VRS EMPLOYEE")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"HRMS_VRS_EMPLOYEE");
	}

	@Test(priority=1,description="login verify",dataProvider="VRS EMPLOYEE",alwaysRun=true)
	public void UAT_HRMS_VRS_1(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_VRS_Employee(Username,Password);
	}
	
	@Test(priority=2,description="verify self service",dataProvider="VRS EMPLOYEE",alwaysRun=true)
	public void UAT_HRMS_VRS_2(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_VRS_Employee(Username,Password);
		
		HomePage selfService=PageFactory.initElements(driver,HomePage.class);
		selfService.clickOnDiscussImage();
		selfService.clickOnSelfService();
	}
	
	@Test(priority=3,description="verify new request",dataProvider="VRS EMPLOYEE",alwaysRun=true)
	public void UAT_HRMS_VRS_3(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_VRS_Employee(Username,Password);
		
		HomePage selfService=PageFactory.initElements(driver,HomePage.class);
		selfService.clickOnDiscussImage();
		selfService.clickOnSelfService();
		
		NewRequestPage newrequest=PageFactory.initElements(driver,NewRequestPage.class);
		newrequest.clickOnNewRequest();
		newrequest.clickOnNewServiceRequest();
	}
	
	@Test(priority=4,description="verify VRS request",dataProvider="VRS EMPLOYEE",alwaysRun=true)
	public void UAT_HRMS_VRS_4(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_VRS_Employee(Username,Password);
		
		HomePage selfService=PageFactory.initElements(driver,HomePage.class);
		selfService.clickOnDiscussImage();
		selfService.clickOnSelfService();
		
		NewRequestPage newrequest=PageFactory.initElements(driver,NewRequestPage.class);
		newrequest.clickOnNewRequest();
		newrequest.clickOnNewServiceRequest();
		
		CreateVRSPage create=PageFactory.initElements(driver,CreateVRSPage.class);
		create.clickOnCreate();
		
		RequestTypePage requesttype=PageFactory.initElements(driver,RequestTypePage.class);
		requesttype.selectRequestType();
		requesttype.enterRemark();
	}
	
	@Test(priority=6,description="verify submit request",dataProvider="VRS EMPLOYEE",alwaysRun=true)
	public void UAT_HRMS_VRS_5(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_VRS_Employee(Username,Password);
		
		HomePage selfService=PageFactory.initElements(driver,HomePage.class);
		selfService.clickOnDiscussImage();
		selfService.clickOnSelfService();
		
		NewRequestPage newrequest=PageFactory.initElements(driver,NewRequestPage.class);
		newrequest.clickOnNewRequest();
		newrequest.clickOnNewServiceRequest();
		
		CreateVRSPage create=PageFactory.initElements(driver,CreateVRSPage.class);
		create.clickOnCreate();
		
		RequestTypePage requesttype=PageFactory.initElements(driver,RequestTypePage.class);
		requesttype.selectRequestType();
		requesttype.enterRemark();
		requesttype.clickOnSubmitRequest();
	}
	
	@Test(priority=5,description="verify discard",dataProvider="VRS EMPLOYEE",alwaysRun=true)
	public void UAT_HRMS_VRS_6(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_VRS_Employee(Username,Password);
		
		HomePage selfService=PageFactory.initElements(driver,HomePage.class);
		selfService.clickOnDiscussImage();
		selfService.clickOnSelfService();
		
		NewRequestPage newrequest=PageFactory.initElements(driver,NewRequestPage.class);
		newrequest.clickOnNewRequest();
		newrequest.clickOnNewServiceRequest();
		
		CreateVRSPage create=PageFactory.initElements(driver,CreateVRSPage.class);
		create.clickOnCreate();
		
		RequestTypePage requesttype=PageFactory.initElements(driver,RequestTypePage.class);
		requesttype.selectRequestType();
		requesttype.enterRemark();
		requesttype.clickOnDiscard();
	}
	
	
	
					//check Employee status

	@Test(priority=1,description="login verify",dataProvider="VRS EMPLOYEE",alwaysRun=true)
	public void UAT_HRMS_VRS_24(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_VRS_Employee(Username,Password);
	}
	
	
	@Test(priority=2,description="verify employee status",dataProvider="VRS EMPLOYEE",alwaysRun=true)
	public void UAT_HRMS_VRS_25(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_VRS_Employee(Username,Password);
		
		HomePage home=PageFactory.initElements(driver,HomePage.class);
		home.clickOnDiscussImage();
		
		COHomePage cohome=PageFactory.initElements(driver,COHomePage.class);
		cohome.clickOnResignation();
		
		ResignationPage retirement=PageFactory.initElements(driver,ResignationPage.class);
		retirement.clickOnRetirement();
		retirement.clickOnRetirements();
		
		EmployeeCheckStatus status=PageFactory.initElements(driver,EmployeeCheckStatus.class);
		status.verifyEmployeeStatus();
	}
	
	@Test(priority=3,description="verify employee status done",dataProvider="VRS EMPLOYEE",alwaysRun=true)
	public void UAT_HRMS_VRS_26(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_VRS_Employee(Username,Password);
		
		HomePage home=PageFactory.initElements(driver,HomePage.class);
		home.clickOnDiscussImage();
		
		COHomePage cohome=PageFactory.initElements(driver,COHomePage.class);
		cohome.clickOnResignation();
		
		ResignationPage retirement=PageFactory.initElements(driver,ResignationPage.class);
		retirement.clickOnRetirement();
		retirement.clickOnRetirements();
		
		EmployeeCheckStatus status=PageFactory.initElements(driver,EmployeeCheckStatus.class);
		status.clickOnEmployee();
		status.checkStatus();
	}
}
