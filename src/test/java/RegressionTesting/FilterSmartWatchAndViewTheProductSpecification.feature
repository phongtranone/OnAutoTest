Feature: Filter SMART WATCH by the branch
  Can quickly find a SMART WATCH and view the product specification

  @RegressionTesting @RegressionTestingGroup2
  Scenario Outline: Filter the smart watch by branch name and view the product specification
    Given Go to the home page
    And Go to the "smartWatchMenu" menu
    And Select smart watch brand name "xiaomi"
    When View the product details "<smartWatchModel>"
    Then Verify smart watch display "<display>"
    And Verify smart watch screen size "<screenSize>"
    And Verify smart watch resolution "<resolution>"
    And Verify smart watch dimension "<dimensions>"

    Examples:
      |smartWatchModel          |display |screenSize|resolution       |dimensions |
      |Xiaomi Mi Band 9 dây TPU |AMOLED  |1.62 inch |490 × 192 pixels |46.53 mm   |