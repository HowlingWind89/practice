package testSteps;

import io.cucumber.java.en.And;
import pages.GoogleSearch;

public class GooglePageSteps {

    private GoogleSearch googleSearch;

    public GooglePageSteps(GoogleSearch googleSearch) {
        this.googleSearch = googleSearch;
        }

        @And("I type search text")
    public void typeSearchText() {
        googleSearch.GoogleSearchField().sendKeys("Test");
        }

        @And("I click confirmation dialogue accept button")
    public void clickAcceptButton() {
        googleSearch.ConfirmationDialogueAcceptButton().click();
        }
    }
