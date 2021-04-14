package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cart {

	WebDriver driver;
	
	
	By continueCheckout=By.xpath("//*[@class='js-checkoutButtons checkout-buttons']//a");
	
	public Cart(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	public Checkout continueCheckout() {
		driver.findElement(continueCheckout).click();
		return new Checkout(driver);
	}
	
	
	
	
	
	
}
