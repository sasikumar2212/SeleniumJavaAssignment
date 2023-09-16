package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;


public class LoginPage extends ProjectSpecificMethod{

	public LoginPage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	public LoginPage enterUsername(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
		return this;
	}

	public LoginPage enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		return this;
	}
	
	public WelcomePage clickLoginButton(){
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage(driver);
	}
	
}
