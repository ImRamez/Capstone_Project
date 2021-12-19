package stepDefinitions;

import PageObject.HomePagePageObject;
import core.CapstoneBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDefinitions extends CapstoneBase{
	HomePagePageObject obj = new HomePagePageObject();
	
	@When("User click on Currency")
	public void user_click_on_currency() {
		obj.clickOnCurrency();

	}

	@And("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		obj.selectCurrency();
	
	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		obj.currencyChangeValidation();

	}

	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		obj.clickOnShoppingCart();

	}

	@Then("“Your shopping cart is empty!” message should display")
	public void your_shopping_cart_is_empty_message_should_display() {
		obj.shoppingCartValidation();
		

	}

}
