package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import java.util.ArrayList;
import java.util.List;

public class LoginSteps {
    @Given("I navigate to the login page")
    public void iNavigateToTheLoginPage() {
        System.out.println("I navigate to the login page");
    }

     @And("I click on login button")
    public void iClickOnLoginButton() {
        System.out.println("I click on login button");
    }

    @And("I should see the userform page")
    public void iShouldSeeTheUserformPage() {
        System.out.println("I should see the userform page");
    }

    @And("I enter the username as {string} and password as {string}")
    public void iEnterTheUsernameAsAndPasswordAs(String username, String password) {
        System.out.println("I enter the username as: "+username);
        System.out.println("I enter the password as: "+password);
    }

    @Given("I navigate to the automation login page")
    public void iNavigateToTheAutomationLoginPage() {
        System.out.println("I navigate to the automation login page");
    }

    @And("I enter the following for login")
    public void iEnterTheFollowingForLogin(DataTable table) {
      /* List<String> data=  table.asList();
        System.out.println("username: "+data.get(0));
        System.out.println("Password: "+data.get(1));

        data.forEach(value->{
            System.out.println(value);
        });*/
        // Create a arrayList
        List<String> users = new ArrayList<>();

      /*  users = table.asList(User.class);
        for (User us:users){
            System.out.println("the username is: "+us.username);
            System.out.println("the password is: "+us.password);
        }

       */

        users = table.asList();
        users.forEach(va->{
            System.out.println(va);
        });


    }

    @And("I should see the userdetails page")
    public void iShouldSeeTheUserdetailsPage() {
        System.out.println("I should see the userdetails page");
    }

      @And("I enter ([^\"]*) and ([^\"]*)")
    public void iEnterUsernameAndPassword(String user,String pass) {
          System.out.println("username: "+user);
          System.out.println("password: "+pass);
    }

    @And("I just need to see how step looks for cucumber-java{int}")
    public void iJustNeedToSeeHowStepLooksForCucumberJava(int arg0) {

    }




    public class User{

        public String username;
        public String password;

        public User(String username,String password) {
            this.username = username;
            this.password = password;
        }

    }
}
