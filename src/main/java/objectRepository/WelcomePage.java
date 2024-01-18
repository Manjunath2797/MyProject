package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
	@FindBy(xpath = "//button[text()='Login']")
	private WebElement login ;

	public WelcomePage(WebDriver driver) {
		PageFactory.initElements( driver , this);
	}
	public WebElement getLogin() {
		return login;
	}
	
	

}
