package HRMS_ERP_UAT_TECHNICAL_SECTION;

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
import HRMS_ERP_UAT_DSC.HRHomePage;
import HRMS_LOGINPAGE.LoginPageHRMS;
import HRMS_URL_Page.HRMS_URL;

@Listeners(GenericLibrary.ListenerDriver.class)
public class LoginAsCEO extends HRMS_URL
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

	@DataProvider(name="AA CEO")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"HRMS_TOUR_CEO");
	}

	@Test(priority=1,description="login verify",dataProvider="AA CEO",alwaysRun=true)
	public void UAT_Finance_AA_40(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_CEO(Username,Password);
	}
	
	@Test(priority=2,description="verify Administrative Approval",dataProvider="AA CEO",alwaysRun=true)
	public void UAT_Finance_AA_41(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_CEO(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		AdministrativeApprovalPage app=PageFactory.initElements(driver,AdministrativeApprovalPage.class);
		app.clickOnAdministrativeApproval();
	}
	
	@Test(priority=2,description="verify Administrative Approval",dataProvider="AA CEO",alwaysRun=true)
	public void UAT_Finance_AA_42(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_CEO(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		AdministrativeApprovalPage app=PageFactory.initElements(driver,AdministrativeApprovalPage.class);
		app.clickOnAdministrativeApproval();
		
		TechnicalSectionPage section=PageFactory.initElements(driver,TechnicalSectionPage.class);
		section.clickOnTechnicalSection();
	}
	
	
	@Test(priority=3,description="verify Technical section",dataProvider="AA CEO",alwaysRun=true)
	public void UAT_Finance_AA_43(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_CEO(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		AdministrativeApprovalPage app=PageFactory.initElements(driver,AdministrativeApprovalPage.class);
		app.clickOnAdministrativeApproval();
		
		TechnicalSectionPage section=PageFactory.initElements(driver,TechnicalSectionPage.class);
		section.clickOnTechnicalSection();
		
		FilterPage filter=PageFactory.initElements(driver,FilterPage.class);
		filter.clickOnSerach();
		filter.enterFilterDetails();
		filter.enterProposalNo();
		filter.clickOnApply();
		filter.clickOnCEOWaitingStatus();
		
		EditPage edit=PageFactory.initElements(driver,EditPage.class);
		edit.clickOnEdit();
		
		SavePage save=PageFactory.initElements(driver,SavePage.class);
		save.clickOnSave();
	}
	
	@Test(priority=4,description="verify Approve",dataProvider="AA CEO",alwaysRun=true)
	public void UAT_Finance_AA_44(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_CEO(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		AdministrativeApprovalPage app=PageFactory.initElements(driver,AdministrativeApprovalPage.class);
		app.clickOnAdministrativeApproval();
		
		TechnicalSectionPage section=PageFactory.initElements(driver,TechnicalSectionPage.class);
		section.clickOnTechnicalSection();
		
		FilterPage filter=PageFactory.initElements(driver,FilterPage.class);
		filter.clickOnSerach();
		filter.enterFilterDetails();
		filter.enterProposalNo();
		filter.clickOnApply();
		filter.clickOnCEOWaitingStatus();	
		
		SubmitPage submit=PageFactory.initElements(driver,SubmitPage.class);
		submit.clickOnApprove();
		submit.enterBODRemark();
		submit.clickOnApproves();
	}
	

}
