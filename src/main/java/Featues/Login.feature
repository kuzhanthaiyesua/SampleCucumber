Feature: Login to demo guru application

  Scenario: Login to demo guru application with Valid user
    Given Launch chrome browser and navigate to demo guru url
    When Enter the userId and password
    Then Click on Login button
    Then Verify that user is logged in successfully