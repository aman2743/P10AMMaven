package ExceptionTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NotInteractableException {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.testfire.net/login.jsp");
	Thread.sleep(2000);
	driver.close();
	driver.getCurrentUrl();
//	driver.findElement(By.xpath("//td[contains(text(),'Username:')]")).sendKeys("jsmith");
//	driver.findElement(By.id("login")).sendKeys("Test123");
	driver.get("https://omayo.blogspot.com/");
//	driver.findElement(By.className("gsc-input")).sendKeys("aman");
//	driver.findElement(By.id("hbutton")).click();
}
}
