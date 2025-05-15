Feature: Add PHONES and empty the cart
  Can quickly remove all PHONE in the cart page

  @FunctionalTesting @FuncCart001
  Scenario Outline: Add phones and remove all in the cart page
    Given Go to the home page
    When Search a product by the product name "<firstPhoneModel>"
    And View the product details "<firstPhoneModel>"
    And Add the product to the cart
    And View the cart details
    And Search a product by the product name "<secondPhoneModel>"
    And View the product details "<secondPhoneModel>"
    And Add the product to the cart
    And View the cart details
    Then Remove all product in the cart page
    And Verify the cart is empty

    Examples:
      |firstPhoneModel                    |secondPhoneModel          |
      |Samsung Galaxy A56 5G 12GB/256GB   |iPhone 16 Pro Max 256GB   |