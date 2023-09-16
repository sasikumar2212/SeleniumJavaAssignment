package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class LoginTC extends ProjectSpecificMethod{
	@Parameters({"username","password"})
	@Test
	public void runLogin(String username,String password) {
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername(username).enterPassword(password).clickLoginButton();
	}
}
