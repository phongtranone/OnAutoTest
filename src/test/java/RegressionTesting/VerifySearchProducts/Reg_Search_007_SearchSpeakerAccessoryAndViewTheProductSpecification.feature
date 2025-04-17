Feature: Search SPEAKER by the speaker model
  Can quickly search a SPEAKER and view the product specification

  @RegressionTesting @Reg_Search_007
  Scenario Outline: Search the speaker by the model name and view the product specification
    Given Go to the home page
    When Search a product by the product name "<speakerModel>"
    And Ensure that find only one product
    Then View the product details "<speakerModel>"
    And Verify speaker out power "<outputPower>"
    And Verify speaker sound "<sound>"
    And Verify speaker time using "<timeUsing>"

    Examples:
      |speakerModel                       |outputPower |sound                |timeUsing                               |
      |Loa Bluetooth Xiaomi Sound Outdoor |30 W        |True Wireless Stereo |Dùng khoảng 12 tiếng (với 50% âm lượng) |