package genericUtility;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumWebDriverUtility {

	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	/**
	 * select option in dropdown using index
	 * @param element
	 * @param indexNum
	 */
	public void selectOptionFromDropDown(WebElement element , int indexNum) {
		
		Select s = new Select(element);
		s.selectByIndex(indexNum);
		
	}
	
	/**
	 * select option from dropdown using value
	 * @param element
	 * @param value
	 */
	
	public void selectOptionFromDropDown(WebElement element , String value) {
		
		Select s = new Select(element);
		s.selectByValue(value);
		
	}
	
	/**
	 * select option from droopdown using visible text
	 * @param element
	 * @param visibleText
	 */
	public void selectOptionFromDropDownVisibleText(WebElement element , String visibleText) {
		
		Select s = new Select(element);
		s.selectByValue(visibleText);
		
	}
	
	
	/**
	 * this method is to move to an element
	 * @param driver
	 * @param element
	 */
	public void movingToAnElement(WebDriver driver , WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	
	/**
	 * this method will accept the alert pop up
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver) {
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}
	
	
	/**
	 * this method will dismiss the alert pop up
	 * @param driver
	 */
	public void dismissAlert(WebDriver driver) {
		Alert alt = driver.switchTo().alert();
		alt.dismiss();
	}
	
	
	
	
}
