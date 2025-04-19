package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SortProductStepDefinitions {
    private final CommonStepDefinitions commonStepDefinitions;
    public SortProductStepDefinitions(CommonStepDefinitions commonStepDefinitions){
        this.commonStepDefinitions = commonStepDefinitions;
    }

    @When("Sort the product by {word} order")
    public void sortTheProductByOrderType(String orderType) {
        commonStepDefinitions.productListAction.sortByPrice(orderType);
    }

    @Then("Verify list prices of the products after sorting by order type {word}")
    public void verifyListPricesOfTheProductsAfterSortingByOrderType(String orderType){
        Assert.assertTrue(commonStepDefinitions.productListAction.verifySortOrder(orderType));
    }
}
