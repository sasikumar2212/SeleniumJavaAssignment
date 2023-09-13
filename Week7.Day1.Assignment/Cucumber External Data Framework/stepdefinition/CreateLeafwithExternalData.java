package stepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.ExcelReader;

public class CreateLeafwithExternalData extends BaseClass{

	public static void enterUserData(String cname,String fname,String lname,String phone) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	}
	@When("Click on CRM SFA click create DataTable")
	public void click_on_crm_sfa_click_create_DataTable() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	@When("Click on Leads for Create DataTable")
	public void click_on_lead_DataTable() {
		driver.findElement(By.linkText("Leads")).click();
	}

	@When("Click Create Lead DataTable")
	public void click_create_lead_DataTable() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	
	@When("Enter User Detaile from given {string} and rownumber {int}")
	public void enter_user_detaile_from_given_and_rownumber(String sheetname, Integer index) throws IOException, InvalidFormatException {
		ExcelReader readData = new ExcelReader();
		List<Map<String, String>> testData = readData.getData("./Data/Lead.xlsx", sheetname);
		//System.out.println(testData);
		String cname=testData.get(index).get("Company");
		String fname=testData.get(index).get("FristName");
		String lname=testData.get(index).get("LastName");
		String phone=testData.get(index).get("Phone");
		enterUserData(cname, fname, lname, phone);
	}
	
	@When("Click Create Button DataTable")
	public void click_create_button_DataTable() {
		driver.findElement(By.name("submitButton")).click();
	}
	
	@Then("Result Page is displayed DataTable")
	public void resultPage_DataTable() {
		System.out.println(driver.getTitle());
	}
}
