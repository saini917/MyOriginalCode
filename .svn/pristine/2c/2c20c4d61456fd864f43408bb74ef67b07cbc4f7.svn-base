package NRDA_NegativeCases;

import java.awt.AWTException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericLibrary.ExcelDataDriver;
import LoginLogoutWSNRDAScript.URLPageWSNRDAScript;
import WaterAndSewerageLogin.WaterAndSewerageLoginPage;

@Listeners(GenericLibrary.ListenerDriver.class)
public class LoginAsNegativeValue extends URLPageWSNRDAScript
{
	ExcelDataDriver excel=new ExcelDataDriver();
	String filepath="C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\NRDA_TESTDATA.xlsx";

	@AfterMethod 
	public void logoutWS() throws InterruptedException
	{
		driver.close();
		Reporter.log("Browser closed successfully",true);

	}
	
	
	@Test(description="verify invalid Password login",priority=1)
	public void NRDA_Sewerage_New_Connection_Negative_SC_02_TC_02() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		
		ToVerifyWaterAndSewerage_SC_02_TC_02 cases=PageFactory.initElements(driver,ToVerifyWaterAndSewerage_SC_02_TC_02.class);
		cases.invalidPasswordLogin();
		cases.getErrormsg();
	}
	

	@Test(description="verify invalid Username login",priority=2)
	public void NRDA_Sewerage_New_Connection_Negative_SC_02_TC_03() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		
		ToVerifyWaterAndSewerage_SC_02_TC_03 cases=PageFactory.initElements(driver,ToVerifyWaterAndSewerage_SC_02_TC_03.class);
		cases.invalidUsernameLogin();
		cases.getErrormsg();
	}
	
	@Test(description="verify invalid Username and Password login",priority=3)
	public void NRDA_Sewerage_New_Connection_Negative_SC_02_TC_04() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		
		ToVerifyWaterAndSewerage_SC_02_TC_04 cases=PageFactory.initElements(driver,ToVerifyWaterAndSewerage_SC_02_TC_04.class);
		cases.invalidUsernamePasswordLogin();
		cases.getErrormsg();
	}
	
	@Test(description="verify valid Username and blank Password login",priority=4)
	public void NRDA_Sewerage_New_Connection_Negative_SC_02_TC_05() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		
		ToVerifyWaterAndSewerage_SC_02_TC_05 cases=PageFactory.initElements(driver,ToVerifyWaterAndSewerage_SC_02_TC_05.class);
		cases.validUsernameLogin();
		cases.getErrormsg();
	}

	@Test(description="verify valid Password and blank Username  login",priority=5)
	public void NRDA_Sewerage_New_Connection_Negative_SC_02_TC_06() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		
		ToVerifyWaterAndSewerage_SC_02_TC_06 cases=PageFactory.initElements(driver,ToVerifyWaterAndSewerage_SC_02_TC_06.class);
		cases.validPasswordLogin();
		cases.getErrormsg();
	}
	
	@Test(description="verify blank Password and blank Username  login",priority=6)
	public void NRDA_Sewerage_New_Connection_Negative_SC_02_TC_07() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		
		ToVerifyWaterAndSewerage_SC_02_TC_07 cases=PageFactory.initElements(driver,ToVerifyWaterAndSewerage_SC_02_TC_07.class);
		cases.blankUsernamePasswordLogin();
		cases.getErrormsg();
	}
}
