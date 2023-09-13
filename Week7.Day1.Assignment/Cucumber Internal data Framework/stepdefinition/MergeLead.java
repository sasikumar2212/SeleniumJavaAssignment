package stepdefinition;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MergeLead extends BaseClass{
	public Set<String> allWindows;
	public List<String> allhandles;
	public Set<String> allWindows2;
	public List<String> allhandles2;
	public String leadID;
	
	
	@When("Click CRMSFA for Merge")
	public void click_crmsfa_for_merge() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@When("Click lead for Merge")
	public void click_lead_for_merge() {
		driver.findElement(By.linkText("Leads")).click();
	}
	@When("Click MergeLead for Merge")
	public void click_merge_lead_for_merge() {
		driver.findElement(By.linkText("Merge Leads")).click();
	}
	@When("Click the lookup image for Merge")
	public void click_the_lookup_image_for_merge() {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
	}
	@When("Enter firstname on new window for Merge as {string}")
	public void enter_firstname_on_new_window_for_merge(String fname) {
		allWindows = driver.getWindowHandles();
		allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fname);
	}
	@When("Click Findlead Button for Merge")
	public void click_findlead_button_for_merge() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	@When("Select First result for Merge")
	public void select_first_result_for_merge() throws InterruptedException {
		Thread.sleep(2000);
		//driver.switchTo().window(allhandles.get(0));
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	@When("Click the second lookup image for Merge")
	public void click_the_second_lookup_image_for_merge() {
		driver.switchTo().window(allhandles.get(0));
		
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	}
	@When("Enter firstname on second new window for Merge as {string}")
	public void enter_firstname_on_second_new_window_for_merge(String mname) {
		allWindows2 = driver.getWindowHandles();
		allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(mname);
	}
	@When("Click Findlead Button on second new window for Merge")
	public void click_findlead_button_on_second_new_window_for_merge() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	@When("Select First result on second window for Merge")
	public void select_first_result_on_second_window_for_merge() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
	}
	@When("Click Merge button for Merge")
	public void click_merge_button_for_merge() {
		System.out.println(allhandles2.get(1));
		driver.switchTo().window(allhandles2.get(0));
		System.out.println(allhandles2.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	}
	@When("Enter lead id for merge")
	public void enter_lead_id_for_merge() throws InterruptedException {
		//driver.switchTo().window(allhandles.get(0));
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[text()='Leads']")).click();
		//driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
	}
	@Then("Get the lead and check the if merch")
	public void get_the_lead_and_check_the_if_merch() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
	}

}
