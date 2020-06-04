package NRDA_Estate_Project;

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

public class NRDA_Estate_VerifyFunctionalityLoginAs_Manager_AfterLand extends URLPageWSNRDAScript
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
	
	@DataProvider(name="M_Project")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"ProjectManager_Credentials");
	}
	
	@Test(dataProvider ="M_Project",description="toverifyUploaddocumentfield",priority=12)
	public void NRDA_Estate_SC_020_TC_001(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsProject_Manager(username, password);
			
			ToverifyFunctionalityof_M_Project_AfterLand M_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_M_Project_AfterLand.class);
			M_Login.toverifyActionButtonagainsttheApplication();
			M_Login.toverifyActionDropdownFunctionality();
			M_Login.toverifyDepartmentDropdownFunctionality();
			M_Login.toverifySelectUserFunctionality();
			M_Login.toverifyEnterCommentsField();
			M_Login.toverifyUploaddocumentfield();
			M_Login.toverifysubmitbuttonFunctionality();
		}
	
 }
	
