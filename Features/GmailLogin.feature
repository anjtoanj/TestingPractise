Feature: OrangeHRM
  Scenario: Check logo in OrangeHRM
    Given I launch Edge browser
    When I open OrangeHRM homepage
    Then I verify that the logo is present on the page
    And close the browser

