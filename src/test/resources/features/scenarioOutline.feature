Feature: Smartbear order feature

  @scenarioOutline
  Scenario Outline: User ordering a product from Orders page
    Given user is logged into SmartBear Tester account and on Order page
    When user fills out the forms as followed from the table below
    And user selects "<product>" from product dropdown
    And user enters "<quantity>" to quantity
    And user enters "<actual name>" to customer name
    And user enters "<street>" to street
    And user enters "<city>" to city
    And user enters "<state>" to state
    And user enters "<zip>" to zip
    And user selects "<cardType>" as card type
    And user enters "<card number>" to card number
    And user enters "<expiration date>" to expiration date
    And user clicks process button
    Then user verifies "<expected name>" is in the list

    Examples:
      | product | quantity | actual name | street   | city     | state | zip   | cardType | card number      | expiration date | expected name |
      | MyMoney | 1        | Eren        | kepakepa | mililani | HI    | 98999 | visa     | 3333444422225555 | 12/24           | eren          |