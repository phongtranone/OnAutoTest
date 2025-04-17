Feature: Search PHONE by the model
  Can quickly search a PHONE and view the product specification

  @RegressionTesting @Reg_Search_009
  Scenario Outline: Search a phone by the phone name and view the product specification
    Given Go to the home page
    When Search a product by the product name "<phoneName>"
    And Ensure that find only one product
    Then View the product details "<phoneName>"
    And Verify the operation system "<operationSystem>"
    And Verify the chip model "<chip>"
    And Verify the speed of CPU "<cpuSpeed>"
    And Verify RAM memory "<ram>"
    And Verify memory storage "<memory>"

    Examples:
      |phoneName                  |operationSystem  |chip                               | cpuSpeed  |ram   |memory |
      |OPPO Find N5 5G 16GB/512GB |Android 15       |Qualcomm Snapdragon 8 Elite 8 nhân | 4.32 GHz  |16 GB |512 GB |