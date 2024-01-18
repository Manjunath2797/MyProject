package sampleTestNgPrograms;

import org.testng.annotations.Test;

public class SampleTestNgMethods {

	@Test(priority = 1 , enabled = true , invocationCount = 5)
	public void testcase1() {
		System.out.println("tc1 executed");
		
	}
	
	@Test(priority = -1 , dependsOnMethods = "testcase1")
	public void testCase2() {
		System.out.println("tc2 executed");
	}

}
