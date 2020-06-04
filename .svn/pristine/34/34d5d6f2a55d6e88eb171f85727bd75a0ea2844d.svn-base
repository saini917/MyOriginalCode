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
 * @Date: 02-11-2017
 * @Purpose: RTI-APIO Login As Verified
 */
public class NRDA_RTILoginAsAPIO_Verified extends URLPageWSNRDAScript
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
	@DataProvider(name="APIO")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"APIO Credentials");
	}
	
	 @Test(priority=1,dataProvider ="APIO",description="verifyLoginAsAPIO_SC_14_TC_01")
	 public void NRDA_RTI_SC_14_TC_01(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
			{
				WaterAndSewerageLoginPage login_as_APIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
				login_as_APIO.loginAsAPIO(username, password);
			}
	
	 @Test(priority=2,dataProvider ="APIO",description="verifyUploadDocumentFunctionality_SC_14_TC_01")
	 public void NRDA_RTI_SC_14_TC_02(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
			{
				WaterAndSewerageLoginPage login_as_APIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
				login_as_APIO.loginAsAPIO(username, password);
				
				ToverifyRTIAPIO_LoginVerified APIO_LoginVerify=PageFactory.initElements(driver,ToverifyRTIAPIO_LoginVerified.class);
				APIO_LoginVerify.toverifytheuploaddocumentFunctionality_SC_14_TC_02();
				
			}
	
	
	 @Test(priority=3,dataProvider ="APIO",description="verifySubmitFunctionalityWithActionIsVerified_SC_14_TC_03")
	 public void NRDA_RTI_SC_14_TC_03(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
			{
				WaterAndSewerageLoginPage login_as_APIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
				login_as_APIO.loginAsAPIO(username, password);
				
				ToverifyRTIAPIO_LoginVerified APIO_LoginVerify=PageFactory.initElements(driver,ToverifyRTIAPIO_LoginVerified.class);
				APIO_LoginVerify.toverifytheuploaddocumentFunctionality_SC_14_TC_02();
				APIO_LoginVerify.toverifySubmitFunctionalitywithActionIsVerified_SC_14_TC_03();
			}
	
	
 }
	 