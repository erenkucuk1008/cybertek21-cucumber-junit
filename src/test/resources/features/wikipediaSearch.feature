@wiki
Feature: Wikipedia search feature
  As a user, I should be able to search terms and see related results

  Background: user is already do these steps
    Given user is on Wikipedia home page
    When user types Steve Jobs in the wiki search box
    And user clicks wiki search button

  Scenario: Wikipedia search functionality title verification
    Then user sees Steve Jobs in the wiki title

  Scenario: Wikipedia search functionality header verification
    Then user sees Steve Jobs in the main header

  Scenario: Wikipedia search functionality image header verification
    Then user sees Steve Jobs in the image header