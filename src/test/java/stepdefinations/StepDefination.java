package stepdefinations;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

import java.util.List;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefination {



    @Given("User is on netbanking landing page")
    public void user_on_netbanking_landing_page(){
        System.out.println("User navigated to the landing page");
    }


    @When("user login into the application with username and password")
    public void userLoginIntoTheApplicationWithUsernameAndPassword() {
        System.out.println("Username and Password");
    }

    @And("User clicks on login button")
    public void userClicksOnLoginButton() {
        System.out.println("User clicks on login button");
    }

    @Then("Home page is populated")
    public void homePageIsPopulated() {
        System.out.println("home page is populated");
    }

    @And("Cards are displayed")
    public void cardsAreDisplayed() {
        System.out.println("cards are displayed");
    }

    @When("user login into the application with {string} and {string}")
    public void userLoginIntoTheApplicationWithUsernameAndPassword(String username, String password) {
        System.out.println("Username: "+username);
        System.out.println("Password: "+password);

    }


    @And("Cards displayed are {string}")
    public void cardsDisplayedAre(String value) {
        System.out.println("Card are "+value+" displayed ");
    }

    @When("user sign up with following details")
    public void userSignUpWithFollowingDetails(DataTable data) {
        List<String> dataFromFeature= data.asList();
        for(int i=0 ; i<dataFromFeature.size() ; i++){
            System.out.println(dataFromFeature.get(i));
        }


    }

    /*@When("user sign up with following details <username> and <password>")
    public void userSignUpWithFollowingDetailsUsernameAndPassword(String username, String password) {
        System.out.println(username);
        System.out.println(password);

    }*/

    @When("user sign up with following details <username> and <password>")
    public void userSignUpWithFollowingDetailsUsernameAndPassword(String username,String password) {
        System.out.println("Username"+username);
        System.out.println("Password"+password);
    }



    @When("^user sign up with details \"(.*)\" and \"(.*)\"$")
    public void userSignUpWithDetailsUsernameAndPassword(String username,String password) {
        System.out.println("Username"+username);
        System.out.println("Password"+password);
    }

    @Given("Validate the browser")
    public void validateTheBrowser() {
        System.out.println("Validate the browser");
    }

    @When("Browser is triggered")
    public void browserIsTriggered() {
        System.out.println("Browser is triggered");
        
    }

    @Then("check if browser is started")
    public void checkIfBrowserIsStarted() {
        System.out.println("check if browser is started");
    }
}
