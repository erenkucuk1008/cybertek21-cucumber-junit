@1
Feature:Library app login feature
  Agile story:As a user, I should be able to login with correct credentials
  to different accounts. And dashboard should be displayed.
  # this is how we comment in feature file

  Background: User is already in login page
    Given User is on the login page

  @librarian @employee
  Scenario: Login as librarian
    When User enters librarian username
    And User enters librarian password
    Then User should see dashboard

  @student
  Scenario: Login as student
    When User enters student username
    And User enters student password
    Then User should see dashboard

  @admin @employee @db
  Scenario: Login as admin
    When User enters admin username
    And User enters admin password
    Then User should see dashboard