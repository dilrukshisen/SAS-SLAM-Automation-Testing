package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.SASSlamMerchandise.*;
import static pages.ShopPage.click_order_your_gear_page;

public class SASSlamMerchandise {

    @Then("User able to navigate into the merch page and clicks the sample page")
    public void User_able_to_navigate_into_the_merch_page_and_clicks_the_sample_page() throws InterruptedException {
        click_merch_page_xpath();
        click_product_xpath();
    }

}


