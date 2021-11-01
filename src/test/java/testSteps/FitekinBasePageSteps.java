package testSteps;

import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.FitekinBasePage;

public class FitekinBasePageSteps {

    private FitekinBasePage fitekinBasePage;

    public FitekinBasePageSteps(FitekinBasePage fitekinBasePage) {
        this.fitekinBasePage = fitekinBasePage;
        }

    @And("I click {} menu")
    public void clickCountryAndLanguageMenu(String menuName) {
        fitekinBasePage.fitekinBasePageCountryAndLanguageMenu(menuName).click();
        }

    @And("I select {} as {} in the list")
    public void clickAcceptButton(String countryAndLanguageName,String menuName) {
        fitekinBasePage.countryAndLanguageInTheList(countryAndLanguageName, menuName).click();
        }

        @And("I click Continue button")
    public void clickContinueButton() {
        fitekinBasePage.continueButton().click();
        }

        @And("I check that {} page is opened")
    public void checkPageTitle(String pageName) {
        Assert.assertEquals(pageName, fitekinBasePage.pageTitle(pageName).getText());
        }
    }
