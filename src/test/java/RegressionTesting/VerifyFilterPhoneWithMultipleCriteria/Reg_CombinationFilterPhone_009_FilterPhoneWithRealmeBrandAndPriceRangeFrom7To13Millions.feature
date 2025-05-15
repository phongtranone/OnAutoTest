Feature: Filter PHONE with Realme brand and price range
  Can quickly filter a PHONE LIST

  @RegressionTesting @CombinationFilterPhone_009
  Scenario Outline: Filter the phone by Realme branch name and price range
    Given Go to the home page
    And Go to the "phoneMenu" menu
    And Go to the Filter function
    When Combination filter with brand name "<brandName>"
    And Combination filter with price range "<priceRange>"
    And View the filter results
    Then Verify filter result that contains brand name "<brandName>"
    And Verify filter result is in price range "<priceRange>"

    Examples:
      |brandName      |priceRange              |
      |realme         |from 7 to 13 millions   |