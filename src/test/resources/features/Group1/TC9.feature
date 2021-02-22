Feature: 9. user group category features


  @TC9
  Scenario: verify user categories
    Given User is on Library login "qa3_url" page
    Given the user login as a "librarian"
  When the user click users modules
  And the user click User Group dropdown
  Then the user should see the following options:
  | ALL           |
  |Librarian      |
  |Students       |



