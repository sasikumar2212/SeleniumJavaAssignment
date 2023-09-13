package stepdefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeads extends BaseClass{
	
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
	@When("Click on CRM SFA click create")
	public void click_on_crm_sfa_click_create() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	@When("Click on Leads for Create")
	public void click_on_leads() {
		driver.findElement(By.linkText("Leads")).click();
	}

	@When("Click Create Lead")
	public void click_create_lead() {
		driver.findElement(By.linkText("Create Lead")).click();
	}

	@When("Enter Company Name as {string}")
	public void enter_company_name(String cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
	}

	@When("Enter FristName as {string}")
	public void enter_frist_name(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	}

	@When("Enter LastName as {string}")
	public void enter_last_name(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	}

	@When("Click Create Button")
	public void click_create_button() {
		driver.findElement(By.name("submitButton")).click();
	}
	
	@Then("Result Page is displayed")
	public void resultPage() {
		System.out.println(driver.getTitle());
	}
}
