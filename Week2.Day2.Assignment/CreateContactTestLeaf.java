package Week2.day2.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContactTestLeaf {

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
		findElementClick(By.linkText("Contacts"));
		findElementClick(By.linkText("Create Contact"));
		findElementSendKeys(By.id("firstNameField"), "Sasikumar");
		findElementSendKeys(By.id("lastNameField"), "Balasubramaniyam");
		findElementSendKeys(By.id("createContactForm_firstNameLocal"), "Test1");
		findElementSendKeys(By.id("createContactForm_lastNameLocal"), "Test2");
		findElementSendKeys(By.id("createContactForm_departmentName"), "Test Automation");
		findElementSendKeys(By.id("createContactForm_description"), "Test Automation Using Selenium Java");
		findElementSendKeys(By.id("createContactForm_primaryEmail"), "Test123@gmail.com");
		WebElement state = findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select selState =new Select(state);
		selState.selectByVisibleText("New York");
		findElementClick(By.xpath("//input[@name='submitButton']"));
		findElementClick(By.xpath("//a[text()='Edit']"));
		findElement(By.id("updateContactForm_description")).clear();
		findElementSendKeys(By.id("updateContactForm_importantNote"), "Test Automation Using Selenium Java");
		findElementClick(By.xpath("//input[@value='Update']"));
		System.out.println(driver.getTitle());
 		Thread.sleep(5000);
		//close browser
		driver.quit();
	}

}
