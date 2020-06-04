package com.userTest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.utility.LoginNameInformation;
import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(com.utility.CustomListener.class)
public class LoginUserInformationTest extends LoginNameInformation {
	public static WebDriver driver;
	public static WebDriverManager manager;
	static WebDriverWait wait;

	@SuppressWarnings("static-access")
	@BeforeMethod
	public void setUp() {

		manager.chromedriver().version("2.40").setup();
		driver = new ChromeDriver();
		driver.get("http://125.19.63.165:8081/HPHDS/Department/index.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test(priority = 1)
	public void loginFarmerUser() throws InterruptedException {
		WebElement loginbutton = driver.findElement(By.xpath("//a[@id='Header_btnLogin']"));
		wait = new WebDriverWait(driver, 50000);
		wait.until(ExpectedConditions.visibilityOf(loginbutton));
		loginbutton.click();

		driver.findElement(By.name("txtUserName")).sendKeys(getUserName("Farmer"));
		driver.findElement(By.name("txtPassword")).sendKeys(getUserPassword("Farmer"));
	}

	@Test(priority = 2)
	public void loginHDOUser() throws InterruptedException {
		WebElement loginbutton = driver.findElement(By.xpath("//a[@id='Header_btnLogin']"));
		wait = new WebDriverWait(driver, 50000);
		wait.until(ExpectedConditions.visibilityOf(loginbutton));
		loginbutton.click();

		driver.findElement(By.name("txtUserName")).sendKeys(getUserName("HDO"));
		driver.findElement(By.name("txtPassword")).sendKeys(getUserPassword("HDO"));
	}

	@Test(priority = 3)
	public void loginSMSUser() throws InterruptedException {
		WebElement loginbutton = driver.findElement(By.xpath("//a[@id='Header_btnLogin']"));
		wait = new WebDriverWait(driver, 50000);
		wait.until(ExpectedConditions.visibilityOf(loginbutton));
		loginbutton.click();

		driver.findElement(By.name("txtUserName")).sendKeys(getUserName("SMS"));
		driver.findElement(By.name("txtPassword")).sendKeys(getUserPassword("SMS"));
	}

	@Test(priority = 4)
	public void loginDDHUser() throws InterruptedException {
		WebElement loginbutton = driver.findElement(By.xpath("//a[@id='Header_btnLogin']"));
		wait = new WebDriverWait(driver, 50000);
		wait.until(ExpectedConditions.visibilityOf(loginbutton));
		loginbutton.click();

		driver.findElement(By.name("txtUserName")).sendKeys(getUserName("DDH"));
		driver.findElement(By.name("txtPassword")).sendKeys(getUserPassword("DDH"));
	}

}
