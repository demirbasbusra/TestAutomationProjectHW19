package steps;

import common.PageManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;

import static org.testng.AssertJUnit.assertEquals;

public class ElementsStepDefinitions {

    PageManager pageManager;

    @Description("Bu senaryo Elements sayfasını çağırdığım söylenir.")
    @Given("I am on the elements page")
    public void ıAmOnTheElementsPage() {
        pageManager = new PageManager();
    }

    @Description("Bu senaryo Elements sayfası açılır.")
    @Severity(SeverityLevel.CRITICAL)
    @Given("Open the Elements Page")
    public void openTheElementsPage() {
        pageManager = new PageManager();
        pageManager.elementsPage.open();
    }

    @Description("Bu senaryoda Elements sayfasındaki Buttonsa tıklanır.")
    @When("I click Buttons Section")
    public void ıClickButtonsSection() {
        pageManager.elementsPage.buttons.click();
    }

    @Description("Bu senaryoda Elements sayfasındaki ClickMe butonuna tıklanır.")
    @And("I click Click Me Button")
    public void ıClickClickMeButton() {
        pageManager.elementsPage.clickMeButtons.click();
    }

    @Description("Bu senaryoda Butona tıklanınca ilgili mesaj görülür.")
    @Then("I check see {string}")
    public void ıCheckSeeYouHaveDoneADynamicClick(String text) {
        String pageMsg = pageManager.elementsPage.clickMeMessage.getText();
        System.out.println(pageMsg + " " + text);
        assertEquals(pageMsg,text);
    }


}