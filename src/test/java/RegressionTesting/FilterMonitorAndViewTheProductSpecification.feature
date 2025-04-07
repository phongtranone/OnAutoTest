Feature: Filter MONITOR by the branch
  Can quickly find a MONITOR and view the product specification

  @RegressionTesting @RegressionTestingGroup1
  Scenario Outline: Filter the monitor by branch name and view the product specification
    Given Go to the home page
    And Go to the "monitorAndPrinterMenu" menu
    And Select monitor category
    And Select monitor brand name "msi"
    When View the product details "<monitorModel>"
    Then Verify monitor resolution "<resolution>"
    And Verify monitor touchScreen "<touchScreen>"
    And Verify monitor response time "<responseTime>"
    And Verify monitor rate technology "<rateTechnology>"

    Examples:
      |monitorModel                   |resolution            |touchScreen   |responseTime |rateTechnology|
      |MSI 24.5 inch Full HD MP251 E2 |Full HD (1920 x 1080) |Không cảm ứng |1ms (MPRT)   |Adaptive Sync |