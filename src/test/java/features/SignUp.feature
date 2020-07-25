Feature: application login functionality to check hooks
  In order to check the application functionality with different flow correctly




  Scenario: Home Page default login with proper credentials
    Given User is on netbanking landing page
    When user login into the application with "arjunk" and "temp1234"
    And User clicks on login button
    Then Home page is populated
    And Cards displayed are "false"


  @RegressionTest
  Scenario: Home Page default login with proper credentials for Regression
    Given User is on netbanking landing page
    When user login into the application with "arjunk" and "temp1234"
    And User clicks on login button
    Then Home page is populated
    And Cards displayed are "false"


  @MoblieTest
  Scenario: Home Page default login with proper credentials for mobile
    Given User is on netbanking landing page
    When user login into the application with "arjunk" and "temp1234"
    And User clicks on login button
    Then Home page is populated
    And Cards displayed are "false"

  @SanityTest
  Scenario: Home Page default login with proper credentials for sanity
    Given User is on netbanking landing page
    When user login into the application with "arjunk" and "temp1234"
    And User clicks on login button
    Then Home page is populated
    And Cards displayed are "false"

  @WebTest
  Scenario: Home Page default login with proper credentials for web
    Given User is on netbanking landing page
    When user login into the application with "arjunk" and "temp1234"
    And User clicks on login button
    Then Home page is populated
    And Cards displayed are "false"

  @AppiumTest
  Scenario: Home Page default login with proper credentials for appium
    Given User is on netbanking landing page
    When user login into the application with "arjunk" and "temp1234"
    And User clicks on login button
    Then Home page is populated
    And Cards displayed are "false"