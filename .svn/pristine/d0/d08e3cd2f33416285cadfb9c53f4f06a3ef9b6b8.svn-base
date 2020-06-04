/**
 * 
 */
package NRDA_RTI;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sun.media.sound.InvalidFormatException;

import GenericLibrary.ExcelDataDriver;
import LoginLogoutWSNRDAScript.URLPageWSNRDAScript;
import WaterAndSewerageLogin.WaterAndSewerageLoginPage;

/**
 * @author Sarvesh.Nellore
 * @Date: 02-11-2017
 * @Purpose: 
 */
public class NRDA_RTILoginAsHEAD_Verified extends URLPageWSNRDAScript
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
	@DataProvider(name="HEAD")
	public String[][] getExcelData() throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException
	{
		return exceldata.getCellData(filepath,"HEAD Credentials");
	}
	
	    @Test(priority=1,dataProvider ="HEAD",description="verifyLoginAsHead_SC_13_TC_01")
		public void NRDA_RTI_SC_13_TC_01(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
			{
				WaterAndSewerageLoginPage login_as_HEAD=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
				login_as_HEAD.loginAsHead(username, password);
			}
	    
	    @Test(priority=2,dataProvider ="HEAD",description="verifyRTIApplicationReceivedFromEmployee_SC_13_TC_02")
		public void NRDA_RTI_SC_13_TC_02(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
			{
				WaterAndSewerageLoginPage login_as_HEAD=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
				login_as_HEAD.loginAsHead(username, password);
				
				ToverifyRTIHEAD_LoginVerified Head_Login=PageFactory.initElements(driver, ToverifyRTIHEAD_LoginVerified.class);
				Head_Login.toVerifyActionFunctionWithValidData_SC_11_TC_11();
				Head_Login.toVerifySubmitbuttonFunctionalityWithActionFieldISBlank_SC_09_TC_12();
				Head_Login.toverifythefunctionalityofForward_SC_11_TC_14();
				Head_Login.toVerifySubmitbuttonFunctionalityWithActionFieldISBlank();
				
				
			}
	    
	    
	    
	    
	    
	    
	    
	    
	
	
	/*@Test(priority=3,dataProvider ="HEAD",description="verifySubmitFunctionalityWithActionisVerified_SC_13_TC_03")
			public void NRDA_RTI_SC_13_TC_03(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
				{
					WaterAndSewerageLoginPage login_as_HEAD=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
					login_as_HEAD.loginAsHead(username, password);
					
					ToverifyRTIHEAD_LoginVerified Head_Login=PageFactory.initElements(driver, ToverifyRTIHEAD_LoginVerified.class);
					Head_Login.toverifytheuploadButtonFunctionality_SC_13_TC_02();
					Head_Login.toVerifySubmitbuttonFunctionalityWithCommentFieldISBlank_SC_11_TC_13();
					Head_Login.toVerifySubmitbuttonFunctionality();
				}
	
	@Test(priority=4,dataProvider ="HEAD",description="verifySendBackFunctionalityofApplication_SC_13_TC_04")
	public void NRDA_RTI_SC_13_TC_04(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_HEAD=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_HEAD.loginAsHead(username, password);
			
			ToverifyRTIHEAD_LoginVerified Head_Login=PageFactory.initElements(driver, ToverifyRTIHEAD_LoginVerified.class);
			Head_Login.toverifySendBackFunctionalityofApplication_SC_13_TC_04();
		}
*/
	}
