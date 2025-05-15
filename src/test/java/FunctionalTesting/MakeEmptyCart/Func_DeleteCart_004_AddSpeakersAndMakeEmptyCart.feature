Feature: Add SPEAKERS in the cart and make empty cart
  Can quickly remove all SPEAKER in the cart page

  @FunctionalTesting @FuncCart004
  Scenario Outline: Add speakers and remove all in the cart page
    Given Go to the home page
    When Search a product by the product name "<firstSpeakerModel>"
    And View the product details "<firstSpeakerModel>"
    And Add the product to the cart
    And View the cart details
    And Search a product by the product name "<secondSpeakerModel>"
    And View the product details "<secondSpeakerModel>"
    And Add the product to the cart
    And View the cart details
    Then Remove all product in the cart page
    And Verify the cart is empty

    Examples:
      |firstSpeakerModel            |secondSpeakerModel       |
      |Loa Bluetooth JBL Charge 6   |Loa Bluetooth Rezo Pulse E21  |