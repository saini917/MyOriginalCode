package com.multiplewindowshandles;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWindowPopUp {
	public static WebDriver driver;
	public static WebDriverManager manager;

	@SuppressWarnings("static-access")
	public static void main(String[] str) {
		manager.chromedriver().version("2.40").setup();
		driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #3')]")).click();
		
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> itr=handler.iterator();
		
		/*String parentWindowId=itr.next();
		System.out.println("Parent Window ID: "+parentWindowId);
		 
		String childWindowId=itr.next();
		System.out.println("Child Window ID: "+childWindowId);
		
		driver.switchTo().window(childWindowId);
		System.out.println("child window pop up title: "+driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window pop up title: "+driver.getTitle());
		driver.close();*/
		
		while(itr.hasNext()){
			String parentWindowId=itr.next();
			System.out.println("Parent Window ID: "+parentWindowId);
			String childWindowId=itr.next();
			System.out.println("Child Window ID: "+childWindowId);
			if(!parentWindowId.equals(childWindowId)){
				driver.switchTo().window(childWindowId);
				System.out.println("child window pop up title: "+driver.getTitle());
				driver.close();
			}
			driver.switchTo().window(parentWindowId);
			System.out.println("parent window pop up title: "+driver.getTitle());
			driver.close();
			
		}
		
	} 

}
