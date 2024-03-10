package steps;

import common.PageManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.AssertJUnit.assertEquals;

public class ElementsStepDefinitions {

    PageManager pageManager;

    @Given("Open the Elements Page")
    public void openTheElementsPage() {
        pageManager = new PageManager();
        pageManager.elementsPage.open();
    }

    @When("I click Buttons Section")
    public void ıClickButtonsSection() {
        pageManager.elementsPage.buttons.click();
    }

    @And("I click Click Me Button")
    public void ıClickClickMeButton() {
        pageManager.elementsPage.clickMeButtons.click();
    }

    @Then("I check see {string}")
    public void ıCheckSeeYouHaveDoneADynamicClick(String text) {
        String pageMsg = pageManager.elementsPage.clickMeMessage.getText();
        System.out.println(pageMsg + " " + text);
        assertEquals(pageMsg,text);
    }
}