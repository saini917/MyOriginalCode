package com.otphandle;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.twilio.Twilio;
import com.twilio.base.ResourceSet;
import com.twilio.rest.api.v2010.account.Message;
import io.github.bonigarcia.wdm.WebDriverManager;


public class OTPHandle {
	public static WebDriver driver;
	public static WebDriverManager manager;
	static WebDriverWait wait;
	public static final String ACCOUNT_SID = "AC7db9d0d97f62fba5e7b365afc9787694";
	public static final String AUTH_TOKEN = "542eca2d107b7bf8301a28c2b440e53c";

	@SuppressWarnings("static-access")
	@Test
	public void test() {

		manager.chromedriver().version("2.40").setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.cssSelector("a#nav-link-accountList")).click();

		driver.findElement(By.cssSelector("a#createAccountSubmit")).click();

		driver.findElement(By.cssSelector("input#ap_customer_name")).sendKeys("deepak");

		driver.findElement(By.cssSelector("#auth-country-picker-container")).click();
		driver.findElement(By.cssSelector("ul>li:nth-of-type(213)")).click();
		driver.findElement(By.cssSelector("input#ap_phone_number")).sendKeys("2053033443");

		driver.findElement(By.cssSelector("input#ap_password")).sendKeys("Reema@1994");

		driver.findElement(By.cssSelector("#continue")).click();

		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		String smsBody = getMessage();
		System.out.println(smsBody);
		String OTPNumber = smsBody.replaceAll("[^-?0-9]+", "");
		System.out.println(OTPNumber);
		
		driver.findElement(By.cssSelector("input#auth-pv-enter-code")).sendKeys(OTPNumber);
	}

	// get the OTP using Twillo APIs:

	public static String getMessage() {
		return getMessages().filter(m -> m.getDirection().compareTo(Message.Direction.INBOUND) == 0)
				.filter(m -> m.getTo().equals("+12053033443")).map(Message::getBody).findFirst()
				.orElseThrow(IllegalStateException::new);
	}

	private static Stream<Message> getMessages() {
		ResourceSet<Message> messages = Message.reader(ACCOUNT_SID).read();
		return StreamSupport.stream(messages.spliterator(), false);
	}

}
