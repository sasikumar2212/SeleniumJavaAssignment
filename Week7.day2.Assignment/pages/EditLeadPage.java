package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class EditLeadPage extends ProjectSpecificMethod{
	
	public static String leadID="";
	public EditLeadPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	public EditLeadPage Click_find_Lead() {
		driver.findElement(By.linkText("Find Leads")).click();
		return this;
	}
	public EditLeadPage Click_phoneNum() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return this;
	}
	public EditLeadPage Enter_Phone_num(Integer phone) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phone.toString());
		return this;
	}
	public EditLeadPage Click_findlead_button() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}
	public EditLeadPage Select_first_result_and_Click() throws InterruptedException {
		Thread.sleep(2000);
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"))
				.getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return this;
	}
	
	public EditLeadPage Click_Edit_button(){
		driver.findElement(By.linkText("Edit")).click();
		return this;
	}
	public EditLeadPage Update_company_name(String cname){
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cname);
		return this;
	}
	public EditLeadPage Click_submit_button(){
		driver.findElement(By.name("submitButton")).click();
		return this;
	}
	

}
