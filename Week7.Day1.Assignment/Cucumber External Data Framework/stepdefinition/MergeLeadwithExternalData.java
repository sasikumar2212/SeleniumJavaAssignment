package stepdefinition;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.ExcelReader;

public class MergeLeadwithExternalData extends BaseClass {
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

	public void mergeLead(String fname,String mname) throws InterruptedException {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		allWindows = driver.getWindowHandles();
		allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fname);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		// driver.switchTo().window(allhandles.get(0));
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(allhandles.get(0));

		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		allWindows2 = driver.getWindowHandles();
		allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(mname);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		System.out.println(allhandles2.get(1));
		driver.switchTo().window(allhandles2.get(0));
		System.out.println(allhandles2.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		driver.switchTo().alert().accept();

		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	}
	
	@When("Merge Lead using External data sheetname {string} and rownumber {int}")
	public void click_the_lookup_image_for_merge(String sheetname, Integer rownum) throws InvalidFormatException, IOException, InterruptedException {
		ExcelReader readData = new ExcelReader();
		String Path ="./Data/Lead.xlsx";
		List<Map<String, String>> data = readData.getData(Path, sheetname);
		
		String fname = data.get(rownum).get("FirstName");
		String mname = data.get(rownum).get("MergeName");
		mergeLead(fname, mname);
	}

	@When("Enter lead id for merge")
	public void enter_lead_id_for_merge() throws InterruptedException {
		// driver.switchTo().window(allhandles.get(0));
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("//a[text()='Leads']")).click();
		// driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
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
