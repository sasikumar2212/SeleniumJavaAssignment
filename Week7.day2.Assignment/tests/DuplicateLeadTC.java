package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class DuplicateLeadTC extends ProjectSpecificMethod{
	private String uname;
	private String pass;
	@Parameters({"username","password"})
	@BeforeTest
	public void setFilename(final String username, final String password) {
		// filename = "CreateLead";
		sheetname = "DuplicateLead";
		uname =username;
		pass =password;
	}
	@Test(dataProvider="fetchData")
	public void runDeleteLead(Integer phone) throws InterruptedException {
		LoginPage lp =new LoginPage(driver);
		lp.enterUsername(uname).enterPassword(pass).clickLoginButton()
		.crmsfaPage().clickLeadforDuplication()
		.Click_find_Lead().Click_phoneNum().Enter_Phone_num(phone).Click_findlead_button().Select_first_result_and_Click();
		
	}
}
