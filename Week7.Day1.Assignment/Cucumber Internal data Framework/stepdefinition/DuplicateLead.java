package stepdefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DuplicateLead extends BaseClass{

	@When("Click CRMSFA for Dup")
	public void click_crmsfa_for_dup() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@When("Click lead for Dup")
	public void click_lead_for_dup() {
		driver.findElement(By.linkText("Leads")).click();
	}
	@When("Click FindLead for Dup")
	public void click_find_lead_for_dup() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@When("Click Phone tab for Dup")
	public void click_phone_tab_for_dup() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}
	@When("Enter Phone Number for Dup as {string}")
	public void enter_phone_number_for_dup(String phone) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phone.toString());
	}
	@When("Click Find Button for Dup")
	public void click_find_button_for_dup() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	@When("Select First result for Dup")
	public void select_first_result_for_dup() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	@When("Click Duplication button for Dup")
	public void click_Duplication_button_for_dup() {
		driver.findElement(By.linkText("Duplicate Lead")).click();
	}
	@Then("Click Submit Button for Dup")
	public void click_submit_button_for_dup() {
		driver.findElement(By.name("submitButton")).click();
	}
}
