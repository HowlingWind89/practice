package veriffPages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class VerificationNotificationDialogue {

    public SelenideElement verificationDialogueTitle() {
        return $(By.xpath("//main[@class='p15mwn5e']//h1"));
    }

    public SelenideElement verificationDialogueCloseButton() {
        return $(By.xpath("//button[@aria-label='Exit']"));
    }

    public SelenideElement questionDialogueTitle() {
        return $(By.xpath("//div[@class='d9uv3le']//h1"));
    }

    public SelenideElement questionDialogueButtons(String buttonName) {
        return $(By.xpath("//div[@class='d9uv3le']//button[text()='" + buttonName + "']"));
    }

    public SelenideElement exitQuestionDialogueButtonInRedirectPage(String buttonName) {
        return $(By.xpath("//a[text()='" + buttonName + "']"));
    }
}
