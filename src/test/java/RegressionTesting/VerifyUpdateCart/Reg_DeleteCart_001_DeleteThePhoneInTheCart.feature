Feature: Delete a PHONE in the cart
  Can quickly remove a PHONE in the cart page

  @RegressionTesting @Reg_Delete_Cart_001
  Scenario Outline: Delete a phone in the cart page
    Given Go to the home page
    When Search a product by the product name "<phoneModel>"
    And View the product details "<phoneModel>"
    And Add the product to the cart
    And View the cart details
    Then Remove the product in the cart page
    And Verify the cart is empty

    Examples:
      |phoneModel                   |
      |Xiaomi Redmi 13x 6GB/128GB   |