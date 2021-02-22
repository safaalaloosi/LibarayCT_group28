
@wip
Feature: As a librarian, I should be able to add users from users page

Background:
  Given user successfully logged in to the user page
  When user enters User Management page

  Scenario: Add users with all valid info
    And clicks on Add User button
    Then user can fill up fields with valid info
    Then user clicks Save changes button

  Scenario: Librarians able to close the add user window with "close" button
    And clicks on Add User button
    Then user is able to close the window by clicking close button

  Scenario:  Librarians able to edit user info
    Then user clicks on edit user button
    Then user is able to enter new credentials
    And user is able to Save Changes

