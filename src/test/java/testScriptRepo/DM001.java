package testScriptRepo;

import java.io.IOException;


import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.ExcelUtility;
import objectRepository.DepartmentAddPage;
import objectRepository.DepartmentManagementHomePage;
import objectRepository.HomePage;

@Listeners(genericUtility.ListenersImplementationClass.class)
public class DM001 extends BaseClass {
	
	@Test(groups = {"smoke"})
	public void testcase2() throws Exception
	{
		
		ExcelUtility EUTIL = new ExcelUtility();
		String DEPTNAME = EUTIL.getDataFromExcel("Department Management", 2, 1);
//		driver.findElement(By.xpath("//span[text()='Department Management']")).click();
		HomePage hp = new HomePage(driver);
		hp.clickOnDepartmentManagement();
		Thread.sleep(6000);
		
		//driver.findElement(By.xpath("//span[text()='Add']")).click();
		DepartmentManagementHomePage dmHomepage = new DepartmentManagementHomePage(driver);
		
		
		dmHomepage.clickOnAdd();
		
		//driver.findElement(By.xpath("//input[@placeholder=\"Department Name\"]")).sendKeys(DEPTNAME);
		//driver.findElement(By.xpath("//button[text()='Submit']")).click();
	
		DepartmentAddPage deptAdd = new DepartmentAddPage(driver);
		deptAdd.departmentWithActiveStatus(DEPTNAME);
		Thread.sleep(6000);
		
		System.out.println("testCase2 execution successfull!!");
	}
	

}
