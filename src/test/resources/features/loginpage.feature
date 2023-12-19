Feature: Login Feature
  In Order to perform successful login
  As a User
  I have to enter correct username and password

  @smoke@regression@sanity
  Scenario: User should navigate to login page successfully
    Given I am on homepage
    When I click on login link
    Then I should navigate to login page successfully

  @regression
  Scenario: verifyTheErrorMessageWithInValidCredentials
    Given I am on homepage
    When I click on login link
    And I enter email "abcd123@gmail.com"
    And I enter password "abcd1234"
    And I click on login button
    Then I should see the error message

  @regression@sanity
  Scenario: verifyThatUserShouldLogInSuccessFullyWithValidCredential
    Given I am on homepage
    And I click on login link
    And I enter email "tescoExtra780@gmail.com"
    And I enter password "Tesco852"
    And I click on login button
    Then I should see the logOut link is Display

      @smoke
      Scenario: VerifyThatUserShouldLogOutSuccessFully
        Given I am on homepage
        And I click on login link
        And I enter email "tescoExtra780@gmail.com"
        And I enter password "Tesco852"
        And I click on login button
        And I click on logout link
        Then I should see the login link is Display

