package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class CreateLeadTC extends ProjectSpecificMethod{
	
	private String uname;
	private String pass;
	@Parameters({"username","password"})
	@BeforeTest
	public void setFilename(final String username, final String password) {
		//filename = "CreateLead";
		sheetname = "CreateLead";
		uname =username;
		pass =password;
	}
	
	
	@Test(dataProvider="fetchData")
	public void runCreateLead(String cname, String fname,String lname,Integer phone) {
		LoginPage lp =new LoginPage(driver);
		lp.enterUsername(uname).enterPassword(pass).clickLoginButton().crmsfaPage().clickLead()
		.click_on_leads().click_create_lead()
		.enter_company_name(cname).enter_frist_name(fname).enter_last_name(lname).enter_phone(phone)
		.click_create_button().resultPage();
	}
}
