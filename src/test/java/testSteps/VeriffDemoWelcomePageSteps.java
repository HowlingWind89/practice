package testSteps;

import com.browserup.bup.assertion.model.filter.AssertionUrlFilterInfo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import veriffPages.VeriffDemoWelcomePage;

public class VeriffDemoWelcomePageSteps {

    private final VeriffDemoWelcomePage veriffDemoWelcomePage;
    public String fieldData;

    public VeriffDemoWelcomePageSteps (VeriffDemoWelcomePage veriffDemoWelcomePage) {
        this.veriffDemoWelcomePage = veriffDemoWelcomePage;
    }

    @When("Veriff welcome page is opened and title text {} is visible")
    public void checkWelcomePageTitle(String title) {
        String pageTitle = veriffDemoWelcomePage.veriffWelcomePageTitle().getText();
        Assert.assertEquals(title, pageTitle);
    }

    @And("I enter username {} in {} field")
    public void enterFullName(String userName, String fieldName) {

         do {
            fieldData = veriffDemoWelcomePage.veriffWelcomePageInputFields(fieldName).getValue();
            veriffDemoWelcomePage.veriffWelcomePageInputFields(fieldName).doubleClick().sendKeys(Keys.BACK_SPACE);
        } while (!fieldData.isEmpty());

        veriffDemoWelcomePage.veriffWelcomePageInputFields(fieldName).sendKeys(userName);
    }

    @And("I select {} language in {} field")
    public void selectLanguage(String language, String fieldName) {
        veriffDemoWelcomePage.veriffWelcomePageLists(fieldName).click();
        veriffDemoWelcomePage.languageOrDocumentType(language).click();
    }

    @And("I select document {} in {} field")
    public void selectDocumentType(String document, String fieldName) {
        veriffDemoWelcomePage.veriffWelcomePageLists(fieldName).click();
        veriffDemoWelcomePage.languageOrDocumentType(document).click();
    }

    @And("I select radio button {}")
    public void selectRadioButton(String buttonName) {
        veriffDemoWelcomePage.veriffWelcomePageRadioButtons(buttonName).click();
    }

    @And("I select {} as document country")
    public void selectDocumentCountry(String country) {
        veriffDemoWelcomePage.documentCountryField().sendKeys(country, Keys.ENTER);
    }

    @Then("I check that every field data is correctly applied in the fields")
    public void checkFieldsData() {
        Assert.assertEquals("User", veriffDemoWelcomePage.veriffWelcomePageInputFields("Full Name").
                getValue());

        Assert.assertEquals("English", veriffDemoWelcomePage.selectedLanguageOrDocumentType("English").
                getText());

        Assert.assertEquals("Estonia", veriffDemoWelcomePage.documentCountryField().getValue());

        Assert.assertEquals("ID Card", veriffDemoWelcomePage.selectedLanguageOrDocumentType("ID Card").
                getText());
    }
}
