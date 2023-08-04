package Week2.day2.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLeaf {

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
		// Launch Chrome
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		findElementSendKeys(By.id("username"), "demoSalesManager");
		findElementSendKeys(By.id("password"), "crmsfa");
		findElementClick(By.className("decorativeSubmit"));
		findElementClick(By.linkText("CRM/SFA"));
		findElementClick(By.linkText("Leads"));
		findElementClick(By.linkText("Find Leads"));
		findElementClick(By.xpath("//span[text()='Phone']"));
		findElementSendKeys(By.xpath("//input[@name='phoneNumber']"), "123");

		findElementClick(By.xpath("//button[text()='Find Leads']"));
		Thread.sleep(2000);
		String leafid = findElement(By.xpath("(//table[@class='x-grid3-row-table']//td/div/a[@class='linktext'])[1]")).getText();
		System.out.println(leafid);
		Thread.sleep(2000);
		findElementClick(By.xpath("(//table[@class='x-grid3-row-table']//td/div/a[@class='linktext'])[1]"));
		findElementClick(By.xpath("//a[text()='Delete']"));
		findElementClick(By.linkText("Find Leads"));
		findElementSendKeys(By.xpath("//input[@name='id']"), leafid);
		findElementClick(By.xpath("//button[text()='Find Leads']"));
		String result = findElement(By.xpath("//div[@class='x-toolbar x-small-editor']/div")).getText();
		System.out.println(result);
		
		//close browser
		driver.quit();
	}

}
