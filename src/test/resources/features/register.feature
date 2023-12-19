Feature: Register Feature
  In Order to perform successful login
  As a User
  I have to enter correct username and password

  @smoke@regression@sanity
  Scenario: verifyUserShouldNavigateToRegisterPageSuccessfully
    Given I am on homepage
    When I click on Register link
    Then I should navigate to Register page successfully

  @regression
  Scenario: verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory
    Given I am on homepage
    When I click on Register link
    And I click on Register Button
    Then I should see the error message First name is required.
    And I should see the error message Last name is required.
    And I should see the error message Email is required.
    And I should see the error message Password is required.
    And I should see the error message ConfirmPassword is required.

  @regression@sanity
  Scenario: verifyThatUserShouldCreateAccountSuccessfully
    Given I am on homepage
    When I click on Register link
    And I should select gender Female
    And I enter First Name "Tesco"
    And I enter Last Name "Extra"
    And I select day "25"
    And I select month "12"
    And I select year "1995"
    And I enter email "tescoExtra783@gmail.com"
    And I enter password "Tesco852"
    And I enter Confirm Password "Tesco852"
    And I click on Register Button
    Then I should Registration completed


