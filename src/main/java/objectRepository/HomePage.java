package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//input[@id='search']")
	private WebElement search;
	
	@FindBy(xpath = "//*[local-name()='svg' and @id='searchBtn']")
	private WebElement searchIcon;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getSearchIcon() {
		return searchIcon;
	}
	
	public void searchProduct(String searchProduct) {
		search.sendKeys(searchProduct);
		searchIcon.click();
		
	}
	
	
}
