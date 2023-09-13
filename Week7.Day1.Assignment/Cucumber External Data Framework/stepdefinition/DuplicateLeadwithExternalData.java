package stepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.ExcelReader;

public class DuplicateLeadwithExternalData extends BaseClass{

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
	
	public static void duplicateLead(String phone) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phone.toString());
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
	}

	/*
	 * @When("Create Duplecate Lead using External Data sheetname {string} and rownumber <rownumber>"
	 * ) public void
	 * create_duplecate_lead_using_external_data_sheetname_and_rownumber_rownumber(
	 * String string) { // Write code here that turns the phrase above into concrete
	 * actions throw new io.cucumber.java.PendingException(); }
	 */
	@When("Create Duplecate Lead using External Data sheetname {string} and rownumber {int}")
	public void create_duplecate_lead_using_external_data_sheetname_and_rownumber_rownumber(String sheetname, Integer index) throws InterruptedException, InvalidFormatException, IOException {
		ExcelReader readData = new ExcelReader();
		String path ="./Data/Lead.xlsx";
		List<Map<String, String>> data = readData.getData(path, sheetname);
		String phone = data.get(index).get("Phone");
		duplicateLead(phone);
	}
	
	@Then("Click Submit Button for Dup")
	public void click_submit_button_for_dup() {
		driver.findElement(By.name("submitButton")).click();
	}
}
