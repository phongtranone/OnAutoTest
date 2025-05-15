Feature: Add a PHONE to the cart
  Can quickly add a PHONE to the cart and view the cart page

  @RegressionTesting @Reg_Cart_006
  Scenario Outline: Add a phone to the cart and view the cart page
    Given Go to the home page
    When Search a product by the product name "<phoneModel>"
    And View the product details "<phoneModel>"
    And Add the product to the cart
    Then Verify number of product in the cart is "1"
    And View the cart details
    And Verify that the cart contains product name "<phoneModel>"
    And Verify that the cart display original price "<productPrice>"

    Examples:
      |phoneModel                   |productPrice   |
      |Xiaomi Redmi 13x 6GB/128GB   | 4.290.000đ    |