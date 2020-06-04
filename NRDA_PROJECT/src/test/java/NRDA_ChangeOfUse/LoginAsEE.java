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
public class LoginAsEE extends URLPageWSNRDAScript
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
		driver.close();

	}
	@DataProvider(name="Executive engineer")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"Executive Engineer Credentials");
	}
	
	@Test(priority=1,dataProvider ="Executive engineer",description="Home Page")
	public void NRDA_ChangeOfUse_Officer_SC_07_TC_01(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToVerifyChangeOfUse_SC_07_TC_01 dashboard=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_01.class);
		dashboard.verifyDisplayLink();
		dashboard.verifyStatisticsDisplayLink();
		
	}
	
	@Test(priority=2,dataProvider ="Executive engineer",description="verify pending")
	public void NRDA_ChangeOfUse_Officer_SC_07_TC_02(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToVerifyChangeOfUse_SC_07_TC_02 pending=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_02.class);
		pending.clickOnPublicHealthAndEngg();
		pending.clickOnChangeOfUse();
		pending.verifyNavigation();
		pending.clickOnPage1();
		pending.clickOnPage2();
	}
	
	@Test(priority=3,dataProvider ="Executive engineer",description="verify my inbox")
	public void NRDA_ChangeOfUse_Officer_SC_07_TC_03(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToVerifyChangeOfUse_SC_07_TC_03 inbox=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_03.class);
		inbox.clickOnMyInbox();
		inbox.verifyNavigation();
		inbox.clickOnClose();
	}
	
	@Test(priority=4,dataProvider ="Executive engineer",description="verify pagination")
	public void NRDA_ChangeOfUse_Officer_SC_07_TC_04(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToVerifyChangeOfUse_SC_07_TC_02 pending=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_02.class);
		pending.clickOnPublicHealthAndEngg();
		pending.clickOnChangeOfUse();
		
		ToVerifyChangeOfUse_SC_07_TC_04 pagination=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_04.class);
		pagination.clickOnPage2();
		pagination.clickOnPage1();
	}
	
	@Test(priority=5,dataProvider ="Executive engineer",description="verify application error msg")
	public void NRDA_ChangeOfUse_Officer_SC_07_TC_05(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToVerifyChangeOfUse_SC_07_TC_02 pending=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_02.class);
		pending.clickOnPublicHealthAndEngg();
		pending.clickOnChangeOfUse();
		
		ToVerifyChangeOfUse_SC_07_TC_05 apperrormsg=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_05.class);
		apperrormsg.enterApplicationNum();
		apperrormsg.verifyErrorMsg();
	}
	
	@Test(priority=6,dataProvider ="Executive engineer",description="verify application number")
	public void NRDA_ChangeOfUse_Officer_SC_07_TC_06(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToVerifyChangeOfUse_SC_07_TC_02 pending=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_02.class);
		pending.clickOnPublicHealthAndEngg();
		pending.clickOnChangeOfUse();
		
		ToVerifyChangeOfUse_SC_07_TC_06 appno=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_06.class);
		appno.enterApplicationNum();
		appno.verifyDisplayList();
	}
	
	@Test(priority=7,dataProvider ="Executive engineer",description="verify action display list")
	public void NRDA_ChangeOfUse_Officer_SC_07_TC_07(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToVerifyChangeOfUse_SC_07_TC_02 pending=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_02.class);
		pending.clickOnPublicHealthAndEngg();
		pending.clickOnChangeOfUse();
		
		ToVerifyChangeOfUse_SC_07_TC_06 appno=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_06.class);
		appno.enterApplicationNum();
		
		ToVerifyChangeOfUse_SC_07_TC_07 actiondisplay=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_07.class);
		actiondisplay.clickOnAction();
		actiondisplay.verifyDisplayFile();
		actiondisplay.verifyDisplaySubject();
		actiondisplay.verifyDisplayList();
	}
	
	@Test(priority=8,dataProvider ="Executive engineer",description="verify select action without")
	public void NRDA_ChangeOfUse_Officer_SC_07_TC_08(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToVerifyChangeOfUse_SC_07_TC_02 pending=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_02.class);
		pending.clickOnPublicHealthAndEngg();
		pending.clickOnChangeOfUse();
		
		ToVerifyChangeOfUse_SC_07_TC_06 appno=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_06.class);
		appno.enterApplicationNum();
		
		ToVerifyChangeOfUse_SC_07_TC_07 actiondisplay=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_07.class);
		actiondisplay.clickOnAction();
		
		ToVerifyChangeOfUse_SC_07_TC_08 withotaction=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_08.class);
		withotaction.enterComment();
		withotaction.clickOnSubmit();
		withotaction.verifyErrorMsg();
	}
	
	@Test(priority=9,dataProvider ="Executive engineer",description="verify without comment")
	public void NRDA_ChangeOfUse_Officer_SC_07_TC_09(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToVerifyChangeOfUse_SC_07_TC_02 pending=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_02.class);
		pending.clickOnPublicHealthAndEngg();
		pending.clickOnChangeOfUse();
		
		ToVerifyChangeOfUse_SC_07_TC_06 appno=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_06.class);
		appno.enterApplicationNum();
		
		ToVerifyChangeOfUse_SC_07_TC_07 actiondisplay=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_07.class);
		actiondisplay.clickOnAction();
		
		ToVerifyChangeOfUse_SC_07_TC_09 withoutcomment=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_09.class);
		withoutcomment.clickOnSelectAction();
		withoutcomment.selectActionApproved();
		withoutcomment.clickOnSubmit();
		withoutcomment.verifyErrorMsg();
	}
	
	@Test(priority=10,dataProvider ="Executive engineer",description="verify invalid document")
	public void NRDA_ChangeOfUse_Officer_SC_07_TC_10(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToVerifyChangeOfUse_SC_07_TC_02 pending=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_02.class);
		pending.clickOnPublicHealthAndEngg();
		pending.clickOnChangeOfUse();
		
		ToVerifyChangeOfUse_SC_07_TC_06 appno=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_06.class);
		appno.enterApplicationNum();
		
		ToVerifyChangeOfUse_SC_07_TC_07 actiondisplay=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_07.class);
		actiondisplay.clickOnAction();
		
		ToVerifyChangeOfUse_SC_07_TC_10 invalidoc=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_10.class);
		invalidoc.clickOnUploadDocument();
		invalidoc.verifyErrorMsg();
	}
	
	@Test(priority=11,dataProvider ="Executive engineer",description="verify file number")
	public void NRDA_ChangeOfUse_Officer_SC_07_TC_11(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToVerifyChangeOfUse_SC_07_TC_02 pending=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_02.class);
		pending.clickOnPublicHealthAndEngg();
		pending.clickOnChangeOfUse();
		
		ToVerifyChangeOfUse_SC_07_TC_06 appno=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_06.class);
		appno.enterApplicationNum();
		
		ToVerifyChangeOfUse_SC_07_TC_07 actiondisplay=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_07.class);
		actiondisplay.clickOnAction();
		
		ToVerifyChangeOfUse_SC_07_TC_11 file=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_11.class);
		file.verifyDisplayFile();
	}
	
	@Test(priority=12,dataProvider ="Executive engineer",description="verify subject")
	public void NRDA_ChangeOfUse_Officer_SC_07_TC_12(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToVerifyChangeOfUse_SC_07_TC_02 pending=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_02.class);
		pending.clickOnPublicHealthAndEngg();
		pending.clickOnChangeOfUse();
		
		ToVerifyChangeOfUse_SC_07_TC_06 appno=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_06.class);
		appno.enterApplicationNum();
		
		ToVerifyChangeOfUse_SC_07_TC_07 actiondisplay=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_07.class);
		actiondisplay.clickOnAction();
		
		ToVerifyChangeOfUse_SC_07_TC_12 subject=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_12.class);
		subject.verifyDisplaySubject();
	}
	
	@Test(priority=13,dataProvider ="Executive engineer",description="verify save as draft")
	public void NRDA_ChangeOfUse_Officer_SC_07_TC_16(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToVerifyChangeOfUse_SC_07_TC_02 pending=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_02.class);
		pending.clickOnPublicHealthAndEngg();
		pending.clickOnChangeOfUse();
		
		ToVerifyChangeOfUse_SC_07_TC_06 appno=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_06.class);
		appno.enterApplicationNum();
		
		ToVerifyChangeOfUse_SC_07_TC_07 actiondisplay=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_07.class);
		actiondisplay.clickOnAction();
		
		ToVerifyChangeOfUse_SC_07_TC_16 saveasdraft=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_16.class);
		saveasdraft.clickOnSaveAsDraft();
		saveasdraft.verifyMsg();
	}
	
	@Test(priority=14,dataProvider ="Executive engineer",description="verify remove draft")
	public void NRDA_ChangeOfUse_Officer_SC_07_TC_17(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToVerifyChangeOfUse_SC_07_TC_02 pending=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_02.class);
		pending.clickOnPublicHealthAndEngg();
		pending.clickOnChangeOfUse();
		
		ToVerifyChangeOfUse_SC_07_TC_06 appno=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_06.class);
		appno.enterApplicationNum();
		
		ToVerifyChangeOfUse_SC_07_TC_07 actiondisplay=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_07.class);
		actiondisplay.clickOnAction();
		
		ToVerifyChangeOfUse_SC_07_TC_17 removedraft=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_17.class);
		removedraft.clickOnRemoveDraft();
		removedraft.verifyMsg();
	}
	
	@Test(priority=15,dataProvider ="Executive engineer",description="verify close")
	public void NRDA_ChangeOfUse_Officer_SC_07_TC_18(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToVerifyChangeOfUse_SC_07_TC_02 pending=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_02.class);
		pending.clickOnPublicHealthAndEngg();
		pending.clickOnChangeOfUse();
		
		ToVerifyChangeOfUse_SC_07_TC_06 appno=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_06.class);
		appno.enterApplicationNum();
		
		ToVerifyChangeOfUse_SC_07_TC_07 actiondisplay=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_07.class);
		actiondisplay.clickOnAction();
		
		ToVerifyChangeOfUse_SC_07_TC_18 close=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_18.class);
		close.clickOnClose();
	}
	
	@Test(priority=16,dataProvider ="Executive engineer",description="verify submit with valid data")
	public void NRDA_ChangeOfUse_Officer_SC_07_TC_13(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToVerifyChangeOfUse_SC_07_TC_02 pending=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_02.class);
		pending.clickOnPublicHealthAndEngg();
		pending.clickOnChangeOfUse();
		
		ToVerifyChangeOfUse_SC_07_TC_06 appno=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_06.class);
		appno.enterApplicationNum();
		
		ToVerifyChangeOfUse_SC_07_TC_07 actiondisplay=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_07.class);
		actiondisplay.clickOnAction();
		
		ToVerifyChangeOfUse_SC_07_TC_08 withotaction=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_08.class);
		withotaction.enterComment();
		
		ToVerifyChangeOfUse_SC_07_TC_09 withoutcomment=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_09.class);
		withoutcomment.clickOnSelectAction();
		withoutcomment.selectActionApproved();
		
		ToVerifyChangeOfUse_SC_07_TC_13 submitvaliddata=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_07_TC_13.class);
		submitvaliddata.clickOnSubmit();
		submitvaliddata.verifyMsg();
		
	}

}
