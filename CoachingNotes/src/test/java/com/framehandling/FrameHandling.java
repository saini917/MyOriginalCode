package com.framehandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandling {
	static WebDriver driver;
	static WebDriverManager manager;

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException {

		manager.firefoxdriver().arch64().version("0.23.0").setup();
		driver = new FirefoxDriver();
		driver.get("https://ui.cogmento.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.findElement(By.name("email")).sendKeys("deesaini1987@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Reema@1994");
		
		driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[contains(text(),'Login')])[1]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();
		
		driver.findElement(By.name("first_name")).sendKeys("deepak");
		
		
	}

}
