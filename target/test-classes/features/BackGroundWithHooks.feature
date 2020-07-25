Feature: application login functionality to check hooks
  In order to check the application functionality with different flow correctly

  Background:
    Given Validate the browser
    When Browser is triggered
    Then check if browser is started

  @PortalTest
Scenario: Home Page default login with proper credentials test1 on chrome
Given User is on netbanking landing page
When user login into the application with "arjunk" and "temp1234"
And User clicks on login button
Then Home page is populated
And Cards displayed are "false"

  @PortalTest
  Scenario: Home Page default login with proper credentials test2 on firefox
    Given User is on netbanking landing page
    When user login into the application with "arjunk" and "temp1234"
    And User clicks on login button
    Then Home page is populated
    And Cards displayed are "false"