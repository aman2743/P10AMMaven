package ExceptionTypes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementReferenceException1 {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
//	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(1));
	driver.get("https://omayo.blogspot.com/");
	driver.findElement(By.id("blogsmenu")).click();
	driver.findElement(By.id("selenium143")).click();
}
}
