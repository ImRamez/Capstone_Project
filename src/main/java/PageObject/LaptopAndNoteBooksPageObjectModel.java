package PageObject;

/*
 * Ramez Hassan
 * Hawks Class 
 * Year: 2021
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.CapstoneBase;
import utilities.UtilityClass;

public class LaptopAndNoteBooksPageObjectModel extends CapstoneBase {

	public LaptopAndNoteBooksPageObjectModel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccount;

	public void clickOnMyAccount() {
		myAccount.click();
	}

	@FindBy(xpath = "//a[text()='Login']")
	private WebElement login;

	public void clickOnLogin() {
		login.click();
		UtilityClass.takeScreenShot();
	}

	@FindBy(id = "input-email")
	private WebElement email;
	
	@FindBy(id = "input-password")
	private WebElement password;

	public void enterEmailAndPassword(String emailValue, String passwordValue) {
		email.sendKeys(emailValue);
		password.sendKeys(passwordValue);
		UtilityClass.takeScreenShot();
	}

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginButton;

	public void clickOnLoginButton() {
		loginButton.click();
		UtilityClass.takeScreenShot();
	}

	@FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]")
	private WebElement laptopAndbooksTab;

	public void laptopAndNotebkTabClick() {
		laptopAndbooksTab.click();
		UtilityClass.takeScreenShot();
	}

	@FindBy(xpath = "//a[contains(text(),'Show All Laptops & Notebooks')]")
	private WebElement showAllElement;

	public void showAllClick() {
		showAllElement.click();
		UtilityClass.takeScreenShot();
	}

	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[2]/div/div[2]/div[1]/h4/a")
	private WebElement macBookProductElement;

	public void macBookProductClick() {
		macBookProductElement.click();
		UtilityClass.takeScreenShot();
	}

	@FindBy(xpath = "//button[contains(text(),'Add to Cart') and @xpath = '1']")
	private WebElement addToCartMBElement;

	public void addtorCardMacBClick() {
		addToCartMBElement.click();
		UtilityClass.takeScreenShot();
	}

	@FindBy(xpath = "//div[contains(text(),'Success: You have added ')]")
	private WebElement successMBmsg;

	public void successMacBMsg() {
		successMBmsg.click();
		UtilityClass.takeScreenShot();
	}

	@FindBy(xpath = "//li[contains(text(),'Availability: In Stock')]")
	private WebElement itemInTheCart;

	public boolean itemInShoppingCart() {

		UtilityClass.takeScreenShot();
		return UtilityClass.isElementDisplayed(itemInTheCart);
		
	}

	@FindBy(xpath = "//a[contains(text(),'shopping cart')]")
	private WebElement shopintCrtOption;

	public void shopingCartOptionClick() {
		shopintCrtOption.click();
		UtilityClass.takeScreenShot();
	}

	@FindBy(xpath = "//i[@class='fa fa-times-circle']")
	private WebElement removeFromCarteElement;

	public void removeFromCartClick() {
		removeFromCarteElement.click();
		UtilityClass.takeScreenShot();
	}

	@FindBy(xpath = "//p[@class='text-center']")
	private WebElement cartEmptyElement;

	public boolean cartEmpty() {
		UtilityClass.takeScreenShot();
		return UtilityClass.isElementDisplayed(cartEmptyElement);
	}



	@FindBy(xpath = "(//button[@type='button'])[14]")
	private WebElement macBookCompareElement;

	public void macBookCompareClick() {
		macBookCompareElement.click();
		UtilityClass.takeScreenShot();
	}
	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[3]/div/div[2]/div[2]/button[3]/i")
	private WebElement macBookAirCompareElement;

	public void macBookAirCompareClick() {
		macBookAirCompareElement.click();
		UtilityClass.takeScreenShot();
	}

	@FindBy(xpath = "//*[@id=\"product-category\"]/div[1]")
	private WebElement compareSuccmsg;

	public boolean compareSuccessText() {
		UtilityClass.takeScreenShot();
		return UtilityClass.isElementDisplayed(compareSuccmsg);
	}

	@FindBy(xpath = "//*[@id=\"product-category\"]/div[1]/a[2]")
	private WebElement productComparsionElement;

	public void productCompareClick() {
		productComparsionElement.click();
		UtilityClass.takeScreenShot();
	}

	@FindBy(xpath = "//*[@id=\"content\"]/h1")
	private WebElement productComparsChartElement;

	public boolean productCompareChart() {
		UtilityClass.takeScreenShot();
		return UtilityClass.isElementDisplayed(productComparsChartElement);
	}


	@FindBy(xpath = "(//i[@class='fa fa-heart'])[6]")
	private WebElement sonyWishLstElement;

	public void sonyWishListClick() {
		sonyWishLstElement.click();
	}

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement sonyWishLstSuccesMsgElement;

	public boolean sonySuccessValidationMsg() {
		if (sonyWishLstSuccesMsgElement.isDisplayed())
			return true;
		else
			return false;
	}
	
	@FindBy(xpath = "//a[text()='MacBook Pro']")
	private WebElement macBookProElement;
	
	public void macBookProClick() {
		macBookProElement.click();
	}
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/ul[2]/li[1]/h2")
	private WebElement macBookProPrice;
	
	public boolean macBookProPriceTag() {
		if(macBookProPrice.isDisplayed())
			
			return true;
		else
			return false;
		
	}
}
