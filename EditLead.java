package Week2.day1.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("sac1.org");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kayalvizhi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sasikumar");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("kayal");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation Test");
		driver.findElement(By.id("createLeadForm_description"))
				.sendKeys("Testing Lestleaf project using Selenium 4.0 with Java");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test212@gmail.com");
		driver.findElement(By.name("submitButton")).click();

		// Get result page title
		String title = driver.getTitle();

		System.out.println("The Result page Title is: " + title);

		driver.findElement(By.linkText("Edit")).click();
		WebElement st = driver.findElement(By.id("updateLeadForm_description"));
		String des = st.getText();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys(des);
		driver.findElement(By.name("submitButton")).click();

		// Get result page title
		String updatetitle = driver.getTitle();

		System.out.println("The Result page Title is: " + updatetitle);
		
		//Close the Browser 
		driver.quit();
		

	}

}
