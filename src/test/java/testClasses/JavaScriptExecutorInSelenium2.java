package testClasses;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorInSelenium2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.get("https://demo.testfire.net/login.jsp");
//		 locate object using javaScript + enter text using java script
//		 js.executeScript("document.getElementById('uid').value='jsmith'");
//		 js.executeScript("document.getElementsByName('passw')[0].value='demo1234'");
//		 js.executeScript("document.getElementsByName('btnSubmit')[0].click()");
//		 driver.close();

//		 locate object using webdriver +  enter text using java script
		WebElement uname = driver.findElement(By.id("uid"));
		js.executeScript("document.getElementById('uid').style.border='5px solid red'");   
		js.executeScript("arguments[0].value='jsmith'", uname);
        Thread.sleep(2000);
		WebElement pwd = driver.findElement(By.name("passw"));
		js.executeScript("arguments[0].value='demo1234'", pwd);

		WebElement btn = driver.findElement(By.name("btnSubmit"));
		js.executeScript("arguments[0].click()", btn);
	}
}
