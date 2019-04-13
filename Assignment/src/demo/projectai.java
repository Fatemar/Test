package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class projectai {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver","C://Users//fatema//Downloads//chromedriver_win32//chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get(" http://61.12.39.109:9090/login");
driver.manage().window().maximize();

WebElement Username= driver.findElement(By.name("username"));
Username.sendKeys("admin");

WebElement Password = driver.findElement(By.name("password"));
Password.sendKeys("admin");
Thread.sleep(5000);



WebElement btn= driver.findElement(By.className("login-btn"));
btn.click();

//driver.close();







	}

}
