package testSteps;

import com.codeborne.selenide.logevents.SelenideLogger;
import environment.EnvironmentSetup;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.qameta.allure.selenide.AllureSelenide;

public class Hooks {
    private final EnvironmentSetup environment;


    public Hooks (EnvironmentSetup environment) {
        this.environment = environment;
    }

    @Before
    public void openFitekInBasePage() {
        environment.setUp();
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @After
    public void closeBrowser() {
        environment.tearDown();
    }
}
