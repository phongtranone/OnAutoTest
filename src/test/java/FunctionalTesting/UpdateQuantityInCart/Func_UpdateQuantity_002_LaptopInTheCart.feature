Feature: Change quantity of LAPTOP in the cart
  Can quickly update quantity of LAPTOP in the cart page

  @FunctionalTesting @FuncUpdateQuantity002
  Scenario Outline: Add laptop and change quantity in the cart page
    Given Go to the home page
    When Search a product by the product name "<laptopModel>"
    And View the product details "<laptopModel>"
    And Add the product to the cart
    And View the cart details
    And Increase quantity in the cart page with number "<updatedQuantity>"
    Then Verify current quantity after changing with number "<updatedQuantity>"

    Examples:
      |laptopModel                                     |updatedQuantity|
      |Asus Vivobook Go 15 E1504FA R5 7520U (NJ776W)   |3              |