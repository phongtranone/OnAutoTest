Feature: Filter SPEAKER by the branch
  Can quickly find a SPEAKER and view the product specification

  @RegressionTesting @Reg_Filter_007
  Scenario Outline: Filter the speaker by branch name and view the product specification
    Given Go to the home page
    And Go to the "accessoriesMenu" menu
    And Select accessory category "speaker"
    And Select accessory speaker brand name "xiaomi"
    When View the product details "<speakerModel>"
    Then Verify speaker out power "<outputPower>"
    And Verify speaker sound "<sound>"
    And Verify speaker time using "<timeUsing>"

    Examples:
      |speakerModel                       |outputPower |sound                |timeUsing                               |
      |Loa Bluetooth Xiaomi Sound Outdoor |30 W        |True Wireless Stereo |Dùng khoảng 12 tiếng (với 50% âm lượng) |