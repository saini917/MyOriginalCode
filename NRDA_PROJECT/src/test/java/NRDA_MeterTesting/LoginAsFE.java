package NRDA_MeterTesting;

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

	@Test(priority=1,dataProvider ="Field engineer",description="verify login")
	public void NRDA_MeterTesting_SC_03_TC_01(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);
	}

	@Test(priority=2,dataProvider ="Field engineer",description="verify dashboard")
	public void NRDA_MeterTesting_SC_03_TC_02(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);

		ToVerifyMeterTesting_SC_03_TC_02 homedisplay=PageFactory.initElements(driver, ToVerifyMeterTesting_SC_03_TC_02.class);
		homedisplay.verifyDisplayLink();
		homedisplay.verifyStatisticsDisplayLink();
	}

	@Test(priority=3,dataProvider ="Field engineer",description="verify water meter testing page")
	public void NRDA_MeterTesting_SC_03_TC_03(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);

		ToVerifyMeterTesting_SC_03_TC_03 action=PageFactory.initElements(driver, ToVerifyMeterTesting_SC_03_TC_03.class);
		action.clickOnPublicHealth();
		action.clickOnWatermeterTesting();
		action.verifyDisplayLink();
	}

	@Test(priority=4,dataProvider ="Field engineer",description="verify valid application number")
	public void NRDA_MeterTesting_SC_03_TC_04(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);

		ToVerifyMeterTesting_SC_03_TC_03 action=PageFactory.initElements(driver, ToVerifyMeterTesting_SC_03_TC_03.class);
		action.clickOnPublicHealth();
		action.clickOnWatermeterTesting();

		ToVerifyMeterTesting_SC_03_TC_04 valid=PageFactory.initElements(driver, ToVerifyMeterTesting_SC_03_TC_04.class);
		valid.verifyValidAppSearch();
	}

	@Test(priority=5,dataProvider ="Field engineer",description="verify Invalid application number")
	public void NRDA_MeterTesting_SC_03_TC_05(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);

		ToVerifyMeterTesting_SC_03_TC_03 action=PageFactory.initElements(driver, ToVerifyMeterTesting_SC_03_TC_03.class);
		action.clickOnPublicHealth();
		action.clickOnWatermeterTesting();

		ToVerifyMeterTesting_SC_03_TC_05 invalid=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_03_TC_05.class);
		invalid.verifyInvalidAppSearch();
		invalid.verifyErrorMessage();
	}
	
	@Test(priority=6,dataProvider ="Field engineer",description="verify action")
	public void NRDA_MeterTesting_SC_03_TC_06(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);

		ToVerifyMeterTesting_SC_03_TC_03 action=PageFactory.initElements(driver, ToVerifyMeterTesting_SC_03_TC_03.class);
		action.clickOnPublicHealth();
		action.clickOnWatermeterTesting();

		ToVerifyMeterTesting_SC_03_TC_04 valid=PageFactory.initElements(driver, ToVerifyMeterTesting_SC_03_TC_04.class);
		valid.verifyValidAppSearch();
		
		ToVerifyMeterTesting_SC_03_TC_06 action1=PageFactory.initElements(driver, ToVerifyMeterTesting_SC_03_TC_06.class);
		action1.clickOnAction();
		action1.verifySelectAction();
		action1.verifyMeterStatus();
		action1.verifyDisplayLink();
	}
	
	@Test(priority=7,dataProvider ="Field engineer",description="verify submit without data")
	public void NRDA_MeterTesting_SC_03_TC_07(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);

		ToVerifyMeterTesting_SC_03_TC_03 action=PageFactory.initElements(driver, ToVerifyMeterTesting_SC_03_TC_03.class);
		action.clickOnPublicHealth();
		action.clickOnWatermeterTesting();

		ToVerifyMeterTesting_SC_03_TC_04 valid=PageFactory.initElements(driver, ToVerifyMeterTesting_SC_03_TC_04.class);
		valid.verifyValidAppSearch();
		
		ToVerifyMeterTesting_SC_03_TC_06 action1=PageFactory.initElements(driver, ToVerifyMeterTesting_SC_03_TC_06.class);
		action1.clickOnAction();
		

		ToVerifyMeterTesting_SC_03_TC_07 sub=PageFactory.initElements(driver, ToVerifyMeterTesting_SC_03_TC_07.class);
		sub.enterComment();
		sub.clickOnSubmit();
		sub.verifyErrorMessage();
	}
	
	@Test(priority=8,dataProvider ="Field engineer",description="verify submit without data")
	public void NRDA_MeterTesting_SC_03_TC_08(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);

		ToVerifyMeterTesting_SC_03_TC_03 action=PageFactory.initElements(driver, ToVerifyMeterTesting_SC_03_TC_03.class);
		action.clickOnPublicHealth();
		action.clickOnWatermeterTesting();

		ToVerifyMeterTesting_SC_03_TC_04 valid=PageFactory.initElements(driver, ToVerifyMeterTesting_SC_03_TC_04.class);
		valid.verifyValidAppSearch();
		
		ToVerifyMeterTesting_SC_03_TC_06 action1=PageFactory.initElements(driver, ToVerifyMeterTesting_SC_03_TC_06.class);
		action1.clickOnAction();
		
		ToVerifyMeterTesting_SC_03_TC_08 comment=PageFactory.initElements(driver, ToVerifyMeterTesting_SC_03_TC_08.class);
		comment.selectVerifyAction();
		comment.selectMeterStatusAction();
		comment.clickOnSubmit();
		comment.verifyErrorMessage();
	}
	
	@Test(priority=9,dataProvider ="Field engineer",description="verify close")
	public void NRDA_MeterTesting_SC_03_TC_11(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);

		ToVerifyMeterTesting_SC_03_TC_03 action=PageFactory.initElements(driver, ToVerifyMeterTesting_SC_03_TC_03.class);
		action.clickOnPublicHealth();
		action.clickOnWatermeterTesting();

		ToVerifyMeterTesting_SC_03_TC_04 valid=PageFactory.initElements(driver, ToVerifyMeterTesting_SC_03_TC_04.class);
		valid.verifyValidAppSearch();
		
		ToVerifyMeterTesting_SC_03_TC_06 action1=PageFactory.initElements(driver, ToVerifyMeterTesting_SC_03_TC_06.class);
		action1.clickOnAction();
		
		ToVerifyMeterTesting_SC_03_TC_07 sub=PageFactory.initElements(driver, ToVerifyMeterTesting_SC_03_TC_07.class);
		sub.enterComment();
		
		ToVerifyMeterTesting_SC_03_TC_08 comment=PageFactory.initElements(driver, ToVerifyMeterTesting_SC_03_TC_08.class);
		comment.selectVerifyAction();
		comment.selectMeterStatusAction();
		
		ToVerifyMeterTesting_SC_03_TC_11 close=PageFactory.initElements(driver, ToVerifyMeterTesting_SC_03_TC_11.class);
		close.clickOnClose();
	}
	

	@Test(priority=10,dataProvider ="Field engineer",description="verify save as draft")
	public void NRDA_MeterTesting_SC_03_TC_12(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);

		ToVerifyMeterTesting_SC_03_TC_03 action=PageFactory.initElements(driver, ToVerifyMeterTesting_SC_03_TC_03.class);
		action.clickOnPublicHealth();
		action.clickOnWatermeterTesting();

		ToVerifyMeterTesting_SC_03_TC_04 valid=PageFactory.initElements(driver, ToVerifyMeterTesting_SC_03_TC_04.class);
		valid.verifyValidAppSearch();
		
		ToVerifyMeterTesting_SC_03_TC_06 action1=PageFactory.initElements(driver, ToVerifyMeterTesting_SC_03_TC_06.class);
		action1.clickOnAction();
		
		ToVerifyMeterTesting_SC_03_TC_07 sub=PageFactory.initElements(driver, ToVerifyMeterTesting_SC_03_TC_07.class);
		sub.enterComment();
		
		ToVerifyMeterTesting_SC_03_TC_08 comment=PageFactory.initElements(driver, ToVerifyMeterTesting_SC_03_TC_08.class);
		comment.selectVerifyAction();
		comment.selectMeterStatusAction();
		
		ToVerifyMeterTesting_SC_03_TC_12 draft=PageFactory.initElements(driver, ToVerifyMeterTesting_SC_03_TC_12.class);
		draft.clickOnSaveAsDraft();
		draft.verifyMessage();
	}
	

	@Test(priority=11,dataProvider ="Field engineer",description="verify remove draft")
	public void NRDA_MeterTesting_SC_03_TC_13(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);

		ToVerifyMeterTesting_SC_03_TC_03 action=PageFactory.initElements(driver, ToVerifyMeterTesting_SC_03_TC_03.class);
		action.clickOnPublicHealth();
		action.clickOnWatermeterTesting();

		ToVerifyMeterTesting_SC_03_TC_04 valid=PageFactory.initElements(driver, ToVerifyMeterTesting_SC_03_TC_04.class);
		valid.verifyValidAppSearch();
		
		ToVerifyMeterTesting_SC_03_TC_06 action1=PageFactory.initElements(driver, ToVerifyMeterTesting_SC_03_TC_06.class);
		action1.clickOnAction();
		
		ToVerifyMeterTesting_SC_03_TC_07 sub=PageFactory.initElements(driver, ToVerifyMeterTesting_SC_03_TC_07.class);
		sub.enterComment();
		
		ToVerifyMeterTesting_SC_03_TC_08 comment=PageFactory.initElements(driver, ToVerifyMeterTesting_SC_03_TC_08.class);
		comment.selectVerifyAction();
		comment.selectMeterStatusAction();
		
		ToVerifyMeterTesting_SC_03_TC_13 removedraft=PageFactory.initElements(driver, ToVerifyMeterTesting_SC_03_TC_13.class);
		removedraft.clickOnRemoveDraft();
		removedraft.verifyErrorMessage();
	}
	
	@Test(priority=12,dataProvider ="Field engineer",description="verify submit with valid data")
	public void NRDA_MeterTesting_SC_03_TC_09(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);

		ToVerifyMeterTesting_SC_03_TC_03 action=PageFactory.initElements(driver, ToVerifyMeterTesting_SC_03_TC_03.class);
		action.clickOnPublicHealth();
		action.clickOnWatermeterTesting();

		ToVerifyMeterTesting_SC_03_TC_04 valid=PageFactory.initElements(driver, ToVerifyMeterTesting_SC_03_TC_04.class);
		valid.verifyValidAppSearch();
		
		ToVerifyMeterTesting_SC_03_TC_06 action1=PageFactory.initElements(driver, ToVerifyMeterTesting_SC_03_TC_06.class);
		action1.clickOnAction();
		
		ToVerifyMeterTesting_SC_03_TC_08 comment=PageFactory.initElements(driver, ToVerifyMeterTesting_SC_03_TC_08.class);
		comment.selectVerifyAction();
		comment.selectMeterStatusAction();
		
		ToVerifyMeterTesting_SC_03_TC_07 sub=PageFactory.initElements(driver, ToVerifyMeterTesting_SC_03_TC_07.class);
		sub.enterComment();
		
		ToVerifyMeterTesting_SC_03_TC_09 submit=PageFactory.initElements(driver, ToVerifyMeterTesting_SC_03_TC_09.class);
		submit.clickOnSubmit();
		submit.verifyMessage();
		
	}
		
					// Again Verify FE fo repaired/replaced
		
		
		@Test(priority=1,dataProvider ="Field engineer",description="verify action display list")
		public void NRDA_MeterTesting_SC_05_TC_01(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsFE(username, password);
			
			ToVerifyMeterTesting_SC_05_TC_01 act=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_05_TC_01.class);
			act.clickOnPublicHealth();
			act.clickOnWatermeterTesting();
			act.verifyValidAppSearch();
			act.clickOnAction();
			act.verifySelectAction();
			act.verifyDisplayLink();
		}
		
		@Test(priority=6,dataProvider ="Field engineer",description="verify action display list")
		public void NRDA_MeterTesting_SC_05_TC_02(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsFE(username, password);
			
			ToVerifyMeterTesting_SC_05_TC_01 act=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_05_TC_01.class);
			act.clickOnPublicHealth();
			act.clickOnWatermeterTesting();
			act.verifyValidAppSearch();
			act.clickOnAction();
			
			ToVerifyMeterTesting_SC_05_TC_02 submit=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_05_TC_02.class);
			submit.SelectAction();
			submit.selectMeterStatus();
			submit.enterComment();
			submit.clickOnSubmit();
			submit.verifyMessage();
		}
		
		@Test(priority=2,dataProvider ="Field engineer",description="verify submit without data")
		public void NRDA_MeterTesting_SC_05_TC_04(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsFE(username, password);
			
			ToVerifyMeterTesting_SC_05_TC_01 act=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_05_TC_01.class);
			act.clickOnPublicHealth();
			act.clickOnWatermeterTesting();
			act.verifyValidAppSearch();
			act.clickOnAction();
			
			ToVerifyMeterTesting_SC_05_TC_02 submit=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_05_TC_02.class);
			submit.SelectAction();
			submit.enterComment();
			submit.clickOnSubmit();
			
			ToVerifyMeterTesting_SC_05_TC_04 msg=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_05_TC_04.class);
			msg.verifyErrorMessage();
		}
		
		@Test(priority=3,dataProvider ="Field engineer",description="verify close")
		public void NRDA_MeterTesting_SC_05_TC_05(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsFE(username, password);
			
			ToVerifyMeterTesting_SC_05_TC_01 act=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_05_TC_01.class);
			act.clickOnPublicHealth();
			act.clickOnWatermeterTesting();
			act.verifyValidAppSearch();
			act.clickOnAction();
			
			ToVerifyMeterTesting_SC_05_TC_02 submit=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_05_TC_02.class);
			submit.SelectAction();
			submit.enterComment();
			
			ToVerifyMeterTesting_SC_05_TC_05 close=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_05_TC_05.class);
			close.clickOnClose();
		}
		
		@Test(priority=4,dataProvider ="Field engineer",description="verify save as draft")
		public void NRDA_MeterTesting_SC_05_TC_06(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsFE(username, password);
			
			ToVerifyMeterTesting_SC_05_TC_01 act=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_05_TC_01.class);
			act.clickOnPublicHealth();
			act.clickOnWatermeterTesting();
			act.verifyValidAppSearch();
			act.clickOnAction();
			
			ToVerifyMeterTesting_SC_05_TC_02 submit=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_05_TC_02.class);
			submit.SelectAction();
			submit.enterComment();
			
			ToVerifyMeterTesting_SC_05_TC_06 draftsave=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_05_TC_06.class);
			draftsave.clickOnSaveAsDraft();
			draftsave.verifyMessage();
		}
		
		@Test(priority=5,dataProvider ="Field engineer",description="verify remove draft")
		public void NRDA_MeterTesting_SC_05_TC_07(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsFE(username, password);
			
			ToVerifyMeterTesting_SC_05_TC_01 act=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_05_TC_01.class);
			act.clickOnPublicHealth();
			act.clickOnWatermeterTesting();
			act.verifyValidAppSearch();
			act.clickOnAction();
			
			ToVerifyMeterTesting_SC_05_TC_02 submit=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_05_TC_02.class);
			submit.SelectAction();
			submit.enterComment();
			
			ToVerifyMeterTesting_SC_05_TC_07 removedraft=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_05_TC_07.class);
			removedraft.clickOnRemoveDraft();
			removedraft.verifyErrorMessage();
		}
}
