package Week2.day2.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
		findElementClick(By.xpath("//span[text()='Email']"));
		findElementSendKeys(By.xpath("//input[@name='emailAddress']"), "test@gmail.com");
		String leafid = findElement(By.xpath("(//table[@class='x-grid3-row-table']//td/div/a[@class='linktext'])[1]")).getText();
		String leafName = findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")).getText();
		System.out.println("Leaf Id: "+leafid +" and Leaf Name: "+leafName);
		Thread.sleep(2000);
		findElementClick(By.xpath("(//table[@class='x-grid3-row-table']//td/div/a[@class='linktext'])[1]"));
		findElementClick(By.xpath("//a[text()='Duplicate Lead']"));
		String tabTitle = findElement(By.id("sectionHeaderTitle_leads")).getText();
		System.out.println(tabTitle);
		findElementClick(By.xpath("//input[@value='Create Lead']"));
		String dupName = findElement(By.xpath("//div[@class='fieldgroup-body']//tr[2]/td[2]/span")).getText();
		System.out.println(dupName);
		//if (leafName == dupName) {
		if(leafName.equals(dupName)) {
			System.out.println("duplicated lead name Captured!!!");
		}
		//close Browser
		driver.quit();
		
	}

}
