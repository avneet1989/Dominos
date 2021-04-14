package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
	
	WebDriver driver;
	
	
	
	By signInButton = By.xpath("//*[@id=\"_dpz\"]/header/nav[1]/div[1]/div[3]/span/a");
	By signInPopUp = By.xpath("//h1[contains(text(),'Sign in to your Pizza Profile')]");
	By createOne= By.xpath("(//*[@id='pizzaProfileLoginOverlay']//a)[1]");
	By Orderonline = By.xpath("(//*[@class=' nav__menu-item order']/a)[1]");
	
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	
	public String homePageTitle(){
		return driver.getTitle();
	
	}
	
	public boolean verifySignButton(){
		return driver.findElement(signInButton).isDisplayed();
			
	}


	public NewAccount CreateProfile() {
		if(driver.findElement(signInButton).isDisplayed()) {
			driver.findElement(signInButton).click();
		}
		else {
			System.out.println("SignIn Button not dispalyed");
		}
		
		 System.out.println(driver.findElement(signInPopUp).getText());
	
		
		
		if(driver.findElement(createOne).isDisplayed()); {
			
			driver.findElement(createOne).click();
			}
		 {
			System.out.println("Create one is not displayed");
		}
		return new NewAccount(driver);
	}
	
	
	
	
	public Delivery selectDeleviry() {
		 driver.findElement(Orderonline).click();
		 return new Delivery(driver);
	}
	
	
	

}
