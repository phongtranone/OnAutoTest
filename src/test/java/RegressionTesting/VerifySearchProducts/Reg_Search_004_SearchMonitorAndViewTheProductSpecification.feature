Feature: Search MONITOR by the model name
  Can quickly search a MONITOR and view the product specification

  @RegressionTesting @Reg_Search_004
  Scenario Outline: Search the monitor by the model name and view the product specification
    Given Go to the home page
    When Search a product by the product name "<monitorModel>"
    And Ensure that find only one product
    Then View the product details "<monitorModel>"
    And Verify monitor resolution "<resolution>"
    And Verify monitor touchScreen "<touchScreen>"
    And Verify monitor response time "<responseTime>"
    And Verify monitor rate technology "<rateTechnology>"

    Examples:
      |monitorModel                   |resolution            |touchScreen   |responseTime |rateTechnology|
      |MSI 24.5 inch Full HD MP251 E2 |Full HD (1920 x 1080) |Không cảm ứng |1ms (MPRT)   |Adaptive Sync |