Feature: Simple examples of how dataTables work

  @dataTable
  Scenario: User should be able to login with correct credentials
    Given user is on the dropdowns page of practice tool
    Then user should see below info in month dropdowns
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |


  Scenario: User should be able to login with correct credentials
    Given User is on the login page of SmartBear
    When User enters below info
      | username | Tester |
      | password | test   |
    Then User should see title changed to Web Orders


  Scenario: Something happens
    #Given user does something
    Then user should see below words displayed
      | Apple      |
      | Kiwi       |
      | Orange     |
      | Brocoli    |
      | Watermelon |
    # control + ALT + L duzenlemek icin
    #control + D copy yapmak icin