Feature: Simple examples of how dataTables work

  @dataTable
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