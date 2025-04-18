Feature: Searching the product
  Can quickly search a phone and view detail fof specification

  @FunctionalTesting @FuncSearch001
  Scenario Outline: Search an expected smart phone
    Given Go to the home page
    When Enter the phone name "<phoneName>"
    Then Ensure that find only one product
    And Validate the product name "<phoneName>"
    And Validate the product price "<productPrice>"

    Examples:
      | phoneName                    |productPrice |
      | Samsung Galaxy A06 4GB/64GB  |2.890.000    |