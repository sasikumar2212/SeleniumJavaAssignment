package Week4.day2.Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDealTest {
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
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement firstManu = findElement(By.xpath("//span[text()=\"Men's Fashion\"]"));
		Actions ac = new Actions(driver);
		ac.moveToElement(firstManu).perform();
		Thread.sleep(2000);
		findElementClick(By.xpath("//span[text()='Sports Shoes']"));
		findElementClick(By.xpath("//div[text()='Training Shoes']"));
		findElementClick(By.xpath("//div[3]/div[@class='sorting-sec animBounce']/div"));
		findElementClick(By.xpath("//ul[@class='sort-value']/li[2]"));
		WebElement fromVal = findElement(By.name("fromVal"));
		fromVal.clear();
		fromVal.sendKeys("500");
		WebElement toVal = findElement(By.name("toVal"));
		toVal.clear();
		toVal.sendKeys("900");
		findElementClick(By.xpath("//div[contains(@class,'price-go-arrow')]"));
		Thread.sleep(2000);
		findElementClick(By.xpath("//div[contains(@class,'sdCheckbox ')]/label[@for='Color_s-Navy']"));
		Thread.sleep(2000);
		WebElement firstres = findElement(By.xpath("//div[@class='product-tuple-image ']/a"));
		ac.moveToElement(firstres).perform();
		findElementClick(By.xpath("//div[contains(@class,'quick-view-bar')]"));
		findElementClick(By.xpath("//a[contains(@class,'prodDetailBtn')]"));
		//Set<String> windowHandles = driver.getWindowHandles();
		//List<String> winhans = new ArrayList<String>(windowHandles);
		//driver.switchTo().window(winhans.get(1));
		WebElement normalMRP = findElement(By.xpath("//div[@class='pdpCutPrice ']"));
		System.out.println(normalMRP.getText());
		
		WebElement discountMRP = findElement(By.xpath("//span[@class='payBlkBig']"));
		System.out.println(discountMRP.getText());
		driver.close();
		//driver.switchTo().window(winhans.get(0));
		//driver.close();
	}
}
