package testClasses;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.bouncycastle.util.encoders.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakesScreenShotSeleniumBase64 {

	public static void main(String[] args) throws IOException {
		
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
	     TakesScreenshot ts=(TakesScreenshot)driver;
		 driver.manage().window().maximize();
		 driver.get("https://demo.testfire.net/login.jsp");
		 driver.findElement(By.id("uid")).sendKeys("jsmith");
		 driver.findElement(By.id("passw")).sendKeys("demo1234");
		 driver.findElement(By.name("btnSubmit")).click();
		 File destFile=new File("C:\\Users\\Aman\\eclipse-workspace2\\P10AMMaven\\Screenshot\\test1.png");
		 String base64code=ts.getScreenshotAs(OutputType.BASE64);
		 byte[] arr=java.util.Base64.getDecoder().decode(base64code);
		 FileOutputStream fos=new FileOutputStream(destFile);
		 fos.write(arr); 
		 driver.quit();
	}

}
