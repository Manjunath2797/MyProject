package sampleTestNgPrograms;

import org.testng.Reporter;
import org.testng.annotations.Test;
/*
 * if we want to create a dependency between methods we have to use "dependsOn()".
 * we can use multiple methods in @Test annotation. 
 * If we want to remove a test case from execution , we have to use a method called enable() = false.
 * If we want execute a method for specific number of times , we have to use a method called as
   "invocationCount()".
 * If we want to pass any use full information in our report , we have to use a static method names as 
   "log(String)" which is present in Reporter class.
 */

public class Sample2 {
	public class Sample1 {

		@Test(priority = 1 , enabled = true , invocationCount = 5)
		public void createUser() {
			System.out.println("user created");
		}
		@Test(priority = 2 , dependsOnMethods = "createUser")
		public void modifyUser() {
			System.out.println("user modified");
			Reporter.log("modifyUser depends on createUser");
		}
		
		@Test(priority = 3)
		public void deleteUser() {
			System.out.println("user deleted");
		}
	}

}
