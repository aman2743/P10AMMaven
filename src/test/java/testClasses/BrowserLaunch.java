package testClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {
public static void main(String[] args) {
	 WebDriverManager.chromedriver().setup();
//	 WebDriverManager.firefoxdriver().setup();
//	 WebDriverManager.edgedriver().setup();
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	 driver.get("https://demo.testfire.net/login.jsp");
	 driver.findElement(By.id("uid")).sendKeys("jsmith");
	 driver.findElement(By.id("passw")).sendKeys("demo1234");
	 driver.findElement(By.name("btnSubmit")).click();
	 driver.quit();
	 
	 
}
}
