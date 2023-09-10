package marathon3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SalesforceTestcases extends BaseClass{
	
	
	@BeforeTest
	public void setFilename() {
		//filename = "CreateLead";
		path = "./Data/salesforce_QA.xlsx";
		sheetname = "sheet1";
	}
	
	@Test(dataProvider="fetchExcelData")
	public void testSalseforce(String question, String answer) throws InterruptedException {
		driver.findElement(By.xpath("//button[contains(@class,'salesforceIdentityAppLauncherHeader')]/div")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Content");
		driver.findElement(By.xpath("//mark[text()='Content']")).click();
		//Thread.sleep(10000);
		//Set<String> windowHandles = driver.getWindowHandles();
		//List<String> winhan = new ArrayList<String>(windowHandles);	
		//driver.switchTo().window(winhan.get(1));
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a/span[text()='Chatter']"))).click();
		//driver.findElement(By.xpath("//a/span[text()='Chatter']")).click();
		WebElement elem = driver.findElement(By.xpath("//a/span[text()='Chatter']"));
		JavascriptExecutor exe = driver;
		exe.executeScript("arguments[0].click();", elem);
		
		String title = driver.getTitle();
		
		//Assert.assertTrue("Title contain Chatter", title.contains("Chatter"));
		if(title.contains("Chatter")) {
			System.out.println("Title contains Chatter");
		}
		
		driver.findElement(By.xpath("//span[text()='Question']")).click();
		driver.findElement(By.tagName("textarea")).sendKeys(question);
		driver.findElement(By.xpath("//div[@id='outerContainer']/div//p")).sendKeys(answer);
		
		driver.findElement(By.xpath("//button[text()='Ask']")).click();
		WebElement qa = driver.findElement(By.xpath("//div/span[@class='uiOutputText']"));
		if(qa.getText().equalsIgnoreCase(question)){
			System.out.println("Question is Appeare"+question);
		}else {
			System.out.println("Question not Apperar");
		}
	}

}
