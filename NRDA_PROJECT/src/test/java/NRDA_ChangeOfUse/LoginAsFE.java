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
public class LoginAsFE extends URLPageWSNRDAScript
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
		waitForSomeTime();
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		driver.close();
		waitForSomeTime();
	}
	@DataProvider(name="Field engineer")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"Field Engineer Credentials");
	}


	@Test(priority=1,dataProvider ="Field engineer",description="verify dashboard")
	public void NRDA_ChangeOfUse_Officer_SC_05_TC_01(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);
		
		ToVerifyChangeOfUse_SC_05_TC_01 display=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_05_TC_01.class);
		display.verifyDisplayLink();
		display.verifyStatisticsDisplayLink();
	}
	
	@Test(priority=2,dataProvider ="Field engineer",description="verify pending")
	public void NRDA_ChangeOfUse_Officer_SC_05_TC_02(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);
		
		ToVerifyChangeOfUse_SC_05_TC_02 pending=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_05_TC_02.class);
		 pending.clickOnPublicHealthAndEngg();
		 pending.clickOnChangeOfUse();
		 pending.verifyNavigation();
		 pending.clickOnPage1();
		 pending.clickOnPage2();
	}
	
	@Test(priority=3,dataProvider ="Field engineer",description="verify action")
	public void NRDA_ChangeOfUse_Officer_SC_05_TC_03(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);
		
		ToVerifyChangeOfUse_SC_05_TC_02 pending=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_05_TC_02.class);
		 pending.clickOnPublicHealthAndEngg();
		 pending.clickOnChangeOfUse();
		 
		 ToVerifyChangeOfUse_SC_05_TC_03 action=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_05_TC_03.class);
		 action.enterApplicationNum();
		 action.clickOnAction();
		 action.verifyDisplayList();
	}
	
	@Test(priority=4,dataProvider ="Field engineer",description="verify display file number")
	public void NRDA_ChangeOfUse_Officer_SC_05_TC_04(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);
		
		ToVerifyChangeOfUse_SC_05_TC_02 pending=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_05_TC_02.class);
		 pending.clickOnPublicHealthAndEngg();
		 pending.clickOnChangeOfUse();
		 
		 ToVerifyChangeOfUse_SC_05_TC_03 action=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_05_TC_03.class);
		 action.enterApplicationNum();
		 action.clickOnAction();
		 
		 ToVerifyChangeOfUse_SC_05_TC_04 file=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_05_TC_04.class);
		 file.verifyDisplayFile();
	}
	
	@Test(priority=5,dataProvider ="Field engineer",description="verify display subject")
	public void NRDA_ChangeOfUse_Officer_SC_05_TC_05(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);
		
		ToVerifyChangeOfUse_SC_05_TC_02 pending=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_05_TC_02.class);
		 pending.clickOnPublicHealthAndEngg();
		 pending.clickOnChangeOfUse();
		 
		 ToVerifyChangeOfUse_SC_05_TC_03 action=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_05_TC_03.class);
		 action.enterApplicationNum();
		 action.clickOnAction();
		 
		 ToVerifyChangeOfUse_SC_05_TC_05 sub=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_05_TC_05.class);
		 sub.verifyDisplaySubject();
	}
	
	@Test(priority=6,dataProvider ="Field engineer",description="verify action error msg")
	public void NRDA_ChangeOfUse_Officer_SC_05_TC_06(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);
		
		ToVerifyChangeOfUse_SC_05_TC_02 pending=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_05_TC_02.class);
		 pending.clickOnPublicHealthAndEngg();
		 pending.clickOnChangeOfUse();
		 
		 ToVerifyChangeOfUse_SC_05_TC_03 action=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_05_TC_03.class);
		 action.enterApplicationNum();
		 action.clickOnAction();
		 
		 ToVerifyChangeOfUse_SC_05_TC_06 actionmsg=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_05_TC_06.class);
		 actionmsg.enterComment();
		 actionmsg.clickOnSubmit();
		 actionmsg.verifyErrorMsg();
	}
	
	@Test(priority=7,dataProvider ="Field engineer",description="verify comment error msg")
	public void NRDA_ChangeOfUse_Officer_SC_05_TC_07(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);
		
		ToVerifyChangeOfUse_SC_05_TC_02 pending=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_05_TC_02.class);
		 pending.clickOnPublicHealthAndEngg();
		 pending.clickOnChangeOfUse();
		 
		 ToVerifyChangeOfUse_SC_05_TC_03 action=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_05_TC_03.class);
		 action.enterApplicationNum();
		 action.clickOnAction();
		 
		 ToVerifyChangeOfUse_SC_05_TC_07 commentmsg=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_05_TC_07.class);
		 commentmsg.clickOnSelectAction();
		 commentmsg.selectActionVerify();
		 commentmsg.clickOnSubmit();
		 commentmsg.verifyErrorMsg();
	}
	
	@Test(priority=8,dataProvider ="Field engineer",description="verify close")
	public void NRDA_ChangeOfUse_Officer_SC_05_TC_10(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);
		
		ToVerifyChangeOfUse_SC_05_TC_02 pending=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_05_TC_02.class);
		 pending.clickOnPublicHealthAndEngg();
		 pending.clickOnChangeOfUse();
		 
		 ToVerifyChangeOfUse_SC_05_TC_03 action=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_05_TC_03.class);
		 action.enterApplicationNum();
		 action.clickOnAction();
		 
		 ToVerifyChangeOfUse_SC_05_TC_10 close=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_05_TC_10.class);
		 close.clickOnClose();
	}
	
	@Test(priority=9,dataProvider ="Field engineer",description="verify submit")
	public void NRDA_ChangeOfUse_Officer_SC_05_TC_08(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);
		
		ToVerifyChangeOfUse_SC_05_TC_02 pending=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_05_TC_02.class);
		 pending.clickOnPublicHealthAndEngg();
		 pending.clickOnChangeOfUse();
		 
		 ToVerifyChangeOfUse_SC_05_TC_03 action=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_05_TC_03.class);
		 action.enterApplicationNum();
		 action.clickOnAction();
		 
		 ToVerifyChangeOfUse_SC_05_TC_06 actionmsg=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_05_TC_06.class);
		 actionmsg.enterComment();
		 
		 ToVerifyChangeOfUse_SC_05_TC_07 commentmsg=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_05_TC_07.class);
		 commentmsg.clickOnSelectAction();
		 commentmsg.selectActionVerify();
		 commentmsg.enterComment();
		 commentmsg.clickOnSubmit();
		 
		 ToVerifyChangeOfUse_SC_05_TC_08 submit=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_05_TC_08.class);
		 submit.verifyMsg();
	}
	
	
	
									// Login as FE for Final Approval
	
	@Test(priority=1,dataProvider ="Field engineer",description="verify action display")
	public void NRDA_ChangeOfUse_Officer_SC_09_TC_01(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);
		
		ToVerifyChangeOfUse_SC_09_TC_01 displayaction=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_09_TC_01.class);
		displayaction.clickOnPublicHealthAndEngg();
		displayaction.clickOnChangeOfUse();
		displayaction.enterApplicationNum();
		displayaction.clickOnAction();
		displayaction.verifyDisplayList();
	}
	
	@Test(priority=2,dataProvider ="Field engineer",description="verify file view")
	public void NRDA_ChangeOfUse_Officer_SC_09_TC_02(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);
		
		ToVerifyChangeOfUse_SC_09_TC_01 displayaction=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_09_TC_01.class);
		displayaction.clickOnPublicHealthAndEngg();
		displayaction.clickOnChangeOfUse();
		displayaction.enterApplicationNum();
		displayaction.clickOnAction();
		
		ToVerifyChangeOfUse_SC_09_TC_02 filev=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_09_TC_02.class);
		filev.verifyDisplayFile();
	}
	
	@Test(priority=3,dataProvider ="Field engineer",description="verify subject view")
	public void NRDA_ChangeOfUse_Officer_SC_09_TC_03(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);
		
		ToVerifyChangeOfUse_SC_09_TC_01 displayaction=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_09_TC_01.class);
		displayaction.clickOnPublicHealthAndEngg();
		displayaction.clickOnChangeOfUse();
		displayaction.enterApplicationNum();
		displayaction.clickOnAction();
		
		ToVerifyChangeOfUse_SC_09_TC_03 subjectv=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_09_TC_03.class);
		subjectv.verifyDisplaySubject();
	}
	
	@Test(priority=4,dataProvider ="Field engineer",description="verify without select action")
	public void NRDA_ChangeOfUse_Officer_SC_09_TC_04(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);
		
		ToVerifyChangeOfUse_SC_09_TC_01 displayaction=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_09_TC_01.class);
		displayaction.clickOnPublicHealthAndEngg();
		displayaction.clickOnChangeOfUse();
		displayaction.enterApplicationNum();
		displayaction.clickOnAction();
		
		ToVerifyChangeOfUse_SC_09_TC_04 wsaction=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_09_TC_04.class);
		wsaction.enterComment();
		wsaction.clickOnSubmit();
		wsaction.verifyErrorMsg();
	}
	
	@Test(priority=5,dataProvider ="Field engineer",description="verify without comment")
	public void NRDA_ChangeOfUse_Officer_SC_09_TC_05(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);
		
		ToVerifyChangeOfUse_SC_09_TC_01 displayaction=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_09_TC_01.class);
		displayaction.clickOnPublicHealthAndEngg();
		displayaction.clickOnChangeOfUse();
		displayaction.enterApplicationNum();
		displayaction.clickOnAction();
		
		ToVerifyChangeOfUse_SC_09_TC_05 wecomment=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_09_TC_05.class);
		wecomment.clickOnSelectAction();
		wecomment.selectActionFinalApproved();
		wecomment.clickOnSubmit();
		wecomment.verifyErrorMsg();
	}
	
	@Test(priority=6,dataProvider ="Field engineer",description="verify upload wrong ext docs")
	public void NRDA_ChangeOfUse_Officer_SC_09_TC_06(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);
		
		ToVerifyChangeOfUse_SC_09_TC_01 displayaction=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_09_TC_01.class);
		displayaction.clickOnPublicHealthAndEngg();
		displayaction.clickOnChangeOfUse();
		displayaction.enterApplicationNum();
		displayaction.clickOnAction();
		
		ToVerifyChangeOfUse_SC_09_TC_06 updocs=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_09_TC_06.class);
		updocs.clickOnUploadDocument();
		updocs.verifyErrorMsg();
	}
	
	@Test(priority=7,dataProvider ="Field engineer",description="verify close")
	public void NRDA_ChangeOfUse_Officer_SC_09_TC_08(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);
		
		ToVerifyChangeOfUse_SC_09_TC_01 displayaction=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_09_TC_01.class);
		displayaction.clickOnPublicHealthAndEngg();
		displayaction.clickOnChangeOfUse();
		displayaction.enterApplicationNum();
		displayaction.clickOnAction();
		
		ToVerifyChangeOfUse_SC_09_TC_08 closebtn=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_09_TC_08.class);
		closebtn.clickOnClose();
	}
	
	@Test(priority=8,dataProvider ="Field engineer",description="verify submit")
	public void NRDA_ChangeOfUse_Officer_SC_09_TC_07(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);
		
		ToVerifyChangeOfUse_SC_09_TC_01 displayaction=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_09_TC_01.class);
		displayaction.clickOnPublicHealthAndEngg();
		displayaction.clickOnChangeOfUse();
		displayaction.enterApplicationNum();
		displayaction.clickOnAction();
		
		ToVerifyChangeOfUse_SC_09_TC_05 wecomment=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_09_TC_05.class);
		wecomment.clickOnSelectAction();
		wecomment.selectActionFinalApproved();
		
		ToVerifyChangeOfUse_SC_09_TC_04 wsaction=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_09_TC_04.class);
		wsaction.enterComment();
		
		ToVerifyChangeOfUse_SC_09_TC_07 vsubmit=PageFactory.initElements(driver,ToVerifyChangeOfUse_SC_09_TC_07.class);
		vsubmit.clickOnSubmit();
		vsubmit.verifyMsg();
	}

}
