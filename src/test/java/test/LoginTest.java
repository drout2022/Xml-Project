package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	WebDriver driver;
	
	@Test
	@Parameters({"UserName","Password"})
	public void validUsershouldBeAbleToLogin(String username,String password) {
		
		driver=BrowserFactory.init();
		
		LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
		
		loginpage.insertUserName(username);
		loginpage.insertPassword(password);
		loginpage.clickSignIn();
		
		
		DashboardPage dashboardPage=PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.verifyDashboardPage();
		
		BrowserFactory.tearDown();
		
		//BrowserFactory.tearDown();
	}

}
