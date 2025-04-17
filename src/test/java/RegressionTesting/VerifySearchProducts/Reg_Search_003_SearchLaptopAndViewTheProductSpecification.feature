Feature: Search LAPTOP by the laptop name
  Can quickly search a LAPTOP and view the product specification

  @RegressionTesting @Reg_Search_003
  Scenario Outline: Search the laptop by the laptop model and view the product specification
    Given Go to the home page
    When Search a product by the product name "<laptopModel>"
    And Ensure that find only one product
    Then View the product details "<laptopModel>"
    Then Verify laptop cpu model "<cpu>"
    And Verify laptop cpu speed "<cpuSpeed>"
    And Verify laptop maximum speed "<maxSpeed>"

    Examples:
      |laptopModel                                |cpu                      |cpuSpeed |maxSpeed            |
      |Dell Inspiron 15 3520 i7 1255U (N5I7125W1) |Intel Core i7 Alder Lake |1.7GHz   |Turbo Boost 4.7 GHz |