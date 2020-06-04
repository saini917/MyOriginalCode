package com.mousemovementconcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropConcept {
	public static WebDriver driver = null;
	public static WebDriverManager manager = null;

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException {
		manager.chromedriver().version("2.40").setup();
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		
		WebElement soruceElement=driver.findElement(By.id("draggable"));
		WebElement targetElement=driver.findElement(By.id("droppable"));
		
		Actions action=new Actions(driver);
		action.clickAndHold(soruceElement).moveToElement(targetElement).release().build().perform();
		
	}

}
