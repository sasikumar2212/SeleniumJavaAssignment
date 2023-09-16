package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class DeleteLeadPage extends ProjectSpecificMethod {
	public static String leadID="";
	public DeleteLeadPage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public DeleteLeadPage Click_find_Lead() {
		driver.findElement(By.linkText("Find Leads")).click();
		return this;
	}
	public DeleteLeadPage Click_phoneNum() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return this;
	}
	public DeleteLeadPage Enter_Phone_num(Integer phone) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phone.toString());
		return this;
	}
	public DeleteLeadPage Click_findlead_button() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}
	public DeleteLeadPage Select_first_result_and_Click() throws InterruptedException {
		Thread.sleep(2000);
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"))
				.getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return this;
	}
	public DeleteLeadPage Click_delete_Lead() {
		driver.findElement(By.linkText("Delete")).click();
		return this;
	}
	public DeleteLeadPage Click_find_Lead_Again() {
		driver.findElement(By.linkText("Find Leads")).click();
		return this;
	}
	public DeleteLeadPage Enter_name() {
		 
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		return this;
	}
	public DeleteLeadPage Click_find_Leadbutton_again() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}
	public DeleteLeadPage Check_the_result() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}return this;
	}
	

}
