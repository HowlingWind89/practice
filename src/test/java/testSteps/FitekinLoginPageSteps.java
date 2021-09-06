package testSteps;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.FitekinDashboardPage;
import pages.FitekinLoginPage;

public class FitekinLoginPageSteps {

    private FitekinLoginPage fitekinLoginPage;
    private FitekinDashboardPage fitekinDashboardPage;

    public FitekinLoginPageSteps(FitekinLoginPage fitekinLoginPage, FitekinDashboardPage fitekinDashboardPage) {
        this.fitekinLoginPage = fitekinLoginPage;
        this.fitekinDashboardPage = fitekinDashboardPage;
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
        fitekinLoginPage.loginButton().shouldBe(Condition.enabled);
        fitekinLoginPage.loginButton().click();
        Assert.assertEquals("Dashboard", fitekinDashboardPage.selectedItemInTheLIst().getText());
    }
}
