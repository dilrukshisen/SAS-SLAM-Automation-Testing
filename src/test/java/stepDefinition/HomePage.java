package stepDefinition;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

import static pages.HomePage.*;
import static pages.MainMenue.getText_home_page;

public class HomePage {


    @Given("User able to navigate to the Home page")
    public void  User_able_to_navigate_to_the_Home_page () throws InterruptedException {

        click_hamburger_menu_xpath();
    }

    @When("User able to view the slogan")
    public void  User_able_to_view_the_slogan() throws InterruptedException {

        getText_countdown_text_xpath();
        assertEquals("COUNTDOWN TO TIP-OFF",getText_countdown_text_xpath());




    }

    @Then("User should be able navigate to the gameday site when clicks register now button")
    public void  User_should_be_able_navigate_to_the_gameday_site_when_clicks_register_now_button() throws InterruptedException {
        register_now_btn();

    }




}
