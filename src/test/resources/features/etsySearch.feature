@etsy
Feature: Etsy search feature

  Scenario: Etsy default title verification
    Given user is on www.etsy.com
    Then user sees title is as expected


  Scenario: Etsy wooden spoon title verification
    Given user is on www.etsy.com
    When user types Wooden spoon in the search box
    Then user sees Wooden spoon in the title

  Scenario: Etsy wooden spoon title verification
    Given user is on www.etsy.com
    When user types "Wooden spoon" in the search box
    Then user sees "Wooden spoon" in the title