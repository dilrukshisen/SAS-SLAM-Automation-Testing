package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static pages.MainMenue.getText_home_page;
import static pages.SocialMediaAccounts.click_instagram;
import static pages.VenuePage.*;

public class VenuePage {

    @When("User able to navigate into the venue page")
    public void User_able_to_navigate_into_the_venue_page() throws InterruptedException {
        click_venue_main_menu_xpath();


    }

    @Then("User able to downloaded the tournament guide")
    public void User_able_to_downloaded_the_tournament_guide() throws InterruptedException {
        click_tournament_guide_xpath();


    }


}
