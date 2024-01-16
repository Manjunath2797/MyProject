package sampleTestNgPrograms;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertClass {
	
	@Test
	public void hardAssertStrictComparision() {
		
		String expectedValue = "raja";
		String actualValue = "Raja";
		
		Assert.assertEquals(actualValue, expectedValue);
		System.out.println("Strict assertion passed!!");
	}
	
	@Test
	public void hardAssertContainsComparision() {
		
		String expectedValue = "maharaja";
		String actualValue = "raja";
		
		Assert.assertTrue(expectedValue.contains(actualValue));
		System.out.println("contains assertion passed!!");
			
	}
	
	

}
