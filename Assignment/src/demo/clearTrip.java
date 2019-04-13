package demo;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



public class clearTrip {


	public static void main(String[] args) throws InterruptedException {
		
ChromeOptions ops = new ChromeOptions();
ops.addArguments("--disable-notifications");
System.setProperty("webdriver.chrome.driver","C://Users//fatema//Downloads//chromedriver_win32//chromedriver.exe");


WebDriver driver = new ChromeDriver(ops);
		
driver.get("https://www.cleartrip.com/");
driver.manage().window().maximize();
//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

WebElement btn= driver.findElement(By.id("RoundTrip"));
btn.click();

WebElement from= driver.findElement(By.id("FromTag"));
from.sendKeys("Bangalore, IN - Kempegowda International Airport (BLR)");
Thread.sleep(5000);
 
WebElement to= driver.findElement(By.id("ToTag"));
to.sendKeys("New Delhi, IN - Indira Gandhi Airport (DEL)");


WebElement depart = driver.findElement(By.id("DepartDate")); 
depart.click();
int date = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
System.out.println("Current Date is :" +date);
WebElement currDate = driver.findElement(By.xpath("//table[@class='calendar']/tbody/tr/td[@data-handler]/a[.="+date+"]"));
   currDate.click();
   













driver.close();

	}

}
