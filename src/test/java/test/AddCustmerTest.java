package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;


public class AddCustmerTest {
	WebDriver driver;

	
	String username ;
	String password ;
	String fullName;
	String company;
	String email;
	String phone;
	String address;
	String city;
	String state;
	String zip;
	String country;
	
	

	//@Test
	@Parameters({"UserName","Password","FullName","CompanyName","Email","Phone","Address","City","Country","State","Zip"})
	public void validUserShouldBeAbleToAddCustomer(String username,String password,String fullName,String company,String email,String phone,String address,String city,String state,String zip,String country) {
		driver = BrowserFactory.init();

		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.insertUserName(username);
		loginpage.insertPassword(password);
		loginpage.clickSignIn();

		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.verifyDashboardPage();
		dashboardPage.clickCustomerButton();
		dashboardPage.clickAddCustomerButton();
		
		AddCustomerPage addCustomerPage=PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomerPage.verifyAddContactPage();
		addCustomerPage.insertFullName(fullName);
		addCustomerPage.insertCompanyName(company);
		//addCustomerPage.insertEmail(email);
		addCustomerPage.insertPhoneNumber(phone);
		addCustomerPage.insertAddress(address);
		addCustomerPage.insertCity(city);
		addCustomerPage.insertState(state);
		addCustomerPage.insertZip(zip);
		//addCustomerPage.insertCountry(country);
		addCustomerPage.clickSaveButton();
		addCustomerPage.verifyProfilePage();
		
		dashboardPage.clickListCustomerButton();
		
		addCustomerPage.verifyEnteredName();
		
		
		

	}
	@Test
	@Parameters({"UserName","Password","FullName","CompanyName","Email","Phone","Address","City","Country","State","Zip"})
	public void validUserShouldBeAbleToAddCustomerFromListCustomer(String username,String password,String fullName,String company,String email,String phone,String address,String city,String state,String zip,String country) {
		driver = BrowserFactory.init();

		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.insertUserName(username);
		loginpage.insertPassword(password);
		loginpage.clickSignIn();

		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.verifyDashboardPage();
		dashboardPage.clickCustomerButton();
		dashboardPage.clickListCustomerButton();
		
		
		AddCustomerPage addCustomerPage=PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomerPage.clickAddCustomerOnListCustomer();
		addCustomerPage.verifyAddContactPage();
		addCustomerPage.insertFullName(fullName);
		addCustomerPage.insertCompanyName(company);
		//addCustomerPage.insertEmail(email);
		addCustomerPage.insertPhoneNumber(phone);
		addCustomerPage.insertAddress(address);
		addCustomerPage.insertCity(city);
		addCustomerPage.insertState(state);
		addCustomerPage.insertZip(zip);
		//addCustomerPage.insertCountry(country);
		addCustomerPage.clickSaveButton();
		addCustomerPage.verifyProfilePage();
		
		dashboardPage.clickListCustomerButton();
		
		addCustomerPage.insertIntoSearchBar();
		addCustomerPage.verifySearchBarAndProfile();
		
		
		
		
		

	}

}
