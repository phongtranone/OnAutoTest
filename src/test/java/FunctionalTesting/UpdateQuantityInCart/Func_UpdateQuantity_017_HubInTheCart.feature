Feature: Change quantity of HUB in the cart
  Can quickly update quantity of HUB in the cart page

  @FunctionalTesting @FuncUpdateQuantity017
  Scenario Outline: Add hub and change quantity in the cart page
    Given Go to the home page
    When Search a product by the product name "<hubModel>"
    And View the product details "<hubModel>"
    And Add the product to the cart
    And View the cart details
    And Increase quantity in the cart page with number "<updatedQuantity>"
    Then Verify current quantity after changing with number "<updatedQuantity>"

    Examples:
      |hubModel                                               |updatedQuantity|
      |Adapter chuyển đổi USB Type C 4 in 1 HyperDrive HD41   |3              |