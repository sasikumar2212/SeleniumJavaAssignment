package week6.day1.dataprovide;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DuplicateLead extends BaseClasss {

	@Test(dataProvider = "fetchData")
	public void duplecateRecord(Integer phone) throws InterruptedException {

		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phone.toString());
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.name("submitButton")).click();

	}
	
	@DataProvider(name = "fetchData")
	public Object[][] sendData() throws IOException {
		String path = "./data/userdata_del.xlsx";
		Object[][] readExcelData = ReadExcel.readData(path);
		
		return readExcelData;
	}
}
