package testScriptRepo;

import java.io.IOException;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.ExcelUtility;
import objectRepository.HomePage;
import objectRepository.ScoPage;

public class SCO001 extends BaseClass {
	
	@Test
	public void testcase4() throws Exception {
		
		ExcelUtility EUTIL = new ExcelUtility();
		String refName = EUTIL.getDataFromExcel("SEO Management", 2, 1);
		String slug = EUTIL.getDataFromExcel("SEO Management", 2, 2);
		String title = EUTIL.getDataFromExcel("SEO Management", 2, 3);
		
		HomePage hp =new HomePage(driver);
		hp.clickOnSeoManagementWithSeo();
		
		ScoPage sp = new ScoPage(driver);
		sp.filterOperation(refName, slug, title);
		Thread.sleep(6000);
	}

}
