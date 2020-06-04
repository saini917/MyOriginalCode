/**
 * 
 */
package NRDA_ENVIRONMENT;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;


/**
 * @author Sarvesh.Nellore
 * @Date: 30-11-2017
 * @Purpose: To verify the Functionality of Login
 */
public class ToverifytheFunctionalityof_Environment_Login extends CommonLibrary 
{
	Logger log=Logger.getLogger("devpinoyLogger");
	ExcelDataDriver excel=new ExcelDataDriver();
	
	
	@FindBy(xpath="//table[@style='width:100%;']/tbody/tr/td/div/h3/a")
	private List <WebElement> Menu_DashBoard;
	
	public void toverifyDashBoardMenu() throws InterruptedException
	{
		waitForSomeTime();
		for(WebElement MenuInDashBoard:Menu_DashBoard)
		{
			HighlightOnElement(MenuInDashBoard);
			if(MenuInDashBoard.isDisplayed())
			{
				String DashBoardMenu=MenuInDashBoard.getText();
			System.out.println("MenuInDasHboard Are:"+DashBoardMenu);
			}
		}
	
	}
	
	@FindBy(xpath=".//*[@id='loginForm:user']")
	private WebElement emailid;

	@FindBy(xpath=".//*[@id='loginForm:password']")
	private WebElement password;

	@FindBy(xpath="//div/select")
	private WebElement usertype;

	@FindBy(xpath=".//*[@id='loginForm']/div[12]")
	private WebElement anylogo;

	@FindBy(xpath="(//button/span[contains(text(),'Submit')])[1]")
	private WebElement submit;
	
	public void LoginwithValidCredentials_SC_02_TC_01() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		HighlightOnElement(emailid);
		excel.getExcelData(emailid, "Login_Data", 0, 1);
		
		HighlightOnElement(password);
		excel.getExcelData(password, "Login_Data", 1, 1);
		
		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Citizen /Architect Login");
		waitForSomeTime();
		
		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();
	
	}
	
	public void logoutWS() throws InterruptedException
	{
		waitForSomeTime();
		WebElement web1=driver.findElement(By.xpath("//a[@class='dropdown-toggle' and@role='button']/span"));
		Actions action = new Actions(driver);
		action.moveToElement(web1).build().perform();
		waitForSomeTime();
		waitForSomeTime();
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		waitForSomeTime();
		driver.close();

	}
	
	@FindBy(xpath=".//*[@id='growl_container']/div/div/div[2]/span")
	private WebElement ErrorMsg_Login;
	
	public void LoginwithInValidUser_SC_02_TC_02() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		HighlightOnElement(emailid);
		excel.getExcelData(emailid, "Login_Data", 0, 2);
		
		HighlightOnElement(password);
		excel.getExcelData(password, "Login_Data", 1, 2);
		
		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Citizen /Architect Login");
		waitForSomeTime();
		
		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();
		
		HighlightOnElement(ErrorMsg_Login);
		String ActualMsg=ErrorMsg_Login.getText();
		String ExpectedMsg="Invalid Login details";
		Assert.assertEquals(ActualMsg, ExpectedMsg);
		waitForSomeTime();
		driver.close();
		
	}
	
	public void LoginwithInValidPassword_SC_02_TC_03() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		HighlightOnElement(emailid);
		excel.getExcelData(emailid, "Login_Data", 0, 3);
		
		HighlightOnElement(password);
		excel.getExcelData(password, "Login_Data", 1, 3);
		
		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Citizen /Architect Login");
		waitForSomeTime();
		
		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();
		
		HighlightOnElement(ErrorMsg_Login);
		String ActualMsg=ErrorMsg_Login.getText();
		String ExpectedMsg="Invalid Login details";
		Assert.assertEquals(ActualMsg, ExpectedMsg);
		waitForSomeTime();
		driver.close();
		
	}
	
	public void LoginwithBlankFields_SC_02_TC_04() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		HighlightOnElement(emailid);
		excel.getExcelData(emailid, "Login_Data", 0, 4);
		
		HighlightOnElement(password);
		excel.getExcelData(password, "Login_Data", 1, 4);
		
		HighlightOnElement(usertype);
		Select sel=new Select(usertype);
		sel.selectByVisibleText("Citizen /Architect Login");
		waitForSomeTime();
		
		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();
		
		HighlightOnElement(ErrorMsg_Login);
		String ErrorMsg=ErrorMsg_Login.getText();
		System.out.println("Error Msg Is:"+ErrorMsg);
		waitForSomeTime();
		driver.close();
		
	}
	
	
	

}
