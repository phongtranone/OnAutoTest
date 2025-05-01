package stepdefinitions;

import io.cucumber.java.en.And;
import org.testng.Assert;

public class ProductListStepDefinitions {
    private final CommonStepDefinitions commonStepDefinitions;
    public ProductListStepDefinitions(CommonStepDefinitions commonStepDefinitions){
        this.commonStepDefinitions = commonStepDefinitions;
    }

    @And("Go to the Filter function")
    public void goToFilterFunction() {
        commonStepDefinitions.productListAction.goToFilterFunction();
    }

}
