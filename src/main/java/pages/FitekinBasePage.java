package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FitekinBasePage {

    public SelenideElement fitekinBasePageCountryAndLanguageMenu(String menuName) {
        return $(By.xpath("//div[@data-id='login.choose" + menuName + "']"));
    }

    public SelenideElement countryAndLanguageInTheList(String countryAndLanguageName, String menuName) {
        return $(By.xpath("//div[@data-id='login.choose" + menuName + ".option']//span[text()='" + countryAndLanguageName + "']"));
    }

    public SelenideElement continueButton() {
        return $(By.xpath("//button[@data-id='login.continue']"));
    }

    public SelenideElement pageTitle(String pageName) {
        return $(By.xpath("//h2[text()='" + pageName + "']"));
    }
}
