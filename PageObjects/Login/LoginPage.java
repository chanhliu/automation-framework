package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import core.WebActions;

public class LoginPage {
	
	WebDriver driver;
	WebActions webActions = new WebActions();
	
	@FindBy(id= "username")
	@CacheLookup
	private WebElement userName;
	
	@FindBy(id= "password")
	@CacheLookup
	private WebElement password;
	
	@FindBy(id= "login")
	@CacheLookup
	private WebElement loginBtn;

	
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
				PageFactory.initElements(new AjaxElementLocatorFactory(driver, new WebActions().getWaitTimeout()), this);
	}
	
	public void setUserName(String userName) {
		
	}
	
	
	
	
	
	
	
	
}
