package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class MergeLeadTC extends ProjectSpecificMethod{
	private String uname;
	private String pass;
	@Parameters({"username","password"})
	@BeforeTest
	public void setFilename(final String username, final String password) {
		// filename = "CreateLead";
		sheetname = "MergeLead";
		uname =username;
		pass =password;
	}
	@Test(dataProvider="fetchData")
	public void runDeleteLead(String fname,String mname) throws InterruptedException {
		LoginPage lp =new LoginPage(driver);
		lp.enterUsername(uname).enterPassword(pass).clickLoginButton()
		.crmsfaPage().clickLeadforMerge()
		.Click_find_Lead().Click_findlead_first_image()
		.switch_window_select_firstResule_for_firstfind(fname)
		.switch_HomeWindow_Click_Second_FindImage().switch_Window_Select_FirstResule_For_SecondFind(mname).switch_Backto_Home_Click_MergeButton()
		.find_MerchSuccess();
		
		
	}
}
