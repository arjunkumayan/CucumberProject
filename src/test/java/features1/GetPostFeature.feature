Feature:
    Verify different GET operation using REST-assured

  Scenario: Verify one author of the post
    Given I perform GET operation for "/post"
    And I perform GET for the post number "1"
    Then I should see the author name as "Arjun KK"


  Scenario: Verify collection of authors in the post
    Given I perform GET operation for "/post"
    Then I should see the author names



