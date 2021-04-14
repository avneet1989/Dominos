package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sun.glass.ui.Menu;

import Pages.Delivery;
import Pages.HomePage;
import Pages.MenuPage;

public class MenuTest {
	WebDriver driver;
	HomePage homePage;
	Delivery delivery;
	MenuPage menuPage;
	
	
	
	@BeforeTest 
	public void initilizeDriver() throws InterruptedException{
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
		menuPage=delivery.deliveryOption();
		
		
	}
	@Test
	public void verifyBuildPizza() throws InterruptedException {
		
		menuPage.buildPizzaOption();
	}
	
	
	
	

}
