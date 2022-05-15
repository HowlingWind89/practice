package testSteps;


import betssonPages.MainPage;
import com.codeborne.selenide.Condition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.ConfigReaderUtil;

public class BetssonMainPageTests {

    private final MainPage mainPage;

    public BetssonMainPageTests(MainPage mainPage) {
        this.mainPage = mainPage;
    }

    @When("I click 'Login' button")
    public void clickLoginButton() {
        mainPage.CookieAcceptButton().shouldBe(Condition.visible).click();
        mainPage.LoginButton().click();
    }

    @And("Login modal is opened")
    public void loginModalIsOpened() {
        mainPage.LoginModal().shouldBe(Condition.visible);
    }

    @And("I enter betsson username")
    public void enterUserName() {
        mainPage.UserNameField().sendKeys(ConfigReaderUtil.USER_NAME);
    }
    @And("I enter betsson password")
    public void enterPassword() {
        mainPage.UserNameField().sendKeys(ConfigReaderUtil.PASSWORD);
    }

    @Then("I click login submit button")
    public void clickLoginSubmitButton() {
        mainPage.LoginSubmitButton().click();
    }
}
