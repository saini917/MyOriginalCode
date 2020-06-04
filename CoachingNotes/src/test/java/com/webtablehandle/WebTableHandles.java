package com.webtablehandle;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandles {

	public static WebDriver driver;
	public static WebDriverManager manager;

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		manager.chromedriver().version("2.40").setup();
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		int rowCount = rows.size();
		System.out.println("Total rows in web table: " + rowCount);

		// *[@id="customers"]/tbody/tr[2]/td[1]
		// *[@id="customers"]/tbody/tr[3]/td[1]
		// *[@id="customers"]/tbody/tr[4]/td[1]
		// *[@id="customers"]/tbody/tr[6]/td[1]

		String beforeXpathCompany = "//*[@id='customers']/tbody/tr[";
		String afterXpathCompany = "]/td[1]";

		// handle webtable rows
		for (int i = 2; i <= rowCount; i++) {
			String actualXpathCompany = beforeXpathCompany + i + afterXpathCompany;
			WebElement elementCompany = driver.findElement(By.xpath(actualXpathCompany));
			System.out.println(elementCompany.getText());

			if (elementCompany.getText().equals("Island Trading")) {
				System.out.println(
						"company name: " + elementCompany.getText() + " is found " + "at postion : " + (i - 1));
				break;
			}
		}

		System.out.println("**********************");
		// *[@id="customers"]/tbody/tr[2]/td[2]
		// *[@id="customers"]/tbody/tr[3]/td[2]

		String beforeXpathContact = "//*[@id='customers']/tbody/tr[";
		String afterXpathContact = "]/td[2]";

		for (int i = 2; i <= rowCount; i++) {
			String actualXpathContact = beforeXpathContact + i + afterXpathContact;
			WebElement elementContact = driver.findElement(By.xpath(actualXpathContact));
			System.out.println(elementContact.getText());

			if (elementContact.getText().equals("Roland Mendel")) {
				System.out.println(
						"contact number: " + elementContact.getText() + " is found " + "at postion : " + (i - 1));
				break;
			}
		}

		System.out.println("**********************");
		// *[@id="customers"]/tbody/tr[2]/td[3]
		// *[@id="customers"]/tbody/tr[3]/td[3]

		String beforeXpathCountry = "//*[@id='customers']/tbody/tr[";
		String afterXpathCountry = "]/td[3]";

		for (int i = 2; i <= rowCount; i++) {
			String actualXpathConuntry = beforeXpathCountry + i + afterXpathCountry;
			WebElement elementCountry = driver.findElement(By.xpath(actualXpathConuntry));
			System.out.println(elementCountry.getText());

			if (elementCountry.getText().equals("UK")) {
				System.out.println(
						"country name: " + elementCountry.getText() + " is found " + "at postion : " + (i - 1));
				break;
			}
		}

		// handle web table colums

		// *[@id="customers"]/tbody/tr[1]/th[1]
		// *[@id="customers"]/tbody/tr[1]/th[2]
		// *[@id="customers"]/tbody/tr[1]/th[3]
		String colBeforeXpath = "//*[@id='customers']/tbody/tr[1]/th[";
		String colAfterXpath = "]";
		List<WebElement> cols = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[1]/th"));
		int colCount = cols.size();
		System.out.println("Total number of columns are: " + colCount);

		System.out.println("Columns values are: ");
		for (int i = 1; i <= colCount; i++) {
			WebElement element = driver.findElement(By.xpath(colBeforeXpath + i + colAfterXpath));
			String colText=element.getText();
			System.out.println(colText);
		}

		driver.close();

	}

}
