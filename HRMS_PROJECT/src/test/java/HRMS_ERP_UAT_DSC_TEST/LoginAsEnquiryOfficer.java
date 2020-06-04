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
import HRMS_ERP_UAT_DSC.EnquiryOfficerStatusPage;
import HRMS_ERP_UAT_DSC.HRCreateNotice;
import HRMS_ERP_UAT_DSC.HRHomePage;
import HRMS_ERP_UAT_DSC.SubmitPage;
import HRMS_LOGINPAGE.LoginPageHRMS;
import HRMS_URL_Page.HRMS_URL;

@Listeners(GenericLibrary.ListenerDriver.class)
public class LoginAsEnquiryOfficer extends HRMS_URL
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

	@DataProvider(name="DSC Enquiry Officer")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"HRMS_DSC_ENQUIRY_OFFICER");
	}

	@Test(priority=1,description="login verify",dataProvider="DSC Enquiry Officer",alwaysRun=true)
	public void UAT_HRMS_DSC_19(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_EnquiryOfficer(Username,Password);
	}
	
	@Test(priority=2,description="verify Discipliary Action",dataProvider="DSC Enquiry Officer",alwaysRun=true)
	public void UAT_HRMS_DSC_20(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_EnquiryOfficer(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		home.clickOnDisciplinaryAction();
	}
	
	@Test(priority=3,description="verify create show cause notice",dataProvider="DSC Enquiry Officer",alwaysRun=true)
	public void UAT_HRMS_DSC_21(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_EnquiryOfficer(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		home.clickOnDisciplinaryAction();
		home.clickOnShowCauseNotice();
		home.clickOnRaiseNotice();
		
		HRCreateNotice notice=PageFactory.initElements(driver,HRCreateNotice.class);
		notice.clickOnSerach();
		notice.enterFilterDetails();
	}
	
	@Test(priority=4,description="verify status",dataProvider="DSC Enquiry Officer",alwaysRun=true)
	public void UAT_HRMS_DSC_22(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_EnquiryOfficer(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		home.clickOnDisciplinaryAction();
		home.clickOnShowCauseNotice();
		home.clickOnRaiseNotice();
		
		HRCreateNotice notice=PageFactory.initElements(driver,HRCreateNotice.class);
		notice.clickOnSerach();
		notice.enterFilterDetails();
		
		EnquiryOfficerStatusPage status=PageFactory.initElements(driver,EnquiryOfficerStatusPage.class);
		status.clickOnEnqOfficerStatus();
	}
	
	@Test(priority=5,description="verify edit",dataProvider="DSC Enquiry Officer",alwaysRun=true)
	public void UAT_HRMS_DSC_23(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_EnquiryOfficer(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		home.clickOnDisciplinaryAction();
		home.clickOnShowCauseNotice();
		home.clickOnRaiseNotice();
		
		HRCreateNotice notice=PageFactory.initElements(driver,HRCreateNotice.class);
		notice.clickOnSerach();
		notice.enterFilterDetails();
		
		EnquiryOfficerStatusPage status=PageFactory.initElements(driver,EnquiryOfficerStatusPage.class);
		status.clickOnEnqOfficerStatus();
		
		EditPage edit=PageFactory.initElements(driver,EditPage.class);
		edit.clickOnEdit();
		edit.enterRemarks();
	}
	
	@Test(priority=5,description="verify done enquiry",dataProvider="DSC Enquiry Officer",alwaysRun=true)
	public void UAT_HRMS_DSC_24(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_EnquiryOfficer(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		home.clickOnDisciplinaryAction();
		home.clickOnShowCauseNotice();
		home.clickOnRaiseNotice();
		
		HRCreateNotice notice=PageFactory.initElements(driver,HRCreateNotice.class);
		notice.clickOnSerach();
		notice.enterFilterDetails();
		
		EnquiryOfficerStatusPage status=PageFactory.initElements(driver,EnquiryOfficerStatusPage.class);
		status.clickOnEnqOfficerStatus();
		
		EditPage edit=PageFactory.initElements(driver,EditPage.class);
		edit.clickOnEdit();
		edit.enterRemarks();
		
		SubmitPage done=PageFactory.initElements(driver,SubmitPage.class);
		done.clickOnDoneEnquiry();
	}

}
