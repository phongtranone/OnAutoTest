Feature: Add TABLET CASE to the cart
  Can quickly add a TABLET CASE to the cart and view the cart page

  @RegressionTesting @Reg_Cart_004
  Scenario Outline: Add a tablet case to the cart and view the cart page
    Given Go to the home page
    When Search a product by the product name "<tabletCaseModel>"
    And View the product details "<tabletCaseModel>"
    And Add the product to the cart
    Then Verify number of product in the cart is "1"
    And View the cart details
    And Verify that the cart contains product name "<tabletCaseModel>"
    And Verify that the cart display original price "<productPrice>"

    Examples:
      |tabletCaseModel                              |productPrice   |
      |Bao da Apple iPad mini 7 Smart Folio MC2Q4   | 1.690.000đ    |