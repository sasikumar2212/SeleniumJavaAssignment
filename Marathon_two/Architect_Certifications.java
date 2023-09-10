package marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class Architect_Certifications {

	public static ChromeDriver driver;

	public static void findElementClick(By by) {
		driver.findElement(by).click();
	}

	public static void findElementSendKeys(By by, String x) {
		driver.findElement(by).sendKeys(x);
	}

	public static WebElement findElement(By by) {
		return driver.findElement(by);
	}

	public static void main(String[] args) throws IOException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");

		driver = new ChromeDriver(co);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		findElementSendKeys(By.id("username"), "hari.radhakrishnan@qeagle.com");
		findElementSendKeys(By.id("password"), "Leaf$1234");
		findElementClick(By.id("Login"));

		findElementClick(By.xpath("//span[text()='Learn More']"));

		Set<String> windowHandles = driver.getWindowHandles();
		List<String> winhans = new ArrayList<String>(windowHandles);
		driver.switchTo().window(winhans.get(1));

		findElementClick(By.xpath("//button[text()='Confirm']"));

		Shadow dom = new Shadow(driver);
		dom.setImplicitWait(20);
		dom.findElementByXPath("//span[text()='Learning']").click();
		// dom.setImplicitWait(20);
		WebElement fe = dom.findElementByXPath("//span[text()='Learning on Trailhead']");
		Actions ac = new Actions(driver);
		ac.moveToElement(fe).perform();

		WebElement fl = dom.findElementByXPath("//a[text()='Salesforce Certification']");
		ac.scrollToElement(fl).perform();
		fl.click();

		driver.findElement(By.xpath("(//div[contains(@class,'roleMenu-item')]/a/div)[2]")).click();
		String textSummary = driver.findElement(By.xpath("//h1[text()='Salesforce Architect']/following-sibling::div"))
				.getText();
		System.out.println(textSummary);
		List<WebElement> listOfCertificates = driver.findElements(By.xpath("//div[@class='credentials-card_title']/a"));

		for (WebElement ls : listOfCertificates) {
			System.out.println(ls.getText());
		}
		
		driver.findElement(By.xpath("//div[@class='credentials-card_title']/a")).click();
		
		List<WebElement> findAvailableCourse = driver.findElements(By.xpath("//div[@class='credentials-card ']"));
		int i =1;
		for(WebElement fac : findAvailableCourse) {
			File src = fac.getScreenshotAs(OutputType.FILE);
	        File target = new File("./screenshot/AvailableCourse"+i+".png");

	        FileUtils.copyFile(src,target);
	        i++;
		}
		
		driver.quit();
	}
}
