Feature: Add a person and edit this person on WebTables page

  Background:
    Given Open the WebTables page

  Scenario: Add and Edit Person Operation
    When I click ADD button
    And I add new person
    And I edited the person which I added before
