package NRDA_RTI;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericLibrary.ExcelDataDriver;
import LoginLogoutWSNRDAScript.URLPageWSNRDAScript;
import WaterAndSewerageLogin.WaterAndSewerageLoginPage;



/**
 * @author Sarvesh.Nellore
 *
 */
public class NRDA_LoginAsEE extends URLPageWSNRDAScript
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
		waitForSomeTime();
		driver.close();

	}
	@DataProvider(name="Executive engineer")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"Executive Engineer Credentials");
	}
	
	@Test(priority=1,dataProvider ="Executive engineer",description="verifyLoginAsEE_NRDA_RTI_SC_8_TC_01")
	public void NRDA_RTI_SC_12_TC_01(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
	}
	
	@Test(priority=2,dataProvider ="Executive engineer",description="verifyDashboardLoginAsEE_NRDA_RTI_SC_8_TC_02")
	public void NRDA_RTI_SC_12_TC_02(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToverifyRTILoginAsEE dashboard=PageFactory.initElements(driver,ToverifyRTILoginAsEE.class);
		dashboard.toVerifyDashBoardAsEE02();
		dashboard.toVerifyMenuFieldsOnDashBoard();
	}
	
	@Test(priority=3,dataProvider ="Executive engineer",description="toverifythefunctionalityofpaginationinPendingApplication_SC_09_TC_07")
	public void NRDA_RTI_SC_12_TC_03(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToverifyRTILoginAsEE dashboard=PageFactory.initElements(driver,ToverifyRTILoginAsEE.class);
		dashboard.toVerifyPendingApplicationLink_SC_06_TC_02();
		dashboard.toverifythefunctionalityofpaginationinPendingApplication_SC_09_TC_07();
	}
	
	@Test(priority=4,dataProvider ="Executive engineer",description="toVerifySearchFieldAsPendingApplicationNumberAsInValidNumber")
	public void NRDA_RTI_SC_12_TC_04(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToverifyRTILoginAsEE dashboard=PageFactory.initElements(driver,ToverifyRTILoginAsEE.class);
		dashboard.toVerifyPendingApplicationLink_SC_06_TC_02();
		dashboard.toVerifySearchFieldAsPendingApplicationNumberAsInValidNumber_SC_06_TC_03();
	}
	
	@Test(priority=5,dataProvider ="Executive engineer",description="toVerifySearchFieldAsPendingApplicationNumberAsEnterSpecialCharacters")
	public void NRDA_RTI_SC_12_TC_05(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToverifyRTILoginAsEE dashboard=PageFactory.initElements(driver,ToverifyRTILoginAsEE.class);
		dashboard.toVerifyPendingApplicationLink_SC_06_TC_02();
		dashboard.toVerifySearchFieldAsPendingApplicationNumberAsEnterSpecialCharacters_SC_06_TC_05();
	}
	
	@Test(priority=6,dataProvider ="Executive engineer",description="toVerifySearchFieldAsPendingApplicationNumberAsEnterAlphabetsonly")
	public void NRDA_RTI_SC_12_TC_06(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToverifyRTILoginAsEE dashboard=PageFactory.initElements(driver,ToverifyRTILoginAsEE.class);
		dashboard.toVerifyPendingApplicationLink_SC_06_TC_02();
		dashboard.toVerifySearchFieldAsPendingApplicationNumberAsEnterAlphabetsonly_SC_06_TC_06();
	}
	
	@Test(priority=7,dataProvider ="Executive engineer",description="toVerifySearchFieldAsPendingApplicationNumberAsBlankField")
	public void NRDA_RTI_SC_12_TC_07(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToverifyRTILoginAsEE dashboard=PageFactory.initElements(driver,ToverifyRTILoginAsEE.class);
		dashboard.toVerifyPendingApplicationLink_SC_06_TC_02();
		dashboard.toVerifySearchFieldAsPendingApplicationNumberAsBlankField_SC_06_TC_04();
	}
	
	@Test(priority=8,dataProvider ="Executive engineer",description="toVerifySearchFieldAsPendingApplicationNumberAsBlankField")
	public void NRDA_RTI_SC_12_TC_08(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToverifyRTILoginAsEE dashboard=PageFactory.initElements(driver,ToverifyRTILoginAsEE.class);
		dashboard.toVerifyPendingApplicationLink_SC_06_TC_02();
		dashboard.toVerifySearchFieldAsPendingApplicationNumberAsValid_SC_06_TC_04();
	}
	
	@Test(priority=9,dataProvider ="Executive engineer",description="toVerifyFunctionality of Close Button")
	public void NRDA_RTI_SC_12_TC_09(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToverifyRTILoginAsEE dashboard=PageFactory.initElements(driver,ToverifyRTILoginAsEE.class);
		dashboard.toVerifyPendingApplicationLink_SC_06_TC_02();
		dashboard.toverifythefunctionalityofCloseButton_SC_09_TC_07();
	}
	
	
	@Test(priority=10,dataProvider ="Executive engineer",description="toverifythefunctionalityofUpdateButtonWithoutAnswe")
	public void NRDA_RTI_SC_12_TC_10(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToverifyRTILoginAsEE dashboard=PageFactory.initElements(driver,ToverifyRTILoginAsEE.class);
		dashboard.toVerifyPendingApplicationLink_SC_06_TC_02();
		dashboard.toverifythefunctionalityofUpdateButtonWithoutAnswer_SC_09_TC_07();
	}
	
	
	@Test(priority=11,dataProvider ="Executive engineer",description="toverifyUpdateanswer")
	public void NRDA_RTI_SC_12_TC_11(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToverifyRTILoginAsEE dashboard=PageFactory.initElements(driver,ToverifyRTILoginAsEE.class);
		dashboard.toVerifyPendingApplicationLink_SC_06_TC_02();
		dashboard.toverifyUpdateanswer();
	}
	
	
	
	
	
	
	
	
	
	/*
	@Test(priority=3,dataProvider ="Executive engineer",description="NRDA_Water & Sewerage_RTI_NRDA_RTI_SC_8_TC_05")
	public void verifyRTIPendingCountLoginAsEE_NRDA_RTI_SC_8_TC_05(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToverifyRTILoginAsEE pendingcount=PageFactory.initElements(driver,ToverifyRTILoginAsEE.class);
		pendingcount.toVerifyPendingList05();
	}
	
	@Test(priority=4,dataProvider ="Executive engineer",description="NRDA_Water & Sewerage_RTI_NRDA_RTI_SC_8_TC_06")
	public void verifyRTIPendingApplicationLoginAsEE_NRDA_RTI_SC_8_TC_06(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToverifyRTILoginAsEE pendingcount=PageFactory.initElements(driver,ToverifyRTILoginAsEE.class);
		pendingcount.toVerifyPendingApplication06();
	}
	
	@Test(priority=5,dataProvider ="Executive engineer",description="NRDA_Water & Sewerage_RTI_NRDA_RTI_SC_8_TC_11")
	public void verifyRTIPendingApplicationInvalidLoginAsEE_NRDA_RTI_SC_8_TC_11(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToverifyRTILoginAsEE pendingcount=PageFactory.initElements(driver,ToverifyRTILoginAsEE.class);
		pendingcount.toVerifySearchFunwithInvalidData11();
	}

	
	@Test(priority=6,dataProvider ="Executive engineer",description="NRDA_Water & Sewerage_RTI_NRDA_RTI_SC_8_TC_12")
	public void verifyRTIPendingApplicationInvalidLoginAsEE_NRDA_RTI_SC_8_TC_12(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToverifyRTILoginAsEE pendingcount=PageFactory.initElements(driver,ToverifyRTILoginAsEE.class);
		pendingcount.toVerifySearchFunwithInvalidData12();
	}
	
	@Test(priority=6,dataProvider ="Executive engineer",description="NRDA_Water & Sewerage_RTI_NRDA_RTI_SC_8_TC_13")
	public void verifyRTIPendingApplicationValidLoginAsEE_NRDA_RTI_SC_8_TC_13(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		LoginPageWS_JavaFile login_as_EE=PageFactory.initElements(driver,LoginPageWS_JavaFile.class);
		login_as_EE.loginAsEE(username, password);
		
		WaterAndSewerageRTILoginAsEE pendingcount=PageFactory.initElements(driver,WaterAndSewerageRTILoginAsEE.class);
		pendingcount.toVerifySearchFunwithValidData13();
	}
	
	@Test(priority=7,dataProvider ="Executive engineer",description="NRDA_Water & Sewerage_RTI_NRDA_RTI_SC_8_TC_14")
	public void verifyRTIPendingApplicationValidLoginAsEE_NRDA_RTI_SC_8_TC_14(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToverifyRTILoginAsEE pendingcount=PageFactory.initElements(driver,ToverifyRTILoginAsEE.class);
		pendingcount.toVerifyActionFunWithValidData14();
	}
	
	@Test(priority=8,dataProvider ="Executive engineer",description="NRDA_Water & Sewerage_RTI_NRDA_RTI_SC_8_TC_15")
	public void verifyRTIPendingApplicationValidLoginAsEE_NRDA_RTI_SC_8_TC_15(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToverifyRTILoginAsEE pendingcount=PageFactory.initElements(driver,ToverifyRTILoginAsEE.class);
		pendingcount.toVerifyUpdateFunWithValidData15();
	}
	
	@Test(priority=9,dataProvider ="Executive engineer",description="NRDA_Water & Sewerage_RTI_NRDA_RTI_SC_8_TC_16")
	public void verifyRTIPendingApplicationValidLoginAsEE_NRDA_RTI_SC_8_TC_16(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		ToverifyRTILoginAsEE pendingcount=PageFactory.initElements(driver,ToverifyRTILoginAsEE.class);
		pendingcount.toVerifyUpdateFunWithInvalidData16();
	}*/
}
