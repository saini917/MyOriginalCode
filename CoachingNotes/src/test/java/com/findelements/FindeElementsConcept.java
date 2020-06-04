package com.findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FindeElementsConcept {
	static WebDriver driver;
	static WebDriverManager manager;

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException {

		manager.firefoxdriver().arch64().version("0.23.0").setup();
		driver = new FirefoxDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//get the count of links on the page
		// get the text of each links on the page
		
		List<WebElement> linklist=driver.findElements(By.tagName("a"));
		//size of link
		System.out.println(linklist.size());
		for( int i=0;i<linklist.size();i++){
			String linklists=linklist.get(i).getText();
			System.out.println(linklists);
		}
		
		List<WebElement> inputlist=driver.findElements(By.tagName("input"));
		//size of input
		System.out.println(inputlist.size());
		
		
		List<WebElement> buttonlist=driver.findElements(By.tagName("button"));
		//size of button
		System.out.println(buttonlist.size());
		
	}
}
