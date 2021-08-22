package environment;

import io.github.bonigarcia.wdm.WebDriverManager;

import static com.codeborne.selenide.Selenide.*;

public class EnvironmentSetup {

    public void setUp() {
        WebDriverManager.chromedriver().setup();
        System.setProperty("selenide.browser", "Chrome");
        open("https://google.com");
    }

    public void tearDown() {
        closeWebDriver();
    }
}
