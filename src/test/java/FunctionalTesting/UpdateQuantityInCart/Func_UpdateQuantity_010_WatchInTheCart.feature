Feature: Change quantity of WATCH in the cart
  Can quickly update quantity of WATCH in the cart page

  @FunctionalTesting @FuncUpdateQuantity010
  Scenario Outline: Add watch and change quantity in the cart page
    Given Go to the home page
    When Search a product by the product name "<watchModel>"
    And View the product details "<watchModel>"
    And Add the product to the cart
    And View the cart details
    And Increase quantity in the cart page with number "<updatedQuantity>"
    Then Verify current quantity after changing with number "<updatedQuantity>"

    Examples:
      |watchModel                    |updatedQuantity|
      |CITIZEN 31 mm Nữ EL3100-55Z   |4              |