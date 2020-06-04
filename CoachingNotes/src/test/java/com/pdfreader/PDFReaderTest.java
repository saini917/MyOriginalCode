package com.pdfreader;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PDFReaderTest {
	public static WebDriver driver;
	public static WebDriverManager manager;
	static WebDriverWait wait;

	@SuppressWarnings("static-access")
	@Test
	public void pdfReader() throws FindFailed, IOException {
		manager.chromedriver().version("2.40").setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// driver.get("https://www.betterteam.com/downloads/employee-information-form-download-20170810.pdf");
		driver.get("file:///C:/Users/deepak.saini/Downloads/sample.pdf");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		URL url = new URL(currentUrl);
		InputStream is = url.openStream();
		BufferedInputStream fileParse = new BufferedInputStream(is);
		PDDocument document = null;
		document = PDDocument.load(fileParse);
		String pdfContent = new PDFTextStripper().getText(document);
		System.out.println(pdfContent);

		/*
		 * Assert.assertTrue(pdfContent.contains("Company Name"));
		 * Assert.assertTrue(pdfContent.contains("Personal Information"));
		 * Assert.assertTrue(pdfContent.contains("Full Name:"));
		 */

	}
}
