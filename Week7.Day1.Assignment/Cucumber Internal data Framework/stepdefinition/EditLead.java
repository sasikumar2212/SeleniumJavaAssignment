package stepdefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLead extends BaseClass{

	@When("Click CRMSFA for EditLead")
	public void click_crmsfa_for_edit_lead() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@When("Click lead for EditLead")
	public void click_lead_for_edit_lead() {
		driver.findElement(By.linkText("Leads")).click();
	}
	@When("Click FindLead for EditLead")
	public void click_find_lead_for_edit_lead() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@When("Click Phone tab for EditLead")
	public void click_phone_tab_for_edit_lead() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}
	@When("Enter Phone Number for EditLead as {string}")
	public void enter_phone_number_for_edit_lead_as(String phone) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phone.toString());
	}
	@When("Click Find Button for EditLead")
	public void click_find_button_for_edit_lead() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	@When("Select First result for Editlead")
	public void select_first_result_for_editlead() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	@When("Click Edit button for EditLead")
	public void click_edit_button_for_edit_lead() {
		driver.findElement(By.linkText("Edit")).click();
	}
	@When("Update the Company Name for EditLead as {string}")
	public void update_the_company_name_for_edit_lead_as(String newcompanyname) {
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(newcompanyname);
	}
	@Then("Click Submit Button for EditLead")
	public void click_submit_button_for_edit_lead() {
		driver.findElement(By.name("submitButton")).click();
	}
}
