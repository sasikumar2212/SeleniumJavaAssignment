package Week2.day2.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestACMELogin {

	public static ChromeDriver driver;

	public static void findElementClick(By by) {
		driver.findElement(by).click();
	}

	public static void findElementSendKeys(By by, String x) {
		driver.findElement(by).sendKeys(x);
	}

	public static WebElement findElement(By by) {
		return driver.findElement(by);
	}

	public static void main(String[] args) {
		// Launch Chrome
		driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		findElementSendKeys(By.id("email"), "sac2212@gmail.com");
		findElementSendKeys(By.id("password"), "Sac@2212");
		findElementClick(By.xpath("//button[@type='submit']"));
		String title = driver.getTitle();
		System.out.println(title);
		findElementClick(By.xpath("//a[text()='Log Out']"));
		
		//close browser 
		driver.quit();
		
	}

}
