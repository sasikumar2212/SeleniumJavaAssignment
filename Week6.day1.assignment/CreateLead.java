package week6.day1.dataprovide;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClasss {

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

	@DataProvider(name = "fetchData")
	public Object[][] sendData() throws IOException {
		String path = "./data/userdata.xlsx";
		Object[][] readExcelData = ReadExcel.readData(path);
		
		return readExcelData;
	}
}
