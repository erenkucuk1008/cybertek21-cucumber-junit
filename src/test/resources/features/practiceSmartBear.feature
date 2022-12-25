Feature: SmartBear order verification

  @s1
  Scenario Outline: user order a product from order page
    Given user logged into the smartbear login page and go to on order page
    When user fill out the forms as followed from the table below
    And user select "<product>" from Product dropdown
    And user enter "<quantity>" on Quantity
    And user enter "<actualName>" on Customer Name
    And user enter "<street>" on Street
    And user enter "<city>" on City
    And user enter "<state>" on State
    And user enter "<zip>" on Zip
    And user select "<cardType>" on Card Type
    And user enter "<cardNumber>" on Card Number
    And user enter "<exDate>" on Expire Date
    And user click process button
    Then user verify "<expectedName>" on the list

    Examples:
      | product     | quantity | actualName | street   | city     | state | zip   | cardType         | cardNumber       | exDate | expectedName |
      | MyMoney     | 4        | Eren Kucuk | KepaKepa | Waipahu  | HI    | 98765 | Visa             | 1122990033774466 | 12/28  | Eren Kucuk   |
      | FamilyAlbum | 3        | Arzum      | Ukuwai   | Mililani | HI    | 96789 | MasterCard       | 9374512890324765 | 10/25  | Arzum        |
      | ScreenSaver | 11       | Fehmi      | Owana    | Orlando  | FL    | 67321 | American Express | 373217894002122  | 01/23  | Fehmi        |