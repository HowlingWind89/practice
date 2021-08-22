package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class GoogleSearch {

    public SelenideElement GoogleSearchField() {
        return $(By.xpath("//input[@class='gLFyf gsfi']"));
    }

    public SelenideElement ConfirmationDialogueAcceptButton() {
        return $(By.xpath("//button[@id='L2AGLb']"));
    }
}
