package testSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import veriffApiTests.VeriffApiTest;

public class VeriffApiTestSteps {

    private final VeriffApiTest veriffApiTest;

    public VeriffApiTestSteps(VeriffApiTest veriffApiTest) {
        this.veriffApiTest = veriffApiTest;
    }

    @And("I get veriff authorization token")
    public void getVeriffAuthorizationToken() {
        veriffApiTest.getAuthorizationToken();
    }

    @Then("I get session configuration")
    public void getSessionConfiguration() {
        veriffApiTest.getConfiguration();
    }
}
