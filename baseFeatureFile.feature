 Feature: To check that the main website pages have loaded in http://www.betabreakers.com

  Scenario: To check that the Betabreakers main page has loaded
    Given I navigate to Betabreakers.com
    When I navigate to the Services page
    Then the page services should be visible
