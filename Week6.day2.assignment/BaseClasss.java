package week6.day2.testattributes;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClasss {
	
	public ChromeDriver driver;
	public String sheetname;
	
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void preCondition(String url,String username,String password) {
		System.out.println(Thread.currentThread().getId());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	
	@DataProvider(name = "fetchData")
	public Object[][] sendData() throws IOException {
		//String path = "./data/userdata.xlsx";
		//System.out.println("./data/Lead.xlsx");
		String path = "./data/TattLead.xlsx";
		Object[][] readExcelData = ReadExcel.readData(path,sheetname);
		
		return readExcelData;
	}
}
