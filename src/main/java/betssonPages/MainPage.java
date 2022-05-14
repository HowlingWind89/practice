package betssonPages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    public SelenideElement LoginButton() {
        return $(By.xpath("//a[@test-id='header-login-button']"));
    }

    public SelenideElement LoginModal() {
        return $(By.xpath("//obg-m-dialog-layout[@test-id='login-modal']"));
    }

    public SelenideElement UserNameField() {
        return $(By.xpath("//input[@test-id='login-username']"));
    }

    public SelenideElement PasswordField() {
        return $(By.xpath("//input[@test-id='login-password']"));
    }

    public SelenideElement LoginSubmitButton() {
        return $(By.xpath("//button[@test-id='login-submit']"));
    }

    public SelenideElement CookieAcceptButton() {
        return $(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
    }
}
