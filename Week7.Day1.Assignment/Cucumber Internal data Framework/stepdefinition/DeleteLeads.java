package stepdefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteLeads extends BaseClass{

	/*
	 * @Given("Enter the Username as {string}") public void enterUsername(String
	 * uname) { driver.findElement(By.id("username")).sendKeys(uname);
	 * 
	 * }
	 * 
	 * @Given("Enter the Password as {string}") public void enterPassword(String
	 * pass) { driver.findElement(By.id("password")).sendKeys(pass);
	 * 
	 * }
	 * 
	 * @When("Click on the Login button") public void clickLoginButton(){
	 * driver.findElement(By.className("decorativeSubmit")).click(); }
	 * 
	 * @Then("Welcome Page is displayed") public void welcomePage() {
	 * System.out.println(driver.getTitle()); }
	 */
	
	String leadID="";
	@When("Click on CRM_SFA click delete")
	public void click_on_crm_sfa_click_delete() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	@When("Click on Leads for Delete")
	public void click_on_leads() {
		driver.findElement(By.linkText("Leads")).click();
	}

	@When("Click Find Lead")
	public void click_find_lead() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@When("Click Phone")
	public void click_phone() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}
	@When("Enter Phone Number")
	public void enter_phone_number() {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("123");
	}
	@When("Click Find Lead Button")
	public void click_find_lead_button() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	@Then("Get the First Result")
	public void get_the_first_result() {
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println(leadID);
	}
	@When("Click the Frist Result")
	public void click_the_frist_result() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	@When("Delete the Result lead")
	public void delete_first_result() {
		driver.findElement(By.linkText("Delete")).click();
	}
	@When("Click Find Again")
	public void click_find_again() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@When("Click Phone Again")
	public void click_phone_again() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
	}
	@When("Enter Phone Number Again")
	public void enter_phone_number_again() {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("123");
	}
	@When("Click Find Lead Button Again")
	public void click_find_lead_button_again() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	@Then("Result Message")
	public void result_message() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
	}

}
