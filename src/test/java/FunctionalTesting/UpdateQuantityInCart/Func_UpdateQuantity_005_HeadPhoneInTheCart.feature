Feature: Change quantity of HEAD PHONE in the cart
  Can quickly update quantity of HEAD PHONE in the cart page

  @FunctionalTesting @FuncUpdateQuantity005
  Scenario Outline: Add head phone and change quantity in the cart page
    Given Go to the home page
    When Search a product by the product name "<headphoneModel>"
    And View the product details "<headphoneModel>"
    And Add the product to the cart
    And View the cart details
    And Increase quantity in the cart page with number "<updatedQuantity>"
    Then Verify current quantity after changing with number "<updatedQuantity>"

    Examples:
      |headphoneModel                            |updatedQuantity|
      |Tai nghe TWS OPPO ENCO Buds 3 Pro ETEK1   |5              |