package environment;

import io.github.bonigarcia.wdm.WebDriverManager;

import static com.codeborne.selenide.Selenide.*;

public class EnvironmentSetup {

    public void setUp() {
        WebDriverManager.chromedriver().setup();
        System.setProperty("selenide.browser", "Chrome");
        open("https://test.fitekin.com/login/");
    }

    public void tearDown() {
        closeWebDriver();
    }
}
