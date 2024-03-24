package testClasses;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakesScreenShotSelenium {

	public static void main(String[] args) throws IOException {
		 //Joda API - DateTime API
		 LocalDateTime ldt=LocalDateTime.now();
		 DateTimeFormatter dtf=DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
		 String str=ldt.format(dtf);	 
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
	     TakesScreenshot ts=(TakesScreenshot)driver;
		 driver.manage().window().maximize();
		 driver.get("https://demo.testfire.net/login.jsp");
		 driver.findElement(By.id("uid")).sendKeys("jsmith");
		 driver.findElement(By.id("passw")).sendKeys("demo1234");
		 driver.findElement(By.name("btnSubmit")).click();
		 File destFile=new File("C:\\Users\\Aman\\eclipse-workspace2\\P10AMMaven\\Screenshot\\"+str+".png");
		 File srcFile=ts.getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(srcFile, destFile);
		 driver.quit();
	}
}
