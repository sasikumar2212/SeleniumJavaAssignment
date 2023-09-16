package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadPage extends ProjectSpecificMethod {

	public CreateLeadPage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public CreateLeadPage click_on_crm_sfa_click_create() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return this;
	}

	public CreateLeadPage click_on_leads() {
		driver.findElement(By.linkText("Leads")).click();
		return this;
	}

	public CreateLeadPage click_create_lead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return this;
	}

	public CreateLeadPage enter_company_name(String cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		return this;
	}

	public CreateLeadPage enter_frist_name(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		return this;
	}

	public CreateLeadPage enter_last_name(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		return this;
	}

	public CreateLeadPage enter_phone(Integer phone) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phone.toString());
		return this;
	}

	public ViewPage click_create_button() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewPage();
	}

}
