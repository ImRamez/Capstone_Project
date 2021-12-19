package stepDefinitions;

import java.util.List;
import java.util.Map;

import PageObject.DesktopPageObjects;
import core.CapstoneBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DesktopStepDefinitions extends CapstoneBase {
	DesktopPageObjects deskPageObject = new DesktopPageObjects();

	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		deskPageObject.validateTitle();

	}

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		deskPageObject.clickOnDeskTops();
	}

	@And("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		deskPageObject.showAllDesk();
	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
		deskPageObject.deskValidate();
	}

	@And("User click  ADD TO CART option on ‘HP LP3065’ item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
		deskPageObject.addHpToCard();
	}

	@And("User select quantity {int}")
	public void user_select_quantity(int qty) {
		deskPageObject.hpQuantity(qty);

	}

	@And("User click add to Cart button")
	public void user_click_add_to_cart_button() {

		deskPageObject.quntityAddCardButton();
	}

	@Then("User should see a message ‘Success: you have added HP LP {int} to your Shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_hp_lp_to_your_shopping_cart(Integer int1) {
		deskPageObject.hpSuccessMsg();
	}

	@And("User click  ADD TO CART option on ‘Canon EOS 5D’ item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
		deskPageObject.canonEOS5D();
	}

	@And("User select color from dropdown ‘Red’")
	public void user_select_color_from_dropdown_red() {
		deskPageObject.colorOption();
	}

	@And("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() {
		deskPageObject.canonSuccesMsg();
	}

	@And("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		deskPageObject.canonEOS5D();
	}

	@And("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		deskPageObject.reviews();
	}

	@And("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> info = dataTable.asMaps(String.class, String.class);
		deskPageObject.nameData(info.get(0).get("yourname"));
		deskPageObject.reviewerRev(info.get(0).get("yourReview"));
		deskPageObject.rateCanon(info.get(0).get("Rating"));

	}

	@And("User click on Continue Button")
	public void user_click_on_continue_button() {
		deskPageObject.continueButton();

	}

	@Then("User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.”")
	public void user_should_see_a_message_with_thank_you_for_your_review() {
		deskPageObject.revewSuccesMsg();
	}

}
