Feature: Sort list of TABLET by Ascending price
  Can quickly sort ascending price to view easily the product list

  @RegressionTesting @Reg_Sort_017
  Scenario: Sort the list of TABLET by Ascending Price
    Given Go to the home page
    And Go to the "tabletMenu" menu
    And Select tablet brand name "samsung"
    When Sort the product by ascending order
    Then Verify list prices of the products after sorting by order type ascending
