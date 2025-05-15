Feature: Filter TABLET with IPAD brand and storage and range price
  Can quickly filter a TABLET LIST

  @RegressionTesting @CombinationFilterTablet_015
  Scenario Outline: Filter the tablet by IPAD branch name and storage and range price
    Given Go to the home page
    And Go to the "tabletMenu" menu
    And Go to the Filter function
    When Combination filter tablet with brand name "<brandName>"
    And Combination filter with price range "<priceRange>"
    And Combination filter tablet with storage option "<storageOption>"
    And View the filter results
    Then Verify filter result that contains brand name "<brandName>"
    And Verify filter result is in price range "<priceRange>"
    And Verify filter result of tablet that contains storage option "<storageOption>"

    Examples:
      |brandName        |priceRange              |storageOption  |
      |iPad (Apple)     |over 15 millions        |512 GB         |