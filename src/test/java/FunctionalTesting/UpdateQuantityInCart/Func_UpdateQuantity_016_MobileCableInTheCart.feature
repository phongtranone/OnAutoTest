Feature: Change quantity of MOBILE CABLE in the cart
  Can quickly update quantity of MOBILE CABLE in the cart page

  @FunctionalTesting @FuncUpdateQuantity016
  Scenario Outline: Add mobile cable and change quantity in the cart page
    Given Go to the home page
    When Search a product by the product name "<mobileCableModel>"
    And View the product details "<mobileCableModel>"
    And Add the product to the cart
    And View the cart details
    And Increase quantity in the cart page with number "<updatedQuantity>"
    Then Verify current quantity after changing with number "<updatedQuantity>"

    Examples:
      |mobileCableModel                        |updatedQuantity|
      |Cáp Type C - Type C 2m Xmobile DR-T11   |2              |