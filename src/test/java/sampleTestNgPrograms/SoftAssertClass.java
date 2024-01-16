package sampleTestNgPrograms;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertClass {
	
	@Test
	public void softAssertStrictComparision(){
		
		String expectedValue = "raja";
		String actualValue = "Raja";
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualValue, expectedValue);
		System.out.println("Strict assertion passed");
		sa.assertAll();
		
	}
	
	@Test
	public void softAssertContainsComparision(){
		
		String expectedValue = "maharaja";
		String actualValue = "raja";
		
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(expectedValue.contains(actualValue));
		System.out.println("contains assertion passed");
		sa.assertAll();
		
		
		
	}

}
