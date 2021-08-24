package testSteps;

import io.cucumber.java.en.And;
import pages.FitekinBasePage;

public class FitekinBasePageSteps {

    private FitekinBasePage fitekinBasePage;

    public FitekinBasePageSteps(FitekinBasePage fitekinBasePage) {
        this.fitekinBasePage = fitekinBasePage;
        }

    @And("I click {} menu")
    public void clickCountryAndLanguageMenu(String menuName) {
        fitekinBasePage.FitekinBasePageCountryAndLanguageMenu(menuName).click();
        }

    @And("I select {} as {} in the list")
    public void clickAcceptButton(String countryAndLanguageName,String menuName) {
        fitekinBasePage.CountryAndLanguageInTheList(countryAndLanguageName, menuName).click();
        }
    }
