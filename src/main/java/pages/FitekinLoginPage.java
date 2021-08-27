package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FitekinLoginPage {

    public SelenideElement loginField() {
        return $(By.xpath("//input[@data-id='email']"));
    }

    public SelenideElement passwordField() {
        return $(By.xpath("//input[@data-id='password']"));
    }

    public SelenideElement loginButton() {
        return $(By.xpath("//button[@data-id='loginButton']"));
    }
}
