package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import steps.BDDStyleMethod;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.is;


public class GETPostSteps {
    @Given("I perform GET operation for {string}")
    public void iPerformGETOperationFor(String url) {

       given().contentType(ContentType.JSON);

    }

    @And("I perform GET for the post number {string}")
    public void iPerformGETForThePostNumber(String postNumber) {
       /* when().get(String.format("http://localhost:3000/posts/%s",postNumber)).
                then().body("author",is("Arjun KK"));*/

        BDDStyleMethod.SimpleGETPost(postNumber);

    }

    @Then("I should see the author name as {string}")
    public void iShouldSeeTheAuthorNameAs(String arg0) {

    }

    @Then("I should see the author names")
    public void iShouldSeeTheAuthorNames() {
        BDDStyleMethod.PerformContainsCollection();
    }
}
