package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.CapstoneBase;

public class DesktopPageObjects extends CapstoneBase {

	public DesktopPageObjects() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//title[text()='TEK SCHOOL']")
	private WebElement title;

	public boolean validateTitle() {
		if (title.isDisplayed()) {
			return true;
		} else
			return false;
	}

	@FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[1]/a")
	private WebElement destops;

	public void clickOnDeskTops() {
		destops.click();
	}

	@FindBy(xpath = "//a[contains(text(),'Show All Desktops')]")
	private WebElement showAllDesktops;

	public void showAllDesk() {
		showAllDesktops.click();
	}

	@FindBy(xpath = "//h2[contains(text(),'Desktops')]")
	private WebElement desktopShow;

	public boolean deskValidate() {
		if (desktopShow.isDisplayed()) {
			return true;
		} else
			return false;
	}

	@FindBy(xpath = "//a[contains(text(),'HP LP3065')]")
	private WebElement addToCardHp;

	public void addHpToCard() {
		addToCardHp.click();
	}

	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement hpQnty;

	public void hpQuantity(int quntyValue) {
		
		hpQnty.clear();
		hpQnty.sendKeys(String.valueOf(quntyValue));
		
	}

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCardQntybtn;

	public void quntityAddCardButton() {
		addToCardQntybtn.click();
	}

	@FindBy(xpath = "//div[contains(text(),'You have added')]")
	private WebElement successMsgHP;

	public boolean hpSuccessMsg() {
		if (successMsgHP.isDisplayed()) {
			return true;
		} else
			return false;
	}

	@FindBy(xpath = "//a[contains(text(),'Canon EOS 5D')]")
	private WebElement Canon_EOS_5D_Link;

	public void canonEOS5D() {
		Canon_EOS_5D_Link.click();
	}

	@FindBy(xpath = "//select[@id='input-option226']")
	private WebElement colorSelection;

	public void colorOption() {
		Select select = new Select(colorSelection);
		select.selectByVisibleText("Red");

	}

	@FindBy(xpath = "//body/div[@id='product-product']/div[1]")
	private WebElement SuccesMsg;

	public boolean canonSuccesMsg() {
		if (SuccesMsg.isDisplayed()) {
			return true;
		} else
			return false;

	}

	@FindBy(xpath = "//a[contains(text(),'Reviews (0)')]")
	private WebElement review;

	public void reviews() {
		review.click();
	}

	@FindBy(xpath = "//input[@id='input-name']")
	private WebElement name;

	public void nameData(String nameVale) {
		name.sendKeys(nameVale);
	}

	@FindBy(xpath = "//textarea[@id='input-review']")
	private WebElement reviewBox;

	public void reviewerRev(String revText) {
		reviewBox.sendKeys(revText);
	}

	@FindBy(xpath = "//input[@value='5']")
	private WebElement goodRt;

	public void rateCanon(String rating) {
		if(rating.equalsIgnoreCase("good")&& !goodRt.isSelected())  {
			
			goodRt.click();
			
		}
	}

	@FindBy(xpath = "//button[@id='button-review']")
	private WebElement continueBtn;

	public void continueButton() {
		continueBtn.click();
	}

	@FindBy(xpath = "//div[contains(text(),'Thank you for your review.')]")
	private WebElement succesMsg;

	public boolean revewSuccesMsg() {
		if (succesMsg.isDisplayed()) {
			return true;
		} else
			return false;
	}

}
