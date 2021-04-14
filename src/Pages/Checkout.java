package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkout {
	
	WebDriver driver;
	
	
	By deliveryInstruction = By.id("Delivery_Instructions");
	By totalOrder  = By.xpath("//*[@class='grid__cell--1/2']//tr");
	By firstName = By.id("First_Name");
	By lastName = By.id("Last_Name");
	By email = By.id("Email");
	By phoneNumber = By.id("Callback_Phone");
	By norewards =By.id("Loyalty_Enrollment_No");
	By selectcredit = By.cssSelector(".optionalInput");
	
	
	
	
	
	public Checkout(WebDriver driver) {
		this.driver=driver;
	}
	
	public void DeliveryInstructions() {
		
		driver.findElement(deliveryInstruction).sendKeys("Call on Arrival");
		List<WebElement> totalAmount=driver.findElements(totalOrder);
		for(int i=0;i<totalAmount.size();i++) {
			String all=totalAmount.get(i).getText();
			System.out.println(all);		
		}
		
		driver.findElement(firstName).sendKeys("Avneet");
		driver.findElement(lastName).sendKeys("Behniwal");
		driver.findElement(email).sendKeys("avneet@gmial.com");
		driver.findElement(phoneNumber).sendKeys("123456789");
		driver.findElement(norewards).click();
		
		List<WebElement> payment=driver.findElements(selectcredit);
		for(int k =0; k<payment.size();k++) {
			payment.get(k).click();
		}
		
		
		
		
	}
	
	
	
	
	

}
