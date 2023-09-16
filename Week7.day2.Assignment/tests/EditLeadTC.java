package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class EditLeadTC extends ProjectSpecificMethod{
	private String uname;
	private String pass;
	@Parameters({"username","password"})
	@BeforeTest
	public void setFilename(final String username, final String password) {
		// filename = "CreateLead";
		sheetname = "EditLead";
		uname =username;
		pass =password;
	}
	@Test(dataProvider="fetchData")
	public void runDeleteLead(Integer phone,String cname) throws InterruptedException {
		LoginPage lp =new LoginPage(driver);
		lp.enterUsername(uname).enterPassword(pass).clickLoginButton()
		.crmsfaPage().clickLeadforEdit()
		.Click_find_Lead().Click_phoneNum().Enter_Phone_num(phone).Click_findlead_button().Select_first_result_and_Click().Click_Edit_button().Update_company_name(cname).Click_submit_button();
		
		
	}
}
