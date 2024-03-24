package testClasses;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarsWork {
public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
	Thread.sleep(5000);
	Calendar calendar=Calendar.getInstance();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollTo(0,1500)");
	driver.findElement(By.id("second_date_picker")).click();
	Thread.sleep(3000);
	String targetDate="27-Mar-2022";
	SimpleDateFormat targetDateFormat=new SimpleDateFormat("dd-MMM-yyyy");
	targetDateFormat.setLenient(false);
	try {
		Date formattedTargetDate=targetDateFormat.parse(targetDate);
		calendar.setTime(formattedTargetDate);
		int targetDay=calendar.get(Calendar.DAY_OF_MONTH);
		int targetMonth=calendar.get(Calendar.MONTH);
		int targetYear=calendar.get(Calendar.YEAR);
		String actualDate=driver.findElement(By.className("ui-datepicker-title")).getText();
		calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(actualDate));

		int actualMonth=calendar.get(Calendar.MONTH);
		int actualYear=calendar.get(Calendar.YEAR);
		
		while(targetMonth<actualMonth||targetYear<actualYear) {
			driver.findElement(By.className("ui-datepicker-prev")).click();
			actualDate=driver.findElement(By.className("ui-datepicker-title")).getText();
			calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(actualDate));
			actualMonth=calendar.get(Calendar.MONTH);
			actualYear=calendar.get(Calendar.YEAR);
		}
		while(targetMonth>actualMonth||targetYear>actualYear) {
			driver.findElement(By.className("ui-datepicker-next")).click();
			actualDate=driver.findElement(By.className("ui-datepicker-title")).getText();
			calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(actualDate));
			actualMonth=calendar.get(Calendar.MONTH);
			actualYear=calendar.get(Calendar.YEAR);
		}
		
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()="+targetDay+"]")).click();
	} catch (ParseException e) {
		throw new Exception("Incorrect Date entered. Please enter correct date");
	}
	

	
	
 }
}
