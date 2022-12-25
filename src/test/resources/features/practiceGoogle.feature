Feature: Google search functionality
  Agile Story : As a user, when I am on the google search page,
  I should be able to search whatever I want, and see relevant information

  @practice
  Scenario: User title verification
    Given user is Google home page
    When user searches  for galatasaray
    Then user should see galatasaray in the title


  @practice2
  Scenario: User title verification
    Given user is on Google home page
    When user searches for "ekrem imamoglu"
    Then user should see "ekrem imamoglu" in the title

