package genericlibOrUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import objectRepo.HomePage;
import objectRepo.LoginPage;

public class BaseClass {

	public static WebDriver driver=null;
	public PropertiesUtilOrLib PUTIL= new PropertiesUtilOrLib();
	public SeleniumUtility SUTIL=new SeleniumUtility();
	
	@BeforeSuite(alwaysRun=true)
	public void createDbConnection() {
		System.out.println("db connection successful..!!");
	}
	
	@BeforeClass(alwaysRun=true)
	public void launchBrowser() throws Exception {
		PUTIL=new PropertiesUtilOrLib();
		String URL=PUTIL.getDataFromProperties("url");
		//if(browser.equals("Chrome")) {
		//	driver=new ChromeDriver();
		//	System.out.println("Chrome started");
		//}
		
		driver=new ChromeDriver();
		SUTIL.implicitWait(driver, 10);
		SUTIL.maximizeWindow(driver); 
		driver.get(URL);
		System.out.println("Launching successful..!!");
	}
	
	@BeforeMethod(alwaysRun=true)
	public void loginOperation() throws Exception  {
		String USERNAME=PUTIL.getDataFromProperties("username");
		String PASSWORD=PUTIL.getDataFromProperties("password");
		LoginPage LP=new LoginPage(driver);
		LP.loginOperation(USERNAME, PASSWORD);
		System.out.println("Login Successful..!!");
	}		
				
	@AfterMethod(alwaysRun=true)
	public void logoutOperation() {
		HomePage hp=new HomePage(driver);
		hp.logoutOperation(driver);
		System.out.println("Logout Successful..!!");
	}
	
	@AfterClass(alwaysRun=true)
	public void closeBrowser() {
		driver.close();
		System.out.println("Browser closed Successful..!!");
	}
	
	@AfterSuite(alwaysRun=true)
	public void closeDbConnection() {
		System.out.println("db connection closed");
	}
	
}
