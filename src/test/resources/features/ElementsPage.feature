@functional
Feature: Open Elements Page And Press Click Me Button

  Background:
    Given I am on the elements page
    Given Open the Elements Page

  Scenario: Clicking Click Me Button
    When I click Buttons Section
    And I click Click Me Button
    Then I check see 'You have done a dynamic click'