package com.barcode;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BarcodeHandle {
	public static WebDriver driver;
	public static WebDriverManager manager;

	@SuppressWarnings("static-access")
	@Test
	public void barCodeTest() throws IOException, NotFoundException {

		manager.chromedriver().version("2.40").setup();
		driver = new ChromeDriver();
		driver.get("https://barcode.tec-it.com/en");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		String barCodeURL = driver.findElement(By.tagName("img")).getAttribute("src");
		System.out.println(barCodeURL);
		
		URL url = new URL(barCodeURL);
		BufferedImage bufferedImage=ImageIO.read(url);
		
		LuminanceSource luminanceSource=new BufferedImageLuminanceSource(bufferedImage);
		BinaryBitmap binaryBitmap =new BinaryBitmap(new HybridBinarizer(luminanceSource));
		Result result=new MultiFormatReader().decode(binaryBitmap);
		System.out.println("Barcode name: "+result.getText());

	}

}
