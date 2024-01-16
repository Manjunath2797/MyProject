package testScriptRepo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.ExcelUtility;
import objectRepository.HomePage;

@Listeners(genericUtility.ListenersImplementationClass.class)
public class FA001 extends BaseClass{
	@Test(groups = {"regression"} , retryAnalyzer = genericUtility.RetryAnalyserImplementationClass.class)
	public void testCase3() throws  Exception
	{
		ExcelUtility EUTIL = new ExcelUtility();
		String FAQCAT = EUTIL.getDataFromExcel("FAQs Management", 2, 1);
//		driver.findElement(By.xpath("//span[text()='FAQs Management']")).click();
//		driver.findElement(By.xpath("//span[text()='FAQ-Category']")).click();
		HomePage hp = new HomePage(driver);
		hp.clickFaqManagementWithCategory();
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//span[text()='Add']")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"Category\"]")).sendKeys(FAQCAT);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(6000);
		
		
		System.out.println("testcase3 execution succesfull!!");
		
		
	}

}
