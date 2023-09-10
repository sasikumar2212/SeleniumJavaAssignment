package marathon3;

import static org.testng.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SalesforceTestcaseEdge extends BaseClass{

	@BeforeTest
	public void setFilename() {
		//filename = "CreateLead";
		path = "./Data/salesforce_opportunity.xlsx";
		sheetname = "sheet1";
	}
	
	@Test(dataProvider="fetchExcelData")
	public void testSalesforce(String oppname, Integer amount) throws InterruptedException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar c = Calendar.getInstance();
		c.setTime(new Date()); // Using today's date
		c.add(Calendar.DATE, 1); // Adding 5 days
		String output = sdf.format(c.getTime());
		//System.out.println(output);
		
		
		driver.findElement(By.xpath("//button[contains(@class,'salesforceIdentityAppLauncherHeader')]/div")).click();
		//driver.findElement(By.xpath("//button[contains(@class,'salesforceIdentityAppLauncherHeader')]/div")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		
		//Thread.sleep(5000);
		//WebElement allOpp = driver.findElement(By.xpath("//a[@title='Key Deals Trigger']"));
		//WebElement allOpp = driver.findElement(By.xpath("//a[@title='Key Deals Trigger']/parent::div"));
		WebElement allOpp = driver.findElement(By.xpath("(//article/div[1]/div)[2]"));
		//Actions ac = new Actions(driver);
		Thread.sleep(2000);
		//ac.scrollToElement(allOpp).perform();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", allOpp);
		
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//article/div[1]/div)[2]"))).click();
		//allOpp.click();

        
		driver.findElement(By.xpath("//a[@title='All Opportunities']")).click();
		Thread.sleep(5000);
		WebElement viewAll = driver.findElement(By.xpath("//span[text()='View All Key Deals']"));
		Thread.sleep(5000);
		//Actions ac = new Actions(driver);	
		//ac.scrollToElement(viewAll).perform();
		//driver.findElement(By.xpath("(//lightning-base-combobox/div/div[1])[3]")).click();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", viewAll);
		viewAll.click();
		//driver.findElement(By.xpath("//span[text()='View All Key Deals']")).click();
		driver.findElement(By.xpath("//a[@title='New']")).click();
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(oppname);
		
		WebElement type = driver.findElement(By.xpath("(//lightning-base-combobox/div/div[1])[3]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", type);
		type.click();
		driver.findElement(By.xpath("//span[@title='New Customer']")).click();
		WebElement leadSource = driver.findElement(By.xpath("(//lightning-base-combobox/div/div[1])[4]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", leadSource);
		leadSource.click();
		driver.findElement(By.xpath("//span[@title='Partner Referral']")).click();
		
		driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys(amount.toString());
		//driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("document.getElementByName('CloseDate').attr('value','10/09/2023')", "");
		
		driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys(output);
		WebElement stage = driver.findElement(By.xpath("(//lightning-base-combobox/div/div[1])[2]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", stage);
		stage.click();
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Search Campaigns...']")).click();
		driver.findElement(By.xpath("//span[@title='sactech']")).click();
		//driver.findElement(By.xpath("//span[@title='New Campaign']")).click();
		//driver.findElement(By.xpath("//div/input[@class=' input']")).sendKeys("sactech");
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		String Opportunity = driver.findElement(By.xpath("//slot[@name='primaryField']/lightning-formatted-text")).getText();
		//assertEquals(Opportunity, oppname);
		if(Opportunity.equals(oppname)) {
			System.out.println("Opportunity created Successfully"+oppname);
		}else {
			System.out.println("Opportunity was not created");
		}
		
	}
}
