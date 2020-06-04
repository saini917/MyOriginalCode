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
	public void NRDA_Sewerage_New_Connection_SC_10_TC_01(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
	}

	@Test(priority=2,dataProvider ="Executive engineer",description="Statistics display")
	public void NRDA_Sewerage_New_Connection_SC_10_TC_02(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToVerifyConnectionDetailsTab_SC_10_TC_02 statistics=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_02.class);
		statistics.clickOnHome();
		statistics.verifyDisplayLink();
		statistics.verifyStatisticsDisplayLink();
	}

	@Test(priority=3,dataProvider ="Executive engineer",description="public health and engineering display")
	public void NRDA_Sewerage_New_Connection_SC_10_TC_03(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToVerifyConnectionDetailsTab_SC_10_TC_03 publichealth=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_03.class);
		publichealth.clickOnPublicHealthAndEng();
		publichealth.verifyDisplayLink();
	}

	@Test(priority=4,dataProvider ="Executive engineer",description="my inbox")
	public void NRDA_Sewerage_New_Connection_SC_10_TC_04(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToVerifyConnectionDetailsTab_SC_10_TC_04 myinbox=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_04.class);
		myinbox.clickOnMyInbox();
		myinbox.verifyDisplay();
		myinbox.clickOnClosePopUp();
	}
	
	@Test(priority=5,dataProvider ="Executive engineer",description="other")
	public void NRDA_Sewerage_New_Connection_SC_10_TC_05(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToVerifyConnectionDetailsTab_SC_10_TC_05 other=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_05.class);
		other.clickOnOther();
		other.clickOnClosePopUp();
	}
	
	@Test(priority=6,dataProvider ="Executive engineer",description="pagination")
	public void NRDA_Sewerage_New_Connection_SC_10_TC_06(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToVerifyConnectionDetailsTab_SC_10_TC_05 other=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_05.class);
		other.clickOnOther();
		
		ToVerifyConnectionDetailsTab_SC_10_TC_06 pagination=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_06.class);
		pagination.clickOnPage2();
		pagination.clickOnPage1();
		pagination.clickOnClosePopUp();
	}
	
	@Test(priority=7,dataProvider ="Executive engineer",description="pending dashboard")
	public void NRDA_Sewerage_New_Connection_SC_10_TC_07(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToVerifyConnectionDetailsTab_SC_10_TC_03 publichealth=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_03.class);
		publichealth.clickOnPublicHealthAndEng();
		
		ToVerifyConnectionDetailsTab_SC_10_TC_07 display=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_07.class);
		display.clickOnWaterAndSewerage();
	}

	@Test(priority=8,dataProvider ="Executive engineer",description="invalid application number")
	public void NRDA_Sewerage_New_Connection_SC_10_TC_08(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToVerifyConnectionDetailsTab_SC_10_TC_03 publichealth=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_03.class);
		publichealth.clickOnPublicHealthAndEng();
		
		ToVerifyConnectionDetailsTab_SC_10_TC_07 display=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_07.class);
		display.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_10_TC_08 invalidapp=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_08.class);
		invalidapp.enterApplicationNum();
		invalidapp.verifyErrorMsg();
	}
	
	@Test(priority=9,dataProvider ="Executive engineer",description="invalid pending days")
	public void NRDA_Sewerage_New_Connection_SC_10_TC_09(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToVerifyConnectionDetailsTab_SC_10_TC_03 publichealth=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_03.class);
		publichealth.clickOnPublicHealthAndEng();
		
		ToVerifyConnectionDetailsTab_SC_10_TC_07 display=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_07.class);
		display.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_10_TC_09 invalidpendingdays=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_09.class);
		invalidpendingdays.enterInvalidPendingDays();
		invalidpendingdays.verifyErrorMsg();
	}
	
	@Test(priority=10,dataProvider ="Executive engineer",description="application display")
	public void NRDA_Sewerage_New_Connection_SC_10_TC_10(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToVerifyConnectionDetailsTab_SC_10_TC_03 publichealth=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_03.class);
		publichealth.clickOnPublicHealthAndEng();
		
		ToVerifyConnectionDetailsTab_SC_10_TC_07 display=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_07.class);
		display.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_10_TC_10 appdisplay=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_10.class);
		appdisplay.enterApplicationNum();
	}
	
	@Test(priority=11,dataProvider ="Executive engineer",description="action display")
	public void NRDA_Sewerage_New_Connection_SC_10_TC_11(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToVerifyConnectionDetailsTab_SC_10_TC_03 publichealth=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_03.class);
		publichealth.clickOnPublicHealthAndEng();
		
		ToVerifyConnectionDetailsTab_SC_10_TC_07 display=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_07.class);
		display.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_10_TC_10 appdisplay=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_10.class);
		appdisplay.enterApplicationNum();
		
		ToVerifyConnectionDetailsTab_SC_10_TC_11 actdisplay=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_11.class);
		actdisplay.clickOnActionImg();
		actdisplay.verifyDisplayList();
	}
	
	@Test(priority=12,dataProvider ="Executive engineer",description="map")
	public void NRDA_Sewerage_New_Connection_SC_10_TC_12(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToVerifyConnectionDetailsTab_SC_10_TC_03 publichealth=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_03.class);
		publichealth.clickOnPublicHealthAndEng();
		
		ToVerifyConnectionDetailsTab_SC_10_TC_07 display=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_07.class);
		display.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_10_TC_10 appdisplay=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_10.class);
		appdisplay.enterApplicationNum();
		
		ToVerifyConnectionDetailsTab_SC_10_TC_11 actdisplay=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_11.class);
		actdisplay.clickOnActionImg();
		
		ToVerifyConnectionDetailsTab_SC_10_TC_12 map=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_12.class);
		map.clickOnMap();
	}
	
	@Test(priority=13,dataProvider ="Executive engineer",description="blank action")
	public void NRDA_Sewerage_New_Connection_SC_10_TC_13(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToVerifyConnectionDetailsTab_SC_10_TC_03 publichealth=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_03.class);
		publichealth.clickOnPublicHealthAndEng();
		
		ToVerifyConnectionDetailsTab_SC_10_TC_07 display=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_07.class);
		display.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_10_TC_10 appdisplay=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_10.class);
		appdisplay.enterApplicationNum();
		
		ToVerifyConnectionDetailsTab_SC_10_TC_11 actdisplay=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_11.class);
		actdisplay.clickOnActionImg();
		
		ToVerifyConnectionDetailsTab_SC_10_TC_13 actionblank=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_13.class);
		actionblank.enterComment();
		actionblank.clickOnSubmit();
		actionblank.getErrormsg();
	}
	
	@Test(priority=14,dataProvider ="Executive engineer",description="without action")
	public void NRDA_Sewerage_New_Connection_SC_10_TC_14(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToVerifyConnectionDetailsTab_SC_10_TC_03 publichealth=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_03.class);
		publichealth.clickOnPublicHealthAndEng();
		
		ToVerifyConnectionDetailsTab_SC_10_TC_07 display=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_07.class);
		display.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_10_TC_10 appdisplay=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_10.class);
		appdisplay.enterApplicationNum();
		
		ToVerifyConnectionDetailsTab_SC_10_TC_11 actdisplay=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_11.class);
		actdisplay.clickOnActionImg();
		
		ToVerifyConnectionDetailsTab_SC_10_TC_14 blankcomment=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_14.class);
		blankcomment.selectAction();
		blankcomment.clickOnSubmit();
		blankcomment.getErrorMsg();
	}
	
	@Test(priority=16,dataProvider ="Executive engineer",description="submit")
	public void NRDA_Sewerage_New_Connection_SC_10_TC_15(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToVerifyConnectionDetailsTab_SC_10_TC_03 publichealth=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_03.class);
		publichealth.clickOnPublicHealthAndEng();
		
		ToVerifyConnectionDetailsTab_SC_10_TC_07 display=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_07.class);
		display.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_10_TC_10 appdisplay=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_10.class);
		appdisplay.enterApplicationNum();
		
		ToVerifyConnectionDetailsTab_SC_10_TC_11 actdisplay=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_11.class);
		actdisplay.clickOnActionImg();
		
		ToVerifyConnectionDetailsTab_SC_10_TC_14 blankcomment=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_14.class);
		blankcomment.selectAction();
		
		ToVerifyConnectionDetailsTab_SC_10_TC_13 actionblank=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_13.class);
		actionblank.enterComment();
		
		ToVerifyConnectionDetailsTab_SC_10_TC_15 submit=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_15.class);
		submit.verifyUploadDocument();
		submit.clickOnSubmit();
	}
	
	@Test(priority=15,dataProvider ="Executive engineer",description="close")
	public void NRDA_Sewerage_New_Connection_SC_10_TC_18(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToVerifyConnectionDetailsTab_SC_10_TC_03 publichealth=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_03.class);
		publichealth.clickOnPublicHealthAndEng();
		
		ToVerifyConnectionDetailsTab_SC_10_TC_07 display=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_07.class);
		display.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_10_TC_10 appdisplay=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_10.class);
		appdisplay.enterApplicationNum();
		
		ToVerifyConnectionDetailsTab_SC_10_TC_11 actdisplay=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_11.class);
		actdisplay.clickOnActionImg();
		
		ToVerifyConnectionDetailsTab_SC_10_TC_18 close=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_10_TC_18.class);
		close.clickOnClose();
	}

}
