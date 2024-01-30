package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EcommerceStepDef {
    @Given("user logins to url {string}")
    public void user_logins_to_url(String string) {
        // Write code here that turns the phrase above into concrete actions

    }
    @When("enters email id {string}")
    public void enters_email_id(String string) {
        // Write code here that turns the phrase above into concrete actions

    }
    @When("clicks continue")
    public void clicks_continue() {
        // Write code here that turns the phrase above into concrete actions

    }
    @When("enters paswword {string}")
    public void enters_paswword(String string) {
        // Write code here that turns the phrase above into concrete actions

    }
    @When("clicks sign in")
    public void clicks_sign_in() {
        // Write code here that turns the phrase above into concrete actions
        
    }
    @Then("user is on Amazon web page")
    public void user_is_on_amazon_web_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
