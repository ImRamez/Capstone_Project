package PageObject;
/*
 * Ramez Hassan
 * Hawks Class 
 * Year: 2021
 */

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.CapstoneBase;
import utilities.UtilityClass;

public class HomePagePageObject extends CapstoneBase {
	
	
	public HomePagePageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Currency')]")
	private WebElement currency;
	
	public void clickOnCurrency() {
		currency.click();
		logger.info("User clicked on currency drop down menue");
	
	}
	
	@FindBy(xpath="//button[@name='EUR']")
	private WebElement eruo;
	public void selectCurrency(){
		eruo.click();
		logger.info("User click on Eruo currency from drop down");
		
		
	}
	@FindBy(xpath = "//strong[contains(text(),'€')]")
	private WebElement carrencyDisplyed;
	public boolean currencyChangeValidation() {
		UtilityClass.takeScreenShot();
		return UtilityClass.isElementDisplayed(carrencyDisplyed);
	
	}
	
	
	@FindBy(xpath="//span[contains(text(),'Shopping Cart')]")
	private WebElement shoppingCart;
	public void clickOnShoppingCart() {
		shoppingCart.click();
		logger.info("User clicked on shopping cart");
	}
	
	@FindBy(xpath = "(//p[text()='Your shopping cart is empty!'])[2]")
	private WebElement shopingCartMassage;
	public boolean shoppingCartValidation() {
		System.out.println("Shoping Cart is empty");
		UtilityClass.takeScreenShot();
		return UtilityClass.isElementDisplayed(shopingCartMassage);	
	
	}

}
