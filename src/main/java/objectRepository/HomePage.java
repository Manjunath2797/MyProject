package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath = "//span[text()='Dashboard Management']")
	private WebElement dBoardManagement;
	
	@FindBy(xpath = "//span[text()='Promotions & Discounts']")
	private WebElement promotionsAndDiscounts;
	
	@FindBy(xpath = "//span[text()='Categories']")
	private WebElement categories;
	
	@FindBy(xpath = "//span[text()='Offers']")
	private WebElement offers;
	
	@FindBy(xpath = "//span[text()='Banner Management']")
	private WebElement bannerManagement;
	
	@FindBy(xpath = "")
	private WebElement whatsNew;
	
	@FindBy(xpath = "")
	private WebElement testManagement;
	
	@FindBy(xpath = "//span[text()='Department Management']")
	private WebElement departmentManagement;
	
	@FindBy(xpath = "//span[text()='FAQs Management']")
	private WebElement faqManagement;
	
	@FindBy(xpath = "//span[text()='FAQ-Category']\"")
	private WebElement faqCategory;
	
	@FindBy(xpath = "//span[text()='FAQs']")
	private WebElement faqs;
	
	@FindBy(xpath = "//span[text()='SEO Management']")
	private WebElement scoManagement;

	@FindBy(xpath = "//span[text()='SEO']")
	private WebElement sco;
	
	@FindBy(xpath = "")
	private WebElement ticketManagement;
	
	@FindBy(xpath = "")
	private WebElement hrManagement;
	
	@FindBy(xpath = "")
	private WebElement jobApplications;
	
	@FindBy(xpath = "")
	private WebElement jobPosts;
	
	
	@FindBy(xpath = "")
	private WebElement btlManagement;
	
	@FindBy(xpath = "")
	private WebElement btlOffers;
	
	@FindBy(xpath = "")
	private WebElement btlCustomers;
	
	@FindBy(xpath = "")
	private WebElement userManagement;
	
	@FindBy(xpath = "")
	private WebElement users;
	
	@FindBy(xpath = "")
	private WebElement roles;
	
	@FindBy(xpath = "//span[text()='Logout']")
	private WebElement logout;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements( driver , this);
	}
	public WebElement getdBoardManagement() {
		return dBoardManagement;
	}

	public WebElement getPromotionsAndDiscounts() {
		return promotionsAndDiscounts;
	}

	public WebElement getCategories() {
		return categories;
	}

	public WebElement getOffers() {
		return offers;
	}

	public WebElement getBannerManagement() {
		return bannerManagement;
	}

	public WebElement getWhatsNew() {
		return whatsNew;
	}

	public WebElement getTestManagement() {
		return testManagement;
	}

	public WebElement getDepartmentManagement() {
		return departmentManagement;
	}

	public WebElement getFaqManagement() {
		return faqManagement;
	}

	public WebElement getFaqCategory() {
		return faqCategory;
	}

	public WebElement getFaqs() {
		return faqs;
	}

	public WebElement getScoManagement() {
		return scoManagement;
	}

	public WebElement getSco() {
		return sco;
	}

	public WebElement getTicketManagement() {
		return ticketManagement;
	}

	public WebElement getHrManagement() {
		return hrManagement;
	}

	public WebElement getJobApplications() {
		return jobApplications;
	}

	public WebElement getJobPosts() {
		return jobPosts;
	}

	public WebElement getBtlManagement() {
		return btlManagement;
	}

	public WebElement getBtlOffers() {
		return btlOffers;
	}

	public WebElement getBtlCustomers() {
		return btlCustomers;
	}

	public WebElement getUserManagement() {
		return userManagement;
	}

	public WebElement getUsers() {
		return users;
	}

	public WebElement getRoles() {
		return roles;
	}

	public WebElement getLogout() {
		return logout;
	}
	
	public void clickOnPromotionsAndDiscountsWithCategories() {
		promotionsAndDiscounts.click();
		categories.click();
	}
	
	public void clickOnPromotionsAndDiscountsWithOffers() {
		promotionsAndDiscounts.click();
		offers.click();	
		
	}
	
	/**
	 * This method will click on department management
	 */
	public void clickOnDepartmentManagement() {
		departmentManagement.click();
	}
	
	/**
	 * These methods are for Faq
	 */
	
	public void clickFaqManagementWithCategory() {
		faqManagement.click();
		faqCategory.click();
		
	}
	
	public void clickFaqManagementWithFaqs() {
		faqManagement.click();
		faqs.click();
		
	} 
	
	
	public void clickOnSeoManagementWithSeo() {
		scoManagement.click();
		sco.click();
	}
	/**
	 * This method is for logout
	 */
	public void logout(){
		logout.click();
	}

}
