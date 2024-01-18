package testCaseRepo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.PropertiesUtility;

@Listeners(genericUtility.ListenerImplementationClass.class)

public class SS001_LoginAsAUser extends BaseClass{

	@Test (groups = {"regression"} , retryAnalyzer = genericUtility.RetryAnalyserImplementationClass.class)
	public  void testcase1() throws Exception  {
		System.out.println("hello");	
	}
}
