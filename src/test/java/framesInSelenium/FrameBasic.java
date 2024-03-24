package framesInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameBasic {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	JavascriptExecutor js=(JavascriptExecutor) driver;
	driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	Thread.sleep(2000);
	js.executeScript("document.getElementById('name').value='Testing on Home page'");
	int count=driver.findElements(By.tagName("iframe")).size();
	System.out.println(count);
	driver.switchTo().frame("frm1");
	WebElement we=driver.findElement(By.id("course"));
	Select sl=new Select(we);
	sl.selectByVisibleText("Python");
	Thread.sleep(2000);
	driver.switchTo().parentFrame();
	js.executeScript("document.getElementById('name').value='Testing on Home page 123456'");
	Thread.sleep(2000);
//	driver.close();
	
	}

}
