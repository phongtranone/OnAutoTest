Feature: Sort list of TABLET by Descending price
  Can quickly sort descending price to view easily the product list

  @RegressionTesting @Reg_Sort_018
  Scenario: Sort the list of TABLET by Descending Price
    Given Go to the home page
    And Go to the "tabletMenu" menu
    And Select tablet brand name "samsung"
    When Sort the product by descending order
    Then Verify list prices of the products after sorting by order type descending
