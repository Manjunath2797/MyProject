package testScriptRepo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.ExcelUtility;
import genericUtility.PropertiesUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.HomePage;

@Listeners(genericUtility.ListenersImplementationClass.class)
public class PD001 extends BaseClass {

	@Test(groups = {"smoke","regression"})
	public  void testcase1() throws Exception {
	
		ExcelUtility EUTIL = new ExcelUtility();
		String CATAGORY = EUTIL.getDataFromExcel("Promotions & Discounts", 2, 1);
		String SLUG = EUTIL.getDataFromExcel("Promotions & Discounts", 2 , 2);
		
//		driver.findElement(By.xpath("//span[text()='Promotions & Discounts']")).click();
//		driver.findElement(By.xpath("//span[text()='Categories']")).click();
		HomePage hp = new HomePage(driver);
		hp.clickOnPromotionsAndDiscountsWithCategories();
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//span[text()='Add']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Category']")).sendKeys(CATAGORY , Keys.TAB , SLUG );
		driver.findElement(By.xpath("//input[@id='basic_Type']")).click();
		driver.findElement(By.xpath("//div[text()='Others']")).click();
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(6000);
		
	}
}
