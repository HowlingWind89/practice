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
}
