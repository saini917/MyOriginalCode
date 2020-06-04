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
	public void NRDA_MeterTesting_SC_02_TC_01(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		ToVerifyMeterTesting_SC_02_TC_01 homedisplay=PageFactory.initElements(driver, ToVerifyMeterTesting_SC_02_TC_01.class);
		homedisplay.verifyDisplayLink();
		homedisplay.verifyStatisticsDisplayLink();
	}
	
	@Test(priority=2,dataProvider ="junior engineer",description="verify home page")
	public void NRDA_MeterTesting_SC_02_TC_02(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyMeterTesting_SC_02_TC_02 home=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_02.class);
		home.clickOnHomeIcon();
		home.verifyDisplayLink();
		home.verifyStatisticsDisplayLink();
	}
	
	@Test(priority=3,dataProvider ="junior engineer",description="verify action page")
	public void NRDA_MeterTesting_SC_02_TC_03(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyMeterTesting_SC_02_TC_03 action=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_03.class);
		action.clickOnPublicHealth();
		action.clickOnWatermeterTesting();
		action.verifyDisplayLink();
	}
	
	@Test(priority=4,dataProvider ="junior engineer",description="verify invalid application number")
	public void NRDA_MeterTesting_SC_02_TC_05(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyMeterTesting_SC_02_TC_03 action=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_03.class);
		action.clickOnPublicHealth();
		action.clickOnWatermeterTesting();
		
		ToVerifyMeterTesting_SC_02_TC_05 invalid=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_05.class);
		invalid.verifyInvalidAppSearch();
		invalid.verifyErrorMessage();
		
	}
	
	@Test(priority=5,dataProvider ="junior engineer",description="verify valid application number")
	public void NRDA_MeterTesting_SC_02_TC_04(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyMeterTesting_SC_02_TC_03 action=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_03.class);
		action.clickOnPublicHealth();
		action.clickOnWatermeterTesting();
		
		ToVerifyMeterTesting_SC_02_TC_04 valid=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_04.class);
		valid.verifyValidAppSearch();
	}
	
	@Test(priority=6,dataProvider ="junior engineer",description="verify invalid application number")
	public void NRDA_MeterTesting_SC_02_TC_06(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyMeterTesting_SC_02_TC_03 action=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_03.class);
		action.clickOnPublicHealth();
		action.clickOnWatermeterTesting();
		
		ToVerifyMeterTesting_SC_02_TC_04 valid=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_04.class);
		valid.verifyValidAppSearch();
		
		ToVerifyMeterTesting_SC_02_TC_06 alert=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_06.class);
		alert.clickAlert();
		alert.getSuccessfulMessage();
	}
	

	@Test(priority=7,dataProvider ="junior engineer",description="verify action")
	public void NRDA_MeterTesting_SC_02_TC_07(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyMeterTesting_SC_02_TC_03 action=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_03.class);
		action.clickOnPublicHealth();
		action.clickOnWatermeterTesting();
		
		ToVerifyMeterTesting_SC_02_TC_04 valid=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_04.class);
		valid.verifyValidAppSearch();
		
		ToVerifyMeterTesting_SC_02_TC_06 alert=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_06.class);
		alert.clickAlert();
		alert.getSuccessfulMessage();
		
		ToVerifyMeterTesting_SC_02_TC_07 actionv=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_07.class);
		actionv.clickOnAction();
		actionv.verifySelectAction();
		actionv.verifyDisplayLink();
	}
	
	@Test(priority=8,dataProvider ="junior engineer",description="verify search")
	public void NRDA_MeterTesting_SC_02_TC_08(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyMeterTesting_SC_02_TC_03 action=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_03.class);
		action.clickOnPublicHealth();
		action.clickOnWatermeterTesting();
		
		ToVerifyMeterTesting_SC_02_TC_04 valid=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_04.class);
		valid.verifyValidAppSearch();
		
		ToVerifyMeterTesting_SC_02_TC_06 alert=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_06.class);
		alert.clickAlert();
		alert.getSuccessfulMessage();
		
		ToVerifyMeterTesting_SC_02_TC_07 actionv=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_07.class);
		actionv.clickOnAction();
		
		ToVerifyMeterTesting_SC_02_TC_08 searchv=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_08.class);
		searchv.clickOnSearch();
		searchv.verifyDisplayList();
		searchv.verifyClosePopUpWindow();
	}
	
	@Test(priority=9,dataProvider ="junior engineer",description="verify create new file")
	public void NRDA_MeterTesting_SC_02_TC_09(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyMeterTesting_SC_02_TC_03 action=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_03.class);
		action.clickOnPublicHealth();
		action.clickOnWatermeterTesting();
		
		ToVerifyMeterTesting_SC_02_TC_04 valid=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_04.class);
		valid.verifyValidAppSearch();
		
		ToVerifyMeterTesting_SC_02_TC_06 alert=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_06.class);
		alert.clickAlert();
		alert.getSuccessfulMessage();
		
		ToVerifyMeterTesting_SC_02_TC_07 actionv=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_07.class);
		actionv.clickOnAction();
		
		ToVerifyMeterTesting_SC_02_TC_08 searchv=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_08.class);
		searchv.clickOnSearch();
		
		ToVerifyMeterTesting_SC_02_TC_09 create=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_09.class);
		create.clickOnCreateNewFile();
		create.verifyDisplayList();
		create.verifyClosePopUpWindow();
		create.verifyClosePopUpWindow1();
	}
	
	@Test(priority=10,dataProvider ="junior engineer",description="verify file no")
	public void NRDA_MeterTesting_SC_02_TC_10(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyMeterTesting_SC_02_TC_03 action=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_03.class);
		action.clickOnPublicHealth();
		action.clickOnWatermeterTesting();
		
		ToVerifyMeterTesting_SC_02_TC_04 valid=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_04.class);
		valid.verifyValidAppSearch();
		
		ToVerifyMeterTesting_SC_02_TC_06 alert=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_06.class);
		alert.clickAlert();
		alert.getSuccessfulMessage();
		
		ToVerifyMeterTesting_SC_02_TC_07 actionv=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_07.class);
		actionv.clickOnAction();
		
		ToVerifyMeterTesting_SC_02_TC_08 searchv=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_08.class);
		searchv.clickOnSearch();
		
		ToVerifyMeterTesting_SC_02_TC_09 create=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_09.class);
		create.clickOnCreateNewFile();
		
		ToVerifyMeterTesting_SC_02_TC_10 file=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_10.class);
		file.verifyFileNo();
		file.verifyClosePopUpWindow();
		file.verifyClosePopUpWindow1();
	}
	
	@Test(priority=11,dataProvider ="junior engineer",description="verify subject")
	public void NRDA_MeterTesting_SC_02_TC_11(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyMeterTesting_SC_02_TC_03 action=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_03.class);
		action.clickOnPublicHealth();
		action.clickOnWatermeterTesting();
		
		ToVerifyMeterTesting_SC_02_TC_04 valid=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_04.class);
		valid.verifyValidAppSearch();
		
		ToVerifyMeterTesting_SC_02_TC_06 alert=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_06.class);
		alert.clickAlert();
		alert.getSuccessfulMessage();
		
		ToVerifyMeterTesting_SC_02_TC_07 actionv=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_07.class);
		actionv.clickOnAction();
		
		ToVerifyMeterTesting_SC_02_TC_08 searchv=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_08.class);
		searchv.clickOnSearch();
		
		ToVerifyMeterTesting_SC_02_TC_09 create=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_09.class);
		create.clickOnCreateNewFile();
		
		ToVerifyMeterTesting_SC_02_TC_11 subject=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_11.class);
		subject.verifySubject();
		subject.verifyClosePopUpWindow();
		subject.verifyClosePopUpWindow1();
	}
	
	@Test(priority=12,dataProvider ="junior engineer",description="verify submit")
	public void NRDA_MeterTesting_SC_02_TC_12(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyMeterTesting_SC_02_TC_03 action=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_03.class);
		action.clickOnPublicHealth();
		action.clickOnWatermeterTesting();
		
		ToVerifyMeterTesting_SC_02_TC_04 valid=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_04.class);
		valid.verifyValidAppSearch();
		
		ToVerifyMeterTesting_SC_02_TC_06 alert=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_06.class);
		alert.clickAlert();
		alert.getSuccessfulMessage();
		
		ToVerifyMeterTesting_SC_02_TC_07 actionv=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_07.class);
		actionv.clickOnAction();
		
		ToVerifyMeterTesting_SC_02_TC_08 searchv=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_08.class);
		searchv.clickOnSearch();
		
		ToVerifyMeterTesting_SC_02_TC_09 create=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_09.class);
		create.clickOnCreateNewFile();
		
		ToVerifyMeterTesting_SC_02_TC_12 submit=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_12.class);
		submit.enterData();
		submit.clickOnSubmit();
		submit.selectSubjectClickOnSearch();
		submit.verifyClosePopUpWindow1();
	}
	
	@Test(priority=13,dataProvider ="junior engineer",description="verify clear")
	public void NRDA_MeterTesting_SC_02_TC_13(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyMeterTesting_SC_02_TC_03 action=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_03.class);
		action.clickOnPublicHealth();
		action.clickOnWatermeterTesting();
		
		ToVerifyMeterTesting_SC_02_TC_04 valid=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_04.class);
		valid.verifyValidAppSearch();
		
		ToVerifyMeterTesting_SC_02_TC_06 alert=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_06.class);
		alert.clickAlert();
		alert.getSuccessfulMessage();
		
		ToVerifyMeterTesting_SC_02_TC_07 actionv=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_07.class);
		actionv.clickOnAction();
		
		ToVerifyMeterTesting_SC_02_TC_08 searchv=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_08.class);
		searchv.clickOnSearch();
		
		ToVerifyMeterTesting_SC_02_TC_09 create=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_09.class);
		create.clickOnCreateNewFile();
		
		ToVerifyMeterTesting_SC_02_TC_12 submit=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_12.class);
		submit.enterData();
		
		ToVerifyMeterTesting_SC_02_TC_13 clear=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_13.class);
		clear.clickOnClearBtn();
		clear.verifyFieldClear();
		clear.verifyClosePopUpWindow();
		clear.verifyClosePopUpWindow1();
	}
	
	@Test(priority=14,dataProvider ="junior engineer",description="verify invalid data")
	public void NRDA_MeterTesting_SC_02_TC_14(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyMeterTesting_SC_02_TC_03 action=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_03.class);
		action.clickOnPublicHealth();
		action.clickOnWatermeterTesting();
		
		ToVerifyMeterTesting_SC_02_TC_04 valid=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_04.class);
		valid.verifyValidAppSearch();
		
		ToVerifyMeterTesting_SC_02_TC_06 alert=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_06.class);
		alert.clickAlert();
		alert.getSuccessfulMessage();
		
		ToVerifyMeterTesting_SC_02_TC_07 actionv=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_07.class);
		actionv.clickOnAction();
		
		ToVerifyMeterTesting_SC_02_TC_08 searchv=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_08.class);
		searchv.clickOnSearch();
		
		ToVerifyMeterTesting_SC_02_TC_09 create=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_09.class);
		create.clickOnCreateNewFile();
		
		ToVerifyMeterTesting_SC_02_TC_14 invaliddata=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_14.class);
		invaliddata.enterInvalidData();
		invaliddata.clickOnSubmit();
		invaliddata.verifyClosePopUpWindow1();
	}
	
	@Test(priority=15,dataProvider ="junior engineer",description="verify fill in form")
	public void NRDA_MeterTesting_SC_02_TC_15(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyMeterTesting_SC_02_TC_03 action=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_03.class);
		action.clickOnPublicHealth();
		action.clickOnWatermeterTesting();
		
		ToVerifyMeterTesting_SC_02_TC_04 valid=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_04.class);
		valid.verifyValidAppSearch();
		
		ToVerifyMeterTesting_SC_02_TC_06 alert=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_06.class);
		alert.clickAlert();
		alert.getSuccessfulMessage();
		
		ToVerifyMeterTesting_SC_02_TC_07 actionv=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_07.class);
		actionv.clickOnAction();
		
		ToVerifyMeterTesting_SC_02_TC_08 searchv=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_08.class);
		searchv.clickOnSearch();
		
		ToVerifyMeterTesting_SC_02_TC_09 create=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_09.class);
		create.clickOnCreateNewFile();
		
		ToVerifyMeterTesting_SC_02_TC_12 submit=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_12.class);
		submit.enterData();
		submit.clickOnSubmit();
		submit.selectSubjectClickOnSearch();
		
		ToVerifyMeterTesting_SC_02_TC_15 fillform=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_15.class);
		fillform.clickOnFillInForm();
	}
	
	@Test(priority=16,dataProvider ="junior engineer",description="verify upload document")
	public void NRDA_MeterTesting_SC_02_TC_16(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyMeterTesting_SC_02_TC_03 action=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_03.class);
		action.clickOnPublicHealth();
		action.clickOnWatermeterTesting();
		
		ToVerifyMeterTesting_SC_02_TC_04 valid=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_04.class);
		valid.verifyValidAppSearch();
		
		ToVerifyMeterTesting_SC_02_TC_06 alert=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_06.class);
		alert.clickAlert();
		alert.getSuccessfulMessage();
		
		ToVerifyMeterTesting_SC_02_TC_07 actionv=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_07.class);
		actionv.clickOnAction();
		
		ToVerifyMeterTesting_SC_02_TC_08 searchv=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_08.class);
		searchv.clickOnSearch();
		
		ToVerifyMeterTesting_SC_02_TC_09 create=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_09.class);
		create.clickOnCreateNewFile();
		
		ToVerifyMeterTesting_SC_02_TC_12 submit=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_12.class);
		submit.enterData();
		submit.clickOnSubmit();
		submit.selectSubjectClickOnSearch();
		
		ToVerifyMeterTesting_SC_02_TC_15 fillform=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_15.class);
		fillform.clickOnFillInForm();
		
		ToVerifyMeterTesting_SC_02_TC_16 upload=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_16.class);
		upload.uploadDocument();
		upload.verifyMessage();
	}
	
	@Test(priority=17,dataProvider ="junior engineer",description="verify submit withot data")
	public void NRDA_MeterTesting_SC_02_TC_17(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyMeterTesting_SC_02_TC_03 action=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_03.class);
		action.clickOnPublicHealth();
		action.clickOnWatermeterTesting();
		
		ToVerifyMeterTesting_SC_02_TC_04 valid=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_04.class);
		valid.verifyValidAppSearch();
		
		ToVerifyMeterTesting_SC_02_TC_06 alert=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_06.class);
		alert.clickAlert();
		alert.getSuccessfulMessage();
		
		ToVerifyMeterTesting_SC_02_TC_07 actionv=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_07.class);
		actionv.clickOnAction();
		
		ToVerifyMeterTesting_SC_02_TC_08 searchv=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_08.class);
		searchv.clickOnSearch();
		
		ToVerifyMeterTesting_SC_02_TC_09 create=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_09.class);
		create.clickOnCreateNewFile();
		
		ToVerifyMeterTesting_SC_02_TC_12 submit=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_12.class);
		submit.enterData();
		submit.clickOnSubmit();
		submit.selectSubjectClickOnSearch();
		
		ToVerifyMeterTesting_SC_02_TC_15 fillform=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_15.class);
		fillform.clickOnFillInForm();
		
		ToVerifyMeterTesting_SC_02_TC_16 upload=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_16.class);
		upload.uploadDocument();
		upload.verifyMessage();
		
		ToVerifyMeterTesting_SC_02_TC_17 submitwithout=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_17.class);
		submitwithout.enterComment();
		submitwithout.clickOnSubmit();
		submitwithout.verifyErrorMessage();
	}
	
	@Test(priority=18,dataProvider ="junior engineer",description="verify submit withot data")
	public void NRDA_MeterTesting_SC_02_TC_18(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyMeterTesting_SC_02_TC_03 action=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_03.class);
		action.clickOnPublicHealth();
		action.clickOnWatermeterTesting();
		
		ToVerifyMeterTesting_SC_02_TC_04 valid=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_04.class);
		valid.verifyValidAppSearch();
		
		ToVerifyMeterTesting_SC_02_TC_06 alert=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_06.class);
		alert.clickAlert();
		alert.getSuccessfulMessage();
		
		ToVerifyMeterTesting_SC_02_TC_07 actionv=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_07.class);
		actionv.clickOnAction();
		
		ToVerifyMeterTesting_SC_02_TC_08 searchv=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_08.class);
		searchv.clickOnSearch();
		
		ToVerifyMeterTesting_SC_02_TC_09 create=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_09.class);
		create.clickOnCreateNewFile();
		
		ToVerifyMeterTesting_SC_02_TC_12 submit=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_12.class);
		submit.enterData();
		submit.clickOnSubmit();
		submit.selectSubjectClickOnSearch();
		
		ToVerifyMeterTesting_SC_02_TC_15 fillform=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_15.class);
		fillform.clickOnFillInForm();
		
		ToVerifyMeterTesting_SC_02_TC_16 upload=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_16.class);
		upload.uploadDocument();
		upload.verifyMessage();
		
		ToVerifyMeterTesting_SC_02_TC_17 submitwithout=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_17.class);
		submitwithout.enterComment();
		
		ToVerifyMeterTesting_SC_02_TC_18 submitwithou=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_18.class);
		submitwithou.selectAction();
		submitwithou.clickOnSubmit();
		submitwithou.verifyErrorMessage();
	}
	
	@Test(priority=19,dataProvider ="junior engineer",description="verify submit withot data")
	public void NRDA_MeterTesting_SC_02_TC_19(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyMeterTesting_SC_02_TC_03 action=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_03.class);
		action.clickOnPublicHealth();
		action.clickOnWatermeterTesting();
		
		ToVerifyMeterTesting_SC_02_TC_04 valid=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_04.class);
		valid.verifyValidAppSearch();
		
		ToVerifyMeterTesting_SC_02_TC_06 alert=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_06.class);
		alert.clickAlert();
		alert.getSuccessfulMessage();
		
		ToVerifyMeterTesting_SC_02_TC_07 actionv=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_07.class);
		actionv.clickOnAction();
		
		ToVerifyMeterTesting_SC_02_TC_08 searchv=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_08.class);
		searchv.clickOnSearch();
		
		ToVerifyMeterTesting_SC_02_TC_09 create=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_09.class);
		create.clickOnCreateNewFile();
		
		ToVerifyMeterTesting_SC_02_TC_12 submit=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_12.class);
		submit.enterData();
		submit.clickOnSubmit();
		submit.selectSubjectClickOnSearch();
		
		ToVerifyMeterTesting_SC_02_TC_15 fillform=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_15.class);
		fillform.clickOnFillInForm();
		
		ToVerifyMeterTesting_SC_02_TC_16 upload=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_16.class);
		upload.uploadDocument();
		upload.verifyMessage();
		
		ToVerifyMeterTesting_SC_02_TC_18 selaction=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_18.class);
		selaction.selectAction();
		
		ToVerifyMeterTesting_SC_02_TC_19 selectaction=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_19.class);
		selectaction.selectOfficer();
		selectaction.clickOnSubmit();
		selectaction.verifyErrorMessage();
	}
	
	@Test(priority=20,dataProvider ="junior engineer",description="verify save as draft")
	public void NRDA_MeterTesting_SC_02_TC_20(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyMeterTesting_SC_02_TC_03 action=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_03.class);
		action.clickOnPublicHealth();
		action.clickOnWatermeterTesting();
		
		ToVerifyMeterTesting_SC_02_TC_04 valid=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_04.class);
		valid.verifyValidAppSearch();
		
		ToVerifyMeterTesting_SC_02_TC_06 alert=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_06.class);
		alert.clickAlert();
		alert.getSuccessfulMessage();
		
		ToVerifyMeterTesting_SC_02_TC_07 actionv=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_07.class);
		actionv.clickOnAction();
		
		ToVerifyMeterTesting_SC_02_TC_08 searchv=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_08.class);
		searchv.clickOnSearch();
		
		ToVerifyMeterTesting_SC_02_TC_09 create=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_09.class);
		create.clickOnCreateNewFile();
		
		ToVerifyMeterTesting_SC_02_TC_12 submit=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_12.class);
		submit.enterData();
		submit.clickOnSubmit();
		submit.selectSubjectClickOnSearch();
		
		ToVerifyMeterTesting_SC_02_TC_15 fillform=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_15.class);
		fillform.clickOnFillInForm();
		
		ToVerifyMeterTesting_SC_02_TC_16 upload=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_16.class);
		upload.uploadDocument();
		upload.verifyMessage();
		
		ToVerifyMeterTesting_SC_02_TC_17 submitwithout=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_17.class);
		submitwithout.enterComment();
		
		ToVerifyMeterTesting_SC_02_TC_18 submitwithou=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_18.class);
		submitwithou.selectAction();
		
		ToVerifyMeterTesting_SC_02_TC_19 selectaction=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_19.class);
		selectaction.selectOfficer();
		
		ToVerifyMeterTesting_SC_02_TC_20 draft=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_20.class);
		draft.clickOnSaveAsDraft();
		draft.verifyMessage();
	}
	
	@Test(priority=21,dataProvider ="junior engineer",description="verify remove draft")
	public void NRDA_MeterTesting_SC_02_TC_21(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyMeterTesting_SC_02_TC_03 action=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_03.class);
		action.clickOnPublicHealth();
		action.clickOnWatermeterTesting();
		
		ToVerifyMeterTesting_SC_02_TC_04 valid=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_04.class);
		valid.verifyValidAppSearch();
		
		ToVerifyMeterTesting_SC_02_TC_06 alert=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_06.class);
		alert.clickAlert();
		alert.getSuccessfulMessage();
		
		ToVerifyMeterTesting_SC_02_TC_07 actionv=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_07.class);
		actionv.clickOnAction();
		
		ToVerifyMeterTesting_SC_02_TC_08 searchv=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_08.class);
		searchv.clickOnSearch();
		
		ToVerifyMeterTesting_SC_02_TC_09 create=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_09.class);
		create.clickOnCreateNewFile();
		
		ToVerifyMeterTesting_SC_02_TC_12 submit=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_12.class);
		submit.enterData();
		submit.clickOnSubmit();
		submit.selectSubjectClickOnSearch();
		
		ToVerifyMeterTesting_SC_02_TC_15 fillform=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_15.class);
		fillform.clickOnFillInForm();
		
		ToVerifyMeterTesting_SC_02_TC_16 upload=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_16.class);
		upload.uploadDocument();
		upload.verifyMessage();
		
		ToVerifyMeterTesting_SC_02_TC_17 submitwithout=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_17.class);
		submitwithout.enterComment();
		
		ToVerifyMeterTesting_SC_02_TC_18 submitwithou=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_18.class);
		submitwithou.selectAction();
		
		ToVerifyMeterTesting_SC_02_TC_19 selectaction=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_19.class);
		selectaction.selectOfficer();
		
		ToVerifyMeterTesting_SC_02_TC_21 remove=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_21.class);
		remove.clickOnRemoveDraft();
		remove.verifyMessage();
	}
	
	@Test(priority=22,dataProvider ="junior engineer",description="verify close")
	public void NRDA_MeterTesting_SC_02_TC_22(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyMeterTesting_SC_02_TC_03 action=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_03.class);
		action.clickOnPublicHealth();
		action.clickOnWatermeterTesting();
		
		ToVerifyMeterTesting_SC_02_TC_04 valid=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_04.class);
		valid.verifyValidAppSearch();
		
		ToVerifyMeterTesting_SC_02_TC_06 alert=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_06.class);
		alert.clickAlert();
		alert.getSuccessfulMessage();
		
		ToVerifyMeterTesting_SC_02_TC_07 actionv=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_07.class);
		actionv.clickOnAction();
		
		ToVerifyMeterTesting_SC_02_TC_08 searchv=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_08.class);
		searchv.clickOnSearch();
		
		ToVerifyMeterTesting_SC_02_TC_09 create=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_09.class);
		create.clickOnCreateNewFile();
		
		ToVerifyMeterTesting_SC_02_TC_12 submit=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_12.class);
		submit.enterData();
		submit.clickOnSubmit();
		submit.selectSubjectClickOnSearch();
		
		ToVerifyMeterTesting_SC_02_TC_15 fillform=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_15.class);
		fillform.clickOnFillInForm();
		
		ToVerifyMeterTesting_SC_02_TC_16 upload=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_16.class);
		upload.uploadDocument();
		upload.verifyMessage();
		
		ToVerifyMeterTesting_SC_02_TC_17 submitwithout=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_17.class);
		submitwithout.enterComment();
		
		ToVerifyMeterTesting_SC_02_TC_18 submitwithou=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_18.class);
		submitwithou.selectAction();
		
		ToVerifyMeterTesting_SC_02_TC_19 selectaction=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_19.class);
		selectaction.selectOfficer();
		
		ToVerifyMeterTesting_SC_02_TC_22 close=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_22.class);
		close.clickOnClose();
	}
	
	@Test(priority=23,dataProvider ="junior engineer",description="verify submit")
	public void NRDA_MeterTesting_SC_02_TC_23(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyMeterTesting_SC_02_TC_03 action=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_03.class);
		action.clickOnPublicHealth();
		action.clickOnWatermeterTesting();
		
		ToVerifyMeterTesting_SC_02_TC_04 valid=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_04.class);
		valid.verifyValidAppSearch();
		
		ToVerifyMeterTesting_SC_02_TC_06 alert=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_06.class);
		alert.clickAlert();
		alert.getSuccessfulMessage();
		
		ToVerifyMeterTesting_SC_02_TC_07 actionv=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_07.class);
		actionv.clickOnAction();
		
		ToVerifyMeterTesting_SC_02_TC_08 searchv=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_08.class);
		searchv.clickOnSearch();
		
		ToVerifyMeterTesting_SC_02_TC_09 create=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_09.class);
		create.clickOnCreateNewFile();
		
		ToVerifyMeterTesting_SC_02_TC_12 submit=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_12.class);
		submit.enterData();
		submit.clickOnSubmit();
		submit.selectSubjectClickOnSearch();
		
		ToVerifyMeterTesting_SC_02_TC_15 fillform=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_15.class);
		fillform.clickOnFillInForm();
		
		ToVerifyMeterTesting_SC_02_TC_23 submitbtn=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_23.class);
		submitbtn.selectAction();
		submitbtn.selectOfficer();
		submitbtn.enterComment();
		submitbtn.uploadDocument();
		submitbtn.clickOnSubmit();
	}
	
	@Test(priority=26,dataProvider ="junior engineer",description="verify other")
	public void NRDA_MeterTesting_SC_02_TC_26(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyMeterTesting_SC_02_TC_26 other=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_02_TC_26.class);
		other.clickOnOther();
		other.verifyAppSearch();
		other.clickOnClosePopUp();
	}
	
	
	
							// Again login as JE for Approval
	
	@Test(priority=1,dataProvider ="junior engineer",description="verify action display list")
	public void NRDA_MeterTesting_SC_04_TC_01(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyMeterTesting_SC_04_TC_01 act=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_04_TC_01.class);
		act.clickOnPublicHealth();
		act.clickOnWatermeterTesting();
		act.verifyValidAppSearch();
		act.clickOnAction();
		act.verifySelectAction();
		act.verifyDisplayLink();
	}
	
	@Test(priority=2,dataProvider ="junior engineer",description="verify invalid app")
	public void NRDA_MeterTesting_SC_04_TC_02(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyMeterTesting_SC_04_TC_01 act=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_04_TC_01.class);
		act.clickOnPublicHealth();
		act.clickOnWatermeterTesting();
		
		ToVerifyMeterTesting_SC_04_TC_02 actinvalid=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_04_TC_02.class);
		actinvalid.verifyInvalidAppSearch();
		actinvalid.verifyErrorMessage();
	}
	
	@Test(priority=3,dataProvider ="junior engineer",description="verify submit without data")
	public void NRDA_MeterTesting_SC_04_TC_03(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyMeterTesting_SC_04_TC_01 act=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_04_TC_01.class);
		act.clickOnPublicHealth();
		act.clickOnWatermeterTesting();
		act.verifyValidAppSearch();
		act.clickOnAction();
		
		ToVerifyMeterTesting_SC_04_TC_03 subwithout=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_04_TC_03.class);
		subwithout.selectApprovedAction();
		subwithout.clickOnSubmit();
		subwithout.verifyErrorMessage();
	}
	
	@Test(priority=4,dataProvider ="junior engineer",description="verify close")
	public void NRDA_MeterTesting_SC_04_TC_06(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyMeterTesting_SC_04_TC_01 act=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_04_TC_01.class);
		act.clickOnPublicHealth();
		act.clickOnWatermeterTesting();
		act.verifyValidAppSearch();
		act.clickOnAction();
		
		ToVerifyMeterTesting_SC_04_TC_03 subwithout=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_04_TC_03.class);
		subwithout.selectApprovedAction();
		
		ToVerifyMeterTesting_SC_04_TC_06 close=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_04_TC_06.class);
		close.clickOnClose();
	}
	
	@Test(priority=5,dataProvider ="junior engineer",description="verify save as draft")
	public void NRDA_MeterTesting_SC_04_TC_07(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyMeterTesting_SC_04_TC_01 act=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_04_TC_01.class);
		act.clickOnPublicHealth();
		act.clickOnWatermeterTesting();
		act.verifyValidAppSearch();
		act.clickOnAction();
		
		ToVerifyMeterTesting_SC_04_TC_03 subwithout=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_04_TC_03.class);
		subwithout.selectApprovedAction();
		
		ToVerifyMeterTesting_SC_04_TC_07 draft=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_04_TC_07.class);
		draft.clickOnSaveAsDraft();
		draft.verifyMessage();
	}
	
	@Test(priority=6,dataProvider ="junior engineer",description="verify remove draft")
	public void NRDA_MeterTesting_SC_04_TC_08(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyMeterTesting_SC_04_TC_01 act=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_04_TC_01.class);
		act.clickOnPublicHealth();
		act.clickOnWatermeterTesting();
		act.verifyValidAppSearch();
		act.clickOnAction();
		
		ToVerifyMeterTesting_SC_04_TC_03 subwithout=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_04_TC_03.class);
		subwithout.selectApprovedAction();
		
		ToVerifyMeterTesting_SC_04_TC_08 remove=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_04_TC_08.class);
		remove.clickOnRemoveDraft();
		remove.verifyErrorMessage();
	}
	
	@Test(priority=7,dataProvider ="junior engineer",description="verify submit with valid data")
	public void NRDA_MeterTesting_SC_04_TC_05(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyMeterTesting_SC_04_TC_01 act=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_04_TC_01.class);
		act.clickOnPublicHealth();
		act.clickOnWatermeterTesting();
		act.verifyValidAppSearch();
		act.clickOnAction();
		
		ToVerifyMeterTesting_SC_04_TC_03 subwithout=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_04_TC_03.class);
		subwithout.selectApprovedAction();
		
		ToVerifyMeterTesting_SC_04_TC_05 subwithdata=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_04_TC_05.class);
		subwithdata.enterComment();
		subwithdata.clickOnSubmit();
		subwithdata.verifyMessage();
	}
}
