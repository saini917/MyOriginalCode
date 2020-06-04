package HRMS_ERP_UAT_DSC_TEST;

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
import HRMS_ERP_UAT_DSC.EditPage;
import HRMS_ERP_UAT_DSC.HRCreateNotice;
import HRMS_ERP_UAT_DSC.HRHomePage;
import HRMS_ERP_UAT_DSC.HRStatusPage;
import HRMS_ERP_UAT_DSC.HRemarksPage;
import HRMS_ERP_UAT_DSC.SubmitPage;
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

	@DataProvider(name="DSC HRManager")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"HRMS_VRS_HR");
	}

	@Test(priority=1,description="login verify",dataProvider="DSC HRManager",alwaysRun=true)
	public void UAT_HRMS_DSC_1(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HR(Username,Password);
	}
	
	@Test(priority=2,description="verify Discipliary Action",dataProvider="DSC HRManager",alwaysRun=true)
	public void UAT_HRMS_DSC_2(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HR(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		home.clickOnDisciplinaryAction();
	}
	
	@Test(priority=3,description="verify create show cause notice",dataProvider="DSC HRManager",alwaysRun=true)
	public void UAT_HRMS_DSC_3(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HR(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		home.clickOnDisciplinaryAction();
		home.clickOnShowCauseNotice();
		home.clickOnRaiseNotice();
		
		HRCreateNotice notice=PageFactory.initElements(driver,HRCreateNotice.class);
		notice.clickOnCreates();
		notice.selectEmployee();
	}
	
	@Test(priority=4,description="verify remarks",dataProvider="DSC HRManager",alwaysRun=true)
	public void UAT_HRMS_DSC_4(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HR(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		home.clickOnDisciplinaryAction();
		home.clickOnShowCauseNotice();
		home.clickOnRaiseNotice();
		
		HRCreateNotice notice=PageFactory.initElements(driver,HRCreateNotice.class);
		notice.clickOnCreates();
		notice.selectEmployee();
		notice.enterRemarks();
	}
	
	@Test(priority=5,description="verify save",dataProvider="DSC HRManager",alwaysRun=true)
	public void UAT_HRMS_DSC_5(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HR(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		home.clickOnDisciplinaryAction();
		home.clickOnShowCauseNotice();
		home.clickOnRaiseNotice();
		
		HRCreateNotice notice=PageFactory.initElements(driver,HRCreateNotice.class);
		notice.clickOnCreates();
		notice.selectEmployee();
		notice.enterRemarks();
		notice.clickOnSave();
	}
	
	@Test(priority=6,description="verify submit notice",dataProvider="DSC HRManager",alwaysRun=true)
	public void UAT_HRMS_DSC_6(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HR(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		home.clickOnDisciplinaryAction();
		
		HRCreateNotice notice=PageFactory.initElements(driver,HRCreateNotice.class);
		notice.clickOnSerach();
		notice.enterFilterDetails();
		notice.clickOnEmployeeStatus();
		notice.clickOnSubmitNotice();
	}
	
	
					//HR RESPONSE
	
	@Test(priority=1,description="login verify",dataProvider="DSC HRManager",alwaysRun=true)
	public void UAT_HRMS_DSC_13(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HR(Username,Password);
	}
	
	@Test(priority=2,description="verify Discipliary Action",dataProvider="DSC HRManager",alwaysRun=true)
	public void UAT_HRMS_DSC_14(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HR(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		home.clickOnDisciplinaryAction();
	}
	
	@Test(priority=3,description="verify create show cause notice",dataProvider="DSC HRManager",alwaysRun=true)
	public void UAT_HRMS_DSC_15(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HR(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		home.clickOnDisciplinaryAction();
		home.clickOnShowCauseNotice();
		home.clickOnRaiseNotice();
		
		HRCreateNotice notice=PageFactory.initElements(driver,HRCreateNotice.class);
		notice.clickOnSerach();
		notice.enterFilterDetails();
	}
	
	@Test(priority=4,description="verify HR Status",dataProvider="DSC HRManager",alwaysRun=true)
	public void UAT_HRMS_DSC_16(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HR(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		home.clickOnDisciplinaryAction();
		home.clickOnShowCauseNotice();
		home.clickOnRaiseNotice();
		
		HRCreateNotice notice=PageFactory.initElements(driver,HRCreateNotice.class);
		notice.clickOnSerach();
		notice.enterFilterDetails();
		
		HRStatusPage status=PageFactory.initElements(driver,HRStatusPage.class);
		status.clickOnHRStatus();
	}
	
	@Test(priority=5,description="verify edit",dataProvider="DSC HRManager",alwaysRun=true)
	public void UAT_HRMS_DSC_17(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HR(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		home.clickOnDisciplinaryAction();
		home.clickOnShowCauseNotice();
		home.clickOnRaiseNotice();
		
		HRCreateNotice notice=PageFactory.initElements(driver,HRCreateNotice.class);
		notice.clickOnSerach();
		notice.enterFilterDetails();
		
		HRStatusPage status=PageFactory.initElements(driver,HRStatusPage.class);
		status.clickOnHRStatus();
		
		EditPage edit=PageFactory.initElements(driver,EditPage.class);
		edit.clickOnEdit();
		
		HRemarksPage remark=PageFactory.initElements(driver,HRemarksPage.class);
		remark.selectEnquiryOfficer();
		remark.enterRemarks();
	}
	
	@Test(priority=6,description="verify Request DE",dataProvider="DSC HRManager",alwaysRun=true)
	public void UAT_HRMS_DSC_18(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HR(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		home.clickOnDisciplinaryAction();
		home.clickOnShowCauseNotice();
		home.clickOnRaiseNotice();
		
		HRCreateNotice notice=PageFactory.initElements(driver,HRCreateNotice.class);
		notice.clickOnSerach();
		notice.enterFilterDetails();
		
		HRStatusPage status=PageFactory.initElements(driver,HRStatusPage.class);
		status.clickOnHRStatus();
		
		EditPage edit=PageFactory.initElements(driver,EditPage.class);
		edit.clickOnEdit();
		
		HRemarksPage remark=PageFactory.initElements(driver,HRemarksPage.class);
		remark.selectEnquiryOfficer();
		remark.enterRemarks();
		
		SubmitPage request=PageFactory.initElements(driver,SubmitPage.class);
		request.clickOnRequestDE();
	}

}
