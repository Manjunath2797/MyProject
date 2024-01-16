package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DepartmentAddPage {
	
	@FindBy(xpath = "//input[@placeholder='Department Name']")
	private WebElement departmentName;
	
	@FindBy(xpath = "//div[@class='ant-select-selector']")
	private WebElement status;
	
	@FindBy(xpath = "//div[text()='Active']")
	private WebElement activeStatus;
	
	@FindBy(xpath = "//div[text()='Inactive']")
	private WebElement inActiveStatus;
	
	@FindBy(xpath = "//button[text()='Submit']")
	private WebElement submit;
	
	public DepartmentAddPage(WebDriver driver) {
		PageFactory.initElements( driver , this);
	}

	public WebElement getDepartmentName() {
		return departmentName;
	}

	public WebElement getStatus() {
		return status;
	}

	public WebElement getActiveStatus() {
		return activeStatus;
	}

	public WebElement getInActiveStatus() {
		return inActiveStatus;
	}
	
	public WebElement getSubmit() {
		return submit;
	}
	
	public void departmentWithActiveStatus(String deptName) throws Exception {
		departmentName.sendKeys(deptName);
		Thread.sleep(4000);
		status.click();
		activeStatus.click();
		submit.click();
	}
	


	public void departmentWithInactiveStatus(String deptName) {
		departmentName.sendKeys(deptName);
		status.click();
		inActiveStatus.click();
		
	}
	
	
}
