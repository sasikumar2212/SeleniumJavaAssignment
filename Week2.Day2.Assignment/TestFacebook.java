package Week2.day2.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestFacebook {
	public static ChromeDriver driver;
	
	public static void findElementClick(By by) {
		driver.findElement(by).click();
	}
	public static void findElementSendKeys(By by,String x) {
		driver.findElement(by).sendKeys(x);
	}
	public static WebElement findElement(By by) {
		return driver.findElement(by);
	}
	
	public static void main(String[] args) {
		// Launch Chrome
		driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Click on Create New Account button
		findElementClick(By.xpath("//a[@data-testid='open-registration-form-button']"));
		
		//Enter the first name
		findElementSendKeys(By.xpath("//input[@name='firstname']"),"Sasikumar");
		//Enter the last name
		findElementSendKeys(By.xpath("//input[@name='lastname']"), "Balasubramaniyam");
		//Enter the mobile number
		findElementSendKeys(By.xpath("//input[@name='reg_email__']"), "1234567890");
		//Enterthe password
		findElementSendKeys(By.id("password_step_input"), "Test@123");
		//Handle all the three drop downs
		WebElement day = findElement(By.id("day"));
		Select selDay = new Select(day);
		selDay.selectByVisibleText("20");
		WebElement month = findElement(By.id("month"));
		Select selMonth = new Select(month);
		selMonth.selectByVisibleText("Sep");
		WebElement year = findElement(By.id("year"));
		Select selYear = new Select(year);
		selYear.selectByVisibleText("1991");
		//Select the radio button "Female" 
		findElementClick(By.xpath("//input[@value='1']"));
		
		
		
		
		
	}

}
