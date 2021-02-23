Feature: user status feature
@wip1
  Scenario: verify user status
    Given user successfully logged in to the user page
    When user enters User Management page
    And the user click Status dropdown
    Then librarian should see the following options:
      | ACTIVE  |
      | INACTIVE |



