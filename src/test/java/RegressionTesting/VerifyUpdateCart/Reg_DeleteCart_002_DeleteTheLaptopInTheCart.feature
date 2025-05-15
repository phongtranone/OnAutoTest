Feature: Delete a LAPTOP in the cart
  Can quickly remove a LAPTOP in the cart page

  @RegressionTesting @Reg_Delete_Cart_002
  Scenario Outline: Delete a laptop in the cart page
    Given Go to the home page
    When Search a product by the product name "<laptopModel>"
    And View the product details "<laptopModel>"
    And Add the product to the cart
    And View the cart details
    Then Remove the product in the cart page
    And Verify the cart is empty

    Examples:
      |laptopModel                             |
      |MSI Modern 15 F13MG i5 1335U (082VN)    |