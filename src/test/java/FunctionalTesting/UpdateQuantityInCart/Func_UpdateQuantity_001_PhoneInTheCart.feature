Feature: Change quantity of PHONE in the cart
  Can quickly update quantity of PHONE in the cart page

  @FunctionalTesting @FuncUpdateQuantity001
  Scenario Outline: Add phone and change quantity in the cart page
    Given Go to the home page
    When Search a product by the product name "<firstPhoneModel>"
    And View the product details "<firstPhoneModel>"
    And Add the product to the cart
    And View the cart details
    And Increase quantity in the cart page with number "<updatedQuantity>"
    Then Verify current quantity after changing with number "<updatedQuantity>"

    Examples:
      |firstPhoneModel                    |updatedQuantity|
      |Samsung Galaxy A56 5G 12GB/256GB   |5              |