package marathon3;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;



public class BaseClass {
	public RemoteWebDriver driver;
	public String sheetname;
	public String path;
	
	@Parameters({"browser","url","username","password"})
	@BeforeMethod
	public void preExecution(String browser,String url, String username, String password) {
		
		if(browser.equals("chrome")) {
			System.out.println(browser);
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--disable-notifications");
			
			driver = new ChromeDriver(co);
		}else if(browser.equals("edge")){
			/*
			 * System.out.println(browser); EdgeOptions eo = new EdgeOptions();
			 * eo.addArguments("--disable-notifications"); eo.addArguments("--guest");
			 */
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("Login")).click();
	}
	
	@AfterMethod
	public void postExecution() {
		driver.close();
	}
	
	@DataProvider(name = "fetchExcelData")
	public Object[][] getData() throws IOException{
		
		//String path = "./Data/salesforce_opportunity.xlsx";
		//String sheetname = "sheet1";
		Object[][] readExcelData = ReadExcel.readData(path,sheetname);
		
		return readExcelData;
		
	}
	
}
