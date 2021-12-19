package stepDefinitions;

import PageObject.LaptopAndNoteBooksPageObjectModel;
import core.CapstoneBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.UtilityClass;

public class LaptopAndNoteBooksStepDefinition extends CapstoneBase {
	
	LaptopAndNoteBooksPageObjectModel obj = new LaptopAndNoteBooksPageObjectModel();
	
	@When("^user click on Myaccount$")
	public void user_click_on_Myaccount() {
		obj.clickOnMyAccount();
		logger.info("user clicked on MyAccount");

	}

	@And("^user click on Login option$")
	public void user_click_on_Login_option() {
		obj.clickOnLogin();
		logger.info("user clicked on Login Option");
		UtilityClass.takeScreenShot();
	}

	@And("^user enter userName '(.+)' and password '(.+)'$")
	public void user_enter_userName_and_password(String uName, String pass) {
		obj.enterEmailAndPassword(uName, pass);
		logger.info("user Enter " + uName + "and password " + pass);
		UtilityClass.takeScreenShot();
	}

	@And("^user click on Login Button$")
	public void user_click_login_Button() {
		obj.clickOnLoginButton();
		logger.info("user clicked on Login Button");
	}

	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		obj.laptopAndNotebkTabClick();
	}

	@And("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		obj.showAllClick();
	}

	@And("User click on MacBook  item")
	public void user_click_on_mac_book_item() {
		obj.macBookProductClick();
	}

	@Then("User should see a message ‘Success: You have added MacBook to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_to_your_shopping_cart() {
		obj.successMacBMsg();
	}

	@And("User should see ‘{int} tem\\(s){double}’ showed to the cart")
	public void user_should_see_tem_s_showed_to_the_cart(Integer int1, Double double1) {
		obj.itemInShoppingCart();
	}

	@And("User click on cart option")
	public void user_click_on_cart_option() {
		obj.shopingCartOptionClick();
	}

	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		obj.removeFromCartClick();
	}

	@Then("item should be removed and cart should show ‘{int} item\\(s)’")
	public void item_should_be_removed_and_cart_should_show_item_s(Integer int1) {
		obj.cartEmpty();
	}

	@When("User click on product comparison icon on ‘MacBook’")
	public void user_click_on_product_comparison_icon_on_mac_book() {
		obj.macBookCompareClick();
	}

	@When("User click on product comparison icon on ‘MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
		obj.macBookAirCompareClick();
	}

	@Then("User should see a message ‘Success: You have added MacBook Air to your product comparison!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_air_to_your_product_comparison() {
		obj.compareSuccessText();
	}

	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		obj.productCompareClick();
	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		obj.productCompareChart();
	}

	@When("User click on heart icon to add ‘Sony VaIO’ laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {
		obj.sonyWishListClick();
	}

	@Then("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’")
	public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list() {
		obj.sonySuccessValidationMsg();
	}

	@When("User click on ‘MacBook Pro’ item")
	public void user_click_on_mac_book_pro_item() {
		obj.macBookProClick();

	}

	@Then("User should see  ‘${double}’ price tag is present on UI.")
	public void user_should_see_$_price_tag_is_present_on_ui(Double double1) {
		obj.macBookProPriceTag();

	}

}
