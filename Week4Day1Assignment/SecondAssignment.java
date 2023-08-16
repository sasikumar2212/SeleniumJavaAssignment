package Week4.day1.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SecondAssignment {
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

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://buythevalue.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		findElementClick(By.xpath("//div[@id='owl-slides']//div[1]/a"));
		WebElement element1 = findElement(By.id("wk_zipcode"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1); 
		element1.sendKeys("641659");
		Thread.sleep(2000);
		findElementClick(By.xpath("//div[@class='wk_zipfinder_btn']/input[@type='button' ]"));
		findElementClick(By.xpath("//button[@id='product-add-to-cart']/span"));
		findElementClick(By.xpath("(//a[text()='View Cart'])[2]"));
		findElementClick(By.id("agree"));
		findElementClick(By.id("checkout"));
		
	}

}
