package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FitekinDashboardPage {

    public SelenideElement selectedItemInTheLIst() {
        return $(By.xpath("//li[@class='main-menu__list-item main-menu__list-item--is-active']//span[text()='Dashboard']"));
    }
}
