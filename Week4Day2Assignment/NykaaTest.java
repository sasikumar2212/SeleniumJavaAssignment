package Week4.day2.Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NykaaTest {
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
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement brand = findElement(By.xpath("//a[text()='brands']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(brand).perform();
		findElementSendKeys(By.id("brandSearchBox"), "L'Oreal Paris");
		findElementClick(By.xpath("//a[text()=\"L'Oreal Paris\"]"));
		// findElementClick(By.xpath("//ul/li/section[1]/div[1]/div/div"));
		String acttitle = driver.getTitle();
		String exptitle = "L'Oreal Paris";
		if (acttitle.contains(acttitle)) {
			System.out.println("The landing Page is L'Oreal Paris");
		} else {
			System.out.println("The landing Page is not a L'Oreal Paris");
		}
		
		findElementClick(By.xpath("//span[text()='Sort By : popularity']"));
		findElementClick(By.xpath("(//label[@class='control control-radio']/div[2])[4]"));
		findElementClick(By.xpath("//span[text()='Category']"));
		findElementClick(By.xpath("//span[text()='Hair']"));
		findElementClick(By.xpath("(//span[text()='Hair Care'])[2]"));
		findElementClick(By.xpath("//ul[@id=\"custom-scroll\"]/ul/li/ul/li/ul/li[1]/div/label"));
		
		findElementClick(By.xpath("//span[text()='Concern']"));
		findElementClick(By.xpath("//span[text()='Color Protection']"));
		
		findElementClick(By.xpath("//div[@id=\"product-list-wrap\"]/div/div/div[1]/a"));
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> winhands = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(winhands.get(1));
		findElementClick(By.xpath("//span[text()='180ml']"));
		WebElement MRP = findElement(By.xpath("//div[2]/div/span[2]"));
		System.out.println(MRP.getText());
		findElementClick(By.xpath("//span[text()='Add to Bag']"));
		findElementClick(By.xpath("//*[@id=\"header_id\"]/div[2]/div/div[2]/div[2]/button"));
	
		WebElement ifreame = findElement(By.className("css-acpm4k"));
		driver.switchTo().frame(ifreame);
		WebElement GrandTotal = findElement(By.xpath("//div[contains(@class,'footer-layout')]/div[1]/div/div[1]/span"));
		String grntol = GrandTotal.getText();
		System.out.println("Grand Total : "+grntol);
		findElementClick(By.xpath("//span[text()='Proceed']"));
		driver.switchTo().defaultContent();

		findElementClick(By.xpath("//button[text()='Continue as guest']"));
		driver.get("https://www.nykaa.com/address");
		findElement(By.xpath("//input[@placeholder='Pincode']")).clear();
		WebElement pin = findElement(By.xpath("//input[@placeholder='Pincode']"));
		pin.sendKeys("641659");
		pin.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		findElementSendKeys(By.xpath("//input[@placeholder='House/ Flat/ Office No.']"), "123,east street");
		findElementSendKeys(By.xpath("//textarea[@placeholder='Road Name/ Area /Colony']"), "123,east street");
		findElementSendKeys(By.xpath("//input[@placeholder='Name']"), "Tester");
		findElementSendKeys(By.xpath("//input[@placeholder='Phone']"), "9876543210");
		findElementSendKeys(By.xpath("//input[@placeholder='Email ID']"), "test123@gmail.com");
		findElementClick(By.xpath("//button[text()='Ship to this address']"));
		
		WebElement finalMRP = findElement(By.xpath("(//div[contains(@class,'leftSelector')]/p)[3]"));
		System.out.println("Final total : "+finalMRP.getText());
		if(finalMRP.getText().equals(grntol)) {
			System.out.println("Both Final and Grand totals are Same");
			driver.quit();
		}else {
			System.out.println("Final and Grand totals are not Same");
		}
	}

}
