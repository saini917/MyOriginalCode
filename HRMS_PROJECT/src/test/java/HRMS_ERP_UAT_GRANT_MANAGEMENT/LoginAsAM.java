package HRMS_ERP_UAT_GRANT_MANAGEMENT;

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
import HRMS_LOGINPAGE.LoginPageHRMS;
import HRMS_URL_Page.HRMS_URL;

@Listeners(GenericLibrary.ListenerDriver.class)
public class LoginAsAM extends HRMS_URL
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

	@DataProvider(name="AM")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"HRMS_AM");
	}

	@Test(priority=1,description="login verify",dataProvider="AM",alwaysRun=true)
	public void UAT_Finance_GM_19(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_AM(Username,Password);
	}
	
	@Test(priority=2,description="verify Administrative Aproval",dataProvider="AM",alwaysRun=true)
	public void UAT_Finance_GM_20(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_AM(Username,Password);
		
		AdministrativeApprovalPage admin=PageFactory.initElements(driver,AdministrativeApprovalPage.class);
		admin.clickOnDiscussImage();
		admin.clickOnAdministrativeApproval();
	}
	
	@Test(priority=3,description="verify grant installation",dataProvider="AM",alwaysRun=true)
	public void UAT_Finance_GM_21(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_AM(Username,Password);
		
		AdministrativeApprovalPage admin=PageFactory.initElements(driver,AdministrativeApprovalPage.class);
		admin.clickOnDiscussImage();
		admin.clickOnAdministrativeApproval();
		admin.clickOnEstimateProjectMenu();
		admin.clickOnGrantInstallation();
	}
	
	@Test(priority=4,description="verify edit",dataProvider="AM",alwaysRun=true)
	public void UAT_Finance_GM_22(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_AM(Username,Password);
		
		AdministrativeApprovalPage admin=PageFactory.initElements(driver,AdministrativeApprovalPage.class);
		admin.clickOnDiscussImage();
		admin.clickOnAdministrativeApproval();
		admin.clickOnEstimateProjectMenu();
		admin.clickOnGrantInstallation();
		
		FilterPage filter=PageFactory.initElements(driver,FilterPage.class);
		filter.clickOnSerach();
		filter.enterFilterDetails();
		filter.enterInstallationNo();
		filter.clickOnApply();
		filter.clickOnAMWaitingStatus();
		
		EditPage edit=PageFactory.initElements(driver,EditPage.class);
		edit.clickOnEdit();
	}
	
	@Test(priority=5,description="verify save",dataProvider="AM",alwaysRun=true)
	public void UAT_Finance_GM_23(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_AM(Username,Password);
		
		AdministrativeApprovalPage admin=PageFactory.initElements(driver,AdministrativeApprovalPage.class);
		admin.clickOnDiscussImage();
		admin.clickOnAdministrativeApproval();
		admin.clickOnEstimateProjectMenu();
		admin.clickOnGrantInstallation();
		
		FilterPage filter=PageFactory.initElements(driver,FilterPage.class);
		filter.clickOnSerach();
		filter.enterFilterDetails();
		filter.enterInstallationNo();
		filter.clickOnApply();
		filter.clickOnAMWaitingStatus();
		
		EditPage edit=PageFactory.initElements(driver,EditPage.class);
		edit.clickOnEdit();
		
		SavePage save=PageFactory.initElements(driver,SavePage.class);
		save.clickOnSave();
	}
	
	@Test(priority=6,description="verify revert",dataProvider="AM",alwaysRun=true)
	public void UAT_Finance_GM_25(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_AM(Username,Password);
		
		AdministrativeApprovalPage admin=PageFactory.initElements(driver,AdministrativeApprovalPage.class);
		admin.clickOnDiscussImage();
		admin.clickOnAdministrativeApproval();
		admin.clickOnEstimateProjectMenu();
		admin.clickOnGrantInstallation();
		
		FilterPage filter=PageFactory.initElements(driver,FilterPage.class);
		filter.clickOnSerach();
		filter.enterFilterDetails();
		filter.enterInstallationNo();
		filter.clickOnApply();
		filter.clickOnAMWaitingStatus();
		
		RevertPage revert=PageFactory.initElements(driver,RevertPage.class);
		revert.clickOnRevert();
	}
	
	@Test(priority=7,description="verify approve",dataProvider="AM",alwaysRun=true)
	public void UAT_Finance_GM_24(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_AM(Username,Password);
		
		AdministrativeApprovalPage admin=PageFactory.initElements(driver,AdministrativeApprovalPage.class);
		admin.clickOnDiscussImage();
		admin.clickOnAdministrativeApproval();
		admin.clickOnEstimateProjectMenu();
		admin.clickOnGrantInstallation();
		
		FilterPage filter=PageFactory.initElements(driver,FilterPage.class);
		filter.clickOnSerach();
		filter.enterFilterDetails();
		filter.enterInstallationNo();
		filter.clickOnApply();
		filter.clickOnAMWaitingStatus();
		
		ApproveApge approve=PageFactory.initElements(driver,ApproveApge.class);
		approve.clickOnApprove();
		approve.enterAMRemark();
		approve.clickOnApproves();
	}

}
