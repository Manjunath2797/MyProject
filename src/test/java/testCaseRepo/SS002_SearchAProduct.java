package testCaseRepo;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.ExcelUtility;
import objectRepository.HomePage;

public class SS002_SearchAProduct extends BaseClass {
	
	@Test(groups = {"smoke"})
	public void testcase2() throws Exception {
		
		ExcelUtility EUTIL = new ExcelUtility();
		String product = EUTIL.getDataFromExcelFile("HomePage", 1, 1);
		HomePage hp = new HomePage(driver);
		hp.searchProduct(product);
		Thread.sleep(6000);
		
		
		
		
		
	}

}
