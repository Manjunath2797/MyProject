package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DepartmentManagementHomePage {
	
	@FindBy(xpath = "//span[text()='Add']")
	private WebElement add;

	public DepartmentManagementHomePage(WebDriver driver) {
		PageFactory.initElements( driver , this);
	}
	
	
	public WebElement getAdd() {
		return add;
	}
	public void clickOnAdd() {
		add.click();
	}
	
	

}
