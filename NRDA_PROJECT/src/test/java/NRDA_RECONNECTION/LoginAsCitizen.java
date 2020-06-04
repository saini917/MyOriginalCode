package NRDA_RECONNECTION;

import java.awt.AWTException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
		WebElement web1=driver.findElement(By.xpath("//a[@class='dropdown-toggle' and@role='button']/span"));
		Actions action = new Actions(driver);
		WebDriverWait wait1 = new WebDriverWait(driver,50);
		wait1.until(ExpectedConditions.visibilityOf( web1));
		action.moveToElement(web1).build().perform();
		waitForSomeTime();

		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		driver.close();

	}
	@DataProvider(name="Valid_Connection")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"Citizen_login");
	}


	@Test(description="verify dashboard",priority=1,dataProvider="Valid_Connection")
	public void NRDA_Reconnection_SC_01_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		NRDA_Reconnection_SC_01_TC_01 display=PageFactory.initElements(driver,NRDA_Reconnection_SC_01_TC_01.class);
		display.clickOnFreshApp();
		display.clickOnPublicHealth();
		display.clickOnReconnection();
		display.verifyExistDisconnection();
		display.verifyDisplay();
	}

	@Test(description="verify disconnection data dashboard",priority=2,dataProvider="Valid_Connection")
	public void NRDA_Reconnection_SC_01_TC_02(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		NRDA_Reconnection_SC_01_TC_01 display=PageFactory.initElements(driver,NRDA_Reconnection_SC_01_TC_01.class);
		display.clickOnFreshApp();
		display.clickOnPublicHealth();
		display.clickOnReconnection();
		display.verifyExistDisconnection();
		
		NRDA_Reconnection_SC_01_TC_02 disconnectiondashboarddata=PageFactory.initElements(driver,NRDA_Reconnection_SC_01_TC_02.class);
		disconnectiondashboarddata.clickOnApplicantDetails();
		disconnectiondashboarddata.clickOnConnectionDetails();
		disconnectiondashboarddata.clickOnBuildingDetails();
	}
	
	@Test(description="verify submit",priority=3,dataProvider="Valid_Connection")
	public void NRDA_Reconnection_SC_01_TC_03(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		NRDA_Reconnection_SC_01_TC_01 display=PageFactory.initElements(driver,NRDA_Reconnection_SC_01_TC_01.class);
		display.clickOnFreshApp();
		display.clickOnPublicHealth();
		display.clickOnReconnection();
		display.verifyExistDisconnection();
		
		NRDA_Reconnection_SC_01_TC_02 disconnectiondashboarddata=PageFactory.initElements(driver,NRDA_Reconnection_SC_01_TC_02.class);
		disconnectiondashboarddata.clickOnApplicantDetails();
		disconnectiondashboarddata.clickOnConnectionDetails();
		disconnectiondashboarddata.clickOnBuildingDetails();
		
		NRDA_Reconnection_SC_01_TC_03 submit=PageFactory.initElements(driver,NRDA_Reconnection_SC_01_TC_03.class);
		submit.clickOnSubmit();
		submit.getReconnectionAppNum();
	}

}
