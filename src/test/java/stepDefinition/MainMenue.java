package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

import static pages.HomePage.click_hamburger_menu_xpath;
import static pages.MainMenue.*;

public class MainMenue {

    @Given("User navigate to the Home page and clicks on main menu")
    public void User_navigate_to_the_Home_page_and_clicks_on_main_menu() throws InterruptedException {
        click_hamburger_menu_xpath();

    }


    //@When("User able to view main menu")
    public void  User_able_to_view_main_menu() throws InterruptedException {
        getText_home_page();
        assertEquals("HOME", getText_home_page());

        getText_venue_update();
        assertEquals("VENUE UPDATE", getText_venue_update());

        getText_order_your_gear();
        assertEquals("ORDER YOUR GEARS", getText_order_your_gear());

        getText_division();
        assertEquals("DIVISION", getText_division());

        getText_size_guide();
        assertEquals("SIZE GUIDE", getText_size_guide());

    }

   //@Then("User should be able to closed the main menu")
    public void User_should_be_able_to_closed_the_main_menu() throws InterruptedException{
        click_close_btn();
    }


}
