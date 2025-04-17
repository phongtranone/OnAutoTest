Feature: Filter LAPTOP by the branch
  Can quickly find a LAPTOP and view the product specification

  @RegressionTesting @Reg_Filter_003
  Scenario Outline: Filter the laptop by branch name and view the product specification
    Given Go to the home page
    And Go to the "laptopMenu" menu
    And Select the laptop brand name "asus"
    When View the product details "<laptopModel>"
    Then Verify laptop cpu model "<cpu>"
    And Verify laptop cpu speed "<cpuSpeed>"
    And Verify laptop maximum speed "<maxSpeed>"

    Examples:
      |laptopModel                             |cpu                      |cpuSpeed |maxSpeed            |
      |Asus Vivobook X1404ZA i5 1235U (NK376W) |Intel Core i5 Alder Lake |1.3GHz   |Turbo Boost 4.4 GHz |