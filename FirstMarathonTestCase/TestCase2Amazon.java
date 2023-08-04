package firstmarathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase2Amazon {

	public static void main(String[] args) throws InterruptedException {
		//Launch Chrome
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Type "Bags" in the Search box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
		//Choose thei tem in the result (bags for boys)
		driver.findElement(By.xpath("//*[@id='nav-flyout-searchAjax']/div[2]/div/div[1]/div[7]/div/div/span[text()=' for boys']")).click();
		//Print the total number of results 
		String totalResult = driver.findElement(By.xpath("//*[@id='search']/span[2]/div/h1/div/div[1]/div/div/span[1]")).getText();
		System.out.println("total number of results: "+totalResult);
		//Thread.sleep(5000);
		//Select the first 2 brands in the left menu
		driver.findElement(By.xpath("//div[@id='brandsRefinements']//i")).click();
		driver.findElement(By.xpath("(//div[@id='brandsRefinements']//i)[2]")).click();
		//Choose New Arrivals
		WebElement sort=driver.findElement(By.id("s-result-sort-select"));
		Select sel = new Select(sort);
		sel.selectByVisibleText("Newest Arrivals");
		//Print the first resulting bag info (name, discounted price)
		String bagName = driver.findElement(By.xpath("//div[@data-cel-widget='search_result_1']//h2/a/span")).getText();
		String bagPrice = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println("Bag Name Resulted: "+bagName +"Price of the bage: "+bagPrice);
		//Get the page title 
		System.out.println(driver.getTitle());
		//close the browser(driver.close())	
		driver.quit();

	}

}
