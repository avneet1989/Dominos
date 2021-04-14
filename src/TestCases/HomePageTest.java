package TestCases;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.HomePage;



public class HomePageTest {
	WebDriver driver;
	HomePage homePage;
	
	@BeforeTest 
	public void initilizeDriver(){
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\14387\\\\OneDrive\\\\Documents\\\\TESTING\\\\all drivers\\\\chromedriver.exe");
		 driver=new ChromeDriver();
//		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\14387\\OneDrive\\Documents\\TESTING\\all drivers\\geckodriver.exe");
//		 driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.dominos.ca/en/");	
		
		
	}
	
	@Test(priority=2)
	public void verifyHomePageTitle() {
		homePage=new HomePage(driver);
		String title=homePage.homePageTitle();
		System.out.println(title);
		String Expectedtitle="Domino's Home Page - Domino's Pizza, Order Pizza Online for Delivery - Dominos.com";
		Assert.assertEquals(title, Expectedtitle);
		
		}
	
	 
//	@Test(priority=2)
//	public void verifySignInButton() {
//		System.out.println(homePage.verifySignButton());
//	}
//	 
//	
//
//	@Test(priority = 3) 
//	public void verifyCreateProfile() {
//		homePage.CreateProfile();
//		
//		
//	}
	 
	
	
	@Test(priority=1)
	public void selectDeleviryOption() {
	 homePage.selectDeleviry();
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//@AfterTest
		//public void driverClose(){
		//	driver.close();
		//}
	
	
	
	
	
	

}
