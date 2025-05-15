Feature: Add a DESKTOP PC to the cart
  Can quickly add a DESKTOP PC to the cart and view the cart page

  @RegressionTesting @Reg_Cart_010
  Scenario Outline: Add a desktop pc to the cart and view the cart page
    Given Go to the home page
    When Search a product by the product name "<pcModel>"
    And View the product details "<pcModel>"
    And Add the product to the cart
    Then Verify number of product in the cart is "1"
    And View the cart details
    And Verify that the cart contains product name "<pcModel>"
    And Verify that the cart display original price "<productPrice>"

    Examples:
      |pcModel                           |productPrice   |
      |ROSA Crystal A10 Ryzen 3 3200G    | 5.990.000đ    |