package firstmarathon;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testcase3PVRCinimas {

	public static void main(String[] args) throws InterruptedException {
		// Launch Chrome
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Click on Movie Library under hamburger button
		driver.findElement(By.className("nav-icon")).click();
		driver.findElement(By.xpath("//li/a[text()='Movie Library']")).click();
		// Select the City -->chennai
		Thread.sleep(2000);
		WebElement city = driver.findElement(By.name("city"));
		Select selCity = new Select(city);
		selCity.selectByValue("Chennai");
		// Select the Genre-->Animation
		WebElement genre = driver.findElement(By.name("genre"));
		Select selGenre = new Select(genre);
		selGenre.selectByVisibleText("ANIMATION");
		// Select the Language-->english
		WebElement lang = driver.findElement(By.name("lang"));
		Select selLang = new Select(lang);
		selLang.selectByVisibleText("ENGLISH");
		// Click on Apply
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		// Click on first resulting animation movie
		// driver.findElement(By.xpath("//div[contains(@class,'movie-list')]/div[1]")).click();
		// driver.findElement(By.xpath("(//div[@class='movie-list']/div[@class='movie-wrapper
		// ng-star-inserted'])[1]")).click();
		Thread.sleep(5000);
		// driver.findElement(By.xpath("(//div[contains(@class,'movie-list'])/div[@class='movie-wrapper
		// ng-star-inserted'])[1]")).click();
		// driver.findElement(By.xpath("(//div[@class='movie-list']/div[@class='movie-wrapper
		// ng-star-inserted'])[1]")).click();
		driver.findElement(By.xpath("//div[contains(@class,'movie-list')]/div[1]")).click();

		// Click proceed to book
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		// Enter the all fields cinema , Name, date, Prefered show time, no of seats,
		// food and beverages,Email and Mobile
		WebElement selCinema = driver.findElement(By.id("cinemaName"));
		Select selcin = new Select(selCinema);
		selcin.selectByVisibleText("INOX The Marina Mall, OMR, Chennai");

		// Calculate 5 day after date and convert to day(int)
		Date d = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.DAY_OF_MONTH, 6);
		Date d1 = cal.getTime();
		SimpleDateFormat formate = new SimpleDateFormat("dd-MM-yyyy");
		String date = formate.format(d1);
		String splitter[] = date.split("-");
		String day = splitter[0];
		int s = Integer.parseInt(day);
		
		driver.findElement(By.xpath("//pvr-datepicker[@id='datepicker-input']//input")).click();
		driver.findElement(By.xpath("//span[text()='"+s+"']")).click();
		WebElement showTime = driver.findElement(By.xpath("//select[@name='timings']"));
		Select shTime = new Select(showTime);
		shTime.selectByVisibleText("12:00 PM - 03:00 PM");
		driver.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Sasikumar");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Test123@gmail.com");
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("1234567890");
		WebElement food = driver.findElement(By.xpath("//select[@name='food']"));
		Select selFood = new Select(food);
		selFood.selectByVisibleText("Yes");
		driver.findElement(By.xpath("//input[@name='comment']")).sendKeys("Good");
		//Click on copy to self 
		driver.findElement(By.xpath("//label[contains(@class,'custom-radio')]")).click();
		//Click on  Send Request
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		//Click cancel 
		driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
		//Close OTP Dialog 
		driver.findElement(By.xpath("//button[text()='×']")).click();
		//Get Page Title
		System.out.println(driver.getTitle());
		//close browser
		driver.close();
	}

}
