Feature: LoginFeature
     this feature deals with the login functionality

  Scenario: Login with correct username and password
    Given I navigate to the login page
    And  I enter the username as "admin" and password as "temp123"
    And I click on login button
    And I should see the userform page

  Scenario: Login to site
    Given I navigate to the automation login page
    And  I enter the following for login
          |username | password|
          |admin | temp123|
    And I click on login button
    And I should see the userdetails page
    And I just need to see how step looks for cucumber-java8

