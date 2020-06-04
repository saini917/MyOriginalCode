package NRDA_ChangeOfUse;

import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import GenericLibrary.ExcelDataDriver;
import LoginLogoutWSNRDAScript.URLPageWSNRDAScript;
import WaterAndSewerageLogin.WaterAndSewerageLoginPage;

@Listeners(GenericLibrary.ListenerDriver.class)
public class LoginAsCitizen_Module extends URLPageWSNRDAScript
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	String filepath="C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\NRDA_TESTDATA.xlsx";

	@AfterMethod 
	public void logoutWS() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver,20);
		WebElement logoutdrop=driver.findElement(By.xpath("//a[@class='dropdown-toggle' and@role='button']/span"));
		wait.until(ExpectedConditions.visibilityOf(logoutdrop));
		wait.until(ExpectedConditions.elementToBeClickable(logoutdrop));
		Actions action = new Actions(driver);
		action.moveToElement(logoutdrop).build().perform();

		WebElement logout=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(logout).build().perform();
		Reporter.log("Action is performed on Logout button successfully",true);

		driver.close();
		Reporter.log("Action is performed on browser closed successfully",true);
	}

	@DataProvider(name="Valid_Connection")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"Valid_Connection");
	}
 
	@Test(priority=0,dataProvider ="Valid_Connection",description="verify dashboard")
	public void NRDA_ChangeOfUse_Citizen_SC_01_TC_01(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_citizen.loginAsCitizen(username,password);

		ToVerifyChangeOfUse_SC_01_TC_01 dashboard=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_01_TC_01.class);
		dashboard.verifyDashboard();
	}

	@Test(priority=1,dataProvider ="Valid_Connection",description="verify change connection details tab")
	public void NRDA_ChangeOfUse_Citizen_SC_02_TC_01(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_citizen.loginAsCitizen(username,password);

		ToVerifyChangeOfUse_SC_02_TC_01 changeconnectiontab=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_01.class);
		changeconnectiontab.clickOnFreshApplication();
		changeconnectiontab.clickOnPublicHealthEngineering();
		changeconnectiontab.clickOnWaterAndSewerageConnectionImage();
		changeconnectiontab.verifyExitConnection();
		changeconnectiontab.clickOnChangeConnectionDetails();
		changeconnectiontab.verifyChangeConnectionDashboard();
	}

	@Test(priority=2,dataProvider ="Valid_Connection",description="verify connection details field")
	public void NRDA_ChangeOfUse_Citizen_SC_02_TC_02(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_citizen.loginAsCitizen(username,password);

		ToVerifyChangeOfUse_SC_02_TC_01 changeconnectiontab=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_01.class);
		changeconnectiontab.clickOnFreshApplication();
		changeconnectiontab.clickOnPublicHealthEngineering();
		changeconnectiontab.clickOnWaterAndSewerageConnectionImage();
		changeconnectiontab.verifyExitConnection();
		changeconnectiontab.clickOnChangeConnectionDetails();

		ToVerifyChangeOfUse_SC_02_TC_02 conversion=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_02.class);
		conversion.verifyTypeOfConversion();
		conversion.verifyDisplayList();
	}

	@Test(priority=3,dataProvider ="Valid_Connection",description="verify completetion certificate document")
	public void NRDA_ChangeOfUse_Citizen_SC_02_TC_03(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_citizen.loginAsCitizen(username,password);


		ToVerifyChangeOfUse_SC_02_TC_01 changeconnectiontab=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_01.class);
		changeconnectiontab.clickOnFreshApplication();
		changeconnectiontab.clickOnPublicHealthEngineering();
		changeconnectiontab.clickOnWaterAndSewerageConnectionImage();
		changeconnectiontab.verifyExitConnection();
		changeconnectiontab.clickOnChangeConnectionDetails();

		ToVerifyChangeOfUse_SC_02_TC_03 connectiontype=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_03.class);
		connectiontype.verifyConnectionType();
	}


	@Test(priority=4,dataProvider ="Valid_Connection",description="verify details of usage")
	public void NRDA_ChangeOfUse_Citizen_SC_02_TC_04(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_citizen.loginAsCitizen(username,password);
		ToVerifyChangeOfUse_SC_02_TC_01 changeconnectiontab=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_01.class);
		changeconnectiontab.clickOnFreshApplication();
		changeconnectiontab.clickOnPublicHealthEngineering();
		changeconnectiontab.clickOnWaterAndSewerageConnectionImage();
		changeconnectiontab.verifyExitConnection();
		changeconnectiontab.clickOnChangeConnectionDetails();

		ToVerifyChangeOfUse_SC_02_TC_04 usage=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_04.class);
		usage.selectConnectionType();
		usage.verifyDetailsOfUsage();
		usage.verifyDisplayList();
	}
	
	@Test(priority=5,dataProvider ="Valid_Connection",description="verify details of usage")
	public void NRDA_ChangeOfUse_Citizen_SC_02_TC_05(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_citizen.loginAsCitizen(username,password);

		ToVerifyChangeOfUse_SC_02_TC_01 changeconnectiontab=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_01.class);
		changeconnectiontab.clickOnFreshApplication();
		changeconnectiontab.clickOnPublicHealthEngineering();
		changeconnectiontab.clickOnWaterAndSewerageConnectionImage();
		changeconnectiontab.verifyExitConnection();
		changeconnectiontab.clickOnChangeConnectionDetails();

		ToVerifyChangeOfUse_SC_02_TC_05 usage=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_05.class);
		usage.selectConnectionType();
		usage.verifyDetailsOfUsage();
		usage.verifyDisplayList();
	}
	
	@Test(priority=6,dataProvider ="Valid_Connection",description="verify details of usage")
	public void NRDA_ChangeOfUse_Citizen_SC_02_TC_06(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_citizen.loginAsCitizen(username,password);

		ToVerifyChangeOfUse_SC_02_TC_01 changeconnectiontab=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_01.class);
		changeconnectiontab.clickOnFreshApplication();
		changeconnectiontab.clickOnPublicHealthEngineering();
		changeconnectiontab.clickOnWaterAndSewerageConnectionImage();
		changeconnectiontab.verifyExitConnection();
		changeconnectiontab.clickOnChangeConnectionDetails();

		ToVerifyChangeOfUse_SC_02_TC_06 usage=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_06.class);
		usage.selectConnectionType();
		usage.verifyDetailsOfUsage();
		usage.verifyDisplayList();

	}
	
	@Test(priority=7,dataProvider ="Valid_Connection",description="verify details of usage")
	public void NRDA_ChangeOfUse_Citizen_SC_02_TC_07(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_citizen.loginAsCitizen(username,password);

		ToVerifyChangeOfUse_SC_02_TC_01 changeconnectiontab=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_01.class);
		changeconnectiontab.clickOnFreshApplication();
		changeconnectiontab.clickOnPublicHealthEngineering();
		changeconnectiontab.clickOnWaterAndSewerageConnectionImage();
		changeconnectiontab.verifyExitConnection();
		changeconnectiontab.clickOnChangeConnectionDetails();

		ToVerifyChangeOfUse_SC_02_TC_07 usage=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_07.class);
		usage.selectConnectionType();
		usage.verifyDetailsOfUsage();
		usage.verifyDisplayList();
	}
	
	@Test(priority=8,dataProvider ="Valid_Connection",description="verify upload completion certificate document")
	public void NRDA_ChangeOfUse_Citizen_SC_02_TC_08(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_citizen.loginAsCitizen(username,password);

		ToVerifyChangeOfUse_SC_02_TC_01 changeconnectiontab=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_01.class);
		changeconnectiontab.clickOnFreshApplication();
		changeconnectiontab.clickOnPublicHealthEngineering();
		changeconnectiontab.clickOnWaterAndSewerageConnectionImage();
		changeconnectiontab.verifyExitConnection();
		changeconnectiontab.clickOnChangeConnectionDetails();
		
		ToVerifyChangeOfUse_SC_02_TC_08 certificate=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_08.class);
		certificate.verifyInvalidUploadCertificate();
		certificate.verifyErrorMessage();
		certificate.verifyAgainInvalidCertificate();
		certificate.verifyErrMessage();
		certificate.verifyValidCertificate();
	}
	
	@Test(priority=9,dataProvider ="Valid_Connection",description="verify trust/organzation/school")
	public void NRDA_ChangeOfUse_Citizen_SC_02_TC_09(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_citizen.loginAsCitizen(username,password);

		ToVerifyChangeOfUse_SC_02_TC_01 changeconnectiontab=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_01.class);
		changeconnectiontab.clickOnFreshApplication();
		changeconnectiontab.clickOnPublicHealthEngineering();
		changeconnectiontab.clickOnWaterAndSewerageConnectionImage();
		changeconnectiontab.verifyExitConnection();
		changeconnectiontab.clickOnChangeConnectionDetails();
		
		ToVerifyChangeOfUse_SC_02_TC_06 usage=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_06.class);
		usage.selectConnectionType();
		
		ToVerifyChangeOfUse_SC_02_TC_09 trust=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_09.class);
		trust.selectDetailsOfUsage();
		trust.enterTrustOrganizationSchool();
	}
	
	@Test(priority=10,dataProvider ="Valid_Connection",description="verify number of bed/employee/students")
	public void NRDA_ChangeOfUse_Citizen_SC_02_TC_10(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_citizen.loginAsCitizen(username,password);

		ToVerifyChangeOfUse_SC_02_TC_01 changeconnectiontab=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_01.class);
		changeconnectiontab.clickOnFreshApplication();
		changeconnectiontab.clickOnPublicHealthEngineering();
		changeconnectiontab.clickOnWaterAndSewerageConnectionImage();
		changeconnectiontab.verifyExitConnection();
		changeconnectiontab.clickOnChangeConnectionDetails();
		
		ToVerifyChangeOfUse_SC_02_TC_06 usage=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_06.class);
		usage.selectConnectionType();
		
		ToVerifyChangeOfUse_SC_02_TC_09 trust=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_09.class);
		trust.selectDetailsOfUsage();
		trust.enterTrustOrganizationSchool();
		
		ToVerifyChangeOfUse_SC_02_TC_10 bed=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_10.class);
		bed.enterNumberOfBedEmployeeStudent();
	}
	
	@Test(priority=11,dataProvider ="Valid_Connection",description="verify other document")
	public void NRDA_ChangeOfUse_Citizen_SC_02_TC_11(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_citizen.loginAsCitizen(username,password);

		ToVerifyChangeOfUse_SC_02_TC_01 changeconnectiontab=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_01.class);
		changeconnectiontab.clickOnFreshApplication();
		changeconnectiontab.clickOnPublicHealthEngineering();
		changeconnectiontab.clickOnWaterAndSewerageConnectionImage();
		changeconnectiontab.verifyExitConnection();
		changeconnectiontab.clickOnChangeConnectionDetails();
		
		ToVerifyChangeOfUse_SC_02_TC_06 usage=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_06.class);
		usage.selectConnectionType();
		
		ToVerifyChangeOfUse_SC_02_TC_09 trust=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_09.class);
		trust.selectDetailsOfUsage();
		trust.enterTrustOrganizationSchool();
		
		ToVerifyChangeOfUse_SC_02_TC_10 bed=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_10.class);
		bed.enterNumberOfBedEmployeeStudent();
		
		ToVerifyChangeOfUse_SC_02_TC_11 otherdocument=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_11.class);
		otherdocument.clickOnOtherDocument();
	}
	
	@Test(priority=12,dataProvider ="Valid_Connection",description="verify remarks")
	public void NRDA_ChangeOfUse_Citizen_SC_02_TC_12(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_citizen.loginAsCitizen(username,password);

		ToVerifyChangeOfUse_SC_02_TC_01 changeconnectiontab=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_01.class);
		changeconnectiontab.clickOnFreshApplication();
		changeconnectiontab.clickOnPublicHealthEngineering();
		changeconnectiontab.clickOnWaterAndSewerageConnectionImage();
		changeconnectiontab.verifyExitConnection();
		changeconnectiontab.clickOnChangeConnectionDetails();
		
		ToVerifyChangeOfUse_SC_02_TC_06 usage=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_06.class);
		usage.selectConnectionType();
		
		ToVerifyChangeOfUse_SC_02_TC_09 trust=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_09.class);
		trust.selectDetailsOfUsage();
		trust.enterTrustOrganizationSchool();
		
		ToVerifyChangeOfUse_SC_02_TC_10 bed=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_10.class);
		bed.enterNumberOfBedEmployeeStudent();
		
		/*ToVerifyChangeOfUse_SC_02_TC_11 otherdocument=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_11.class);
		otherdocument.clickOnOtherDocument();*/
		
		ToVerifyChangeOfUse_SC_02_TC_12 remark=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_12.class);
		remark.enterRemarks();
	}
	
	@Test(priority=13,dataProvider ="Valid_Connection",description="verify next")
	public void NRDA_ChangeOfUse_Citizen_SC_02_TC_14(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_citizen.loginAsCitizen(username,password);

		ToVerifyChangeOfUse_SC_02_TC_01 changeconnectiontab=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_01.class);
		changeconnectiontab.clickOnFreshApplication();
		changeconnectiontab.clickOnPublicHealthEngineering();
		changeconnectiontab.clickOnWaterAndSewerageConnectionImage();
		changeconnectiontab.verifyExitConnection();
		changeconnectiontab.clickOnChangeConnectionDetails();
		
		ToVerifyChangeOfUse_SC_02_TC_06 usage=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_06.class);
		usage.selectConnectionType();
		
		ToVerifyChangeOfUse_SC_02_TC_09 trust=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_09.class);
		trust.selectDetailsOfUsage();
		trust.enterTrustOrganizationSchool();
		
		ToVerifyChangeOfUse_SC_02_TC_10 bed=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_10.class);
		bed.enterNumberOfBedEmployeeStudent();
		
		/*ToVerifyChangeOfUse_SC_02_TC_11 otherdocument=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_11.class);
		otherdocument.clickOnOtherDocument();*/
		
		ToVerifyChangeOfUse_SC_02_TC_12 remark=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_12.class);
		remark.enterRemarks();
		
		ToVerifyChangeOfUse_SC_02_TC_14 next=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_14.class);
		next.clickOnNextButton();
	}
	
	@Test(priority=14,dataProvider ="Valid_Connection",description="verify close")
	public void NRDA_ChangeOfUse_Citizen_SC_02_TC_15(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_citizen.loginAsCitizen(username,password);

		ToVerifyChangeOfUse_SC_02_TC_01 changeconnectiontab=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_01.class);
		changeconnectiontab.clickOnFreshApplication();
		changeconnectiontab.clickOnPublicHealthEngineering();
		changeconnectiontab.clickOnWaterAndSewerageConnectionImage();
		changeconnectiontab.verifyExitConnection();
		changeconnectiontab.clickOnChangeConnectionDetails();
		
		ToVerifyChangeOfUse_SC_02_TC_06 usage=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_06.class);
		usage.selectConnectionType();
		
		ToVerifyChangeOfUse_SC_02_TC_09 trust=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_09.class);
		trust.selectDetailsOfUsage();
		trust.enterTrustOrganizationSchool();
		
		ToVerifyChangeOfUse_SC_02_TC_10 bed=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_10.class);
		bed.enterNumberOfBedEmployeeStudent();
		
		/*ToVerifyChangeOfUse_SC_02_TC_11 otherdocument=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_11.class);
		otherdocument.clickOnOtherDocument();*/
		
		ToVerifyChangeOfUse_SC_02_TC_12 remark=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_12.class);
		remark.enterRemarks();
		
		ToVerifyChangeOfUse_SC_02_TC_15 close=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_15.class);
		close.clickOnNoCloseButton();
		close.clickOnYesCloseButton();
	}
	
	@Test(priority=15,dataProvider ="Valid_Connection",description="verify save as draft")
	public void NRDA_ChangeOfUse_Citizen_SC_02_TC_13(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_citizen.loginAsCitizen(username,password);

		ToVerifyChangeOfUse_SC_02_TC_01 changeconnectiontab=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_01.class);
		changeconnectiontab.clickOnFreshApplication();
		changeconnectiontab.clickOnPublicHealthEngineering();
		changeconnectiontab.clickOnWaterAndSewerageConnectionImage();
		changeconnectiontab.verifyExitConnection();
		changeconnectiontab.clickOnChangeConnectionDetails();
		
		ToVerifyChangeOfUse_SC_02_TC_02 conversion=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_02.class);
		conversion.selectTypeOfConversion();
		
		ToVerifyChangeOfUse_SC_02_TC_06 usage=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_06.class);
		usage.selectConnectionType();
		
		ToVerifyChangeOfUse_SC_02_TC_09 trust=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_09.class);
		trust.selectDetailsOfUsage();
		trust.enterTrustOrganizationSchool();
		
		ToVerifyChangeOfUse_SC_02_TC_10 bed=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_10.class);
		bed.enterNumberOfBedEmployeeStudent();
		
		ToVerifyChangeOfUse_SC_02_TC_08 certificate=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_08.class);
		certificate.verifyValidCertificate();
		
		/*ToVerifyChangeOfUse_SC_02_TC_11 otherdocument=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_11.class);
		otherdocument.clickOnOtherDocument();*/
		
		ToVerifyChangeOfUse_SC_02_TC_12 remark=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_12.class);
		remark.enterRemarks();
		
		ToVerifyChangeOfUse_SC_02_TC_13 draft=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_13.class);
		draft.clickOnSaveAsDraft();
		draft.getTempNum();
		draft.clickOnApplicationStatus();
		draft.enterChangeOfUseID();
		draft.clickOnSearchBtn();
		draft.clickOnDraftedApplication();
		draft.clickOnDraftChangeOfUse();
	}
	
	@Test(priority=16,dataProvider ="Valid_Connection",description="verify submit")
	public void NRDA_ChangeOfUse_Citizen_SC_02_TC_16(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_citizen.loginAsCitizen(username,password);

		ToVerifyChangeOfUse_SC_02_TC_01 changeconnectiontab=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_01.class);
		changeconnectiontab.clickOnFreshApplication();
		changeconnectiontab.clickOnPublicHealthEngineering();
		changeconnectiontab.clickOnWaterAndSewerageConnectionImage();
		changeconnectiontab.verifyExitConnection();
		changeconnectiontab.clickOnChangeConnectionDetails();
		
		ToVerifyChangeOfUse_SC_02_TC_02 conversion=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_02.class);
		conversion.selectTypeOfConversion();
		
		ToVerifyChangeOfUse_SC_02_TC_06 usage=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_06.class);
		usage.selectConnectionType();
		
		ToVerifyChangeOfUse_SC_02_TC_09 trust=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_09.class);
		trust.selectDetailsOfUsage();
		trust.enterTrustOrganizationSchool();
		
		ToVerifyChangeOfUse_SC_02_TC_10 bed=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_10.class);
		bed.enterNumberOfBedEmployeeStudent();
		
		ToVerifyChangeOfUse_SC_02_TC_08 certificate=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_08.class);
		certificate.verifyValidCertificate();
		
		/*ToVerifyChangeOfUse_SC_02_TC_11 otherdocument=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_11.class);
		otherdocument.clickOnOtherDocument();*/
		
		ToVerifyChangeOfUse_SC_02_TC_12 remark=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_12.class);
		remark.enterRemarks();
		remark.clickOnConnectionDetails();//temporary used
		
		/*ToVerifyChangeOfUse_SC_02_TC_14 next=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_14.class);
		next.clickOnNextButton();*/
		
		ToVerifyChangeOfUse_SC_02_TC_16 uploaddocname=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_16.class);
		uploaddocname.clickOnUpload();//for temporary used
		uploaddocname.selectDocumentName();
		uploaddocname.clickOnUploadNameDoc();
		uploaddocname.clickOnSubmit();
		uploaddocname.verifyDisplayList();
	}
	
	@Test(priority=16,dataProvider ="Valid_Connection",description="verify select online payment")
	public void NRDA_ChangeOfUse_Citizen_SC_03_TC_01(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_citizen.loginAsCitizen(username,password);

		ToVerifyChangeOfUse_SC_02_TC_01 changeconnectiontab=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_01.class);
		changeconnectiontab.clickOnFreshApplication();
		changeconnectiontab.clickOnPublicHealthEngineering();
		changeconnectiontab.clickOnWaterAndSewerageConnectionImage();
		changeconnectiontab.verifyExitConnection();
		changeconnectiontab.clickOnChangeConnectionDetails();
		
		ToVerifyChangeOfUse_SC_02_TC_02 conversion=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_02.class);
		conversion.selectTypeOfConversion();
		
		ToVerifyChangeOfUse_SC_02_TC_06 usage=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_06.class);
		usage.selectConnectionType();
		
		ToVerifyChangeOfUse_SC_02_TC_09 trust=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_09.class);
		trust.selectDetailsOfUsage();
		trust.enterTrustOrganizationSchool();
		
		ToVerifyChangeOfUse_SC_02_TC_10 bed=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_10.class);
		bed.enterNumberOfBedEmployeeStudent();
		
		ToVerifyChangeOfUse_SC_02_TC_08 certificate=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_08.class);
		certificate.verifyValidCertificate();
		
		/*ToVerifyChangeOfUse_SC_02_TC_11 otherdocument=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_11.class);
		otherdocument.clickOnOtherDocument();*/
		
		ToVerifyChangeOfUse_SC_02_TC_12 remark=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_12.class);
		remark.enterRemarks();
		
		remark.clickOnConnectionDetails();//temporary used
		
		/*ToVerifyChangeOfUse_SC_02_TC_14 next=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_14.class);
		next.clickOnNextButton();*/
		
		ToVerifyChangeOfUse_SC_02_TC_16 uploaddocname=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_16.class);
		uploaddocname.clickOnUpload();//for temporary used
		uploaddocname.selectDocumentName();
		uploaddocname.clickOnUploadNameDoc();
		uploaddocname.clickOnSubmit();
		
		ToVerifyChangeOfUse_SC_03_TC_01 online=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_03_TC_01.class);
		online.selectPaymentGateway();
		online.selectPaymentMode();
		online.verifyMakePayment();
	}
	
	@Test(priority=17,dataProvider ="Valid_Connection",description="verify make payment")
	public void NRDA_ChangeOfUse_Citizen_SC_03_TC_02(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_citizen.loginAsCitizen(username,password);

		ToVerifyChangeOfUse_SC_02_TC_01 changeconnectiontab=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_01.class);
		changeconnectiontab.clickOnFreshApplication();
		changeconnectiontab.clickOnPublicHealthEngineering();
		changeconnectiontab.clickOnWaterAndSewerageConnectionImage();
		changeconnectiontab.verifyExitConnection();
		changeconnectiontab.clickOnChangeConnectionDetails();
		
		ToVerifyChangeOfUse_SC_02_TC_02 conversion=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_02.class);
		conversion.selectTypeOfConversion();
		
		ToVerifyChangeOfUse_SC_02_TC_06 usage=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_06.class);
		usage.selectConnectionType();
		
		ToVerifyChangeOfUse_SC_02_TC_09 trust=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_09.class);
		trust.selectDetailsOfUsage();
		trust.enterTrustOrganizationSchool();
		
		ToVerifyChangeOfUse_SC_02_TC_10 bed=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_10.class);
		bed.enterNumberOfBedEmployeeStudent();
		
		ToVerifyChangeOfUse_SC_02_TC_08 certificate=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_08.class);
		certificate.verifyValidCertificate();
		
		/*ToVerifyChangeOfUse_SC_02_TC_11 otherdocument=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_11.class);
		otherdocument.clickOnOtherDocument();*/
		
		ToVerifyChangeOfUse_SC_02_TC_12 remark=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_12.class);
		remark.enterRemarks();
		
		remark.clickOnConnectionDetails();//temporary used
		
		/*ToVerifyChangeOfUse_SC_02_TC_14 next=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_14.class);
		next.clickOnNextButton();*/
		
		ToVerifyChangeOfUse_SC_02_TC_16 uploaddocname=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_16.class);
		uploaddocname.clickOnUpload();//for temporary used
		uploaddocname.selectDocumentName();
		uploaddocname.clickOnUploadNameDoc();
		uploaddocname.clickOnSubmit();
		
		ToVerifyChangeOfUse_SC_03_TC_01 online=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_03_TC_01.class);
		online.selectPaymentGateway();
		online.selectPaymentMode();
		
		ToVerifyChangeOfUse_SC_03_TC_02 makepay=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_03_TC_02.class);
		makepay.clickOnMakePayment();
		makepay.verifyDisplayList();
	}
	
	@Test(priority=17,dataProvider ="Valid_Connection",description="verify card number wrong message")
	public void NRDA_ChangeOfUse_Citizen_SC_03_TC_03(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_citizen.loginAsCitizen(username,password);

		ToVerifyChangeOfUse_SC_02_TC_01 changeconnectiontab=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_01.class);
		changeconnectiontab.clickOnFreshApplication();
		changeconnectiontab.clickOnPublicHealthEngineering();
		changeconnectiontab.clickOnWaterAndSewerageConnectionImage();
		changeconnectiontab.verifyExitConnection();
		changeconnectiontab.clickOnChangeConnectionDetails();
		
		ToVerifyChangeOfUse_SC_02_TC_02 conversion=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_02.class);
		conversion.selectTypeOfConversion();
		
		ToVerifyChangeOfUse_SC_02_TC_06 usage=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_06.class);
		usage.selectConnectionType();
		
		ToVerifyChangeOfUse_SC_02_TC_09 trust=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_09.class);
		trust.selectDetailsOfUsage();
		trust.enterTrustOrganizationSchool();
		
		ToVerifyChangeOfUse_SC_02_TC_10 bed=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_10.class);
		bed.enterNumberOfBedEmployeeStudent();
		
		ToVerifyChangeOfUse_SC_02_TC_08 certificate=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_08.class);
		certificate.verifyValidCertificate();
		
		/*ToVerifyChangeOfUse_SC_02_TC_11 otherdocument=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_11.class);
		otherdocument.clickOnOtherDocument();*/
		
		ToVerifyChangeOfUse_SC_02_TC_12 remark=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_12.class);
		remark.enterRemarks();
		
		remark.clickOnConnectionDetails();//temporary used
		
		/*ToVerifyChangeOfUse_SC_02_TC_14 next=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_14.class);
		next.clickOnNextButton();*/
		
		ToVerifyChangeOfUse_SC_02_TC_16 uploaddocname=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_16.class);
		uploaddocname.clickOnUpload();//for temporary used
		uploaddocname.selectDocumentName();
		uploaddocname.clickOnUploadNameDoc();
		uploaddocname.clickOnSubmit();
		
		ToVerifyChangeOfUse_SC_03_TC_01 online=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_03_TC_01.class);
		online.selectPaymentGateway();
		online.selectPaymentMode();
		
		ToVerifyChangeOfUse_SC_03_TC_02 makepay=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_03_TC_02.class);
		makepay.clickOnMakePayment();
		
		ToVerifyChangeOfUse_SC_03_TC_03 wrongcardnumber=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_03_TC_03.class);
		wrongcardnumber.clickOnCreditCard();
		wrongcardnumber.enterCreditCardNumber();
		wrongcardnumber.clickOnPayNow();
		wrongcardnumber.verifyErrorMsg();
	}
	
	@Test(priority=17,dataProvider ="Valid_Connection",description="verify blank wrong message")
	public void NRDA_ChangeOfUse_Citizen_SC_03_TC_04(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_citizen.loginAsCitizen(username,password);

		ToVerifyChangeOfUse_SC_02_TC_01 changeconnectiontab=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_01.class);
		changeconnectiontab.clickOnFreshApplication();
		changeconnectiontab.clickOnPublicHealthEngineering();
		changeconnectiontab.clickOnWaterAndSewerageConnectionImage();
		changeconnectiontab.verifyExitConnection();
		changeconnectiontab.clickOnChangeConnectionDetails();
		
		ToVerifyChangeOfUse_SC_02_TC_02 conversion=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_02.class);
		conversion.selectTypeOfConversion();
		
		ToVerifyChangeOfUse_SC_02_TC_06 usage=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_06.class);
		usage.selectConnectionType();
		
		ToVerifyChangeOfUse_SC_02_TC_09 trust=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_09.class);
		trust.selectDetailsOfUsage();
		trust.enterTrustOrganizationSchool();
		
		ToVerifyChangeOfUse_SC_02_TC_10 bed=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_10.class);
		bed.enterNumberOfBedEmployeeStudent();
		
		ToVerifyChangeOfUse_SC_02_TC_08 certificate=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_08.class);
		certificate.verifyValidCertificate();
		
		/*ToVerifyChangeOfUse_SC_02_TC_11 otherdocument=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_11.class);
		otherdocument.clickOnOtherDocument();*/
		
		ToVerifyChangeOfUse_SC_02_TC_12 remark=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_12.class);
		remark.enterRemarks();
		
		remark.clickOnConnectionDetails();//temporary used
		
		/*ToVerifyChangeOfUse_SC_02_TC_14 next=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_14.class);
		next.clickOnNextButton();*/
		
		ToVerifyChangeOfUse_SC_02_TC_16 uploaddocname=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_16.class);
		uploaddocname.clickOnUpload();//for temporary used
		uploaddocname.selectDocumentName();
		uploaddocname.clickOnUploadNameDoc();
		uploaddocname.clickOnSubmit();
		
		ToVerifyChangeOfUse_SC_03_TC_01 online=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_03_TC_01.class);
		online.selectPaymentGateway();
		online.selectPaymentMode();
		
		ToVerifyChangeOfUse_SC_03_TC_02 makepay=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_03_TC_02.class);
		makepay.clickOnMakePayment();
		
		ToVerifyChangeOfUse_SC_03_TC_04 blank=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_03_TC_04.class);
		blank.clickOnPayNow();
		blank.verifyBlankMsg();
	}
	
	@Test(priority=18,dataProvider ="Valid_Connection",description="verify submit with valid card details")
	public void NRDA_ChangeOfUse_Citizen_SC_03_TC_06(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_citizen.loginAsCitizen(username,password);

		ToVerifyChangeOfUse_SC_02_TC_01 changeconnectiontab=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_01.class);
		changeconnectiontab.clickOnFreshApplication();
		changeconnectiontab.clickOnPublicHealthEngineering();
		changeconnectiontab.clickOnWaterAndSewerageConnectionImage();
		changeconnectiontab.verifyExitConnection();
		changeconnectiontab.clickOnChangeConnectionDetails();
		
		ToVerifyChangeOfUse_SC_02_TC_02 conversion=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_02.class);
		conversion.selectTypeOfConversion();
		
		ToVerifyChangeOfUse_SC_02_TC_06 usage=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_06.class);
		usage.selectConnectionType();
		
		ToVerifyChangeOfUse_SC_02_TC_09 trust=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_09.class);
		trust.selectDetailsOfUsage();
		trust.enterTrustOrganizationSchool();
		
		ToVerifyChangeOfUse_SC_02_TC_10 bed=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_10.class);
		bed.enterNumberOfBedEmployeeStudent();
		
		ToVerifyChangeOfUse_SC_02_TC_08 certificate=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_08.class);
		certificate.verifyValidCertificate();
		
		/*ToVerifyChangeOfUse_SC_02_TC_11 otherdocument=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_11.class);
		otherdocument.clickOnOtherDocument();*/
		
		ToVerifyChangeOfUse_SC_02_TC_12 remark=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_12.class);
		remark.enterRemarks();
		
		remark.clickOnConnectionDetails();//temporary used
		
		/*ToVerifyChangeOfUse_SC_02_TC_14 next=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_14.class);
		next.clickOnNextButton();*/
		
		ToVerifyChangeOfUse_SC_02_TC_16 uploaddocname=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_02_TC_16.class);
		uploaddocname.clickOnUpload();//for temporary used
		uploaddocname.selectDocumentName();
		uploaddocname.clickOnUploadNameDoc();
		uploaddocname.clickOnSubmit();
		
		ToVerifyChangeOfUse_SC_03_TC_01 online=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_03_TC_01.class);
		online.selectPaymentGateway();
		online.selectPaymentMode();
		
		ToVerifyChangeOfUse_SC_03_TC_02 makepay=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_03_TC_02.class);
		makepay.clickOnMakePayment();
		
		ToVerifyChangeOfUse_SC_03_TC_03 wrongcardnumber=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_03_TC_03.class);
		wrongcardnumber.clickOnCreditCard();
		
		ToVerifyChangeOfUse_SC_03_TC_06 validcardnumber=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_03_TC_06.class);
		validcardnumber.enterCreditCardNumber();
		validcardnumber.selectValidMonth();
		validcardnumber.selectValidYear();
		validcardnumber.enterCVVNumber();
		validcardnumber.enterCardNameHolder();
		validcardnumber.clickOnPayNow();
		validcardnumber.clickOnSimulate();
		validcardnumber.verifyDisplayWindow();
		validcardnumber.getApplicationNum();
	}
}
