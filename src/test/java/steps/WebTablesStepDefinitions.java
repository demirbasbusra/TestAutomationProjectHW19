package steps;

import common.PageManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.AssertJUnit.assertEquals;

public class WebTablesStepDefinitions {

    PageManager pageManager;

    @Given("Open the WebTables page")
    public void openTheWebTablesPage() {
        pageManager = new PageManager();
        pageManager.webTablesPage.open();
    }

    @When("I click ADD button")
    public void ıClickADDButton() {
        pageManager.webTablesPage.addButton.click();
    }

    @And("I add new person")
    public void ıAddNewPerson() {
        pageManager.webTablesPage.firstName.sendKeys("Büşra");
        pageManager.webTablesPage.lastName.sendKeys("Demirbaş");
        pageManager.webTablesPage.email.sendKeys("demirbaas@gmail.com");
        pageManager.webTablesPage.age.sendKeys("26");
        pageManager.webTablesPage.salary.sendKeys("1000000");
        pageManager.webTablesPage.department.sendKeys("IT / TEST");
        pageManager.webTablesPage.submit.click();
    }

    @And("I edited the person which I added before")
    public void ıEditedThePersonWhichIAddedBefore() {
        pageManager.webTablesPage.editSymbol.click();
        pageManager.webTablesPage.searchBox.clear();
        pageManager.webTablesPage.firstName.clear();
        pageManager.webTablesPage.firstName.sendKeys("ELMAS");
        pageManager.webTablesPage.lastName.clear();
        pageManager.webTablesPage.lastName.sendKeys("DEMİRBAŞ");
        pageManager.webTablesPage.email.clear();
        pageManager.webTablesPage.email.sendKeys("ELMAS@gmail.com");
        pageManager.webTablesPage.age.clear();
        pageManager.webTablesPage.age.sendKeys("56");
        pageManager.webTablesPage.salary.clear();
        pageManager.webTablesPage.salary.sendKeys("200000000");
        pageManager.webTablesPage.department.clear();
        pageManager.webTablesPage.department.sendKeys("HOUSE WIFE :)");
        pageManager.webTablesPage.submit.click();
    }

}