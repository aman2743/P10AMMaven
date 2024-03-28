package WaitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicWait2 {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notification");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(6000));
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html#google_vignette");
		driver.findElement(By.id("btn1")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("txt1")));
		WebElement we=driver.findElement(By.id("txt1"));
		we.sendKeys("Custom Text 123");

	}
}