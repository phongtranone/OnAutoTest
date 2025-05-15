Feature: Change quantity of TABLET in the cart
  Can quickly update quantity of TABLET in the cart page

  @FunctionalTesting @FuncUpdateQuantity011
  Scenario Outline: Add tablet and change quantity in the cart page
    Given Go to the home page
    When Search a product by the product name "<watchModel>"
    And View the product details "<watchModel>"
    And Add the product to the cart
    And View the cart details
    And Increase quantity in the cart page with number "<updatedQuantity>"
    Then Verify current quantity after changing with number "<updatedQuantity>"

    Examples:
      |watchModel                       |updatedQuantity|
      |iPad Air M3 11 inch WiFi 128GB   |3              |