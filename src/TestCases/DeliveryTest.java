package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Delivery;
import Pages.HomePage;


public class DeliveryTest {
	
	WebDriver driver;
	HomePage homePage;
	Delivery delivery;
	
	@BeforeTest 
	public void initilizeDriver(){
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\14387\\\\OneDrive\\\\Documents\\\\TESTING\\\\all drivers\\\\chromedriver.exe");
		 driver=new ChromeDriver();
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\14387\\OneDrive\\Documents\\TESTING\\all drivers\\geckodriver.exe");
//		 driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.dominos.ca/en/");
		homePage = new HomePage(driver);
		delivery=homePage.selectDeleviry();
		
	}
	
	@Test
	public void verifyDeliveryOption() throws InterruptedException {
		
		delivery.deliveryOption();
		
		
	}
	
	
	
	
	
	
	

}
