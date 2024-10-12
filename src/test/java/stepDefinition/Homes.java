package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static pages.Homes.click_sasslam_logo_xpath;
import static pages.Homes.getText_countdown_name_xpath;

public class Homes {

    @Given("User able to navigate to the Home page")
    public void User_able_to_navigate_to_the_Home_page() throws InterruptedException {

        click_sasslam_logo_xpath();
    }

    @When("User able to view the game countdown")
    public void User_able_to_view_the_game_countdown() throws InterruptedException {

        getText_countdown_name_xpath();
    }
}
