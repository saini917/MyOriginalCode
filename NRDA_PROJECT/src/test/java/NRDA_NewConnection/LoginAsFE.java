package NRDA_NewConnection;

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
	public void NRDA_Sewerage_New_Connection_SC_09_TC_01(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);
	}


	@Test(priority=2,description="verify home link display",dataProvider ="Field engineer")
	public void NRDA_Sewerage_New_Connection_SC_09_TC_02(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);

		ToVerifyConnectionDetailsTab_SC_09_TC_02 display=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_02.class);
		display.clickOnHome();
		display.verifyDisplayLink();
		display.verifyStatisticsDisplayLink();
	}

	@Test(priority=3,description="verify public health and engineering display list",dataProvider ="Field engineer")
	public void NRDA_Sewerage_New_Connection_SC_09_TC_03(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);

		ToVerifyConnectionDetailsTab_SC_09_TC_03 display=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_03.class);
		display.clickOnPublicHealthAndEng();
		display.verifyDisplayLink();
	}

	@Test(priority=4,description="verify pending",dataProvider ="Field engineer")
	public void NRDA_Sewerage_New_Connection_SC_09_TC_04(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);
		
		ToVerifyConnectionDetailsTab_SC_09_TC_03 display=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_03.class);
		display.clickOnPublicHealthAndEng();

		ToVerifyConnectionDetailsTab_SC_09_TC_04 pending=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_04.class);
		pending.clickOnWaterAndSewerage();
	}

	@Test(priority=5,description="verify my inbox record per page",dataProvider ="Field engineer")
	public void NRDA_Sewerage_New_Connection_SC_09_TC_05(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);

		ToVerifyConnectionDetailsTab_SC_09_TC_05 record=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_05.class);
		record.clickOnMyInbox();
		record.verifyDisplay();
		record.clickOnClosePopUp();
	}

	@Test(priority=6,description="verify other link",dataProvider ="Field engineer")
	public void NRDA_Sewerage_New_Connection_SC_09_TC_06(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);

		ToVerifyConnectionDetailsTab_SC_09_TC_06 other=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_06.class);
		other.clickOnOther();
		other.clickOnClosePopUp();
	}

	@Test(priority=7,description="verify pagination",dataProvider ="Field engineer")
	public void NRDA_Sewerage_New_Connection_SC_09_TC_07(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);
		
		ToVerifyConnectionDetailsTab_SC_09_TC_06 other=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_06.class);
		other.clickOnOther();

		ToVerifyConnectionDetailsTab_SC_09_TC_07 pagination=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_07.class);
		pagination.clickOnPage2();
		pagination.clickOnPage1();
		pagination.clickOnClosePopUp();
	}

	@Test(priority=8,description="Invalid Application number",dataProvider ="Field engineer")
	public void NRDA_Sewerage_New_Connection_SC_09_TC_08(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);
		
		ToVerifyConnectionDetailsTab_SC_09_TC_03 display=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_03.class);
		display.clickOnPublicHealthAndEng();
		
		ToVerifyConnectionDetailsTab_SC_09_TC_04 pending=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_04.class);
		pending.clickOnWaterAndSewerage();

		ToVerifyConnectionDetailsTab_SC_09_TC_08 invalid=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_08.class);
		invalid.enterApplicationNum();
		invalid.verifyErrorMsg();
	}

	@Test(priority=9,description="invalid pending days",dataProvider ="Field engineer")
	public void NRDA_Sewerage_New_Connection_SC_09_TC_09(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);
		
		ToVerifyConnectionDetailsTab_SC_09_TC_03 display=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_03.class);
		display.clickOnPublicHealthAndEng();

		ToVerifyConnectionDetailsTab_SC_09_TC_04 pending=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_04.class);
		pending.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_09_TC_09 invalid=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_09.class);
		invalid.enterInvalidPendingDays();
		invalid.verifyErrorMsg();
	}

	@Test(priority=10,description="valid Application number",dataProvider ="Field engineer")
	public void NRDA_Sewerage_New_Connection_SC_09_TC_10(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);
		
		ToVerifyConnectionDetailsTab_SC_09_TC_03 display=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_03.class);
		display.clickOnPublicHealthAndEng();

		ToVerifyConnectionDetailsTab_SC_09_TC_04 pending=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_04.class);
		pending.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_09_TC_10 appnum=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_10.class);
		 appnum.enterApplicationNum();
	}
	
	@Test(priority=11,description="verify action display",dataProvider ="Field engineer")
	public void NRDA_Sewerage_New_Connection_SC_09_TC_11(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);
		
		ToVerifyConnectionDetailsTab_SC_09_TC_03 display=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_03.class);
		display.clickOnPublicHealthAndEng();

		ToVerifyConnectionDetailsTab_SC_09_TC_04 pending=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_04.class);
		pending.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_09_TC_10 appnum=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_10.class);
		appnum.enterApplicationNum();
		
		ToVerifyConnectionDetailsTab_SC_09_TC_11 action=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_11.class);
		action.clickOnActionImg();
		action.verifyDisplayList();
	}

	@Test(priority=12,description="verify map ",dataProvider ="Field engineer")
	public void NRDA_Sewerage_New_Connection_SC_09_TC_12(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);

		ToVerifyConnectionDetailsTab_SC_09_TC_03 display=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_03.class);
		display.clickOnPublicHealthAndEng();
		
		ToVerifyConnectionDetailsTab_SC_09_TC_04 pending=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_04.class);
		pending.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_09_TC_10 appnum=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_10.class);
		appnum.enterApplicationNum();
		
		ToVerifyConnectionDetailsTab_SC_09_TC_11 action=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_11.class);
		action.clickOnActionImg();
		
		ToVerifyConnectionDetailsTab_SC_09_TC_12 map=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_12.class);
		map.clickOnMap();
	}
	
	@Test(priority=13,description="Blank Action ",dataProvider ="Field engineer")
	public void NRDA_Sewerage_New_Connection_SC_09_TC_13(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);
		
		ToVerifyConnectionDetailsTab_SC_09_TC_03 display=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_03.class);
		display.clickOnPublicHealthAndEng();

		ToVerifyConnectionDetailsTab_SC_09_TC_04 pending=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_04.class);
		pending.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_09_TC_10 appnum=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_10.class);
		appnum.enterApplicationNum();
		
		ToVerifyConnectionDetailsTab_SC_09_TC_11 action=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_11.class);
		action.clickOnActionImg();
		
		ToVerifyConnectionDetailsTab_SC_09_TC_13 blankaction=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_13.class);
		blankaction.enterComment();
		blankaction.clickOnSubmit();
		blankaction.getErrormsg();
	}

	@Test(priority=14,description="Blank comment ",dataProvider ="Field engineer")
	public void NRDA_Sewerage_New_Connection_SC_09_TC_14(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);

		ToVerifyConnectionDetailsTab_SC_09_TC_03 display=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_03.class);
		display.clickOnPublicHealthAndEng();
		
		ToVerifyConnectionDetailsTab_SC_09_TC_04 pending=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_04.class);
		pending.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_09_TC_10 appnum=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_10.class);
		appnum.enterApplicationNum();
		
		ToVerifyConnectionDetailsTab_SC_09_TC_12 action=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_12.class);
		action.clickOnActionImg();

		ToVerifyConnectionDetailsTab_SC_09_TC_14 blankcomment=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_14.class);
		blankcomment.selectActionBlankComment();
		blankcomment.clickOnSubmit();
		blankcomment.getErrorMsg();
	}
	
	@Test(priority=15,description="Water connection accessories ",dataProvider ="Field engineer")
	public void NRDA_Sewerage_New_Connection_SC_09_TC_15(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);
		
		ToVerifyConnectionDetailsTab_SC_09_TC_03 display=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_03.class);
		display.clickOnPublicHealthAndEng();

		ToVerifyConnectionDetailsTab_SC_09_TC_04 pending=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_04.class);
		pending.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_09_TC_10 appnum=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_10.class);
		appnum.enterApplicationNum();
		
		ToVerifyConnectionDetailsTab_SC_09_TC_12 action=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_12.class);
		action.clickOnActionImg();

		ToVerifyConnectionDetailsTab_SC_09_TC_15 accessories=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_15.class);
		accessories.clickOnWaterConnAccessories();
		accessories.getTotalAmountWithoutAddAccessoryAmt();
		accessories.enterDescription();
		accessories.enterAmount();
		accessories.getTotalAmountWithAddAccessoryAmt();
	}
	
	
	@Test(priority=19,description="submit",dataProvider ="Field engineer")
	public void NRDA_Sewerage_New_Connection_SC_09_TC_16(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);
		
		ToVerifyConnectionDetailsTab_SC_09_TC_03 display=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_03.class);
		display.clickOnPublicHealthAndEng();

		ToVerifyConnectionDetailsTab_SC_09_TC_04 pending=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_04.class);
		pending.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_09_TC_10 appnum=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_10.class);
		appnum.enterApplicationNum();
		
		ToVerifyConnectionDetailsTab_SC_09_TC_12 action=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_12.class);
		action.clickOnActionImg();
		
		ToVerifyConnectionDetailsTab_SC_09_TC_14 selectaction=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_14.class);
		selectaction.selectActionBlankComment();
		
		ToVerifyConnectionDetailsTab_SC_09_TC_13 blankaction=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_13.class);
		blankaction.enterComment();
		
		ToVerifyConnectionDetailsTab_SC_09_TC_16 submit=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_16.class);
		submit.verifyuploadDocument();
		submit.clickOnSubmit();
		submit.clickOnGenerate();
	}


	@Test(priority=16,description="verify save as draft ",dataProvider ="Field engineer")
	public void NRDA_Sewerage_New_Connection_SC_09_TC_18(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);
		
		ToVerifyConnectionDetailsTab_SC_09_TC_03 display=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_03.class);
		display.clickOnPublicHealthAndEng();

		ToVerifyConnectionDetailsTab_SC_09_TC_04 pending=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_04.class);
		pending.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_09_TC_10 appnum=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_10.class);
		appnum.enterApplicationNum();
		
		ToVerifyConnectionDetailsTab_SC_09_TC_12 action=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_12.class);
		action.clickOnActionImg();

		ToVerifyConnectionDetailsTab_SC_09_TC_18 draft=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_18.class);
		draft.clickOnSaveAsDraft();
		draft.verifyMessage();
	}
	
	@Test(priority=17,description="verify remove draft ",dataProvider ="Field engineer")
	public void NRDA_Sewerage_New_Connection_SC_09_TC_19(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);

		ToVerifyConnectionDetailsTab_SC_09_TC_03 display=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_03.class);
		display.clickOnPublicHealthAndEng();

		ToVerifyConnectionDetailsTab_SC_09_TC_04 pending=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_04.class);
		pending.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_09_TC_10 appnum=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_10.class);
		appnum.enterApplicationNum();
		
		ToVerifyConnectionDetailsTab_SC_09_TC_12 action=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_12.class);
		action.clickOnActionImg();

		ToVerifyConnectionDetailsTab_SC_09_TC_19 removedraft=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_19.class);
		removedraft.clickOnRemoveDraft();
		removedraft.verifyMessage();
	}
	
	@Test(priority=18,description="verify close ",dataProvider ="Field engineer")
	public void NRDA_Sewerage_New_Connection_SC_09_TC_20(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);

		ToVerifyConnectionDetailsTab_SC_09_TC_03 display=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_03.class);
		display.clickOnPublicHealthAndEng();

		ToVerifyConnectionDetailsTab_SC_09_TC_04 pending=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_04.class);
		pending.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_09_TC_10 appnum=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_10.class);
		appnum.enterApplicationNum();
		
		ToVerifyConnectionDetailsTab_SC_09_TC_12 action=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_12.class);
		action.clickOnActionImg();

		ToVerifyConnectionDetailsTab_SC_09_TC_20 close=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_20.class);
		close.clickOnClose();
	}
	
	
	
	
	
									//meter installation
	
	
	@Test(priority=1,description="Meter installation ",dataProvider ="Field engineer")
	public void NRDA_Sewerage_New_Connection_SC_11_TC_05(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);
		
		ToVerifyConnectionDetailsTab_SC_09_TC_03 display=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_03.class);
		display.clickOnPublicHealthAndEng();

		ToVerifyConnectionDetailsTab_SC_09_TC_04 pending=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_04.class);
		pending.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_11_TC_05 meter=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_11_TC_05.class);
		meter.enterApplicationNum();
	}
	
	@Test(priority=2,description="action",dataProvider ="Field engineer")
	public void NRDA_Sewerage_New_Connection_SC_11_TC_06(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);
		
		ToVerifyConnectionDetailsTab_SC_09_TC_03 display=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_03.class);
		display.clickOnPublicHealthAndEng();

		ToVerifyConnectionDetailsTab_SC_09_TC_04 pending=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_04.class);
		pending.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_11_TC_05 meter=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_11_TC_05.class);
		meter.enterApplicationNum();
		
		ToVerifyConnectionDetailsTab_SC_09_TC_12 action=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_12.class);
		action.clickOnActionImg();
		
		ToVerifyConnectionDetailsTab_SC_11_TC_06 actiondis=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_11_TC_06.class);
		actiondis.displayList();
		actiondis.selectUserMeterInstallation();
	}
	
	@Test(priority=3,description="invalid",dataProvider ="Field engineer")
	public void NRDA_Sewerage_New_Connection_SC_11_TC_07(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);
		
		ToVerifyConnectionDetailsTab_SC_09_TC_03 display=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_03.class);
		display.clickOnPublicHealthAndEng();

		ToVerifyConnectionDetailsTab_SC_09_TC_04 pending=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_04.class);
		pending.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_11_TC_05 meter=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_11_TC_05.class);
		meter.enterApplicationNum();
		
		ToVerifyConnectionDetailsTab_SC_09_TC_12 action=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_12.class);
		action.clickOnActionImg();
		
		ToVerifyConnectionDetailsTab_SC_11_TC_07 invalid=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_11_TC_07.class);
		invalid.enterComment();
		invalid.uploadDocument();
		invalid.clickOnSubmit();
		invalid.getErrorMsg();
	}
	
	@Test(priority=4,description="connection meter details",dataProvider ="Field engineer")
	public void NRDA_Sewerage_New_Connection_SC_11_TC_08(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);
		
		ToVerifyConnectionDetailsTab_SC_09_TC_03 display=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_03.class);
		display.clickOnPublicHealthAndEng();

		ToVerifyConnectionDetailsTab_SC_09_TC_04 pending=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_04.class);
		pending.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_11_TC_05 meter=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_11_TC_05.class);
		meter.enterApplicationNum();
		
		ToVerifyConnectionDetailsTab_SC_09_TC_12 action=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_12.class);
		action.clickOnActionImg();
		
		ToVerifyConnectionDetailsTab_SC_11_TC_08 connectiondetails=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_11_TC_08.class);
		connectiondetails.clickOnConnectionMeterDetails();
		connectiondetails.displayList();
	}
	
	@Test(priority=5,description="invalid connection meter details",dataProvider ="Field engineer")
	public void NRDA_Sewerage_New_Connection_SC_11_TC_09(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);
		
		ToVerifyConnectionDetailsTab_SC_09_TC_03 display=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_03.class);
		display.clickOnPublicHealthAndEng();

		ToVerifyConnectionDetailsTab_SC_09_TC_04 pending=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_04.class);
		pending.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_11_TC_05 meter=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_11_TC_05.class);
		meter.enterApplicationNum();
		
		ToVerifyConnectionDetailsTab_SC_09_TC_12 action=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_12.class);
		action.clickOnActionImg();
		
		ToVerifyConnectionDetailsTab_SC_11_TC_08 connectiondetails=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_11_TC_08.class);
		connectiondetails.clickOnConnectionMeterDetails();
		
		ToVerifyConnectionDetailsTab_SC_11_TC_09 details=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_11_TC_09.class);
		details.enterInvalidMeterData();
	}
	
	
	@Test(priority=25,description="valid connection meter details",dataProvider ="Field engineer")
	public void NRDA_Sewerage_New_Connection_SC_11_TC_10(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);
		
		ToVerifyConnectionDetailsTab_SC_09_TC_03 display=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_03.class);
		display.clickOnPublicHealthAndEng();

		ToVerifyConnectionDetailsTab_SC_09_TC_04 pending=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_04.class);
		pending.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_09_TC_10 appnum=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_10.class);
		appnum.enterApplicationNum();
		
		ToVerifyConnectionDetailsTab_SC_09_TC_12 action=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_09_TC_12.class);
		action.clickOnActionImg();

		ToVerifyConnectionDetailsTab_SC_11_TC_07 valid1=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_11_TC_07.class);
		valid1.selectUserMeterInstallation();
		valid1.enterComment();
		valid1.uploadDocument();
		
		ToVerifyConnectionDetailsTab_SC_11_TC_08 connectiondetails=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_11_TC_08.class);
		connectiondetails.clickOnConnectionMeterDetails();
		
		ToVerifyConnectionDetailsTab_SC_11_TC_10 validdetails=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_11_TC_10.class);
		validdetails.enterValidMeterData();
		validdetails.clickOnSubmit();
		validdetails.clickOnGenerateNote();
		validdetails.getSuccessMsg();
			
	}
		
}