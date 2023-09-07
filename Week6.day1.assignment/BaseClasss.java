package week6.day1.dataprovide;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClasss {
	
	public ChromeDriver driver;
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void preCondition(String url,String username,String password) {
		System.out.println(Thread.currentThread().getId());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
}
