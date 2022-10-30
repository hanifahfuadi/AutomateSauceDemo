@PurchaseFlow

  Feature: Purchase flow
    As user want to purchase item

  Scenario: User will short item by (Z to A)
    Given User open the web page
    When User input "standard_user" as userName and "secret_sauce" as password
    Then User add one product to cart "Sauce Labs Backpack"
    Then User remove first "Sauce Labs Backpack"
    Then User sort product list by "Name (Z to A)"
    Then User first add "Sauce Labs Onesie"
    Then User second add "Test.allTheThings() T-Shirt (Red)"
    Then User click "cart logo"
    Then User remove "Test.allTheThings() T-Shirt (Red)"
    Then User "Continue Shopping"
    Then User click "cart logo"
    Then User check Out "CheckOut"
    When User input "Hanifah" as FirstName, "Fuadi" as LastName, and "15314" as Zip
    Then User will see "Item total: $7.99" as result item total
    And "Tax: $0.64" as result total
    Then "Total: $8.63" as total end
    Then User already satisfied and to go "FINISH" for ending SauceLab Demo
    Then User will see "THANK YOU FOR YOUR ORDER" in the end of page
