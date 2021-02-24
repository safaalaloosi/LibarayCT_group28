Feature:  User management table feature

  @dataTable
  Scenario: : User management table columns names
    Given User on the homepage
    When  User clicks users module
    Then  User should see the following column names
      | Actions   |
      | User ID   |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |