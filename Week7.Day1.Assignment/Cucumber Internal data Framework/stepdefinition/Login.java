package stepdefinition;


import org.openqa.selenium.By;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends BaseClass{
	
	@Given("Enter the Username as {string}")
	public void enterUsername(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);
	
	}
	@Given("Enter the Password as {string}")
	public void enterPassword(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
		
	}
	@When("Click on the Login button")
	public void clickLoginButton(){
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("Welcome Page is displayed")
	public void welcomePage() {
		System.out.println(driver.getTitle());
	}
	
}
