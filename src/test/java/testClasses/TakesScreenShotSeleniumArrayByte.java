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

public class TakesScreenShotSeleniumArrayByte {

	public static void main(String[] args) throws IOException {
		
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
	     TakesScreenshot ts=(TakesScreenshot)driver;
		 driver.manage().window().maximize();
		 driver.get("https://demo.testfire.net/login.jsp");
		 driver.findElement(By.id("uid")).sendKeys("jsmith");
		 driver.findElement(By.id("passw")).sendKeys("demo1234");
		 driver.findElement(By.name("btnSubmit")).click();
		 File destFile=new File("C:\\Users\\Aman\\eclipse-workspace2\\P10AMMaven\\Screenshot\\test10.png");
		 byte[] arr=ts.getScreenshotAs(OutputType.BYTES);
		 FileOutputStream fos=new FileOutputStream(destFile);
		 fos.write(arr); 
		 driver.quit();
	}

}
