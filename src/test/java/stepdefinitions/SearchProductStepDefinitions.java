package stepdefinitions;

import io.cucumber.java.en.When;

public class SearchProductStepDefinitions {
    private final CommonStepDefinitions commonStepDefinitions;
    public SearchProductStepDefinitions(CommonStepDefinitions commonStepDefinitions){
        this.commonStepDefinitions = commonStepDefinitions;
    }

    @When("Search a product by the product name {string}")
    public void seachAProductByTheProductName(String cameraName) {
        commonStepDefinitions.searchAction.searchTheProductName(cameraName);
    }
}
