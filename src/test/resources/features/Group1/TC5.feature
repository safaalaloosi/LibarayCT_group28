
@Now
Feature: As a librarian, I should be able to see book records on user page

  Background: User is already on Library login page
    Given User is on Library login "qa3_url" page

  Scenario: verify that the default record is 10
    Given the user login as a "librarian"
    When the user click users modules
    Then Default records dropdown value is 10

  Scenario: Show records for count options
    Given the user login as a "librarian"
    When the user click users modules
    And User clicks "Show " dropdown
    Then User should see the following dropdown options:
      | 5   |
      | 10  |
      | 15  |
      | 50  |
      | 100 |
      | 200 |
      | 500 |
