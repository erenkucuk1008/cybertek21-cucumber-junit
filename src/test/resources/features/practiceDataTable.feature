Feature: Examples that how to works dataTables

  @pDataTable
  Scenario: User should see all months correctly in dropdowns
    Given user is on the dropdowns page
    Then user should see below months in dropdowns
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