package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static pages.SocialMediaAccounts.*;

public class SocialMediaAccounts {

    @When("User able to navigate into the Social Media Accounts")
    public void User_able_to_navigate_into_the_Social_Media_Accounts() throws InterruptedException {
        click_instagram();
        click_facebook();
        click_tiktok();
    }

}
