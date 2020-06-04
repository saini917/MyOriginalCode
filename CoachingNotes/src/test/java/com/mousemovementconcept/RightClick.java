package com.mousemovementconcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {
	public static WebDriver driver = null;
	public static WebDriverManager manager = null;

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		manager.chromedriver().version("2.40").setup();
		driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Actions action = new Actions(driver);
		WebElement rightClickButton = driver.findElement(By.cssSelector(".context-menu-one"));
		action.contextClick(rightClickButton).build().perform();

		WebElement copy = driver.findElement(By.cssSelector(".context-menu-icon-copy"));
		String copyText = copy.getText();
		System.out.println(copyText);
		copy.click();

	}

}
