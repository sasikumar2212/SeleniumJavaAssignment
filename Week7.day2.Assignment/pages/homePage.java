package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class homePage extends ProjectSpecificMethod {

	public homePage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	public CreateLeadPage clickLead() {
		driver.findElement(By.linkText("Leads")).click();
		return new CreateLeadPage(driver);
	}
	
	public DeleteLeadPage clickLeadforDelete() {
		driver.findElement(By.linkText("Leads")).click();
		return new DeleteLeadPage(driver);
	}
	
	public EditLeadPage clickLeadforEdit() {
		driver.findElement(By.linkText("Leads")).click();
		return new EditLeadPage(driver);
	}
	
	public DuplicateLeadPage clickLeadforDuplication() {
		driver.findElement(By.linkText("Leads")).click();
		return new DuplicateLeadPage(driver);
	}
	
	public MergeLeadPage clickLeadforMerge() {
		driver.findElement(By.linkText("Leads")).click();
		return new MergeLeadPage(driver);
	}
}
