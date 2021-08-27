package testSteps;

import io.cucumber.java.en.And;
import pages.FitekinLoginPage;

public class FitekinLoginPageSteps {

    private FitekinLoginPage fitekinLoginPage;

    public FitekinLoginPageSteps(FitekinLoginPage fitekinLoginPage) {
        this.fitekinLoginPage = fitekinLoginPage;
    }

    @And("I enter username")
    public void enterUserName() {
        fitekinLoginPage.loginField().sendKeys("qa_admin");
    }

    @And("I enter password")
    public void enterPassword() {
        fitekinLoginPage.passwordField().sendKeys("Testing1!");
    }

    @And("I click Login button")
    public void clickLoginButton() {
        fitekinLoginPage.loginButton().click();
    }
}
