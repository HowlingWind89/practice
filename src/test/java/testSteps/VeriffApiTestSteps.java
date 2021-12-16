package testSteps;

import io.cucumber.java.en.And;
import veriffApiTests.VeriffApiTest;

public class VeriffApiTestSteps {

    private VeriffApiTest veriffApiTest;

    public VeriffApiTestSteps(VeriffApiTest veriffApiTest) {
        this.veriffApiTest = veriffApiTest;
    }

    @And("I get veriff authorization token")
    public void getVeriffAuthorizationToken() {
        veriffApiTest.getAuthorizationToken();
    }
}
