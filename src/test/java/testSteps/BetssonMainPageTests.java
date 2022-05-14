package testSteps;


import betssonPages.MainPage;
import com.codeborne.selenide.Condition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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

    @And("I enter {} as username")
    public void enterUserName(String userName) {
        mainPage.UserNameField().sendKeys(userName);
    }
    @And("I enter {} as password")
    public void enterPassword(String password) {
        mainPage.UserNameField().sendKeys(password);
    }

    @Then("I click login submit button")
    public void clickLoginSubmitButton() {
        mainPage.LoginSubmitButton().click();
    }
}
