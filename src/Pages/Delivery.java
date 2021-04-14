package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Delivery {
	WebDriver driver;
	
	
	By deliveryoption=By.id("Service_Type_Delivery");
	By delivery = By.cssSelector(".Delivery.c-delivery.circ-icons__icon.circ-icons__icon--delivery");
	
	By streetAddress= By.id("Street");
	By city= By.id("City");
	By postalCode = By.id("Postal_Code");
	
	By continueButton = By.cssSelector(".btn.btn--large.btn--search-location.js-search-cta.c-locationsearch-search-cta");
	
	
	
	
	
	public Delivery(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public MenuPage deliveryOption() throws InterruptedException {
		Thread.sleep(5000);
		Actions action = new Actions(driver);
		action.click(driver.findElement(delivery)).click().perform();
		System.out.println(driver.findElement(delivery).isEnabled());		
		driver.findElement(streetAddress).sendKeys("9205 Rue de reims");
		driver.findElement(city).sendKeys("Montreal");
		driver.findElement(postalCode).sendKeys("H2N 1T5");
		driver .findElement(continueButton).click();
		
		return new MenuPage(driver);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
