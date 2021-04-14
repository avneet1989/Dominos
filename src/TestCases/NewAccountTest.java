package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.NewAccount;

public class NewAccountTest {
	WebDriver driver;
	HomePage homePage;
	NewAccount newAccount;
	
	@BeforeTest 
	public void initilizeDriver(){
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\14387\\\\OneDrive\\\\Documents\\\\TESTING\\\\all drivers\\\\chromedriver.exe");
		 driver=new ChromeDriver();
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\14387\\OneDrive\\Documents\\TESTING\\all drivers\\geckodriver.exe");
//		 driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.dominos.ca/en/");
		homePage = new HomePage(driver);
		newAccount=homePage.CreateProfile();
		
		
	}
	
	@Test(priority=1)
	public void verifynewAccountPageHeader() {
		
		String header=newAccount.NewAccountPageHeader();
		System.out.println(header);
		String Expectedheader="JOIN TO START EARNING POINTS TOWARD FREE PIZZA!";
		Assert.assertEquals(header, Expectedheader);
	
		}
	
	
	
	@Test (priority=2)
	public void fillForm() {
		newAccount.fillForm();
	}
	

}
