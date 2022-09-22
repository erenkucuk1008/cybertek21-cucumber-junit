@etsy
Feature: Etsy search feature

  Scenario: Etsy default title verification
    Given user is on etsy landing page
    Then user sees title is as expected


  Scenario: Etsy wooden spoon title verification
    Given user is on etsy landing page
    When user types Wooden spoon in the search box
    Then user sees Wooden spoon in the title

  Scenario: Etsy wooden spoon title verification
    Given user is on etsy landing page
    When user types "wooden spoon" in the search box
    Then user sees "wooden spoon" in the title
