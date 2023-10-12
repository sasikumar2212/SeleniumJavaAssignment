package firstmarathon;


import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase1AbhiBus {

	public static void main(String[] args) {

		Date d = new Date();

		Calendar cal = Calendar.getInstance();
		cal.setTime(d);

		cal.add(Calendar.DAY_OF_MONTH, 1);
		Date d1 = cal.getTime();

		//System.out.println(d1);

		SimpleDateFormat formate = new SimpleDateFormat("dd-MM-yyyy");

		String date = formate.format(d1);

		//System.out.println(date);

		String splitter[] = date.split("-");

		String day = splitter[0];
		
		int s = Integer.parseInt(day);
		//System.out.println(s);

		
		
		  ChromeDriver driver = new ChromeDriver();
		  driver.get("https://www.abhibus.com/"); driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  // Type "Chennai" in the FROM text box
		  driver.findElement(By.id("source")).sendKeys("Chennai");
		  //) Click the first option from the pop up box
		  driver.findElement(By.xpath("//ul[@id='ui-id-1']/li[text()='Chennai']")).click();
		  //Type "Bangalore" in the TO text box
		  driver.findElement(By.id("destination")).sendKeys("Bangalore");
		  //Click the first option from the pop up box
		  driver.findElement(By.xpath("//ul[@id='ui-id-2']/li[text()='Bangalore']")).click();
		  //Select Date option
		  driver.findElement(By.id("datepicker1")).click();
		  //Select tomorrow's date in the Date field
		  WebElement Calblock1 = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]"));
		  Calblock1.findElement(By.xpath("//table/tbody/tr[1]/td[5]/a[text()='"+s+"']")).click();
		  //Click Search Buses
		  driver.findElement(By.linkText("Search")).click();
		  //Print the name of the first resulting bus
		  String Busname = driver.findElement(By.xpath("//div[@id='result_1616044516']/div[2]/div/h2")).getText();
		  System.out.println("First Bus Name : "+Busname);
		  //Choose SLEEPER in the left menu from Bus Type
		  driver.findElement(By.id("Bustypes4")).click();
		  //Get Available seat and print the seat count
		  String seetAvailable = driver.findElement(By.xpath("//div[@id='result_1616044516']/div[2]/div[2]/div/p[contains(@class,'noseats ')]")).getText();
		  System.out.println(" Available Seet Count: "+seetAvailable);
		  //Click seat selection button
		  driver.findElement(By.xpath("//*[@id='result_1616044516']/div[3]/div[2]/div[2]/a/span[text()='Select Seat']")).click();
		  //Select any seat 
		  driver.findElement(By.id("UO4-5ZZ")).click();
		  //Select SeatNumer and print Selected Seat Number 
		  String seatNo = driver.findElement(By.xpath("//span[@id='seatnos']")).getText();		  
		  System.out.println("Selected SeatNo: "+seatNo);
		  //Select Seat Total Fare and print Selected Seat Fare 
		  String seatFare = driver.findElement(By.xpath("//span[@id='ticketfare']")).getText();		  
		  System.out.println("Selected Seat Total Fare: "+seatFare);
		  //Select Boarding Point
		  WebElement bp = driver.findElement(By.id("boardingpoint_id"));
		  Select sel = new Select(bp);
		  //sel.selectByIndex(3);
		  sel.selectByVisibleText("Shollinganallaur-21:17");
		  //Select Dropping Point
		  WebElement dp = driver.findElement(By.id("droppingpoint_id"));
		  Select sel1 = new Select(dp);
		  sel1.selectByVisibleText("Kadubeesanahalli-05:32");
		  //Get the Title of the page
		  String titleOfThePage = driver.getTitle();
		  System.out.println(titleOfThePage);
		  
		  //Close the Browser
		  driver.quit();		  
		  
	}

}

