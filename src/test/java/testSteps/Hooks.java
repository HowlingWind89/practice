package testSteps;

import environment.EnvironmentSetup;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

public class Hooks {
    private final EnvironmentSetup environment;


    public Hooks (EnvironmentSetup environment) {
        this.environment = environment;
    }

    @Before
    @Given("I open a browser")
    public void openGooglePage() {
        environment.setUp();
    }

    @After
    public void closeBrowser() {
        environment.tearDown();
    }
}
