package WaitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicWait {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notification");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(6));
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html#google_vignette");
		driver.findElement(By.id("btn1")).click();
		driver.findElement(By.id("txt1")).sendKeys("Custom Text");

	}
}