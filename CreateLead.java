package Week2.day1.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("sac.org");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sasikumar");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Balsubramaniyam");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("sac");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Test Automation");
		driver.findElement(By.id("createLeadForm_description"))
				.sendKeys("Testing Lestleaf project using Selenium with Java");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sac2212@gmail.com");
		driver.findElement(By.name("submitButton")).click();

		// Get result page title
		String title = driver.getTitle();

		System.out.println("The Result page Title is: " + title);

		// Close the Browser
		driver.quit();

	}

}
