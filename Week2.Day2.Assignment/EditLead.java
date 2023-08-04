package Week2.day2.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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
		findElementSendKeys(By.xpath("(//input[@name='firstName'])[3]"), "test");
		findElementClick(By.xpath("//button[text()='Find Leads']"));
		Thread.sleep(2000);
		findElementClick(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext'])[1]"));
		String title = driver.getTitle();
		System.out.println(title);
		findElementClick(By.xpath("//a[text()='Edit']"));
		findElement(By.id("updateLeadForm_companyName")).clear();
		findElementSendKeys(By.id("updateLeadForm_companyName"), "Test123");
		findElementClick(By.xpath("//input[@value='Update']"));
		String updatedCom = findElement(By.id("viewLead_companyName_sp")).getText();
		String st[] = updatedCom.split(" ");
		
		System.out.println(st[0]);
		if(st[0].equals("Test123")) {
			System.out.println("Company Name Successfully Updated!!!");
		}
		
		//close Browser
		driver.quit();
	}

}
