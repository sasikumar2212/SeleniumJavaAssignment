package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class MergeLeadPage extends ProjectSpecificMethod {
	public static String leadID = "";
	public static Set<String> allWindows;
	public static List<String> allhandles;
	public static Set<String> allWindows2;
	public static List<String> allhandles2;

	public MergeLeadPage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public MergeLeadPage Click_find_Lead() {
		driver.findElement(By.linkText("Merge Leads")).click();
		return this;
	}

	public MergeLeadPage Click_findlead_first_image() {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		return this;
	}

	public MergeLeadPage switch_window_select_firstResule_for_firstfind(String fname) throws InterruptedException {
		allWindows = driver.getWindowHandles();
		allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fname);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		// driver.switchTo().window(allhandles.get(0));
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return this;
	}

	public MergeLeadPage switch_HomeWindow_Click_Second_FindImage() {
		driver.switchTo().window(allhandles.get(0));
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		return this;
	}

	public MergeLeadPage switch_Window_Select_FirstResule_For_SecondFind(String mname) throws InterruptedException {
		allWindows2 = driver.getWindowHandles();
		allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(mname);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return this;
	}

	public MergeLeadPage switch_Backto_Home_Click_MergeButton() {
		driver.switchTo().window(allhandles2.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		driver.switchTo().alert().accept();
		return this;
	}

	public MergeLeadPage find_MerchSuccess() {
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}return this;
	}

	
}
