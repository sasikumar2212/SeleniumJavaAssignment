package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class DuplicateLeadPage extends ProjectSpecificMethod{
	public static String leadID="";
	public DuplicateLeadPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	public DuplicateLeadPage Click_find_Lead() {
		driver.findElement(By.linkText("Find Leads")).click();
		return this;
	}
	public DuplicateLeadPage Click_phoneNum() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return this;
	}
	public DuplicateLeadPage Enter_Phone_num(Integer phone) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phone.toString());
		return this;
	}
	public DuplicateLeadPage Click_findlead_button() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}
	public DuplicateLeadPage Select_first_result_and_Click() throws InterruptedException {
		Thread.sleep(2000);
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"))
				.getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return this;
	}
	public DuplicateLeadPage Click_Duplicate_button() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}
	public DuplicateLeadPage Click_Submit_button() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}
	
	
}
