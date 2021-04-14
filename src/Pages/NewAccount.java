package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewAccount {

WebDriver driver;

	By header = By.cssSelector(".create-profile__title.create-profile__title--piece-of-the-pie");
	
	By FirstName = By.cssSelector("form.loyalty-offer__form>div>div>label>input");
	By lastname = By.xpath("(//*[@class='loyalty-offer__form__label']//input)[2]");
	By email = By.name("email");
	By confirmemail = By.xpath("(//*[@class='loyalty-offer__form__label']//input)[4]");
	By phoneNumber = By.id("loyalty-offer__form__phone");
	By password = By.name("password");
	By confirmpassword = By.name("passwordConfirm");
	By check = By.name("loyalty-offer__form__email-list-signup");
	
	
	public NewAccount(WebDriver driver) {
		this.driver = driver;
	}
	
	public String NewAccountPageHeader() {
		return driver.findElement(header).getText();
	}
	
	public void fillForm() {
	
		 
		driver.findElement(FirstName).sendKeys("Avneet");
		driver.findElement(lastname).sendKeys("behniwal");
		driver.findElement(email).sendKeys("avneet@gmail.com");
		driver.findElement(confirmemail).sendKeys("avneet@gmail.com");
		driver.findElement(phoneNumber).sendKeys("123456789");
		driver.findElement(password).sendKeys("123456");
		driver.findElement(confirmpassword).sendKeys("123456");
		driver.findElement(check).click();;
		
		
	}
	
	
}
