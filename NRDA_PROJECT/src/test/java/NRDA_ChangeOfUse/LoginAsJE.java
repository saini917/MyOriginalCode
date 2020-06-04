package NRDA_ChangeOfUse;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import GenericLibrary.ExcelDataDriver;
import LoginLogoutWSNRDAScript.URLPageWSNRDAScript;
import WaterAndSewerageLogin.WaterAndSewerageLoginPage;

@Listeners(GenericLibrary.ListenerDriver.class)
public class LoginAsJE extends URLPageWSNRDAScript
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	String filepath="C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\NRDA_TESTDATA.xlsx";

	@AfterMethod 
	public void logoutWS() throws InterruptedException
	{
		WebElement web1=driver.findElement(By.xpath("//a[@class='dropdown-toggle' and@role='button']/span"));
		Actions action = new Actions(driver);
		action.moveToElement(web1).build().perform();
		waitForSomeTime();
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		waitForSomeTime();
		driver.close();
	}
	
	@DataProvider(name="junior engineer")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"Junior Engineer Credentials");
	}
	
	@Test(priority=1,dataProvider ="junior engineer",description="verify dashboard")
	public void NRDA_ChangeOfUse_Officer_SC_04_TC_01(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		ToVerifyChangeOfUse_SC_04_TC_01 homedisplay=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_01.class);
		homedisplay.verifyDisplayLink();
	}
	
	@Test(priority=2,dataProvider ="junior engineer",description="verify actionpage")
	public void NRDA_ChangeOfUse_Officer_SC_04_TC_02(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		ToVerifyChangeOfUse_SC_04_TC_02 actionpage=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_02.class);
		actionpage.clickOnPublicHealthAndEngg();
		actionpage.clickOnChangeOfUse();
		actionpage.verifyNavigation();
	}
	
	@Test(priority=3,dataProvider ="junior engineer",description="verify pagination")
	public void NRDA_ChangeOfUse_Officer_SC_04_TC_03(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		ToVerifyChangeOfUse_SC_04_TC_02 actionpage=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_02.class);
		actionpage.clickOnPublicHealthAndEngg();
		actionpage.clickOnChangeOfUse();
		
		ToVerifyChangeOfUse_SC_04_TC_03 pagination=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_03.class);
		pagination.clickOnPage2();
		pagination.clickOnPage1();
	}
	
	@Test(priority=4,dataProvider ="junior engineer",description="verify wrong pending days")
	public void NRDA_ChangeOfUse_Officer_SC_04_TC_04(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		ToVerifyChangeOfUse_SC_04_TC_02 actionpage=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_02.class);
		actionpage.clickOnPublicHealthAndEngg();
		actionpage.clickOnChangeOfUse();
		
		ToVerifyChangeOfUse_SC_04_TC_04 pendingdays=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_04.class);
		pendingdays.enterPendingDays();
		pendingdays.verifyErrorMsg();
	}

	@Test(priority=5,dataProvider ="junior engineer",description="verify wrong application num")
	public void NRDA_ChangeOfUse_Officer_SC_04_TC_05(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		ToVerifyChangeOfUse_SC_04_TC_02 actionpage=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_02.class);
		actionpage.clickOnPublicHealthAndEngg();
		actionpage.clickOnChangeOfUse();
		
		ToVerifyChangeOfUse_SC_04_TC_05 applicationnum=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_05.class);
		applicationnum.enterApplicationNum();
		applicationnum.verifyErrorMsg();
	}
	
	@Test(priority=6,dataProvider ="junior engineer",description="verify action display list")
	public void NRDA_ChangeOfUse_Officer_SC_04_TC_06(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		ToVerifyChangeOfUse_SC_04_TC_02 actionpage=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_02.class);
		actionpage.clickOnPublicHealthAndEngg();
		actionpage.clickOnChangeOfUse();
		
		ToVerifyChangeOfUse_SC_04_TC_06 applicationnum=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_06.class);
		applicationnum.enterApplicationNum();
		applicationnum.clickOnAction();
		applicationnum.verifyDisplayList();
	}
	
	@Test(priority=7,dataProvider ="junior engineer",description="verify selection action display list")
	public void NRDA_ChangeOfUse_Officer_SC_04_TC_07(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		ToVerifyChangeOfUse_SC_04_TC_02 actionpage=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_02.class);
		actionpage.clickOnPublicHealthAndEngg();
		actionpage.clickOnChangeOfUse();
		
		ToVerifyChangeOfUse_SC_04_TC_06 applicationnum=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_06.class);
		applicationnum.enterApplicationNum();
		applicationnum.clickOnAction();
		
		ToVerifyChangeOfUse_SC_04_TC_07 verifydisplay=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_07.class);
		verifydisplay.verifySelectAction();
		verifydisplay.verifyDisplayList();
	}
	
	@Test(priority=8,dataProvider ="junior engineer",description="verify comment")
	public void NRDA_ChangeOfUse_Officer_SC_04_TC_08(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		ToVerifyChangeOfUse_SC_04_TC_02 actionpage=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_02.class);
		actionpage.clickOnPublicHealthAndEngg();
		actionpage.clickOnChangeOfUse();
		
		ToVerifyChangeOfUse_SC_04_TC_06 applicationnum=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_06.class);
		applicationnum.enterApplicationNum();
		applicationnum.clickOnAction();
		
		ToVerifyChangeOfUse_SC_04_TC_07 verifydisplay=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_07.class);
		verifydisplay.verifySelectAction();
		
		ToVerifyChangeOfUse_SC_04_TC_08 comm=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_08.class);
		comm.selectActionForward();
		comm.selectName();
		comm.clickOnSubmit();
		comm.verifyMsg();
	}
	
	@Test(priority=9,dataProvider ="junior engineer",description="verify select user using user")
	public void NRDA_ChangeOfUse_Officer_SC_04_TC_09(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		ToVerifyChangeOfUse_SC_04_TC_02 actionpage=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_02.class);
		actionpage.clickOnPublicHealthAndEngg();
		actionpage.clickOnChangeOfUse();
		
		ToVerifyChangeOfUse_SC_04_TC_06 applicationnum=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_06.class);
		applicationnum.enterApplicationNum();
		applicationnum.clickOnAction();
		
		ToVerifyChangeOfUse_SC_04_TC_07 verifydisplay=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_07.class);
		verifydisplay.verifySelectAction();
		
		ToVerifyChangeOfUse_SC_04_TC_08 comm=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_08.class);
		comm.selectActionForward();
		comm.enterComment();
		
		ToVerifyChangeOfUse_SC_04_TC_09 msgwithoutuser=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_09.class);
		msgwithoutuser.clickOnSubmit();
		msgwithoutuser.verifyMsg();
	}
	
	@Test(priority=10,dataProvider ="junior engineer",description="verify comment msg without enter comment")
	public void NRDA_ChangeOfUse_Officer_SC_04_TC_10(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		ToVerifyChangeOfUse_SC_04_TC_02 actionpage=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_02.class);
		actionpage.clickOnPublicHealthAndEngg();
		actionpage.clickOnChangeOfUse();
		
		ToVerifyChangeOfUse_SC_04_TC_06 applicationnum=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_06.class);
		applicationnum.enterApplicationNum();
		applicationnum.clickOnAction();
		
		ToVerifyChangeOfUse_SC_04_TC_07 verifydisplay=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_07.class);
		verifydisplay.verifySelectAction();
		
		ToVerifyChangeOfUse_SC_04_TC_08 comm=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_08.class);
		comm.selectActionForward();
		comm.selectName();
		comm.clickOnSubmit();
		
		ToVerifyChangeOfUse_SC_04_TC_10 msgwithoutcomment=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_10.class);
		msgwithoutcomment.verifyErrorMsg();
	}
	
	@Test(priority=11,dataProvider ="junior engineer",description="verify upload error msg")
	public void NRDA_ChangeOfUse_Officer_SC_04_TC_11(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		ToVerifyChangeOfUse_SC_04_TC_02 actionpage=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_02.class);
		actionpage.clickOnPublicHealthAndEngg();
		actionpage.clickOnChangeOfUse();
		
		ToVerifyChangeOfUse_SC_04_TC_06 applicationnum=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_06.class);
		applicationnum.enterApplicationNum();
		applicationnum.clickOnAction();
		
		ToVerifyChangeOfUse_SC_04_TC_07 verifydisplay=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_07.class);
		verifydisplay.verifySelectAction();
		
		ToVerifyChangeOfUse_SC_04_TC_08 comm=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_08.class);
		comm.selectActionForward();
		comm.selectName();
		comm.enterComment();
		
		ToVerifyChangeOfUse_SC_04_TC_11 uploaderrormsg=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_11.class);
		uploaderrormsg.clickOnUploadDocument();
		uploaderrormsg.verifyErrorMsg();
		
	}
	
	@Test(priority=12,dataProvider ="junior engineer",description="verify search")
	public void NRDA_ChangeOfUse_Officer_SC_04_TC_12(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		ToVerifyChangeOfUse_SC_04_TC_02 actionpage=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_02.class);
		actionpage.clickOnPublicHealthAndEngg();
		actionpage.clickOnChangeOfUse();
		
		ToVerifyChangeOfUse_SC_04_TC_06 applicationnum=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_06.class);
		applicationnum.enterApplicationNum();
		applicationnum.clickOnAction();
		
		ToVerifyChangeOfUse_SC_04_TC_12 searchfile=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_04_TC_12.class);
		searchfile.clickOnSearch();
		searchfile.verifyDisplayList();
		searchfile.verifyClosePopUpWindow();
	}
	
	@Test(priority=13,dataProvider ="junior engineer",description="verify create new file")
	public void NRDA_ChangeOfUse_Officer_SC_04_TC_13(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		ToVerifyChangeOfUse_SC_04_TC_02 actionpage=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_02.class);
		actionpage.clickOnPublicHealthAndEngg();
		actionpage.clickOnChangeOfUse();
		
		ToVerifyChangeOfUse_SC_04_TC_06 applicationnum=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_06.class);
		applicationnum.enterApplicationNum();
		applicationnum.clickOnAction();
		
		ToVerifyChangeOfUse_SC_04_TC_12 searchfile=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_04_TC_12.class);
		searchfile.clickOnSearch();
		
		ToVerifyChangeOfUse_SC_04_TC_13 createnewfile=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_04_TC_13.class);
		createnewfile.clickOnCreateNewFile();
		createnewfile.verifyDisplayList();
		createnewfile.verifyClosePopUpWindow();
		createnewfile.verifyClosePopUpWindow1();
	}
	@Test(priority=14,dataProvider ="junior engineer",description="verify submit")
	public void NRDA_ChangeOfUse_Officer_SC_04_TC_14(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		ToVerifyChangeOfUse_SC_04_TC_02 actionpage=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_02.class);
		actionpage.clickOnPublicHealthAndEngg();
		actionpage.clickOnChangeOfUse();
		
		ToVerifyChangeOfUse_SC_04_TC_06 applicationnum=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_06.class);
		applicationnum.enterApplicationNum();
		applicationnum.clickOnAction();
		
		ToVerifyChangeOfUse_SC_04_TC_12 searchfile=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_04_TC_12.class);
		searchfile.clickOnSearch();
		
		ToVerifyChangeOfUse_SC_04_TC_13 createnewfile=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_04_TC_13.class);
		createnewfile.clickOnCreateNewFile();
		
		ToVerifyChangeOfUse_SC_04_TC_14 verifysubmit=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_04_TC_14.class);
		verifysubmit.clickOnSubmit();
		verifysubmit.verifyClosePopUpWindow1();
	}
	
	@Test(priority=15,dataProvider ="junior engineer",description="verify fill in form")
	public void NRDA_ChangeOfUse_Officer_SC_04_TC_15(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		ToVerifyChangeOfUse_SC_04_TC_02 actionpage=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_02.class);
		actionpage.clickOnPublicHealthAndEngg();
		actionpage.clickOnChangeOfUse();
		
		ToVerifyChangeOfUse_SC_04_TC_06 applicationnum=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_06.class);
		applicationnum.enterApplicationNum();
		applicationnum.clickOnAction();
		
		ToVerifyChangeOfUse_SC_04_TC_12 searchfile=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_04_TC_12.class);
		searchfile.clickOnSearch();
		
		ToVerifyChangeOfUse_SC_04_TC_15 fillinform=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_04_TC_15.class);
		fillinform.selectSubjectClickOnSearch();
		fillinform.clickOnFillInForm();
	}
	
	@Test(priority=16,dataProvider ="junior engineer",description="verify save as draft")
	public void NRDA_ChangeOfUse_Officer_SC_04_TC_16(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		ToVerifyChangeOfUse_SC_04_TC_02 actionpage=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_02.class);
		actionpage.clickOnPublicHealthAndEngg();
		actionpage.clickOnChangeOfUse();
		
		ToVerifyChangeOfUse_SC_04_TC_06 applicationnum=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_06.class);
		applicationnum.enterApplicationNum();
		applicationnum.clickOnAction();
		
		ToVerifyChangeOfUse_SC_04_TC_16 saveasdraft=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_16.class);
		saveasdraft.clickOnSaveAsDraft();
		saveasdraft.verifyMsg();
	}
	
	@Test(priority=17,dataProvider ="junior engineer",description="verify remove draft")
	public void NRDA_ChangeOfUse_Officer_SC_04_TC_17(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		ToVerifyChangeOfUse_SC_04_TC_02 actionpage=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_02.class);
		actionpage.clickOnPublicHealthAndEngg();
		actionpage.clickOnChangeOfUse();
		
		ToVerifyChangeOfUse_SC_04_TC_06 applicationnum=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_06.class);
		applicationnum.enterApplicationNum();
		applicationnum.clickOnAction();
		
		ToVerifyChangeOfUse_SC_04_TC_17 removedraft=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_17.class);
		removedraft.clickOnRemoveDraft();
		removedraft.verifyMsg();
	}
	
	@Test(priority=18,dataProvider ="junior engineer",description="verify close")
	public void NRDA_ChangeOfUse_Officer_SC_04_TC_21(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		ToVerifyChangeOfUse_SC_04_TC_02 actionpage=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_02.class);
		actionpage.clickOnPublicHealthAndEngg();
		actionpage.clickOnChangeOfUse();
		
		ToVerifyChangeOfUse_SC_04_TC_06 applicationnum=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_06.class);
		applicationnum.enterApplicationNum();
		applicationnum.clickOnAction();
		
		ToVerifyChangeOfUse_SC_04_TC_21 close=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_21.class);
		close.clickOnClose();
	}
	
	@Test(priority=19,dataProvider ="junior engineer",description="verify submit with valid data")
	public void NRDA_ChangeOfUse_Officer_SC_04_TC_18(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		ToVerifyChangeOfUse_SC_04_TC_02 actionpage=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_02.class);
		actionpage.clickOnPublicHealthAndEngg();
		actionpage.clickOnChangeOfUse();
		
		ToVerifyChangeOfUse_SC_04_TC_06 applicationnum=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_06.class);
		applicationnum.enterApplicationNum();
		applicationnum.clickOnAction();
		
		ToVerifyChangeOfUse_SC_04_TC_07 verifydisplay=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_07.class);
		verifydisplay.verifySelectAction();
		
		ToVerifyChangeOfUse_SC_04_TC_08 comm=PageFactory.initElements(driver, ToVerifyChangeOfUse_SC_04_TC_08.class);
		comm.selectActionForward();
		comm.selectName();
		comm.enterComment();
		
		ToVerifyChangeOfUse_SC_04_TC_12 searchfile=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_04_TC_12.class);
		searchfile.clickOnSearch();
		
		ToVerifyChangeOfUse_SC_04_TC_15 fillinform=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_04_TC_15.class);
		fillinform.selectSubjectClickOnSearch();
		fillinform.clickOnFillInForm();
		
		ToVerifyChangeOfUse_SC_04_TC_18 submit=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_04_TC_18.class);
		submit.clickOnUploadDocument();
		submit.verifyUploadMsg();
		submit.clickOnSubmit();
		submit.verifyMsg();
	}
	
	
	
							//login as JE application submitted to EE
	
	@Test(priority=1,dataProvider ="junior engineer",description="verify submit")
	public void NRDA_ChangeOfUse_Officer_SC_06_TC_01(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyChangeOfUse_SC_06_TC_01 submitEE=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_06_TC_01.class);
		submitEE.clickOnPublicHealthAndEngg();
		submitEE.clickOnChangeOfUse();
		submitEE.enterApplicationNum();
		submitEE.clickOnAction();
		submitEE.verifySelectAction();
		submitEE.selectActionForward();
		submitEE.selectName();
		submitEE.enterComment();
		submitEE.clickOnSubmit();
		submitEE.verifyMsg();
	}
	
	
						//login as JE for Final Approval
	
	@Test(priority=1,dataProvider ="junior engineer",description="verify meter insatallation")
	public void NRDA_ChangeOfUse_Officer_SC_08_TC_01(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyChangeOfUse_SC_08_TC_01 install=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_08_TC_01.class);
		install.clickOnPublicHealthAndEngg();
		install.clickOnChangeOfUse();
		install.enterApplicationNum();
		install.clickOnAction();
		install.verifyDisplayList();
	}
	
	@Test(priority=2,dataProvider ="junior engineer",description="verify view file")
	public void NRDA_ChangeOfUse_Officer_SC_08_TC_02(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyChangeOfUse_SC_08_TC_01 install=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_08_TC_01.class);
		install.clickOnPublicHealthAndEngg();
		install.clickOnChangeOfUse();
		install.enterApplicationNum();
		install.clickOnAction();
		
		ToVerifyChangeOfUse_SC_08_TC_02 viewfile=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_08_TC_02.class);
		viewfile.verifyDisplayFile();
	}
	
	@Test(priority=3,dataProvider ="junior engineer",description="verify view subject")
	public void NRDA_ChangeOfUse_Officer_SC_08_TC_03(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyChangeOfUse_SC_08_TC_01 install=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_08_TC_01.class);
		install.clickOnPublicHealthAndEngg();
		install.clickOnChangeOfUse();
		install.enterApplicationNum();
		install.clickOnAction();
		
		ToVerifyChangeOfUse_SC_08_TC_03 viewsubject=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_08_TC_03.class);
		viewsubject.verifyDisplaySubject();
	}
	
	@Test(priority=4,dataProvider ="junior engineer",description="verify without action")
	public void NRDA_ChangeOfUse_Officer_SC_08_TC_04(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyChangeOfUse_SC_08_TC_01 install=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_08_TC_01.class);
		install.clickOnPublicHealthAndEngg();
		install.clickOnChangeOfUse();
		install.enterApplicationNum();
		install.clickOnAction();
		
		ToVerifyChangeOfUse_SC_08_TC_04 withoutaction=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_08_TC_04.class);
		withoutaction.enterComment();
		withoutaction.clickOnSubmit();
		withoutaction.verifyErrorMsg();
	}
	
	@Test(priority=5,dataProvider ="junior engineer",description="verify without comment")
	public void NRDA_ChangeOfUse_Officer_SC_08_TC_05(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyChangeOfUse_SC_08_TC_01 install=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_08_TC_01.class);
		install.clickOnPublicHealthAndEngg();
		install.clickOnChangeOfUse();
		install.enterApplicationNum();
		install.clickOnAction();
		
		ToVerifyChangeOfUse_SC_08_TC_05 withoutcomm=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_08_TC_05.class);
		withoutcomm.clickOnSelectAction();
		withoutcomm.selectActionFinalApproved();
		withoutcomm.clickOnSubmit();
		withoutcomm.verifyErrorMsg();
	}
	
	@Test(priority=6,dataProvider ="junior engineer",description="verify wrong upload docs")
	public void NRDA_ChangeOfUse_Officer_SC_08_TC_06(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyChangeOfUse_SC_08_TC_01 install=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_08_TC_01.class);
		install.clickOnPublicHealthAndEngg();
		install.clickOnChangeOfUse();
		install.enterApplicationNum();
		install.clickOnAction();
		
		ToVerifyChangeOfUse_SC_08_TC_06 invupload=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_08_TC_06.class);
		invupload.clickOnUploadDocument();
		invupload.verifyErrorMsg();
	}
	
	@Test(priority=7,dataProvider ="junior engineer",description="verify submit with valid data")
	public void NRDA_ChangeOfUse_Officer_SC_08_TC_07(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyChangeOfUse_SC_08_TC_01 install=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_08_TC_01.class);
		install.clickOnPublicHealthAndEngg();
		install.clickOnChangeOfUse();
		install.enterApplicationNum();
		install.clickOnAction();
		
		ToVerifyChangeOfUse_SC_08_TC_05 withoutcomm=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_08_TC_05.class);
		withoutcomm.clickOnSelectAction();
		withoutcomm.selectActionFinalApproved();
		withoutcomm.selectName();
		
		ToVerifyChangeOfUse_SC_08_TC_04 withoutaction=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_08_TC_04.class);
		withoutaction.enterComment();
		
		ToVerifyChangeOfUse_SC_08_TC_07 withvaliddatasubmit=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_08_TC_07.class);
		withvaliddatasubmit.clickOnSubmit();
		withvaliddatasubmit.verifyMsg();
	}
	
	
}
