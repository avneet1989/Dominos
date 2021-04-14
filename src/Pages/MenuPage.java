package Pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MenuPage {
	
	WebDriver driver;
	
	
	By Builpizza =By.xpath("//*[@id='csn-BuildYourOwn']/a");
	By pizzaSize = By.id("pizza_size|14");
	By pizzaCrust = By.id("crust_type|14HANDTOSS");
	By cheeseSause = By.id("cheeseSauce");
	By cheese = By.cssSelector(".topping.cheese>label>input");
	By sauce = By.cssSelector(".topping.sauce>label>input");
	By toppings = By.id("toppings");
	By noThanks = By.xpath("//button[contains(text(),'No Thanks')]");
	By addToOrder = By.xpath("//*[@id='pizzaSummaryInColumn']//div/button");
	By checkout = By.xpath("//*[@id='js-myOrderPage']/a");
	By noThankChechout = By.cssSelector(".grid__cell--1.right>a");
	
	
	
	
	
	public MenuPage(WebDriver driver) {
		this.driver = driver;
	}

	

	public Cart buildPizzaOption() throws InterruptedException {
		driver.findElement(Builpizza).click();
		System.out.println(driver.findElement(Builpizza).isEnabled());
		System.out.println(driver.findElement(pizzaCrust).isEnabled());
		driver.findElement(cheeseSause).click();
		System.out.println(driver.findElement(cheese).isEnabled());
		System.out.println(driver.findElement(sauce).isEnabled());
		//driver.findElement(toppings).click();
				
		driver.findElement(addToOrder).click();
		Thread.sleep(5000);
		Actions ac= new Actions(driver);
		ac.click(driver.findElement(noThanks)).build().perform();
		driver.findElement(checkout).click();
		driver.findElement(noThankChechout).click();
			
		return new Cart(driver);
			
		}
	
	
	
	
	
}
