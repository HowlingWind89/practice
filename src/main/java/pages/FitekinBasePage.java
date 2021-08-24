package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FitekinBasePage {

    public SelenideElement FitekinBasePageCountryAndLanguageMenu(String menuName) {
        return $(By.xpath("//div[@data-id='login.choose" + menuName + "']"));
    }

    public SelenideElement CountryAndLanguageInTheList( String countryAndLanguageName, String menuName) {
        return $(By.xpath("//div[@data-id='login.choose" + menuName + ".option']//span[text()='" + countryAndLanguageName + "']"));
    }

    public SelenideElement ContinueButton() {
        return $(By.xpath("//button[@data-id='login.continue']"));
    }

    public SelenideElement PageTitle(String pageName) {
        return $(By.xpath("//h2[text()='" + pageName + "']"));
    }
}
