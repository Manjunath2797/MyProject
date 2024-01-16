package genericUtility;

/**
 * This is a BaseClass  to keep all the common features
 * @author Manjunath S
 * @since  Jan 2024
 */

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.HomePage;
import objectRepository.LoginPage;

public class BaseClass {
	
	public PropertiesUtility PUTIL = new PropertiesUtility();
	public static WebDriver driver = null;
	
	@BeforeSuite(alwaysRun = true)
	public void dbConnectionEstablish()
	{
		System.out.println("db connection successfull");
	}
	
	@BeforeClass(alwaysRun = true)
	public void launchingBrowser() throws Exception
	{
		String URL = PUTIL.getDataFromPropertiesFile("url");
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\selenium folder\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(URL);
		System.out.println("Browser launched successfully");
	}
	
	@BeforeMethod(alwaysRun = true)
	public void loginApplication() throws Exception
	{
		String USERNAME = PUTIL.getDataFromPropertiesFile("username");
		String PASSWORD = PUTIL.getDataFromPropertiesFile("password");
//		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(USERNAME , Keys.TAB ,
//				           PASSWORD , Keys.TAB , Keys.ENTER);
		
		LoginPage lp = new LoginPage(driver);
		lp.loginOperation(USERNAME, PASSWORD);
		System.out.println("login successfull");	
	}
	
	@AfterMethod(alwaysRun = true)
	public void closeApplication()
	{
//		driver.findElement(By.xpath("//span[text()='Logout']")).click();
		HomePage hp = new HomePage(driver);
		hp.logout();
		System.out.println("logout successfull");
	}
	
	@AfterClass(alwaysRun = true)
	public void closeBrowser()
	{
		driver.close();
		System.out.println("browser closed");
	}
	
	@AfterSuite(alwaysRun = true)
	public void closeDbConnection()
	{
		System.out.println("db connection closed successfully");	
	}
}
