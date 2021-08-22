package testSteps;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;

public class AllureSetUp {

    public void allureSetUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true).savePageSource(true));
    }
}
