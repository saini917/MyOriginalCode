package com.mousemovementconcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseMovementConcept {
	public static WebDriver driver = null;
	public static WebDriverManager manager = null;

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException {
		manager.chromedriver().version("2.40").setup();
		driver = new ChromeDriver();
		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Actions action =new Actions(driver);
		//build method will return actions class object
		action.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@class='submenu']//li//a[contains(text(),'Articles')]")).click();
	}

}
