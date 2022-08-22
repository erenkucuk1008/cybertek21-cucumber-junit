@wiki
Feature: Wikipedia search feature
  As a user, I should be able to search terms and see related results

  Scenario: Wikipedia search functionality title verification
    Given user is on Wikipedia home page
    When user types "Steve Jobs" in the wiki search box
    And user clicks wiki search button
    Then user sees "Steve Jobs" in the wiki title

  Scenario: Wikipedia search functionality header verification
    Given user is on Wikipedia home page
    When user types "Steve Jobs" in the wiki search box
    And user clicks wiki search button
    Then user sees "Steve Jobs" in the main header


  @scenarioOutline
  Scenario Outline: Wikipedia search header verification
    Given user is on Wikipedia home page
    When user sees "<searchValue>" in the wiki title
    And user clicks wiki search button
    Then user sees "<expectedMainHeader>" in the main header
    Then user sees "<expectedTitle>" in the wiki title

    Examples: search terms we are going to search in wikipedia
      | searchValue | expectedMainHeader | expectedTitle |
      | Steve Jobs  | Steve Jobs         | Steve Jobs    |
      | Elon Musk   | Elon Musk          | Elon Musk     |
      | Bill Gates  | Bill Gates         | Bill Gates    |
      | Fatih Terim | Fatih Terim        | Fatih Terim   |
      | Kobe Bryant | Kobe Bryant        | Kobe Bryant   |

