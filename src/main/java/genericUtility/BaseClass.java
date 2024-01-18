package genericUtility;

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
import objectRepository.WelcomePage;

public class BaseClass {
	
	PropertiesUtility PUTIL = new PropertiesUtility();
	public static WebDriver driver = null;
	
	@BeforeSuite(alwaysRun = true)
	public void dbConnectionEstablish() {
		System.out.println("db connection established");
	}
	
	@BeforeClass(alwaysRun = true)
	public void launchingBrowser() throws Exception {
		String URL = PUTIL.getDataFromPropertiesFile("url");
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\selenium folder\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(URL);
		System.out.println("browser launched successfully");
	}
	
	@BeforeMethod(alwaysRun = true)
	public void loginApplication() throws Exception {
		String USERNAME = PUTIL.getDataFromPropertiesFile("username");
		String PASSWORD = PUTIL.getDataFromPropertiesFile("password");
		WelcomePage wp = new WelcomePage(driver);
		Thread.sleep(5000);
		wp.getLogin().click();
		//driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(USERNAME 
				, Keys.TAB , PASSWORD , Keys.TAB , Keys.TAB, Keys.ENTER );
		System.out.println("login successfull");
	}
	
	@AfterMethod(alwaysRun = true)
	public void logoutApplication() {
		driver.findElement(By.xpath("//span[contains(@class,'BaseBadge')]")).click();
		driver.findElement(By.xpath("(//div[@class=\"MuiListItemIcon-root css-1f8bwsm\"])[6]")).click();
		System.out.println("logout successfull");
	}
	
	@AfterClass(alwaysRun = true)
	public void closeBrowser() {
		driver.quit();
		System.out.println("closed browser successfully");
	}
	
	@AfterSuite(alwaysRun = true)
	public void dbCloseConnection() {
		System.out.println("db connection closed");
	}
}
