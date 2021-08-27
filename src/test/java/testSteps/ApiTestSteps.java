package testSteps;

import fitekinapi.ApiTest;
import io.cucumber.java.en.And;

public class ApiTestSteps {

    private ApiTest apiTest;

    public ApiTestSteps(ApiTest apiTest) {
        this.apiTest = apiTest;
    }

    @And("I get Currency")
    public void getCurrencyTest() {
        apiTest.getCurrency();
    }
}
