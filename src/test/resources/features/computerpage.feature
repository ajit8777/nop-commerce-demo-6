Feature: Computer Feature
  In Order to perform successful add product in to cart
  As a User
  I have to build my own computer and add to cart

@smoke@regression@sanity
  Scenario: verifyUserShouldNavigateToComputerPageSuccessfully
    Given I am on homepage
    When I click on Computer Tab
    Then I should navigate to Computer page successfully

@regression
  Scenario: verifyUserShouldNavigateToDesktopsPageSuccessfully
    Given I am on homepage
    When I click on Computer Tab
    And I click on Desktops link
    Then I should navigate to Desktops page successfully
  @regression@sanity
  Scenario Outline: verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully
    Given I am on homepage
    When I click on Computer Tab
    And I click on Desktops link
    And I click on product name Build your own computer
    And I Select processor "<processor>"
    And Select RAM "<ram>"
    And Select HDD "<hdd>"
    And Select OS "<os>"
    And Select Software "<software>"
    And Click on ADD TO CART Button
    Then I should see the product added to shopping cart
    Examples:
      | processor                                       |      ram      | hdd               | os                     | software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Vista Home [+$50.00]    | Total Commander [+$5.00]   |

