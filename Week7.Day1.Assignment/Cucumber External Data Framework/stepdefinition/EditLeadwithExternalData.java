package stepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.ExcelReader;

public class EditLeadwithExternalData extends BaseClass{

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
	public void editLead(String phone,String newcompanyname) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phone.toString());
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(newcompanyname);
	}
	
	@When("Edit Lead using external data sheetname {string} and rownumber {int}")
	public void enter_phone_number_for_edit_lead_as(String sheetname, Integer index) throws InvalidFormatException, IOException, InterruptedException {
		ExcelReader readData = new ExcelReader();
		String path = "./Data/Lead.xlsx";
		List<Map<String, String>> data = readData.getData(path, sheetname);
		String phone = data.get(index).get("Phone");
		String cname = data.get(index).get("NewCompanyName");
		editLead(phone, cname);
	}
	
	@Then("Click Submit Button for EditLead")
	public void click_submit_button_for_edit_lead() {
		driver.findElement(By.name("submitButton")).click();
	}
}
