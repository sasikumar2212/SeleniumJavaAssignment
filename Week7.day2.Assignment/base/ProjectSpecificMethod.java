package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.ReadExcel;

public class ProjectSpecificMethod {
	public RemoteWebDriver driver;
	public String sheetname;
	@Parameters({"URI"})
	@BeforeMethod
	public void preCondition(String url) {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	
	/*
	 * @DataProvider(name = "fetchdata") public Object[][] getData() throws
	 * IOException{ String path = "./data/Lead.xlsx"; Object[][] readData =
	 * ReadExcel.readData(path, sheetname); return readData;
	 * 
	 * }
	 */
	
	@DataProvider(name = "fetchData")
	public Object[][] sendData() throws IOException {
		String filename = "./data/NewLeadExtrenalData.xlsx";
		//System.out.println("./data/Lead.xlsx");
		//String filename = "NewLeadExtrenalData";
		Object[][] readData = ReadExcel.readExcel(filename, sheetname);
		System.out.println(readData);
		return readData;
	}
	
	
}
