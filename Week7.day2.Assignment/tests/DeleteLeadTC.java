package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class DeleteLeadTC extends ProjectSpecificMethod{
	private String uname;
	private String pass;
	@Parameters({"username","password"})
	@BeforeTest
	public void setFilename(final String username, final String password) {
		// filename = "CreateLead";
		sheetname = "CreateLead";
		uname =username;
		pass =password;
	}
	@Test(dataProvider="fetchData")
	public void runDeleteLead(String cname, String fname,String lname,Integer phone) throws InterruptedException {
		LoginPage lp =new LoginPage(driver);
		lp.enterUsername(uname).enterPassword(pass).clickLoginButton()
		.crmsfaPage().clickLeadforDelete()
		.Click_find_Lead().Click_phoneNum().Enter_Phone_num(phone).Click_findlead_button()
		.Select_first_result_and_Click().Click_delete_Lead().Click_find_Lead_Again()
		.Enter_name().Click_find_Leadbutton_again().Check_the_result();
		
		
	}
	
}
