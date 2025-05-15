Feature: Add MONITORS in the cart and make empty cart
  Can quickly remove all MONITOR in the cart page

  @FunctionalTesting @FuncCart008
  Scenario Outline: Add monitor and remove all in the cart page
    Given Go to the home page
    When Search a product by the product name "<firstMonitorModel>"
    And View the product details "<firstMonitorModel>"
    And Add the product to the cart
    And View the cart details
    And Search a product by the product name "<secondMonitorModel>"
    And View the product details "<secondMonitorModel>"
    And Add the product to the cart
    And View the cart details
    Then Remove all product in the cart page
    And Verify the cart is empty

    Examples:
      |firstMonitorModel                    |secondMonitorModel                   |
      |SingPC 23.8 inch Full HD Q24F75-IPS  |MSI PRO 21.45 inch Full HD MP223 E2  |