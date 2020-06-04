
package NRDA_RTI;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
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
 * @Date:23-10-2017
 * @Purpose:  Warer And Sewerage RTI Login As  Citizen WithBPL
 */
public class NRDA_RTICitizenWithBPL  extends URLPageWSNRDAScript 
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
	@DataProvider(name="citizen")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"Citizen Credentials");
	}

	
	/*@Test(description="NRDA_Water & Sewerage_RTI_SC_01_TC_01",priority=1,dataProvider ="citizen")
	public void VerifytheLoginAsCitizen_SC_01_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		LoginPageWS_JavaFile logina_citizen=PageFactory.initElements(driver,LoginPageWS_JavaFile.class);
		logina_citizen.loginAsCitizen(username, password);
	}*/
	
	
	/*
	@Test(description="NRDA_Water & Sewerage_RTI_SC_02_TC_01",priority=2,dataProvider ="citizen")
	public void VerifytheLoginAsCitizen_SC_02_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		LoginPageWS_JavaFile logina_citizen=PageFactory.initElements(driver,LoginPageWS_JavaFile.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToverifyWaterAndSewerageRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyWaterAndSewerageRTILoginAsCitizen.class);
		RTI.toverifyDashBoardMenu_SC_02_TC_01();
	}
	*/

	
	@Test(description="NRDA_Water & Sewerage_RTI_SC_03_TC_01",priority=3,dataProvider ="citizen")
	public void VerifytheRTIDetailApplicationForm_SC_03_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToverifyRTILoginAsCitizen RTI=PageFactory.initElements(driver, ToverifyRTILoginAsCitizen.class);
		RTI.clickOnToVerifyRTIConnection02();
		RTI.toverifyLabelsInRTIApplicant_SC_03_TC_01();
	}
}
