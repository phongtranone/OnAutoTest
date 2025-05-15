Feature: Change quantity of PHONE CASE in the cart
  Can quickly update quantity of PHONE CASE in the cart page

  @FunctionalTesting @FuncUpdateQuantity019
  Scenario Outline: Add phone case and change quantity in the cart page
    Given Go to the home page
    When Search a product by the product name "<phonecaseModel>"
    And View the product details "<phonecaseModel>"
    And Add the product to the cart
    And View the cart details
    And Increase quantity in the cart page with number "<updatedQuantity>"
    Then Verify current quantity after changing with number "<updatedQuantity>"

    Examples:
      |phonecaseModel                                   |updatedQuantity|
      |Ốp lưng MagSafe iPhone 16 Pro Nhựa Trong Apple   |2              |