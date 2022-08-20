@Google
Feature: Google search functionality
  Agile Story: As a user, when I am on the google search page,
  I should be able to search whatever I want, and see relevant information


  Scenario: User search title verification
    Given User is on Google home page
    When User searches for apple
    Then User should see apple in the title


  Scenario: Search page title verification
    Given User is on Google home page
    When User searches for galatasaray
    Then User should see that the title is galatasaray

  @wip
  Scenario: Search page title verification
    Given User is on Google home page
    When User searches for "orange"
    Then User should see "orange" in the title