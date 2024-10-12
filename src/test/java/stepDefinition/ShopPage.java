package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static pages.ShopPage.*;

public class ShopPage {

    @When("User able to navigate into the Order Your Gear page")
    public void User_able_to_navigate_into_the_Order_Your_Gear_page() throws InterruptedException {
        click_order_your_gear_page();

    }

    @Then("User able to navigate into merch")
    public void User_able_to_navigate_into_merch() throws InterruptedException {
        click_merch_page();


    }
    @Then("User able to navigate into the uniform page")
    public void User_able_to_navigate_into_the_uniform_page() throws InterruptedException {
        uniform_page_class();


    }

    @Then("User able to navigate into merch page in the when clicks order uniform")
    public void User_able_to_navigate_into_merch_page_in_the_when_clicks_order_uniform() throws InterruptedException {
        click_order_uniform_xpath();


    }

    @Given("User clicks a product user able to navigate product detail page")
    public void User_clicks_a_product_user_able_to_navigate_product_detail_page() throws InterruptedException {
        click_order_uniform_xpath();

    }


    @Then("User able to select the size of the garment")
    public void Use_able_to_select_the_sizeof_the_garment() throws InterruptedException {
        click_size_id();

    }



}
