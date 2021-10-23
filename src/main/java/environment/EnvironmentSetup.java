package environment;

import com.browserup.bup.BrowserUpProxy;
import com.browserup.bup.proxy.CaptureType;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.remote.CapabilityType;
import java.util.Objects;
import static com.codeborne.selenide.Selenide.*;

public class EnvironmentSetup {

    public BrowserUpProxy bmp;

    public void setUp() {

        Configuration.proxyEnabled = true;
        Configuration.proxyHost = "localhost";
        Configuration.proxyPort = 8080;
        Configuration.webdriverLogsEnabled = true;
        Configuration.browserCapabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        Configuration.browserCapabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

        WebDriverManager.chromedriver().setup();
        System.setProperty("selenide.browser", "Chrome");

        /*Configuration.headless = true;*/
        open("https://test.fitekin.com/login/");

        bmp = Objects.requireNonNull(WebDriverRunner.getSelenideProxy()).getProxy();

        // remember body of requests (body is not stored by default because it can be large)
        bmp.setHarCaptureTypes(CaptureType.getAllContentCaptureTypes());

        // remember both requests and responses
        bmp.enableHarCaptureTypes(CaptureType.REQUEST_CONTENT, CaptureType.RESPONSE_CONTENT);

        // start recording!
        bmp.newHar("https://test.fitekin.com/login/");
    }

    public void tearDown() {
        closeWebDriver();
    }
}
