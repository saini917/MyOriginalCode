package NRDA_MeterTesting;

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
public class LoginAsCitizen extends URLPageWSNRDAScript
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
	public void NRDA_MeterTesting_Citizen_SC_01_TC_01(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_citizen.loginAsCitizen(username,password);
		
		ToVerifyMeterTesting_SC_01_TC_01 display=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_01.class);
		display.clickOnWaterAndSewerageConnection();
		display.toVerifyOptions01();
		display.verifyOnOffLineForm();
	}
	
	@Test(priority=1,dataProvider ="Valid_Connection",description="verify online form")
	public void NRDA_MeterTesting_Citizen_SC_01_TC_02(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_citizen.loginAsCitizen(username,password);
		
		ToVerifyMeterTesting_SC_01_TC_01 display=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_01.class);
		display.clickOnWaterAndSewerageConnection();
		
		ToVerifyMeterTesting_SC_01_TC_02 online=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_02.class);
		online.clickOnMeterTesting();
		online.clickOnProceed();
		online.verifyDisplayList();
		online.verifyDisplayButtonList();
	}
	
	@Test(priority=2,dataProvider ="Valid_Connection",description="verify reset")
	public void NRDA_MeterTesting_Citizen_SC_01_TC_03(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_citizen.loginAsCitizen(username,password);
		
		ToVerifyMeterTesting_SC_01_TC_01 display=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_01.class);
		display.clickOnWaterAndSewerageConnection();
		
		ToVerifyMeterTesting_SC_01_TC_02 online=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_02.class);
		online.clickOnMeterTesting();
		online.clickOnProceed();
		
		ToVerifyMeterTesting_SC_01_TC_03 reset=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_03.class);
		reset.enterConsumerID();
		reset.clickOnSearch();
		reset.clickOnReset();
		reset.verifyFieldReset();
	}
	
	@Test(priority=4,dataProvider ="Valid_Connection",description="verify save as draft")
	public void NRDA_MeterTesting_Citizen_SC_01_TC_04(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_citizen.loginAsCitizen(username,password);
		
		ToVerifyMeterTesting_SC_01_TC_01 display=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_01.class);
		display.clickOnWaterAndSewerageConnection();
		
		ToVerifyMeterTesting_SC_01_TC_02 online=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_02.class);
		online.clickOnMeterTesting();
		online.clickOnProceed();
		
		ToVerifyMeterTesting_SC_01_TC_03 reset=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_03.class);
		reset.enterConsumerID();
		reset.clickOnSearch();
		
		ToVerifyMeterTesting_SC_01_TC_04 draft=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_04.class);
		draft.clickOnSaveAsDraft();
		draft.getMeterTestingTempMsg();
		draft.clickOnAppStatus();
		draft.enterApplicationNum();
		draft.clickOnSearch();
		draft.clickOnDraftApp();
		draft.clickOnWaterMeterTesting();
		draft.getTempNo();
	}
	
	@Test(priority=3,dataProvider ="Valid_Connection",description="verify close")
	public void NRDA_MeterTesting_Citizen_SC_01_TC_05(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_citizen.loginAsCitizen(username,password);
		
		ToVerifyMeterTesting_SC_01_TC_01 display=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_01.class);
		display.clickOnWaterAndSewerageConnection();
		
		ToVerifyMeterTesting_SC_01_TC_02 online=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_02.class);
		online.clickOnMeterTesting();
		online.clickOnProceed();
		
		ToVerifyMeterTesting_SC_01_TC_03 reset=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_03.class);
		reset.enterConsumerID();
		reset.clickOnSearch();
		
		ToVerifyMeterTesting_SC_01_TC_05 close=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_05.class);
		close.clickOnClose();
		close.clickOnPopUpNoBtn();
		close.clickOnClose();
		close.clickOnPopUpYesBtn();
	}
	
	@Test(priority=5,dataProvider ="Valid_Connection",description="submit without enter consumer id")
	public void NRDA_MeterTesting_Citizen_SC_01_TC_06(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_citizen.loginAsCitizen(username,password);
		
		ToVerifyMeterTesting_SC_01_TC_01 display=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_01.class);
		display.clickOnWaterAndSewerageConnection();
		
		ToVerifyMeterTesting_SC_01_TC_02 online=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_02.class);
		online.clickOnMeterTesting();
		online.clickOnProceed();
		
		ToVerifyMeterTesting_SC_01_TC_06 submit=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_06.class);
		submit.clickOnSubmitbtn();
		submit.getMessage();
	}
	

	@Test(priority=6,dataProvider ="Valid_Connection",description="serach icon")
	public void NRDA_MeterTesting_Citizen_SC_01_TC_07(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_citizen.loginAsCitizen(username,password);
		
		ToVerifyMeterTesting_SC_01_TC_01 display=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_01.class);
		display.clickOnWaterAndSewerageConnection();
		
		ToVerifyMeterTesting_SC_01_TC_02 online=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_02.class);
		online.clickOnMeterTesting();
		online.clickOnProceed();
		
		ToVerifyMeterTesting_SC_01_TC_03 reset=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_03.class);
		reset.enterConsumerID();
		reset.clickOnSearch();
		
		ToVerifyMeterTesting_SC_01_TC_07 search=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_07.class);
		search.namePopulated();
	}
	

	@Test(priority=7,dataProvider ="Valid_Connection",description="submit")
	public void NRDA_MeterTesting_Citizen_SC_01_TC_08(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_citizen.loginAsCitizen(username,password);
		
		ToVerifyMeterTesting_SC_01_TC_01 display=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_01.class);
		display.clickOnWaterAndSewerageConnection();
		
		ToVerifyMeterTesting_SC_01_TC_02 online=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_02.class);
		online.clickOnMeterTesting();
		online.clickOnProceed();
		
		ToVerifyMeterTesting_SC_01_TC_03 reset=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_03.class);
		reset.enterConsumerID();
		reset.clickOnSearch();
		
		ToVerifyMeterTesting_SC_01_TC_06 submit=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_06.class);
		submit.clickOnSubmitbtn();
		
		ToVerifyMeterTesting_SC_01_TC_08 message=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_08.class);
		//message.getSuccessfulMessage();
		message.clickOnPaymentGateWay();
		message.verifypaymentMode();
		message.verifymakePayment();
	}
	

	@Test(priority=8,dataProvider ="Valid_Connection",description="payment")
	public void NRDA_MeterTesting_Citizen_SC_01_TC_09(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_citizen.loginAsCitizen(username,password);
		
		ToVerifyMeterTesting_SC_01_TC_01 display=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_01.class);
		display.clickOnWaterAndSewerageConnection();
		
		ToVerifyMeterTesting_SC_01_TC_02 online=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_02.class);
		online.clickOnMeterTesting();
		online.clickOnProceed();
		
		ToVerifyMeterTesting_SC_01_TC_03 reset=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_03.class);
		reset.enterConsumerID();
		reset.clickOnSearch();
		
		ToVerifyMeterTesting_SC_01_TC_06 submit=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_06.class);
		submit.clickOnSubmitbtn();
		
		ToVerifyMeterTesting_SC_01_TC_08 message=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_08.class);
		message.clickOnPaymentGateWay();
		
		ToVerifyMeterTesting_SC_01_TC_09 paymentmode=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_09.class);
		paymentmode.clickOnMakePayment();
		paymentmode.verifyCardLabel();
	}
	
	@Test(priority=9,dataProvider ="Valid_Connection",description="invalid payment")
	public void NRDA_MeterTesting_Citizen_SC_01_TC_10(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_citizen.loginAsCitizen(username,password);
		
		ToVerifyMeterTesting_SC_01_TC_01 display=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_01.class);
		display.clickOnWaterAndSewerageConnection();
		
		ToVerifyMeterTesting_SC_01_TC_02 online=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_02.class);
		online.clickOnMeterTesting();
		online.clickOnProceed();
		
		ToVerifyMeterTesting_SC_01_TC_03 reset=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_03.class);
		reset.enterConsumerID();
		reset.clickOnSearch();
		
		ToVerifyMeterTesting_SC_01_TC_06 submit=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_06.class);
		submit.clickOnSubmitbtn();
		
		ToVerifyMeterTesting_SC_01_TC_08 message=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_08.class);
		message.clickOnPaymentGateWay();
		
		ToVerifyMeterTesting_SC_01_TC_09 paymentmode=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_09.class);
		paymentmode.clickOnMakePayment();
		
		ToVerifyMeterTesting_SC_01_TC_10 pay=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_10.class);
		pay.enterCardDetail04();
	}
	
	@Test(priority=10,dataProvider ="Valid_Connection",description="invalid payment")
	public void NRDA_MeterTesting_Citizen_SC_01_TC_11(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_citizen.loginAsCitizen(username,password);
		
		ToVerifyMeterTesting_SC_01_TC_01 display=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_01.class);
		display.clickOnWaterAndSewerageConnection();
		
		ToVerifyMeterTesting_SC_01_TC_02 online=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_02.class);
		online.clickOnMeterTesting();
		online.clickOnProceed();
		
		ToVerifyMeterTesting_SC_01_TC_03 reset=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_03.class);
		reset.enterConsumerID();
		reset.clickOnSearch();
		
		ToVerifyMeterTesting_SC_01_TC_06 submit=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_06.class);
		submit.clickOnSubmitbtn();
		
		ToVerifyMeterTesting_SC_01_TC_08 message=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_08.class);
		message.clickOnPaymentGateWay();
		
		ToVerifyMeterTesting_SC_01_TC_09 paymentmode=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_09.class);
		paymentmode.clickOnMakePayment();
		
		ToVerifyMeterTesting_SC_01_TC_11 paym=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_11.class);
		paym.enterCardDetail05();
	}
	
	@Test(priority=11,dataProvider ="Valid_Connection",description="invalid payment")
	public void NRDA_MeterTesting_Citizen_SC_01_TC_12(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_citizen.loginAsCitizen(username,password);
		
		ToVerifyMeterTesting_SC_01_TC_01 display=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_01.class);
		display.clickOnWaterAndSewerageConnection();
		
		ToVerifyMeterTesting_SC_01_TC_02 online=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_02.class);
		online.clickOnMeterTesting();
		online.clickOnProceed();
		
		ToVerifyMeterTesting_SC_01_TC_03 reset=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_03.class);
		reset.enterConsumerID();
		reset.clickOnSearch();
		
		ToVerifyMeterTesting_SC_01_TC_06 submit=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_06.class);
		submit.clickOnSubmitbtn();
		
		ToVerifyMeterTesting_SC_01_TC_08 message=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_08.class);
		message.clickOnPaymentGateWay();
		
		ToVerifyMeterTesting_SC_01_TC_09 paymentmode=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_09.class);
		paymentmode.clickOnMakePayment();
		
		ToVerifyMeterTesting_SC_01_TC_12 payi=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_12.class);
		payi.enterCardDetail06();
	}
	
	@Test(priority=11,dataProvider ="Valid_Connection",description="valid payment")
	public void NRDA_MeterTesting_Citizen_SC_01_TC_13(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_citizen.loginAsCitizen(username,password);
		
		ToVerifyMeterTesting_SC_01_TC_01 display=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_01.class);
		display.clickOnWaterAndSewerageConnection();
		
		ToVerifyMeterTesting_SC_01_TC_02 online=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_02.class);
		online.clickOnMeterTesting();
		online.clickOnProceed();
		
		ToVerifyMeterTesting_SC_01_TC_03 reset=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_03.class);
		reset.enterConsumerID();
		reset.clickOnSearch();
		
		ToVerifyMeterTesting_SC_01_TC_06 submit=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_06.class);
		submit.clickOnSubmitbtn();
		
		ToVerifyMeterTesting_SC_01_TC_08 message=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_08.class);
		message.clickOnPaymentGateWay();
		
		ToVerifyMeterTesting_SC_01_TC_09 paymentmode=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_09.class);
		paymentmode.clickOnMakePayment();
		
		ToVerifyMeterTesting_SC_01_TC_13 payment=PageFactory.initElements(driver,ToVerifyMeterTesting_SC_01_TC_13.class);
		payment.enterCardDetail();
	}

}
