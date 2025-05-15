Feature: Add PHONE CASE to the cart
  Can quickly add a PHONE CASE to the cart and view the cart page

  @RegressionTesting @Reg_Cart_003
  Scenario Outline: Add a phone case to the cart and view the cart page
    Given Go to the home page
    When Search a product by the product name "<phoneCaseModel>"
    And View the product details "<phoneCaseModel>"
    And Add the product to the cart
    Then Verify number of product in the cart is "1"
    And View the cart details
    And Verify that the cart contains product name "<phoneCaseModel>"
    And Verify that the cart display original price "<productPrice>"

    Examples:
      |phoneCaseModel                                       |productPrice   |
      |Ốp lưng MagSafe iPhone 16 Pro Max Nhựa Trong Apple   | 1.430.000đ    |