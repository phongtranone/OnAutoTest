package stepdefinitions;

import core.utils.Log;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class FilterStepDefinitions {
    private final CommonStepDefinitions commonStepDefinitions;
    public FilterStepDefinitions(CommonStepDefinitions commonStepDefinitions){
        this.commonStepDefinitions = commonStepDefinitions;
    }

    /**
     * Combination filter phone with brand name
     * */
    @When("Combination filter with brand name {string}")
    public void combinationFilterWithBrandName(String brandName) {
        commonStepDefinitions.filterAction.selectPhoneBrandName(brandName);
    }

    @And("Combination filter with price range {string}")
    public void combinationFilterWithPriceRange(String priceRange) {
        commonStepDefinitions.filterAction.selectPriceRange(priceRange);
    }

    @And("View the filter results")
    public void viewFilterResult() {
        commonStepDefinitions.filterAction.viewFilterResults();
    }

    @And("Verify filter result that contains brand name {string}")
    public void verifyFilterResultThatContainsBrandName(String expectedBrandName) {
        Log.info("VERIFY THAT EACH RESULT CONTAINS BRAND NAME: " + expectedBrandName);
        for(String productName : commonStepDefinitions.productListAction.getProductNameList()){
            if((expectedBrandName.trim()).equals("iPhone (Apple)")){
                Assert.assertTrue(productName.contains("iPhone"));
            }else if((expectedBrandName.trim()).equals("iPad (Apple)")){
                Assert.assertTrue(productName.contains("iPad"));
            }
            else{
                Assert.assertTrue(productName.contains(expectedBrandName));
            }
        }
    }

    @And("Verify filter result is in price range {string}")
    public void viewFilterResultIsInPriceRange(String priceRange) {
        Log.info("ENSURE THAT EACH PRICE MUST BE IN RANGE: " + priceRange);
        for(Integer productPrice : commonStepDefinitions.productListAction.getProductPriceList()){
            Assert.assertTrue(commonStepDefinitions.filterAction.verifyProductPriceIsInPriceRange(priceRange, productPrice));
        }
    }

    /**
     * Combination filter laptop with brand name
     * */
    @When("Combination filter laptop with brand name {string}")
    public void combinationFilterLaptopWithBrandName(String brandName) {
        commonStepDefinitions.filterAction.selectLaptopBrandName(brandName);
    }
    @And("Combination filter laptop with ram option {string}")
    public void combinationFilterLaptopWithRamOption(String ramOption) {
        commonStepDefinitions.filterAction.selectRamOption(ramOption);
    }
    @And("Combination filter laptop with hard disk option {string}")
    public void combinationFilterLaptopWithHardDiskOption(String hardDiskOption) {
        commonStepDefinitions.filterAction.selectHardDiskOption(hardDiskOption);
    }

    @Then("Verify filter result of laptops contain ram memory {string}")
    public void verifyFilterResultOfLaptopsContainRamMemory(String expectedRamSelection) {
        for(String ramValue : commonStepDefinitions.productListAction.getProductRamMemoryList()){
            Assert.assertEquals(expectedRamSelection.toLowerCase(), ramValue.toLowerCase());
        }
    }

    @And("Verify filter result of laptops contain hard disk {string}")
    public void verifyFilterResultOfLaptopsContainHardDisk(String expectedHardDisk) {
        for(String hardDiskValue : commonStepDefinitions.productListAction.getProductHardDiskList()){
            Assert.assertEquals(expectedHardDisk.toLowerCase(), hardDiskValue.toLowerCase());
        }
    }

    /**
     * Combination filter tablet with brand name
     * */
    @When("Combination filter tablet with brand name {string}")
    public void combinationFilterTabletWithBrandName(String brandName) {
        commonStepDefinitions.filterAction.selectTabletBrandName(brandName);
    }

    @And("Combination filter tablet with storage option {string}")
    public void combinationFilterTabletWithStorageOption(String storageOption){
        commonStepDefinitions.filterAction.selectStorageOption(storageOption);
    }
    @And("Verify filter result of tablet that contains storage option {string}")
    public void verifyFilterResultOfTabletThatContainsStorageOption(String storageOption) {
        Log.info("VERIFY THAT EACH RESULT CONTAINS THE STORAGE OPTION: " + storageOption);
        for(String actualStorage : commonStepDefinitions.productListAction.getProductStorageList()){
            Assert.assertTrue(actualStorage.toLowerCase().contains(storageOption.toLowerCase()));
        }
    }
}
