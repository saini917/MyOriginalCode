/**
 * 
 */
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
 * @date: 02-11-2017
 */
public class NRDA_RTILoginAsPIO_Verified extends URLPageWSNRDAScript
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
	@DataProvider(name="PIO")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"PIO Credentials");
	}
	
		@Test(priority=1,dataProvider ="PIO",description="verifyLoginAsPIO_SC_15_TC_01")
		public void NRDA_RTI_SC_15_TC_01(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
			{
				WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
				login_as_PIO.loginAsPIO(username, password);
			}
	
	@Test(priority=2,dataProvider ="PIO",description="verifytheByclickingSendBackToApplicantButtonFunctionality_SC_15_TC_02")
	public void NRDA_RTI_SC_15_TC_02(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTIPIO_LoginVerified PIO_Verified=PageFactory.initElements(driver,ToverifyRTIPIO_LoginVerified.class);
			PIO_Verified.toverifyByClickingCitizenAnswerButtonFunctionality_SC_15_TC_03();
			PIO_Verified.toverifyByClickingSendtoApplicantButtonFunctionality_SC_15_TC_02();
			PIO_Verified.toVerifyErrorMessage();
		}
	
	@Test(priority=3,dataProvider ="PIO",description="verifytheByclickingCitizenAnswerButtonFunctionality_SC_15_TC_03")
	public void NRDA_RTI_SC_15_TC_03(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTIPIO_LoginVerified PIO_Verified=PageFactory.initElements(driver,ToverifyRTIPIO_LoginVerified.class);
			PIO_Verified.toverifyByClickingCitizenAnswerButtonFunctionality_SC_15_TC_03();
			PIO_Verified.toverifyByClickingCitizenAnswerButtonFunctionality();
		}
	
	@Test(priority=4,dataProvider ="PIO",description="verifytheByDemandNoteButtonFunctionality_SC_15_TC_03")
	public void NRDA_RTI_SC_15_TC_04(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTIPIO_LoginVerified PIO_Verified=PageFactory.initElements(driver,ToverifyRTIPIO_LoginVerified.class);
			PIO_Verified.toverifyByClickingCitizenAnswerButtonFunctionality_SC_15_TC_03();
			PIO_Verified.toverifyByClickingDemandNoteButtonFunctionality_SC_15_TC_05();
		}
	
	@Test(priority=5,dataProvider ="PIO",description="verifytheApplicationApprove_SC_15_TC_03")
	public void NRDA_RTI_SC_15_TC_05(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_PIO.loginAsPIO(username, password);
			
			ToverifyRTIPIO_LoginVerified PIO_Verified=PageFactory.initElements(driver,ToverifyRTIPIO_LoginVerified.class);
			PIO_Verified.toverifySubmitFunctionalitywithActionAsApprove_SC_09_TC_15();
		}
	
	
	
}
