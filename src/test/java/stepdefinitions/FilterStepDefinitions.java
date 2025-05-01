package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class FilterStepDefinitions {
    private final CommonStepDefinitions commonStepDefinitions;
    public FilterStepDefinitions(CommonStepDefinitions commonStepDefinitions){
        this.commonStepDefinitions = commonStepDefinitions;
    }

    @When("Combination filter with brand name {string}")
    public void combinationFilterWithBrandName(String brandName) {
        commonStepDefinitions.filterAction.selectBrandName(brandName);
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
        for(String productName : commonStepDefinitions.productListAction.getProductNameList()){
            Assert.assertTrue(productName.contains(expectedBrandName));
        }
    }

    @And("Verify filter result is in price range {string}")
    public void viewFilterResultIsInPriceRange(String priceRange) {
        for(Integer productPrice : commonStepDefinitions.productListAction.getProductPriceList()){
            Assert.assertTrue(commonStepDefinitions.filterAction.verifyProductPriceIsInPriceRange(priceRange, productPrice));
        }
    }
}
