package Week4.day1.assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static ChromeDriver driver;

	public static void findElementClick(By by) {
		driver.findElement(by).click();
	}

	public static void findElementSendKeys(By by, String x) {
		driver.findElement(by).sendKeys(x);
	}

	public WebElement findElement(By by) {
		return driver.findElement(by);
	}

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		findElementSendKeys(By.id("username"), "demoSalesManager");
		findElementSendKeys(By.id("password"), "crmsfa");
		findElementClick(By.className("decorativeSubmit"));
		findElementClick(By.linkText("CRM/SFA"));
		findElementClick(By.xpath("//a[text()='Contacts']"));
		findElementClick(By.xpath("//a[text()='Merge Contacts']"));
		findElementClick(By.xpath("//table/tbody/tr[1]/td[2]/a/img"));

		Set<String> winHandles = driver.getWindowHandles();
		System.out.println(winHandles);
		List<String> winHnds = new ArrayList<String>(winHandles);
		driver.switchTo().window(winHnds.get(1));
		System.out.println(driver.getTitle());

		findElementClick(By.xpath("(//table/tbody/tr[1]/td[1]/div/a)[1]"));
		driver.switchTo().window(winHnds.get(0));
		findElementClick(By.xpath("//table/tbody/tr[2]/td[2]/a/img"));
		Set<String> winHandles1 = driver.getWindowHandles();
		System.out.println(winHandles1);
		List<String> winHnds1 = new ArrayList<String>(winHandles1);
		driver.switchTo().window(winHnds1.get(1));
		findElementClick(By.xpath("(//table/tbody/tr[1]/td[1]/div/a)[2]"));
		driver.switchTo().window(winHnds1.get(0));
		findElementClick(By.xpath("//a[text()='Merge']"));

		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();

		System.out.println(driver.getTitle());
		
		driver.quit();

	}

}
