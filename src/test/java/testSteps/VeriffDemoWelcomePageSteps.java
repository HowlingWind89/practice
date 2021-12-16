package testSteps;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import veriffPages.VeriffDemoWelcomePage;
import veriffPages.VerificationNotificationDialogue;

public class VeriffDemoWelcomePageSteps {

    private final VeriffDemoWelcomePage veriffDemoWelcomePage;
    private final VerificationNotificationDialogue verificationNotificationDialogue;
    public String fieldData;

    public VeriffDemoWelcomePageSteps (VeriffDemoWelcomePage veriffDemoWelcomePage,
                                       VerificationNotificationDialogue verificationNotificationDialogue) {
        this.veriffDemoWelcomePage = veriffDemoWelcomePage;
        this.verificationNotificationDialogue = verificationNotificationDialogue;
    }

    @When("Veriff welcome page is opened and title text {} is visible")
    public void checkWelcomePageTitle(String title) {
        Assert.assertEquals(title, veriffDemoWelcomePage.welcomePageTitle().getText());
    }

    @And("I enter username {} in {} field")
    public void enterFullName(String userName, String fieldName) {

         do {
            fieldData = veriffDemoWelcomePage.welcomePageInputFields(fieldName).getValue();
            veriffDemoWelcomePage.welcomePageInputFields(fieldName).doubleClick().sendKeys(Keys.BACK_SPACE);
        } while (!fieldData.isEmpty());

        veriffDemoWelcomePage.welcomePageInputFields(fieldName).sendKeys(userName);
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
        Assert.assertEquals("User", veriffDemoWelcomePage.welcomePageInputFields("Full Name").
                getValue());

        Assert.assertEquals("English", veriffDemoWelcomePage.selectedLanguageOrDocumentType("English").
                getText());

        Assert.assertEquals("Estonia", veriffDemoWelcomePage.documentCountryField().getValue());

        Assert.assertEquals("ID Card", veriffDemoWelcomePage.selectedLanguageOrDocumentType("ID Card").
                getText());
    }

    @And("I click Veriff Me button")
    public void clickVeriffMeButton() {
        veriffDemoWelcomePage.veriffMeButton().click();
    }

    @Then("Veriff notification dialogue is displayed and text {} is presented")
    public void veriffNotificationDialogueCheck(String verificationDialogueTitle) {
       veriffDemoWelcomePage.switchToIFrame();
        verificationNotificationDialogue.verificationDialogueTitle().shouldBe(Condition.visible);
        verificationNotificationDialogue.verificationDialogueTitle().shouldHave(Condition.text(verificationDialogueTitle));
    }

    @And("I click on verification dialogue close button when option is {}")
    public void clickVerificationDialogueCloseButton(String verificationOption) throws InterruptedException {
        Thread.sleep(2000);
        if(verificationOption.equals("InContext"))
        {
            veriffDemoWelcomePage.switchToIFrame();
        }
        verificationNotificationDialogue.verificationDialogueCloseButton().click();
    }

    @And("Question dialogue is {} and title {} is {}")
    public void questionDialogueCheck(String isDialogueOpened, String questionDialogueTitle, String titleIsDisplayed) {

        if(isDialogueOpened.equals("opened") && titleIsDisplayed.equals("displayed"))
        {
            verificationNotificationDialogue.questionDialogueTitle().shouldBe(Condition.visible);
            verificationNotificationDialogue.questionDialogueTitle().shouldHave(Condition.text(questionDialogueTitle));
        } else if (isDialogueOpened.equals("closed") && titleIsDisplayed.equals("not displayed"))
        {
            verificationNotificationDialogue.questionDialogueTitle().shouldNot(Condition.visible);
        }
    }

    @And("I click question dialogue {} button when option is {}")
    public void clickQuestionDialogueButton(String buttonName, String optionName) {
        if(optionName.equals("InContext"))
        {
            verificationNotificationDialogue.questionDialogueButtons(buttonName).click();
        }
        else
        {
            verificationNotificationDialogue.exitQuestionDialogueButtonInRedirectPage(buttonName).click();
        }
    }
}
