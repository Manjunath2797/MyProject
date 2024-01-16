package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath = "//input[@placeholder='Email']")
	private WebElement  username;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[text()='Sign In']")
	private WebElement signIn;
	
	/*Initialize*/
	public LoginPage(WebDriver driver) {
		PageFactory.initElements( driver , this);
	}

//	public WebElement getUsername() {
//		return username;
//	}
//
//	public WebElement getPassword() {
//		return password;
//	}
//
//	public WebElement getSignIn() {
//		return signIn;
//	}
	
	public void loginOperation(String user , String pass) {
	//	username.sendKeys(user);
	//  getUsername().sendKeys(user);
		username.sendKeys(user);
		password.sendKeys(pass);
		signIn.click();
	}
	
	

}
