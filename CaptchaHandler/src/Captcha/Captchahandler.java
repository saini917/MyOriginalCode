package Captcha;

import java.io.File;
import java.io.IOException;
import java.util.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.assertthat.selenium_shutterbug.utils.web.ScrollStrategy;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class Captchahandler {

	//String passWord = "12345@Testing";
	
		static String chromeDriverKey ="webdriver.chrome.driver";
		static String chromeDriverPath = "C:\\Users\\deepak.saini\\Downloads\\Python Docs\\chromedriver_win32\\chromedriver.exe";
		static WebDriver driver;
		String password=decodedPassword("MTIzNDVAVGVzdGluZw==");
		
		@Test
		public void encode() throws InterruptedException, IOException, TesseractException
		{
			/*byte[] encodedPassword = Base64.encode(passWord.getBytes());
			System.out.println("Encoded Password is: " +new String(encodedPassword));
			
			String decodedPassword = Base64.base64Decode("MTIzNDVAVGVzdGluZw==");
			System.out.println("Decoded Password is: " +new String(decodedPassword));*/
			

				 // Open browser
			       System.setProperty(chromeDriverKey, chromeDriverPath);
			       driver = (WebDriver) new ChromeDriver();
			       driver.manage().window().maximize();
			       driver.get("http://125.19.63.165:8082/GeneralpageWithTemplate.aspx?key=HOMEKEY0001");
			       
			       driver.findElement(By.cssSelector("#ctl00_PublicMainHeader_LinkButton1")).click();
			       
			       driver.findElement(By.cssSelector("#txtUserName")).sendKeys("DevTest123");
			       driver.findElement(By.cssSelector("#txtPassword")).sendKeys(password);
			       
			       File img=driver.findElement(By.id("imgCapture")).getScreenshotAs(OutputType.FILE);
			       String path = System.getProperty("user.dir")+"/screenshots/captcha.png";
			       
			   
			       
			       ITesseract image=new Tesseract();
			       String imageText=image.doOCR(new File(path));
			       System.out.println(imageText);
			       String finalCaptcha = imageText.replaceAll("[^a-zA-Z0-9]","");
			       System.out.println(finalCaptcha);
			       
			       
			       driver.findElement(By.cssSelector("#btnSubmit")).click();
			       Thread.sleep(5000);
			       Shutterbug.shootPage(driver,ScrollStrategy.WHOLE_PAGE).withName("HomePage").save();
			       
			       
			       
			       WebElement logout=driver.findElement(By.cssSelector("#ctl00_ucfrmCitizenMenu_LinkButton_Logout"));
			       Actions actions = new Actions(driver);
			       actions.clickAndHold(logout).build().perform();
			       logout.click();
			       Shutterbug.shootPage(driver,ScrollStrategy.WHOLE_PAGE).withName("Pop Up Message").save();
			       
			       
			       driver.findElement(By.cssSelector("#ctl00_ucfrmCitizenMenu_Logout_btnRemoveYes")).click();
			       Thread.sleep(3000);
			       Shutterbug.shootPage(driver,ScrollStrategy.WHOLE_PAGE).withName("LogoutPage").save();
			       
			       driver.quit();
			       
		}
		
		public static String decodedPassword(String passWord)
		{
			String decodedPassword = Base64.base64Decode(passWord);
			return new String(decodedPassword);
		}
}
