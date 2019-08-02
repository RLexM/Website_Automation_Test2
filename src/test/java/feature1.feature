Feature: To check that the Betabreakers pages have loaded in http://www.betabreakers.com

  Background:
    Given I navigate to http://www.betabreakers.com site

  Scenario: To check that the Betabreakers pages have loaded
    Given I navigate to "Autocomplete" page
    Then the page title should be visible

  Scenario: To check that the Formy pages have loaded
    Given I navigate to "Checkbox" page
    Then the page title should be visible

  Scenario: To check that the Formy pages have loaded
    Given I navigate to "Buttons" page
    Then the page title should be visible
      #| Autocomplete |
      #| Checkbox     |
      #| Buttons      |