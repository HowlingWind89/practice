package veriffPages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class VeriffDemoWelcomePage {

    public SelenideElement veriffWelcomePageTitle() {
        return $(By.xpath("//div[@id='root']//h3"));
    }

    public SelenideElement veriffWelcomePageInputFields(String fieldName) {
        return $(By.xpath("//span[text()='" + fieldName + "']/..//input"));
    }

    public SelenideElement veriffWelcomePageLists(String fieldName) {
        return $(By.xpath("//span[text()='" + fieldName + "']/..//button"));
    }

    public SelenideElement veriffWelcomePageRadioButtons(String buttonName) {
        return $(By.xpath("//input[@type='radio']/../span[text()='" + buttonName + "']"));
    }

    public SelenideElement languageOrDocumentType(String elementName) {
        return $(By.xpath("//ul[@role='listbox']//span[text()='" + elementName + "']/.."));
    }

    public SelenideElement veriffMeButton() {
        return $(By.xpath("//button[@type='submit']"));
    }

    public SelenideElement documentCountryField() {
        return $(By.xpath("//input[@name='documentCountry']"));
    }

    public SelenideElement selectedLanguageOrDocumentType(String elementName) {
        return $(By.xpath("//span[text()='" + elementName + "']/.."));
    }
}
