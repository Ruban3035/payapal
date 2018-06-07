package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import paypalpages.PaypalHome;
import wdMethods.ProjectMethods;

public class TC004_PaypalLogin extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC004_PaypalLogin";
		testDescription="login paypal Application";
		testNodes="Leads";
		category="Smoke";
		authors="ruban";
		browserName="chrome";
		dataSheetName="TC004";
	}
	@Test(dataProvider="fetchData")
	public void payapalLogin(String email,String pwd,String cpwd) {
		
		new PaypalHome()
		.clickSignup()
		.SelectRadioButton()
		.clickNext()
		.SelectCountry()
		.enterEmail(email)
		.enterPassword(pwd)
		.entercPassword(cpwd);
		
	}

}
