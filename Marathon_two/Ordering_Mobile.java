package marathon2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.sukgu.Shadow;

public class Ordering_Mobile {

	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(co);
		driver.get("https://dev82321.service-now.com/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("Sasi@2212");
		driver.findElement(By.id("sysverb_login")).click();
		
		Shadow sh = new Shadow(driver);
		sh.setImplicitWait(20);
		sh.findElementByXPath("//div[@id='all']").click();
		//sh.setImplicitWait(20);
		//WebElement filter = sh.findElementByXPath("//input[@id='filter']");
		//filter.click();
		//filter.sendKeys("Service catalog");
		
		sh.findElementByXPath("//input[@id='filter']").sendKeys("Service catalog");
		
		/// dom.setImplicitWait(30);
        //WebElement filter = dom.findElementByXPath("//span[text()='Service Catalog']");
		//sh.findElementByXPath("//input[@id='filter']").sendKeys(Keys.ENTER);
		//sh.findElementByXPath("//span[@class='label']/mark[text()='Service catalog']").click();
		//sh.setImplicitWait(30);
		sh.findElementByXPath("//div[@id='all']").click();
		WebElement sel = sh.findElementByXPath("//span[text()='Service Catalog']");
		sel.click();
		sh.findElementByXPath("//td/a[text()='Mobiles']").click();
		
	}

}
