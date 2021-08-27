package environment;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;

import static com.codeborne.selenide.Selenide.*;

public class EnvironmentSetup {

    public void setUp() {
        WebDriverManager.chromedriver().setup();
        System.setProperty("selenide.browser", "Chrome");
       /* Configuration.headless = true;*/
        open("https://test.fitekin.com/login/");
    }

    public void tearDown() {
        closeWebDriver();
    }
}
