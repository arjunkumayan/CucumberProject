Feature: application login functionality
   In order to check the application functionality with different flow correctly

  Background:
    Given Validate the browser
    When Browser is triggered
    Then check if browser is started

  @RegressionTest
  Scenario: Home Page default login with proper credentials
    Given User is on netbanking landing page
    When user login into the application with "arjunk" and "temp1234"
    And User clicks on login button
    Then Home page is populated
    And Cards displayed are "false"


  @SmokeTest
  Scenario: Home Page with multiple signup data
    Given User is on netbanking landing page
    When user sign up with following details
    |jenny |temp123 |jenny@gmail.com |australia top 12/2 |9112156435 |
    |jackson |temp1234 |jackson@gmail.com |usa garden 4 |983453928 |
    And User clicks on login button
    Then Home page is populated
    And Cards displayed are "false"

  @RegressionTest
  Scenario Outline: Home Page with data parameterization
    Given User is on netbanking landing page
    When user sign up with details "<username>" and "<password>"
    And User clicks on login button
    Then Home page is populated
    And Cards displayed are "false"

    Examples:
      |username|password|
      | jackson | temp123 |
      | johnson | temp456 |





