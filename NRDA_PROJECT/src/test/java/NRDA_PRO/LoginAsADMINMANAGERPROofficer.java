package NRDA_PRO;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericLibrary.ExcelDataDriver;
import LoginLogoutWSNRDAScript.URLPageWSNRDAScript;
import WaterAndSewerageLogin.WaterAndSewerageLoginPage;

@Listeners(GenericLibrary.ListenerDriver.class)
public class LoginAsADMINMANAGERPROofficer extends URLPageWSNRDAScript
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	String filepath="C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\NRDA_TESTDATA.xlsx";

	@AfterMethod 
	public void logoutWS() throws InterruptedException
	{
		WebElement web1=driver.findElement(By.xpath("//a[@class='dropdown-toggle' and@role='button']/span"));
		Actions action = new Actions(driver);
		WebDriverWait wait1 = new WebDriverWait(driver,50);
		wait1.until(ExpectedConditions.visibilityOf( web1));
		action.moveToElement(web1).build().perform();
		waitForSomeTime();

		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		driver.close();

	}
	@DataProvider(name="ADMIN_MANAGER_PRO_Officer")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"ADMIN_MANAGER_PRO_Officer");
	}


	@Test(description="verify dashboard",priority=1,dataProvider="ADMIN_MANAGER_PRO_Officer")
	public void NRDA_PRO_SC_03_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsAdminManagerPROfficer(username, password);

		NRDA_PRO_SC_03_TC_01 dashboard=PageFactory.initElements(driver,NRDA_PRO_SC_03_TC_01.class);
		dashboard.toVerifyDashboard();
	}

	@Test(description="verify display",priority=2,dataProvider="ADMIN_MANAGER_PRO_Officer")
	public void NRDA_PRO_SC_03_TC_03(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsAdminManagerPROfficer(username, password);

		NRDA_PRO_SC_03_TC_03 dashboard=PageFactory.initElements(driver,NRDA_PRO_SC_03_TC_03.class);
		dashboard.verifyStatisticsDisplayLink();
	}

	@Test(description="verify application number",priority=3,dataProvider="ADMIN_MANAGER_PRO_Officer")
	public void NRDA_PRO_SC_03_TC_04(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsAdminManagerPROfficer(username, password);

		NRDA_PRO_SC_03_TC_04 apppage=PageFactory.initElements(driver,NRDA_PRO_SC_03_TC_04.class);
		apppage.clickOnPublicRelOffice();
		apppage.clickOnAdvertisementAndPub();
		apppage.enterApplicationNum();
	}

	@Test(description="verify action page",priority=4,dataProvider="ADMIN_MANAGER_PRO_Officer")
	public void NRDA_PRO_SC_03_TC_05(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsAdminManagerPROfficer(username, password);

		NRDA_PRO_SC_03_TC_04 apppage=PageFactory.initElements(driver,NRDA_PRO_SC_03_TC_04.class);
		apppage.clickOnPublicRelOffice();
		apppage.clickOnAdvertisementAndPub();
		apppage.enterApplicationNum();

		NRDA_PRO_SC_03_TC_05 actionpage=PageFactory.initElements(driver,NRDA_PRO_SC_03_TC_05.class);
		actionpage.clickOnAction();
		actionpage.verifyDisplay();
	}

	@Test(description="verify select action ",priority=5,dataProvider="ADMIN_MANAGER_PRO_Officer")
	public void NRDA_PRO_SC_03_TC_06(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsAdminManagerPROfficer(username, password);

		NRDA_PRO_SC_03_TC_04 apppage=PageFactory.initElements(driver,NRDA_PRO_SC_03_TC_04.class);
		apppage.clickOnPublicRelOffice();
		apppage.clickOnAdvertisementAndPub();
		apppage.enterApplicationNum();

		NRDA_PRO_SC_03_TC_05 actionpage=PageFactory.initElements(driver,NRDA_PRO_SC_03_TC_05.class);
		actionpage.clickOnAction();


		NRDA_PRO_SC_03_TC_06 user=PageFactory.initElements(driver,NRDA_PRO_SC_03_TC_06.class);
		user.selectActionForward();
		user.selectConsultant();
	}

	@Test(description="verify comment ",priority=6,dataProvider="ADMIN_MANAGER_PRO_Officer")
	public void NRDA_PRO_SC_03_TC_07(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsAdminManagerPROfficer(username, password);

		NRDA_PRO_SC_03_TC_04 apppage=PageFactory.initElements(driver,NRDA_PRO_SC_03_TC_04.class);
		apppage.clickOnPublicRelOffice();
		apppage.clickOnAdvertisementAndPub();
		apppage.enterApplicationNum();

		NRDA_PRO_SC_03_TC_05 actionpage=PageFactory.initElements(driver,NRDA_PRO_SC_03_TC_05.class);
		actionpage.clickOnAction();

		NRDA_PRO_SC_03_TC_07 comment=PageFactory.initElements(driver,NRDA_PRO_SC_03_TC_07.class);
		comment.enterComment();
	}

	@Test(description="verify blank comment ",priority=6,dataProvider="ADMIN_MANAGER_PRO_Officer")
	public void NRDA_PRO_SC_03_TC_08(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsAdminManagerPROfficer(username, password);

		NRDA_PRO_SC_03_TC_04 apppage=PageFactory.initElements(driver,NRDA_PRO_SC_03_TC_04.class);
		apppage.clickOnPublicRelOffice();
		apppage.clickOnAdvertisementAndPub();
		apppage.enterApplicationNum();

		NRDA_PRO_SC_03_TC_05 actionpage=PageFactory.initElements(driver,NRDA_PRO_SC_03_TC_05.class);
		actionpage.clickOnAction();

		NRDA_PRO_SC_03_TC_08 blank=PageFactory.initElements(driver,NRDA_PRO_SC_03_TC_08.class);
		blank.clickOnSubmit();
		blank.verifyErrorMessage();
	}


	@Test(description="verify submit ",priority=7,dataProvider="ADMIN_MANAGER_PRO_Officer")
	public void NRDA_PRO_SC_03_TC_09(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsAdminManagerPROfficer(username, password);

		NRDA_PRO_SC_03_TC_04 apppage=PageFactory.initElements(driver,NRDA_PRO_SC_03_TC_04.class);
		apppage.clickOnPublicRelOffice();
		apppage.clickOnAdvertisementAndPub();
		apppage.enterApplicationNum();

		NRDA_PRO_SC_03_TC_05 actionpage=PageFactory.initElements(driver,NRDA_PRO_SC_03_TC_05.class);
		actionpage.clickOnAction();

		NRDA_PRO_SC_03_TC_06 user=PageFactory.initElements(driver,NRDA_PRO_SC_03_TC_06.class);
		user.selectActionForward();
		user.selectConsultant();

		NRDA_PRO_SC_03_TC_07 comment=PageFactory.initElements(driver,NRDA_PRO_SC_03_TC_07.class);
		comment.enterComment();

		NRDA_PRO_SC_03_TC_09 submit=PageFactory.initElements(driver,NRDA_PRO_SC_03_TC_09.class);
		submit.uploadDocument();
		submit.verifyMessage();
		submit.clickOnSubmit();
		submit.verifySuccessfulMessage();
	}


	//again login as admin manager



	@Test(description="verify dashboard",priority=1,dataProvider="ADMIN_MANAGER_PRO_Officer")
	public void NRDA_PRO_SC_05_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsAdminManagerPROfficer(username, password);

		NRDA_PRO_SC_05_TC_01 dashboard=PageFactory.initElements(driver,NRDA_PRO_SC_05_TC_01.class);
		dashboard.toVerifyDashboard();
	}

	@Test(description="verify dashboard",priority=2,dataProvider="ADMIN_MANAGER_PRO_Officer")
	public void NRDA_PRO_SC_05_TC_03(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsAdminManagerPROfficer(username, password);

		NRDA_PRO_SC_05_TC_03 dashboard=PageFactory.initElements(driver,NRDA_PRO_SC_05_TC_03.class);
		dashboard.verifyStatisticsDisplayLink();
	}

	@Test(description="verify advertisement and publication",priority=3,dataProvider="ADMIN_MANAGER_PRO_Officer")
	public void NRDA_PRO_SC_05_TC_04(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsAdminManagerPROfficer(username, password);

		NRDA_PRO_SC_05_TC_04 adv=PageFactory.initElements(driver,NRDA_PRO_SC_05_TC_04.class);
		adv.clickOnPublicRelOffice();
		adv.clickOnAdvertisementAndPub();
		adv.enterApplicationNum();
	}

	@Test(description="verify action page",priority=4,dataProvider="ADMIN_MANAGER_PRO_Officer")
	public void NRDA_PRO_SC_05_TC_05(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsAdminManagerPROfficer(username, password);

		NRDA_PRO_SC_05_TC_04 adv=PageFactory.initElements(driver,NRDA_PRO_SC_05_TC_04.class);
		adv.clickOnPublicRelOffice();
		adv.clickOnAdvertisementAndPub();
		adv.enterApplicationNum();

		NRDA_PRO_SC_05_TC_05 aactionpage=PageFactory.initElements(driver,NRDA_PRO_SC_05_TC_05.class);
		aactionpage.clickOnAction();
	}


	@Test(description="verify select action",priority=5,dataProvider="ADMIN_MANAGER_PRO_Officer")
	public void NRDA_PRO_SC_05_TC_06(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsAdminManagerPROfficer(username, password);

		NRDA_PRO_SC_05_TC_04 adv=PageFactory.initElements(driver,NRDA_PRO_SC_05_TC_04.class);
		adv.clickOnPublicRelOffice();
		adv.clickOnAdvertisementAndPub();
		adv.enterApplicationNum();

		NRDA_PRO_SC_05_TC_05 aactionpage=PageFactory.initElements(driver,NRDA_PRO_SC_05_TC_05.class);
		aactionpage.clickOnAction();

		NRDA_PRO_SC_05_TC_06 user=PageFactory.initElements(driver,NRDA_PRO_SC_05_TC_06.class);
		user.selectActionForward();
		user.selectCEO();
	}

	@Test(description="verify comment",priority=6,dataProvider="ADMIN_MANAGER_PRO_Officer")
	public void NRDA_PRO_SC_05_TC_07(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsAdminManagerPROfficer(username, password);

		NRDA_PRO_SC_05_TC_04 adv=PageFactory.initElements(driver,NRDA_PRO_SC_05_TC_04.class);
		adv.clickOnPublicRelOffice();
		adv.clickOnAdvertisementAndPub();
		adv.enterApplicationNum();

		NRDA_PRO_SC_05_TC_05 aactionpage=PageFactory.initElements(driver,NRDA_PRO_SC_05_TC_05.class);
		aactionpage.clickOnAction();

		NRDA_PRO_SC_05_TC_06 user=PageFactory.initElements(driver,NRDA_PRO_SC_05_TC_06.class);
		user.selectActionForward();
		user.selectCEO();

		NRDA_PRO_SC_05_TC_07 comment=PageFactory.initElements(driver,NRDA_PRO_SC_05_TC_07.class);
		comment.enterComment();
	}

	@Test(description="verify upload",priority=7,dataProvider="ADMIN_MANAGER_PRO_Officer")
	public void NRDA_PRO_SC_05_TC_08(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsAdminManagerPROfficer(username, password);

		NRDA_PRO_SC_05_TC_04 adv=PageFactory.initElements(driver,NRDA_PRO_SC_05_TC_04.class);
		adv.clickOnPublicRelOffice();
		adv.clickOnAdvertisementAndPub();
		adv.enterApplicationNum();

		NRDA_PRO_SC_05_TC_05 aactionpage=PageFactory.initElements(driver,NRDA_PRO_SC_05_TC_05.class);
		aactionpage.clickOnAction();

		NRDA_PRO_SC_05_TC_06 user=PageFactory.initElements(driver,NRDA_PRO_SC_05_TC_06.class);
		user.selectActionForward();
		user.selectCEO();

		NRDA_PRO_SC_05_TC_07 comment=PageFactory.initElements(driver,NRDA_PRO_SC_05_TC_07.class);
		comment.enterComment();

		NRDA_PRO_SC_05_TC_08 upload=PageFactory.initElements(driver,NRDA_PRO_SC_05_TC_08.class);
		upload.uploadDocument();
		upload.verifyMessage();
	}


	@Test(description="verify blank comment",priority=8,dataProvider="ADMIN_MANAGER_PRO_Officer")
	public void NRDA_PRO_SC_05_TC_09(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsAdminManagerPROfficer(username, password);

		NRDA_PRO_SC_05_TC_04 adv=PageFactory.initElements(driver,NRDA_PRO_SC_05_TC_04.class);
		adv.clickOnPublicRelOffice();
		adv.clickOnAdvertisementAndPub();
		adv.enterApplicationNum();

		NRDA_PRO_SC_05_TC_05 aactionpage=PageFactory.initElements(driver,NRDA_PRO_SC_05_TC_05.class);
		aactionpage.clickOnAction();

		NRDA_PRO_SC_05_TC_06 user=PageFactory.initElements(driver,NRDA_PRO_SC_05_TC_06.class);
		user.selectActionForward();
		user.selectCEO();

		NRDA_PRO_SC_05_TC_09 blank=PageFactory.initElements(driver,NRDA_PRO_SC_05_TC_09.class);
		blank.clickOnSubmit();
		blank.verifyErrorMessage();
	}

	@Test(description="verify submit",priority=9,dataProvider="ADMIN_MANAGER_PRO_Officer")
	public void NRDA_PRO_SC_05_TC_10(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsAdminManagerPROfficer(username, password);

		NRDA_PRO_SC_05_TC_04 adv=PageFactory.initElements(driver,NRDA_PRO_SC_05_TC_04.class);
		adv.clickOnPublicRelOffice();
		adv.clickOnAdvertisementAndPub();
		adv.enterApplicationNum();

		NRDA_PRO_SC_05_TC_05 aactionpage=PageFactory.initElements(driver,NRDA_PRO_SC_05_TC_05.class);
		aactionpage.clickOnAction();

		NRDA_PRO_SC_05_TC_06 user=PageFactory.initElements(driver,NRDA_PRO_SC_05_TC_06.class);
		user.selectActionForward();
		user.selectCEO();

		NRDA_PRO_SC_05_TC_07 comment=PageFactory.initElements(driver,NRDA_PRO_SC_05_TC_07.class);
		comment.enterComment();

		NRDA_PRO_SC_05_TC_08 upload=PageFactory.initElements(driver,NRDA_PRO_SC_05_TC_08.class);
		upload.uploadDocument();
		upload.verifyMessage();

		NRDA_PRO_SC_05_TC_10 submit=PageFactory.initElements(driver,NRDA_PRO_SC_05_TC_10.class);
		submit.clickOnSubmit();
		submit.verifySuccessfulMessage();
	}	
	
	
	
									//login as manager forward to Finance manager
	
	@Test(description="verify dashboard",priority=1,dataProvider="ADMIN_MANAGER_PRO_Officer")
	public void NRDA_PRO_SC_08_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsAdminManagerPROfficer(username, password);

		NRDA_PRO_SC_08_TC_01 dashboard=PageFactory.initElements(driver,NRDA_PRO_SC_08_TC_01.class);
		dashboard.toVerifyDashboard();
	}

	@Test(description="verify display",priority=2,dataProvider="ADMIN_MANAGER_PRO_Officer")
	public void NRDA_PRO_SC_08_TC_03(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsAdminManagerPROfficer(username, password);

		NRDA_PRO_SC_08_TC_03 dashboard=PageFactory.initElements(driver,NRDA_PRO_SC_08_TC_03.class);
		dashboard.verifyStatisticsDisplayLink();
	}

	@Test(description="verify application number",priority=3,dataProvider="ADMIN_MANAGER_PRO_Officer")
	public void NRDA_PRO_SC_08_TC_04(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsAdminManagerPROfficer(username, password);

		NRDA_PRO_SC_08_TC_04 apppage=PageFactory.initElements(driver,NRDA_PRO_SC_08_TC_04.class);
		apppage.clickOnPublicRelOffice();
		apppage.clickOnAdvertisementAndPub();
		apppage.enterApplicationNum();
	}

	@Test(description="verify action page",priority=4,dataProvider="ADMIN_MANAGER_PRO_Officer")
	public void NRDA_PRO_SC_08_TC_05(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsAdminManagerPROfficer(username, password);

		NRDA_PRO_SC_08_TC_04 apppage=PageFactory.initElements(driver,NRDA_PRO_SC_08_TC_04.class);
		apppage.clickOnPublicRelOffice();
		apppage.clickOnAdvertisementAndPub();
		apppage.enterApplicationNum();

		NRDA_PRO_SC_08_TC_05 actionpage=PageFactory.initElements(driver,NRDA_PRO_SC_08_TC_05.class);
		actionpage.clickOnAction();
		actionpage.verifyDisplay();
	}

	@Test(description="verify select action ",priority=5,dataProvider="ADMIN_MANAGER_PRO_Officer")
	public void NRDA_PRO_SC_08_TC_06(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsAdminManagerPROfficer(username, password);

		NRDA_PRO_SC_08_TC_04 apppage=PageFactory.initElements(driver,NRDA_PRO_SC_08_TC_04.class);
		apppage.clickOnPublicRelOffice();
		apppage.clickOnAdvertisementAndPub();
		apppage.enterApplicationNum();

		NRDA_PRO_SC_08_TC_05 actionpage=PageFactory.initElements(driver,NRDA_PRO_SC_08_TC_05.class);
		actionpage.clickOnAction();


		NRDA_PRO_SC_08_TC_06 user=PageFactory.initElements(driver,NRDA_PRO_SC_08_TC_06.class);
		user.selectActionForward();
		user.selectFinance();
	}

	@Test(description="verify comment ",priority=6,dataProvider="ADMIN_MANAGER_PRO_Officer")
	public void NRDA_PRO_SC_08_TC_07(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsAdminManagerPROfficer(username, password);

		NRDA_PRO_SC_08_TC_04 apppage=PageFactory.initElements(driver,NRDA_PRO_SC_08_TC_04.class);
		apppage.clickOnPublicRelOffice();
		apppage.clickOnAdvertisementAndPub();
		apppage.enterApplicationNum();

		NRDA_PRO_SC_08_TC_05 actionpage=PageFactory.initElements(driver,NRDA_PRO_SC_08_TC_05.class);
		actionpage.clickOnAction();

		NRDA_PRO_SC_08_TC_07 comment=PageFactory.initElements(driver,NRDA_PRO_SC_08_TC_07.class);
		comment.enterComment();
	}

	@Test(description="verify upload ",priority=6,dataProvider="ADMIN_MANAGER_PRO_Officer")
	public void NRDA_PRO_SC_08_TC_08(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsAdminManagerPROfficer(username, password);

		NRDA_PRO_SC_08_TC_04 apppage=PageFactory.initElements(driver,NRDA_PRO_SC_08_TC_04.class);
		apppage.clickOnPublicRelOffice();
		apppage.clickOnAdvertisementAndPub();
		apppage.enterApplicationNum();

		NRDA_PRO_SC_08_TC_05 actionpage=PageFactory.initElements(driver,NRDA_PRO_SC_08_TC_05.class);
		actionpage.clickOnAction();

		NRDA_PRO_SC_08_TC_08 upload=PageFactory.initElements(driver,NRDA_PRO_SC_08_TC_08.class);
		upload.uploadDocument();
		upload.verifyMessage();
	}
	
	@Test(description="verify blank ",priority=7,dataProvider="ADMIN_MANAGER_PRO_Officer")
	public void NRDA_PRO_SC_08_TC_09(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsAdminManagerPROfficer(username, password);

		NRDA_PRO_SC_08_TC_04 apppage=PageFactory.initElements(driver,NRDA_PRO_SC_08_TC_04.class);
		apppage.clickOnPublicRelOffice();
		apppage.clickOnAdvertisementAndPub();
		apppage.enterApplicationNum();

		NRDA_PRO_SC_08_TC_05 actionpage=PageFactory.initElements(driver,NRDA_PRO_SC_08_TC_05.class);
		actionpage.clickOnAction();

		NRDA_PRO_SC_08_TC_06 user=PageFactory.initElements(driver,NRDA_PRO_SC_08_TC_06.class);
		user.selectActionForward();
		user.selectFinance();
		
		NRDA_PRO_SC_08_TC_09 blank=PageFactory.initElements(driver,NRDA_PRO_SC_08_TC_09.class);
		blank.clickOnSubmit();
		blank.verifyErrorMessage();
	}


	@Test(description="verify submit ",priority=8,dataProvider="ADMIN_MANAGER_PRO_Officer")
	public void NRDA_PRO_SC_08_TC_10(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsAdminManagerPROfficer(username, password);

		NRDA_PRO_SC_08_TC_04 apppage=PageFactory.initElements(driver,NRDA_PRO_SC_08_TC_04.class);
		apppage.clickOnPublicRelOffice();
		apppage.clickOnAdvertisementAndPub();
		apppage.enterApplicationNum();

		NRDA_PRO_SC_08_TC_05 actionpage=PageFactory.initElements(driver,NRDA_PRO_SC_08_TC_05.class);
		actionpage.clickOnAction();

		NRDA_PRO_SC_08_TC_06 user=PageFactory.initElements(driver,NRDA_PRO_SC_08_TC_06.class);
		user.selectActionForward();
		user.selectFinance();

		NRDA_PRO_SC_08_TC_07 comment=PageFactory.initElements(driver,NRDA_PRO_SC_08_TC_07.class);
		comment.enterComment();
		
		NRDA_PRO_SC_08_TC_08 upload=PageFactory.initElements(driver,NRDA_PRO_SC_08_TC_08.class);
		upload.uploadDocument();
		upload.verifyMessage();

		NRDA_PRO_SC_08_TC_10 submit=PageFactory.initElements(driver,NRDA_PRO_SC_08_TC_10.class);
		submit.clickOnSubmit();
		submit.verifySuccessfulMessage();
	}


}
