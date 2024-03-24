package testClasses;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorScrolling {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		js.executeScript("window.scrollTo(1000,0)");
//		driver.findElement(By.xpath("//i[@class='fa fa-hand-o-up']")).click();
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,1000)");
//		driver.findElement(By.xpath("//i[@class='fa fa-hand-o-up']")).click();
//		Thread.sleep(2000);
//      Till bottom
//		js.executeScript("window.scrollTo(0,3077)");
//		driver.findElement(By.xpath("//i[@class='fa fa-hand-o-up']")).click();
		Thread.sleep(2000);
		
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);

	}
}
