package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ListCostumerPage {
WebDriver driver;
	
	public ListCostumerPage(WebDriver driver) {
		this.driver=driver;
		
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[1]/a[1]")
	WebElement AddCustomer_List_Customer_Element;
	@FindBy(how = How.XPATH, using = "//*[@id=\"foo_filter\"]")
	WebElement SearchBar_ListCustomer_Element;
	
	public void clickAddCustomerOnListCustomer() {
		AddCustomer_List_Customer_Element.click();
	}
public void insertIntoSearchBar() {
	//String enteredName=getEnterName();
	AddCustomerPage addCustomer=new AddCustomerPage();
	SearchBar_ListCustomer_Element.sendKeys(null);
}
}
