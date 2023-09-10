package week6.day2.testattributes;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateLead extends BaseClasss {

	@BeforeTest
	public void setFilename() {
		//filename = "CreateLead";
		sheetname = this.getClass().getSimpleName();
	}
	
	@Test(dataProvider="fetchData")
	public void createRecord(String cname,String fname,String lname,Integer phone) throws InterruptedException {
		//System.out.println(cname+" == "+fname+" ** "+lname+" ## "+phone);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phone.toString());
		driver.findElement(By.name("submitButton")).click();

	}

	
}
