package Week4.day2.Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {
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
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement searchbox = findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("oneplus 9 pro");
		searchbox.sendKeys(Keys.ENTER);
		
		WebElement firstProductMRP = findElement(By.xpath("//span[@class='a-price-whole']"));
		System.out.println(firstProductMRP.getText());
		
		Thread.sleep(5000);
		WebElement firstProductRating = findElement(By.xpath("(//span[@class='a-size-base puis-bold-weight-text'])[1]"));
		System.out.println(firstProductRating.getText());
		
		findElementClick(By.xpath("//img[@class='s-image']"));
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> winhans = new ArrayList<String>(windowHandles);
		driver.switchTo().window(winhans.get(1));
		
		WebElement ss = findElement(By.id("imgTagWrapperId"));
		File firstProductSS = ss.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(firstProductSS, new File("./screenshot/element.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		findElementClick(By.id("add-to-cart-button"));
		findElementClick(By.xpath("//span[@id='attach-sidesheet-view-cart-button']/span/input"));
		Thread.sleep(2000);
		WebElement subtotal = findElement(By.xpath("//span[@id='sc-subtotal-amount-buybox']/span"));
		System.out.println(subtotal.getText());
		
		
		driver.quit();
	}

}
