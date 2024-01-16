package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ScoPage {
	
	@FindAll({ @FindBy(xpath = "/input[@placeholder='Reference Name']") , @FindBy(xpath = "//input[@placeholder='Reference Name']") })
	private WebElement referenceName ;
	
	@FindBy(xpath = "//input[@placeholder='Slug']")
	private WebElement scoSlug;
	
	@FindBy(xpath = "//input[@placeholder='Seo Title']")
	private WebElement scoTitle;
	
	@FindBy(xpath = "//button[text()='Filter']")
	private WebElement scoFilter ;
	
	@FindBy(xpath = "//span[text()='Add']")
	private WebElement add;
	
	public ScoPage(WebDriver driver) {
		PageFactory.initElements( driver , this);
	}
	
	/**
	 * this method will filter sco by reference name
	 * @param refName
	 */
	public void filterOperation(String refName) {
		referenceName.sendKeys(refName);
		scoFilter.click();
		
	}
	
	/**
	 * this method will filter sco by reference name and slug
	 * @param refName
	 * @param slug
	 */
	public void filterOperation(String refName , String slug) {
		referenceName.sendKeys(refName);
		scoSlug.sendKeys(slug);
		scoFilter.click();
		
	}
	
	/**
	 * this method will filter sco by reference name , slug , title
	 * @param refName
	 * @param slug
	 * @param title
	 * @throws InterruptedException 
	 */
	public void filterOperation(String refName , String slug , String title) throws InterruptedException {
		referenceName.sendKeys(refName);
		scoSlug.sendKeys(slug);
		scoTitle.sendKeys(title);
		Thread.sleep(5000);
		scoFilter.click();
		
	}
	
	

}
