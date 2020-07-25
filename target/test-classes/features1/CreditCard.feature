Feature: to make the credit card payment for specific months
  In order to CC payment as a real user and perform the all options

  Scenario: to check if min due payment flow is working
    Given preconditions are mentioned in this section
    When describe the user actions
    And user clicks on button
    Then observe the expected result


    Scenario: make min credit card payment
      Given  user is on pay credit card page
      When user fills all required details with min amount option
      And user click on pay button option
      Then Credit card confirmation page is displayed
      And Reference number is generated
      But Error message is not displayed

Scenario: Make min due payment
    Given use is already on pay credit card page
  Then user fills the all details and select min payment option
  And user click on pay button option
  Then credit card payment page is displayed
  But Error message is not displayed

  Scenario: Pay Statement balance
    Given user is on pay credit card page
    Then user fills all required details and select statement balance otpion
    And user clicks on login button
    Then credit card confirmation page is displayed

    Scenario: Enter amount as zero
      Given user is on pay credit card page
      Then user choose zero amount option
      And user clicks on login button
      Then Credit card confirmation page is not displayed
      But error message is displayed

